package com.company.arrays;
import java.util.*;
public class sum_array {
    public static void main(String[] args) {
        int i,sum=0;
        int m[]=new int[5];
        Scanner n =new Scanner(System.in);
        for(i=0;i<5;i++)
        {
            System.out.print("Enter numbers: ");
            m[i]=n.nextInt();
            sum=sum+m[i];
        }
        System.out.println("Sum of the arrays= " +sum);
    }
}
