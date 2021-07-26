package com.company.constructors;
import java.util.*;
public class Stringop {
    String str;

    Stringop() {
        str = "";
    }

    void accept() {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        str = n.nextLine();
    }

    void encode() {
        int a, i;
        char p,q;
        String d="";
        a = str.length();
        for (i = 0; i < a; i++) {
            p = str.charAt(i);
            q = (char)(p + 2);
            d =d + q;
        }
        System.out.println("\nEncoded Sentence:");
        System.out.println(d);
    }
    void print()
    {
        String g="";
        char b;
        int c,d;
        str =str+" ";
        c=str.length();
        System.out.println("the String in a separate line: ");
        for(d=0;d<c;d++)
        {
            b=str.charAt(d);
            if (b!=' ')
            {
                g=g+b;
            }
            else
            {
                System.out.println(g);
                g="";
            }
        }
    }
    public static void main(String[] args) {

        Stringop y = new Stringop();
        y.accept();
        y.print();
        y.encode();
    }
}
