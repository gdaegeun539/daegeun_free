package xyz.device.dao;

import xyz.device.model.DeviceInfoVO;

import java.util.List;

public interface DeviceInfoDAO {
    public Integer insert(DeviceInfoVO vo);

    public Integer delete(Integer id);

    public Integer update(DeviceInfoVO vo);

    public Integer updateRating(Integer id);

    public List<DeviceInfoVO> selectAll();

    public DeviceInfoVO selectById(Integer id);

    public List<DeviceInfoVO> selectByPagination(Integer start, Integer cnt);

    public List<DeviceInfoVO> selectByCompany(String company);

    public List<DeviceInfoVO> selectByCompanyPagination(String company, Integer start, Integer cnt);
}
