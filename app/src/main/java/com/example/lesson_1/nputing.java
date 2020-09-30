package com.example.lesson_1;

import android.widget.EditText;

import java.util.Date;

public class nputing {
//    private static String Sname ="";
//    private static String Fname ="";
//    private static String Pass ="";
//    private static String Passproof ="";
//    private static Date Birth;

    public void readdata() {
    }

//    public void CheckIt(String firstname, String secondname, String Pass, String PassCheck ){
//        boolean a,b,c,d;
//        while(a&b&c&d)
//        a = isAlpha(firstname);
//        b = isAlpha(secondname);
//        c = checkPass(Pass);
//        d = proofPass(Pass, PassCheck);
//
//
//
//    }
    public static boolean isAlpha(String name) {
        if(name.matches("[а-яА-Я]+"))
            return true;
        else return false;
    }

    public static boolean checkPass(String Pass){
        if(isAlpha(Pass)){
//            output ("Пароль должен содержать цифры");
            return false;
        }
        return true;
    }

    public static boolean proofPass(String pass, String passcheck) {
        if (pass == passcheck){
            return true;
        }
        else {
//            output("Пароли не совпадают");
            return false;
        }
    }

}
