package com.company.string;
import java.util.*;
public class Ex_6 {
    public static void main(String[] args) {
            int i,b,x;
            String a;
            Scanner n=new Scanner(System.in);
            System.out.print("Enter a Word : ");
        a = n.nextLine();
        b=a.length();
        n.close();
        for (i = 0; i < b; i++) {
            x=a.charAt(i);
            System.out.println("ASCII of " +a.charAt(i)+ "="+ x);

        }
    }
}
