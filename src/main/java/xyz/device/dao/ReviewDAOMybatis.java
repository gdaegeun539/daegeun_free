package xyz.device.dao;

import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;
import xyz.device.model.ReviewVO;

import java.util.List;

@Setter
@RequiredArgsConstructor
@Repository
public class ReviewDAOMybatis implements ReviewDAO{

    private SqlSession sqlSession;

    private static final String namespace = "xyz.device.mapper.ReviewMapper";

//    리뷰 추가
    @Override
    public Integer insert(ReviewVO vo) {
        return sqlSession.insert(namespace + ".insert", vo);
    }

//    리뷰 수정
    @Override
    public Integer update(ReviewVO vo) {
        return sqlSession.update(namespace + ".update", vo);
    }

//    리뷰 삭제
    @Override
    public Integer delete(Integer id) {
        return sqlSession.delete(namespace + ".delete", id);
    }

//    리뷰 전체 조회
    @Override
    public List<ReviewVO> selectAll() {
        return sqlSession.selectList(namespace + ".selectAll");
    }

//    리뷰 id 단건 조회
    @Override
    public ReviewVO selectById(Integer id) {
        return sqlSession.selectOne(namespace + ".selectById", id);
    }

//    리뷰 기기별 조회
    @Override
    public List<ReviewVO> selectByDevId(Integer dev_id) {
        return sqlSession.selectList(namespace + ".selectByDevId", dev_id);
    }

//    리뷰 기기별 pagination 조회
    @Override
    public List<ReviewVO> selectByDevIdPagination(Integer dev_id, @Param("start") Integer start, @Param("cnt") Integer cnt){
        return sqlSession.selectList(namespace + ".selectByDevIdPagination", dev_id);
    }
}
