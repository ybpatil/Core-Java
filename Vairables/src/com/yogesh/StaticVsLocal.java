package com.yogesh;

public class StaticVsLocal {

    static int a = 10; // Static Variable
    int c = 20; // Instance Var

    void fun(){
        int b = 10;
        System.out.println(a + " "+b);// Local variable
        a++; b++;
    }
    public static void main(String[] args) {
        StaticVsLocal refV = new StaticVsLocal();
        refV.fun(); //
        refV.fun(); // when we run fun method second time memory of local var a  will be destroyed as it's scope is only within block

    }
}
