package com.aiqiy.testforyou;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestHaah {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream=new FileInputStream("");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
