package com.company.arrays;
import  java.util.*;
public class reverse_order {
    public static void main(String[] args) {
        int i,j=0,k;
        int r[]=new int[5];
        Scanner n =new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.print("Enter numbers: ");
            r[i] = n.nextInt();
        }
        for(k=4;k>=0;k--)
        {
            System.out.println(r[k]);
        }
    }
}
