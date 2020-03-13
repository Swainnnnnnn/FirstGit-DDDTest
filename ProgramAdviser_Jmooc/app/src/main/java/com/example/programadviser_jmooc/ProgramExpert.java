package com.example.programadviser_jmooc;

public class ProgramExpert {
    public String getLanguage(String feature){
        String res = null;
        switch (feature){
            case "fast":
                res = "C/C++";break;
            case "easy":
                res = "Python";break;
            case "new":
                res = "Kotlin";break;
            case "OO":
                res = "Java";break;
            default:break;
        }
        return res;
    }
}
