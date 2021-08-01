package com.company.arrays;
import java.util.*;
public class MaxMin_number {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int i, a,max,min;
        System.out.print("Enter the size: ");
        a = n.nextInt();
        int[] m = new int[a];
        for (i = 0; i < a; i++) {
            System.out.print("Enter numbers: ");
            m[i] = n.nextInt();
        }
        max=m[0];
        min=m[0];
        for (i = 0; i<a; i++)
        {
            if(m[i]>max)
            {
                max=m[i];
            }
            if (m[i]<min)
            {
                min=m[i];
            }
        }
        System.out.println("The max number of the array is= "+max);
        System.out.println("The min number of the array is= "+min);
    }
}
