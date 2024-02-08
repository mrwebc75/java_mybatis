package main;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java_mybatis.common.MyBatisManager;

public class Step90_SearchList {

  public static void main(String[] args) {
    
    SqlSessionFactory sqlSessionFactory = MyBatisManager.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession(true);//autocommit
    
    Map<String, String> srchMap = new HashMap<String, String>();
    srchMap.put("field", "name");
    srchMap.put("value", "홍길동");
    
    sqlSession.selectList("member.?",srchMap);
    
  }//main
}
















