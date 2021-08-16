package com.company.arrays;
import java.util.*;
public class numerical_digits {
    public static void main(String[] args) {
        int m = 0, value;
        String s;
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a line: ");
        s = n.nextLine();
        Scanner str = new Scanner(System.in);
        while (str.hasNext()) {
            if (str.hasNextInt())
            {
                value=Integer.parseInt(str.next());
                m+=value;
            }
            else
            {
                str.next();
            }
        }
        System.out.println("add number= "+m);
    }
}