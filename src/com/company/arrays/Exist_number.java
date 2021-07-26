package com.company.arrays;

import java.util.Scanner;

public class Exist_number {
    public static void main(String[] args) {
        int i, s = 0, k,x;
        int e[] = new int[5];
        Scanner n = new Scanner(System.in);
        for (i = 0; i < 5; i++) {
            System.out.print("Enter numbers: ");
            e[i] = n.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        x = n.nextInt();
        for (k = 0; k<5; k++)
        {
            if (e[k]==x)
            {
                s=s+1;
            }
        }
        System.out.println("The number is present= "+s+" times...");
    }
}

