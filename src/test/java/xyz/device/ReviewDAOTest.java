package xyz.device;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import xyz.device.dao.ReviewDAO;
import xyz.device.model.ReviewVO;

import java.time.LocalDateTime;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/**.xml"})
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@WebAppConfiguration
public class ReviewDAOTest {

    @Autowired
    private ReviewDAO reviewDAO;

    @Test
    @Order(1)
    public void testInsert() {
        ReviewVO reviewVO = new ReviewVO();
        reviewVO.setUname("test");
        reviewVO.setContent("test");
        reviewVO.setRating(1);
        reviewVO.setDev_id(1);
        reviewVO.setReg_date(LocalDateTime.now());
        reviewVO.setPwd("test");

        Assertions.assertThat(reviewDAO.insert(reviewVO)).isNotZero();
    }

    @Test
    @Order(2)
    public void testSelectByUName() {
        Assertions.assertThat(reviewDAO.selectByUname("test")).isNotNull();
    }

    @Test
    @Order(3)
    public void testUpdate() {
        ReviewVO reviewVO = reviewDAO.selectByUname("test");
        reviewVO.setContent("test2");
        Assertions.assertThat(reviewDAO.update(reviewVO)).isNotZero();
    }

    @Test
    @Order(4)
    public void testDelete() {
        ReviewVO reviewVO = reviewDAO.selectByUname("test");
        Assertions.assertThat(reviewDAO.delete(reviewVO.getId())).isNotZero();
    }

    @Test
    @Order(5)
    public void testSelectAll() {
        Assertions.assertThat(reviewDAO.selectAll()).isNotNull();
    }

    @Test
    @Order(6)
    public void testSelectById() {
        Assertions.assertThat(reviewDAO.selectById(1)).isNotNull();
    }

    @Test
    @Order(7)
    public void testSelectByDevId() {
        Assertions.assertThat(reviewDAO.selectByDevId(1)).isNotNull();
    }
}
