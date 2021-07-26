package com.company.constructors;

import java.util.*;

public class Bill {
    int bno,call;
    double amt,rental = 125;
    String name;
    Bill(int a,int b,String c)
    {
        bno=a;
        call=b;
        name=c;
    }
    void Calculate() {

        if (call <= 100) {
            amt = (call * 0.60);
        }
        if ((call > 100) && (call <= 200)) {
            amt = (call * 0.80);
        }
        if ((call > 200) && (call <= 300)) {
            amt = (call * 1.20) ;
        }
        if ((call > 300)) {
            amt = (call * 1.50) ;
        }
    }
    void display()
    {
        System.out.println("Bill number= "+bno);
        System.out.println("Customer name= "+name);
        System.out.println("No. Calls in a month= "+call);
        System.out.println("monthly rental fees= "+rental);
        System.out.println("Total Bill amount= "+amt);
    }

    public static void main(String[] args) {
        int x,y;
        String n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the Bill number: ");
        x=s.nextInt();
        System.out.print("Enter of the Customer name: ");
        n=s.next();
        System.out.print("Enter number of Calls in a month: ");
        y=s.nextInt();
        Bill m=new Bill(x,y,n);
        m.Calculate();
        m.display();
    }
}
