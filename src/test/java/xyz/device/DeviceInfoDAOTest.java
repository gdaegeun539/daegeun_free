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
import xyz.device.dao.DeviceInfoDAO;
import xyz.device.model.DeviceInfoVO;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/**/**.xml", "file:src/main/webapp/WEB-INF/spring/**.xml"})
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@WebAppConfiguration
public class DeviceInfoDAOTest {

    @Autowired
    private DeviceInfoDAO deviceInfoDAO;

    @Test
    @Order(1)
    public void testInsert () {
        DeviceInfoVO deviceInfoVO = new DeviceInfoVO();
        deviceInfoVO.setName("test");
        deviceInfoVO.setCategory("test");
        deviceInfoVO.setCompany("test");
        deviceInfoVO.setPrice(1);
        deviceInfoVO.setSpec("test");
        deviceInfoVO.setPhoto_name("test");
        deviceInfoVO.setPhoto_path("test");
        deviceInfoVO.setRating_avg(1.0);
        Assertions.assertThat(deviceInfoDAO.insert(deviceInfoVO)).isNotZero();
    }

    @Test
    @Order(2)
    public void testSelectByName(){
        Assertions.assertThat(deviceInfoDAO.selectByName("test")).isNotNull();
    }

    @Test
    @Order(3)
    public void testUpdate(){
        DeviceInfoVO deviceInfoVO = deviceInfoDAO.selectByName("test");
        deviceInfoVO.setName("test");
        deviceInfoVO.setCategory("test2");
        deviceInfoVO.setCompany("test2");
        deviceInfoVO.setPrice(11);
        deviceInfoVO.setSpec("test2");
        deviceInfoVO.setPhoto_name("test2");
        deviceInfoVO.setPhoto_path("test2");
        deviceInfoVO.setRating_avg(1.0);
        Assertions.assertThat(deviceInfoDAO.update(deviceInfoVO)).isNotZero();
    }

    @Test
    @Order(4)
    public void testUpdateRating() {
        DeviceInfoVO testVO = deviceInfoDAO.selectByName("test");
        testVO.setRating_avg(2.0);
        Assertions.assertThat(deviceInfoDAO.updateRating(testVO.getId())).isNotZero();
    }

    @Test
    @Order(5)
    public void testDelete(){
        DeviceInfoVO testVO = deviceInfoDAO.selectByName("test");
        Assertions.assertThat(deviceInfoDAO.delete(testVO.getId())).isNotZero();
    }

    @Test
    @Order(6)
    public void testSelectById() {
        Assertions.assertThat(deviceInfoDAO.selectById(1)).isNotNull();
    }

    @Test
    @Order(7)
    public void testSelectAll() {
        Assertions.assertThat(deviceInfoDAO.selectAll()).isNotNull();
    }

    @Test
    @Order(8)
    public void testSelectByCompany() {
        Assertions.assertThat(deviceInfoDAO.selectByCompany("samsung")).isNotNull();
    }
}
