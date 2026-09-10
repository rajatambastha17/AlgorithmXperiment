package com.preps.javaconcepts.oopsconcepts.abstraction.interfaces;

import java.lang.*;

// Level 1
interface Bank {
    void deposit();

    void withdraw();

    void loan();

    void account();
}

// Level 2
abstract class Dev1 implements Bank {
    public void deposit() {
        System.out.println("Your deposit Amount :" + 100);
    }
}

abstract class Dev2 extends Dev1 {
    public void withdraw() {
        System.out.println("Your withdraw Amount :" + 50);
    }
}

// Level 3
class Dev3 extends Dev2 {
    public void loan() {
    }

    public void account() {
        System.out.println("account d3");
    }
}

// Level 4
class GFG {
    public static void main(String[] args) {
        Dev3 d = new Dev3();
        d.account();
        d.loan();
        d.deposit();
        d.withdraw();
        Dev2 d2 = new Dev3();
        d2.account();
        d2.deposit();
    }
}
