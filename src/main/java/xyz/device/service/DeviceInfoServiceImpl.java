package xyz.device.service;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import xyz.device.dao.DeviceInfoDAO;
import xyz.device.exception.DataUpdateException;
import xyz.device.model.DeviceInfoVO;

import java.util.List;

@Setter
@AllArgsConstructor
@Service
public class DeviceInfoServiceImpl implements DeviceInfoService{

    private DeviceInfoDAO deviceInfoDAO;

    @Override
    public void insert(DeviceInfoVO vo) {
        Integer result = deviceInfoDAO.insert(vo);
        if (result == 0) {
            throw new DataUpdateException("기기 정보 추가 실패");
        }
    }

    @Override
    public void delete(Integer id) {
        Integer result = deviceInfoDAO.delete(id);
        if (result == 0) {
            throw new DataUpdateException("기기 정보 삭제 실패");
        }
    }

    @Override
    public List<DeviceInfoVO> selectAll() {
        return deviceInfoDAO.selectAll();
    }

    @Override
    public DeviceInfoVO selectById(Integer id) {
        return deviceInfoDAO.selectById(id);
    }

    @Override
    public List<DeviceInfoVO> selectByCompany(String company) {
        return deviceInfoDAO.selectByCompany(company);
    }
}
