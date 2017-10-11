package com.learnJava.oops;

/**
 * Created by z001qgd on 10/7/17.
 */
public class Pen {

    String color;
    int lenght;
    char c;
    String bodyType;
    String owner;
    boolean isDiscountAvailble;
    double price;

    /**
     *
     */
            //return
    public String getTheDiscountValue(boolean discountFlag){
    //access modifier

        if(discountFlag)
            return "I got a 10% discount.";
        else
            return  "No Discount";


    }



}
