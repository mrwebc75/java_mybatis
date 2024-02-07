package main;

import java.util.Calendar;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java_mybatis.common.MyBatisManager;
import model.MemberVO;

public class Step30_UpdateTest {

  public static void main(String[] args) {

    SqlSessionFactory sqlSessionFactory = MyBatisManager.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession(false);

    MemberVO vo = new MemberVO();
    vo.setMemberid("duly");
    vo.setName("아기공룡둘리");
    vo.setPw(2222);
    vo.setPhone("010-7294-3724");
    vo.setEmail("duly@nate.com");
    vo.setRegtime(Calendar.getInstance().getTime());

    int result = sqlSession.update("member.update", vo);
    System.out.println("result = " + result);

    /*
     * 마이바티즈 트랜잭션 처리
     * 
     * insert, delete, update 문장은 DB에 바로 반영하지 말고 commit()/rollback()으로 최종 결정
     * sqlSession이 제공하는 commit()/rollback() 메소드를 호출하는 것과 동시에 트랜잭션이 종료된다. 트랜잭션에 대한
     * 제어를 마이바티즈가 담당한다.
     */
    if (result > 0) {
      sqlSession.commit();// 실제 DB에 반영
    } else {
      sqlSession.rollback();// 작업취소
    }

    sqlSession.close();

  }

}
