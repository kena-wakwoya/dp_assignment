package com.company;

public class OverloadingMethod {


    public void display(String c)
    {
        System.out.println(c);
    }
    public void display(String fname,String lname){
        System.out.println(lname +" "+  lname);
    }
    public void display(String c, int id)
    {
        System.out.println(c + " "+id);
    }

    // to see  how the overloaded method acts
    public static void main(String args[]){
        OverloadingMethod om = new OverloadingMethod();
        om.display("Kena");//the first method.
        om.display("kena","wak"); // overloaded method by adding the parameters number.
        om.display("me",6);//the overloaded method with different data type.


    }

}
