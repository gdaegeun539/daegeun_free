package xyz.device.service;

import xyz.device.model.DeviceInfoVO;

import java.util.List;

public interface DeviceInfoService {
    public void insert(DeviceInfoVO vo);

    public void delete(Integer id);

    public List<DeviceInfoVO> selectAll();

    public DeviceInfoVO selectById(Integer id);

    public List<DeviceInfoVO> selectByCompany(String company);
}
