package xyz.device;

import org.apache.ibatis.session.SqlSessionFactory;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/**.xml"})
public class MybatisTest {

    @Autowired
    private SqlSessionFactory sqlSessionFactory;

    @Test
    public void testFactory() {

        try (var session = sqlSessionFactory.openSession()) {
            Assertions.assertThat(sqlSessionFactory).isNotNull();
            System.out.println("[session]: " + session);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
