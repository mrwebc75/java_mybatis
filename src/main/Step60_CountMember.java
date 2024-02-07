package main;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java_mybatis.common.MyBatisManager;

public class Step60_CountMember {

  public static void main(String[] args) {

    SqlSessionFactory sqlSessionFactory = MyBatisManager.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession(false);

    int countMember = sqlSession.selectOne("member.countById");

    if (countMember > 0) {
      System.out.printf("가입된 회원수는 %d명 입니다.", countMember);
    } else {
      System.out.println("가입된 회원이 없습니다.");
    }

  }// main
}
