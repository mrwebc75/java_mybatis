package model;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberVO {

  // memberid, name, pw, phone, email, regtime
  private String memberid;
  private String name;
  private int pw;
  private String phone;
  private String email;
  private Date regtime;

}
