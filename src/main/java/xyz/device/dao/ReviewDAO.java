package xyz.device.dao;

import xyz.device.model.ReviewVO;

import java.util.List;

public interface ReviewDAO {

    public Integer insert(ReviewVO vo);

    public Integer update(ReviewVO vo);

    public Integer delete(Integer id);

    public List<ReviewVO> selectAll();

    public ReviewVO selectById(Integer id);

    public ReviewVO selectByUname(String uname);

    public List<ReviewVO> selectByDevId(Integer dev_id);
}
