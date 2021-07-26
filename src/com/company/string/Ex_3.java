package com.company.string;
import  java.util.*;

//display the first letter of each word//

public class Ex_3 {
    public static void main(String[] args) {
        int x,i;
        String a;
char ch;
       Scanner n=new Scanner(System.in);
        System.out.print("Enter name : ");
        a = n.nextLine();
        x=a.length();
	System.out.print(a.charAt(0)+" ");
        for(i=0;i<x-1;i++){
	ch=a.charAt(i);
           if(ch==' ')
                System.out.println(a.charAt(i+1) + " ");
        }

    }
}