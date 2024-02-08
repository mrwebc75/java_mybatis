package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java_mybatis.common.MyBatisManager;
import model.MemberVO;

public class Step80_SelectPagingList {

  public static void main(String[] args) {

    SqlSessionFactory sqlSessionFactory = MyBatisManager.getSqlSessionFactory();
    SqlSession sqlSession = sqlSessionFactory.openSession(false);

    // 1. Array 데이터를 넘기는 경우(80-1번예제)
    // String[] arrID = { "duly2", "duly4" };
    // List<MemberVO> list = sqlSession.selectList("member.selectMulty", arrID);

    // 2. List 데이터로 직접 넘기는 경우(80-2번예제)
    // List<Integer> listLimit = new ArrayList<Integer>();
    // listLimit.add(50);
    // listLimit.add(3);
    // List<MemberVO> list = sqlSession.selectList("member.pagingList_list",
    // listLimit);// MemberVO

    // 3. List 데이터로 Map을 통해서 넘기는 경우(80-3번예제)
    List<Integer> listLimit = new ArrayList<Integer>();
    listLimit.add(50);
    listLimit.add(3);

    // map 변수를 선언하시오.
    Map<String, Object> listMap = new HashMap<String, Object>();
    listMap.put("listLimit", listLimit);

    List<MemberVO> list = sqlSession.selectList("member.pagingList_mapList", listMap);

    if (list.size() > 0) {
      for (MemberVO vo : list) {
        System.out.println(vo.toString());
      }
    } else {
      System.out.println("조회된 데이터가 없습니다.");
    }

  }// main
}
