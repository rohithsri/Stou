package com.example.stou.Common;

import com.example.stou.Model.User;

public class Common {
    public static User currrentUser;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static String convertCodeToStatus(String status) {
        if(status.equals("0")){
            return "Order Placed";
        }else if(status.equals("1")){
            return "Order is being prepared";
        }else{
            return "Order is shipped";
        }
    }
}
