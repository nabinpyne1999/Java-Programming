package com.company.arrays;
import java.util.*;
public class Frequency {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int a,i,j,b=-1,c;
        System.out.print("Enter the size of array: ");
        a=p.nextInt();
        int[] x=new int[a];
        int[] y=new int[a];
        for(i=0;i<a;i++)
        {
            System.out.print("Enter the value in position "+(i+1)+":");
            x[i]=p.nextInt();
        }
        for(i=0;i<a;i++)
        {
            c=1;
            for(j=i+1;j<a;j++) {
                {
                    if (x[i] == x[j]) {
                        c++;
                        y[j] = b;
                    }
                }
                if (y[i] != b) {
                    y[i] = c;
                }
            }
        }
        System.out.println("Element | Frequency");
        for(i=0;i<a;i++)
        {
            if(y[i]!=b)
            {
                System.out.println(" "+x[i] +" |"+y[i] );
            }
        }
    }
}