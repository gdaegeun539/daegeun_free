package xyz.device.dao;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import xyz.device.model.DeviceInfoVO;

import java.util.List;

@Setter
@RequiredArgsConstructor
@Repository
public class DeviceInfoDAOMybatis implements DeviceInfoDAO{

    private SqlSession sqlSession;

    private static final String namespace = "xyz.device.mapper.DeviceInfoMapper";

    // 기기 정보 추가
    @Override
    public Integer insert(DeviceInfoVO vo) {
        return sqlSession.insert(namespace + ".insert", vo);
    }

    // 기기 정보 삭제
    @Override
    public Integer delete(Integer id) {
        return sqlSession.delete(namespace + ".delete", id);
    }

    // 기기 정보 수정
    @Override
    public Integer update(DeviceInfoVO vo) {
        return sqlSession.update(namespace + ".update", vo);
    }

    // 기기 평점 수정
    @Override
    public Integer updateRating(Integer id) {
        return sqlSession.update(namespace + ".updateRating", id);
    }

    // 기기 전체 조회
    @Override
    public List<DeviceInfoVO> selectAll() {
        return sqlSession.selectList(namespace + ".selectAll");
    }

    // 기기 id 단건 조회
    @Override
    public DeviceInfoVO selectById(Integer id) {
        return sqlSession.selectOne(namespace + ".selectById", id);
    }

    // 기기 pagination 조회
    @Override
    public List<DeviceInfoVO> selectByPagination(@Param("start") Integer start, @Param("cnt") Integer cnt) {
        return sqlSession.selectList(namespace + ".selectByPagination");
    }

    // 기기 회사로 조회
    @Override
    public List<DeviceInfoVO> selectByCompany(String company) {
        return sqlSession.selectList(namespace + ".selectByCompany", company);
    }

    // 기기 회사 pagination 조회
    @Override
    public List<DeviceInfoVO> selectByCompanyPagination(String company, @Param("start") Integer start, @Param("cnt") Integer cnt) {
        return sqlSession.selectList(namespace + ".selectByCompanyPagination", company);
    }
}
