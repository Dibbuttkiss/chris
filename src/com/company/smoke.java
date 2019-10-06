package com.company;

public class smoke {
//attributes
    float radius;private static final float PI = 3.1416f;

    void Area(){
       System.out.print(PI*radius*radius);
    }

    void Circumference(){
        System.out.println(2*PI*radius);
    }


    smoke (int r)
    {

        radius = r;

    }



}
