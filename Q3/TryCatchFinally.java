package com.company;

public class TryCatchFinally {


    public static void main (String[] args)
    {

        // array of size 10.
        int[] arr = new int[10];

        try
        {
            int i = arr[10];


            System.out.println("Inside try block");
        }


        catch(NullPointerException ex)
        {
            System.out.println("Exception has been caught");
        }

        finally
        {
            System.out.println("finally block executed");
        }

        // rest program will not execute
        System.out.println("Outside try-catch-finally clause");
    }
}


