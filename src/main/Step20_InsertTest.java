package main;

import org.apache.ibatis.session.SqlSessionFactory;

import java_mybatis.common.MyBatisManager;

public class Step20_InsertTest {

  public static void main(String[] args) {

    SqlSessionFactory sqlSessionFactory = MyBatisManager.getSqlSessionFactory();
    sqlSessionFactory.openSession(false);// 만약 true로 하면 autocommit 처리됨

  }// main
}
