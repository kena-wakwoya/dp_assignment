package com.company;

public class Main2 {
    public static void main(String[] args) {
        C c = new C();
        c.methodOne();     // output: A: doing methodOne()
        c.methodTwo();     // output: A: doing methodTwo()
        c.toB();
        c.methodOne();     // output: B: doing methodOne()
        c.methodTwo();     // output: B: doing methodTwo()
    }
}


class A implements Inter {
    public void methodOne() { System.out.println("A: doing methodOne()"); }
    public void methodTwo() { System.out.println("A: doing methodOne()"); }
}

class B implements Inter {
    public void methodOne() { System.out.println("B: doing methodTwo()"); }
    public void methodTwo() { System.out.println("B: doing methodTwo()"); }
}

class C implements Inter {
    // delegation
    Inter i = new A();

    public void methodOne() { i.methodOne(); }
    public void methodTwo() { i.methodTwo(); }

    // normal attributes
    void toA() { i = new A(); }
    void toB() { i = new B(); }
}

