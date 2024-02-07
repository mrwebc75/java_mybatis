package main;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java_mybatis.common.MyBatisManager;
import model.MemberVO;

public class Step70_SelectList {

  public static void main(String[] args) {

    SqlSessionFactory sqlSessionFactory = MyBatisManager.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession(false);

    List<MemberVO> list = sqlSession.selectList("member.findAll");
    
    if(list.size()>0) {
      for(MemberVO vo : list) {
        System.out.println(vo.toString());
      }
    }else {
      System.out.println("조회된 데이터가 없습니다.");
    }

  }// main
}













