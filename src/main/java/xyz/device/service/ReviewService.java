package xyz.device.service;

import xyz.device.model.ReviewVO;

import java.util.List;

public interface ReviewService {

    public void insert(ReviewVO vo);

    public void delete(Integer id);

    public List<ReviewVO> selectByDevId(Integer dev_id);
}
