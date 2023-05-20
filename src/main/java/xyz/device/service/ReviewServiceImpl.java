package xyz.device.service;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import xyz.device.dao.DeviceInfoDAO;
import xyz.device.dao.ReviewDAO;
import xyz.device.model.ReviewVO;

import java.util.List;


@Setter
@RequiredArgsConstructor
@Service
public class ReviewServiceImpl implements ReviewService{

    private ReviewDAO reviewDAO;

    private DeviceInfoDAO deviceInfoDAO;

    @Override
    @Transactional( propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, rollbackFor = Exception.class, timeout = 10)
    public void insert(ReviewVO vo) {
        Integer result = reviewDAO.insert(vo);

        if (result == 0){ // TODO 예외 타입 수정 필요?
            throw new RuntimeException("리뷰 추가 실패");
        }

        // 리뷰 추가 후 기기 평점 업데이트
        deviceInfoDAO.updateRating(vo.getDev_id());
    }

    @Override
    public void delete(Integer id) {
        Integer result = reviewDAO.delete(id);

        if (result == 0){ // TODO 예외 타입 수정 필요?
            throw new RuntimeException("리뷰 삭제 실패");
        }
    }

    @Override
    public List<ReviewVO> selectByDevId(Integer dev_id) {
        return reviewDAO.selectByDevId(dev_id);
    }
}
