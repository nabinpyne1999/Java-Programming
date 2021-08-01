package com.company.arrays;
import java.util.*;
public class Exist_number {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int i, s = 0, k,x,f=0,m;
        System.out.print("Enter the size: ");
        m = n.nextInt();
        int[] e = new int[m];
        for (i = 0; i < m; i++) {
            System.out.print("Enter numbers: ");
            e[i] = n.nextInt();
        }
        System.out.print("Enter the number to be searched: ");
        x = n.nextInt();
        for (k = 0; k<m; k++)
        {
            if (e[k]==x)
            {
                s=s+1;
                f=1;
            }
        }
        if(f==0)
        {
            System.out.println("the number is not present ");
        }
        else {
            System.out.println("The number is present= " + s + " times...");
        }
    }
}

