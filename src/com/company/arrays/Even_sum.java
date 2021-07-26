package com.company.arrays;

import java.util.Scanner;

public class Even_sum {
    public static void main(String[] args) {
        int i,sum=0,j;
        int e[]=new int[5];
        Scanner n =new Scanner(System.in);
        for(i=0;i<5;i++) {
            System.out.print("Enter numbers: ");
            e[i] = n.nextInt();
        }
        for (j=0;j<5;j++){
            if(e[j]%2==0)
            {
                System.out.println("even number= "+e[j]);
                sum=sum+e[j];
            }
        }
        System.out.println("sum even numbers= "+sum);
    }
}
