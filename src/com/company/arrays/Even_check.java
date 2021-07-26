package com.company.arrays;

import java.util.*;

public class Even_check {
    public static void main(String[] args) {
        int i;
        int e[]=new int[5];
        Scanner n =new Scanner(System.in);
        for(i=0;i<5;i++) {
            System.out.print("Enter numbers: ");
            e[i] = n.nextInt();
        }
        for (i=0;i<5;i++){
            if(e[i]%2==0)
            {
                System.out.println("even number= "+e[i]);
            }
        }
    }
}
