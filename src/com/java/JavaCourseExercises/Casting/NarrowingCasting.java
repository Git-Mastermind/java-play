package com.java.JavaCourseExercises.Casting;

public class NarrowingCasting {
    public static void main(String[] args) {
        float floatNumber = 6.8F; // remember to add F because java defaults decimal numbers to double
        System.out.println(floatNumber); // will print 6.8
        
        int intNum = (int) floatNumber; // casting int data type to floatNumber (6.8) and assigning that to integer num
        System.out.println(intNum); // when casting int to float or double the number of rounded down so output would be 6

        byte byteNumber = 32;
        System.out.println(byteNumber); // output: 32

        int intNum2 = (int) byteNumber; // casting type int onto byteNumber (32)
        System.out.println(intNum2); // prediction: output will still be the same::: output was the same

        int intNum3 = 350;
        System.out.println(intNum3); // output: 350

        byte byteNum2 = (byte) intNum3; // casting byte onto intNum3 (350)
        System.out.println(byteNum2); 
    }
}
