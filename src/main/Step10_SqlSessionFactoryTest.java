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
    
    /*
     * sqlSession 객체가 사용할 수 있는 메소드
     * 
     * 1. sqlSession.insert("네임스페이스.구문id", 전달하는 값)
     * 2. sqlSession.update("네임스페이스.구문id", 전달하는 값)
     * 3. sqlSession.delete("네임스페이스.구문id", 전달하는 값)
     * 4. sqlSession.selectOne("네임스페이스.구문id", 전달하는 값)
     * 5. sqlSession.selectList("네임스페이스.구문id")
     */

  }
}












