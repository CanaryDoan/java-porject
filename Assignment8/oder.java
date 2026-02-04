package lec8_objectandclass.orderofparameters;

import jdk.jfr.StackTrace;

public class oder {

    public static void thongTin(String name, int age) {
        System.out.println("name: " + name + ", age: " + age);
    }

    public static void thongTin(int age, String name) {
        System.out.println("age: " + age + ", name: " + name);
    }
}
