package main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java_mybatis.common.MyBatisManager;
import model.MemberVO;

public class Step90_SearchList {

  public static void main(String[] args) {

    SqlSessionFactory sqlSessionFactory = MyBatisManager.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession(true);// autocommit

    // 1. 직접 테이블의 필드명과 값을 저장한 Map 객체를 통해 검색(90-1번 예제)
    // Map<String, String> srchMap = new HashMap<String, String>();
    // srchMap.put("field", "name");
    // srchMap.put("value", "우재남");
    // List<MemberVO> list = sqlSession.selectList("member.srchMap", srchMap);

    // 2. VO객체를 이용해 검색(90-2번 예제)
    MemberVO mVo = new MemberVO();
    // mVo.setName("홍길동");
    // mVo.setPhone("010-4655-1255");
    // mVo.setEmail("hong@naver.com");
    mVo.setMemberid("id3");
    List<MemberVO> list = sqlSession.selectList("member.srchVO", mVo);

    if (list.size() > 0) {
      for (MemberVO vo : list) {
        System.out.println(vo.toString());
      }
    } else {
      System.out.println("조회된 데이터가 없습니다.");
    }

  }// main
}
