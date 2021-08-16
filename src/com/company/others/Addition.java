package com.company.others;
import java.util.Scanner;
public class Addition {
    public static void main(String[] args) {
        double a,b,c;
        Scanner n =new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        a=n.nextInt();
        System.out.print("Enter 2nd number: ");
        b=n.nextInt();
        c=a+b;
        System.out.println("Addition of 2 numbers= "+c);
    }
}
