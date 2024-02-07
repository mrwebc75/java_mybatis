package main;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java_mybatis.common.MyBatisManager;
import model.MemberVO;

public class Step50_SelectOne {

  public static void main(String[] args) {

    SqlSessionFactory sqlSessionFactory = MyBatisManager.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession(false);

    String id = "duly2";
    MemberVO vo = sqlSession.selectOne("member.getOne", id);

    if (vo != null) {
      System.out.println(vo.toString());
    } else {
      System.out.println("해당 아이디로 조회된 테이터가 없습니다.");
    }

    sqlSession.close();
  }
}
