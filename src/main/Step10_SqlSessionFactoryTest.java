package main;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java_mybatis.common.MyBatisManager;

public class Step10_SqlSessionFactoryTest {

  public static void main(String[] args) {

    // 1. 마이바티즈 설정정보를 가진 객체변수
    SqlSessionFactory sqlSessionFactory = MyBatisManager.getSqlSessionFactory();

    // 2. SQL 쿼리문 실행을 담당할 sqlSession 객체 생성
    SqlSession sqlSession = sqlSessionFactory.openSession(true);// 기본값 false = Not AutoCommit

    System.out.println("sqlSession = " + sqlSession);

  }
}
