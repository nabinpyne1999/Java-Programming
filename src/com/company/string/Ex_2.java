package com.company.string;
import java.util.*;
import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        int b,i;
        String a;
        Scanner n=new Scanner(System.in);
        System.out.print("Enter a Word : ");
        a = n.nextLine();
        b=a.length();
        for(i=0;i<b;i++) {
            if ((a.charAt(i) != 'A') && (a.charAt(i) != 'E') && (a.charAt(i) != 'I') && (a.charAt(i) != 'O') && (a.charAt(i) != 'U')) {
                System.out.print(a.charAt(i));
            }
        }
    }
}
