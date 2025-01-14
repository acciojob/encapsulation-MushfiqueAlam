package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly=new RWOnly();
        rwOnly.setName("Mushfique");
//        System.out.println(rwOnly.name);//name has private access in com.driver.RWonly
        System.out.println(rwOnly.getName());

        //for checking github commit successful or not
    }
}