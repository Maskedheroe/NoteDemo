package com.example.asus.mynotebook.flags;

import com.example.asus.mynotebook.model.UserBean;

/**
 * Created by asus on 2018/1/31.
 */

public class Flags {
    public static UserBean USER;
    public static final int SEARCH_ONLINE = 1; //模拟在线搜索
    public static final int SEARCH_ONNOTE = 2; //模拟收藏搜索
    public static int SEARCH_ITEM = 0;
    public static int SEARCH_STATE = Flags.SEARCH_ONLINE;          //搜索状态
    public static int currentAccount = -1;       //当前用户身份
    public static int CURRENT_STATUS = 0;  //管理员或者用户身份
    public static  int ISFIRST_START = 0;
}
