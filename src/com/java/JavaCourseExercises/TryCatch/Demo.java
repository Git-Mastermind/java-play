package com.java.JavaCourseExercises.TryCatch;

public class Demo {
    public static void main(String[] args) {
        int[] nums = {0,1,5,6,2};
        try {
            System.out.println(nums[0]);
            int num0 = nums[0];
            int num5 = nums[5];
            int result = num5/num0;
            
        }

        catch(ArithmeticException error) {
            System.out.println("cannot divide by zero");
        }
        catch (IndexOutOfBoundsException error) {
            System.out.println("index out of bounds");
        }
        catch (Exception e) {
            System.out.println("Something went wrong" + e);
        }
        

    }
}
