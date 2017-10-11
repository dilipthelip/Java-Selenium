package com.learnJava.oops;

/**
 * Created by z001qgd on 10/7/17.
 */
public class Sample {

    public static void main(String[] args) {

        Pen mishraPen = new Pen();
        mishraPen.bodyType = "PushPen";
        mishraPen.lenght=5;
        mishraPen.color="black";
        mishraPen.owner="SubbuMishra";
        mishraPen.isDiscountAvailble = true;
        mishraPen.price=20.09;


        System.out.println(mishraPen.owner + " Pen Properties are : " + mishraPen.bodyType +" ," + mishraPen.lenght +" , "+ mishraPen.color);

        System.out.println("Method Call : " + mishraPen.getTheDiscountValue(mishraPen.isDiscountAvailble ));

        Pen dilipPen=new Pen();
        dilipPen.color="blue";
        dilipPen.lenght=2;
        dilipPen.bodyType="normal";
        dilipPen.owner="Dilip";
        dilipPen.isDiscountAvailble = false;
        dilipPen.price=10.09;


        System.out.println(dilipPen.owner  +" Pen Properties are : " + dilipPen.bodyType +" ," + dilipPen.lenght +" , "+ dilipPen.color);

        System.out.println("Method Call : " + dilipPen.getTheDiscountValue(dilipPen.isDiscountAvailble ));

    }
}
