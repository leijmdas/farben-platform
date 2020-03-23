package com.farben.platform.testcase.common;

public class FarbenConst {
  //public static String base_url = "http://localhost:8085";
  public static String base_url_dev = "http://localhost:10092";
  public static String base_url_test = "http://120.77.172.83:10092";
  public static String base_url = base_url_dev;


  public static int USER_TEST_ID = 388;
  public static String USER_TEST_LOGIN = "13612912836";
  public static String USER_TEST_LOGIN_PWD = "111111";

  public static int USER_ID = 389;
  public static String USER_NORMARL_LOGIN = "18028750812";
  public static String USER_NORMAL_LOGIN_PWD = "111111";
  public static int USER_BOOKINGORDER_ID = 1000;


  public static int PARK_ID_ACTIVE =  1;
  public static int PARK_ID_PREPUBLISH =  3;




  //service
  /**
   * 自预约 1
   */
  public static final int TYPE_SELF = 1;

  /**
   * 代预约 2
   */
  public static final int TYPE_AGENCY = 2;

}
