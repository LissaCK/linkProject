package com.linkedin.testData;

public class User {
    private String emailOrPhone;
    private String password;

    public User(){
        emailOrPhone = "ls-80@mail.ru";
        password = "maylo2012";


    }

    public String getEmailOrPhone(){
        return emailOrPhone;
    }

    public String getPassword(){
        return password;
    }

}
