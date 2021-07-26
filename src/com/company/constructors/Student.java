package com.company.constructors;
import java.util.*;
public class Student {
    int mm,scm,comp;
    double avg,avg2;
    String name;
    Student(String a,int b,int c,int d)
    {
        name=a;
        mm=b;
        scm=c;
        comp=d;
    }
    void check()
    {
        avg=(double) (mm+scm+comp)/3;
        avg2=(double) (scm+comp)/2;
        System.out.print("The eligibility is: ");
        if(avg>=90)
        {
            System.out.println("SCIENCE with COMPUTER ");
        }
        if(avg2>=90)
        {
            System.out.println("BIO SCIENCE ");
        }

    }
}
