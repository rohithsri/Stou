package com.example.stou.Model;

public class User {
    private String Name;
    private String Password;
    private String secureCode;
    private String Phone; //sprint2
    private String staff; //sprint 3 server side

   public User() {

   }

    public User(String name, String password, String secureCode) {
        Name = name;
        Password = password;
        this.secureCode = secureCode;
        staff = "false"; 
    }

    public String getStaff() {
        return staff;
    }

    public void setStaff(String staff) {
        this.staff = staff;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getSecureCode() {
        return secureCode;
    }

    public void setSecureCode(String secureCode) {
        this.secureCode = secureCode;
    }
}
