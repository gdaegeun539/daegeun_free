package xyz.device;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.sql.DataSource;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/**.xml"})
public class DBTest {

    @Autowired
    public DataSource dataSource;

    @Test
    public void testConnection() {
        try (var con = dataSource.getConnection()) {
            Assertions.assertThat(con).isNotNull();
            System.out.println("[con]: " + con);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
