package com.example.stou.Common;

import com.example.stou.Model.User;

public class Common {
    public static User currrentUser;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";
<<<<<<< HEAD

    public static String convertCodeToStatus(String status) {
        if(status.equals("0")){
            return "Order Placed";
        }else if(status.equals("1")){
            return "Order is out for delivery";
        }else{
            return "Order is delivered";
        }
    }
=======
>>>>>>> f41793933d4e682d5106f7b0471df756a1d0c19e
}
