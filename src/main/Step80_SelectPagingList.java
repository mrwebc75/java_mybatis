package main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java_mybatis.common.MyBatisManager;
import model.MemberVO;

public class Step80_SelectPagingList {

  public static void main(String[] args) {

    SqlSessionFactory sqlSessionFactory = MyBatisManager.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession(false);

    // 1. Array 데이터를 넘기는 경우
    String[] arrID = { "duly2", "duly4" };

    List<MemberVO> list = sqlSession.selectList("member.selectMulty", arrID);

    if (list.size() > 0) {
      for (MemberVO vo : list) {
        System.out.println(vo.toString());
      }
    } else {
      System.out.println("조회된 데이터가 없습니다.");
    }

    // 2. List 데이터를 넘기는 경우

    // 3. Map 데이터를 넘기는 경우

    // sqlSession.selectList("member.pagingList", 0, 10);

  }// main
}
