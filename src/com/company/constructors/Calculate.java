package com.company.constructors;
import java.util.*;
public class Calculate {
    int num,f,rev;
    Calculate(int n)
    {
        num=n;
        f=0;
        rev=0;
    }
    int prime(){
        int i,p=0;

        for(i=2;i<num;i++) {
            if(num%i==0) {
                p = 1;
            }
        }
        if(p==0)
        {
            f= 1;
        }
        else {
            f=0;
        }
        return f;
    }
    int reverse() {

        int b = num,d;
        while (b!=0)
        {
            d=b%10;
            b=b/10;
            rev=rev*10+d;
        }
        return rev;
    }
    void display() {
        if (f == 1 && rev == num)
            System.out.println(num + " is prime palindrome");
        else
            System.out.println(num + " is not prime palindrome");
    }
    public static void main(String[] args) {
        int x;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a number: ");
        x=s.nextInt();
        Calculate y = new Calculate(x);
        y.prime();
        y.reverse();
        y.display();
    }
}