package com.company.constructors;

import java.util.*;

public class BookFair {
    double price;
    String Bname;
    Scanner n = new Scanner(System.in);

    BookFair() {
        Bname = "";
        price = 0;
    }

    void input() {
        System.out.print("Enter Name of the Book: ");
        Bname = n.nextLine();
        System.out.print("Enter Price of the Book: ");
        price = n.nextDouble();
    }
    void calculate()
    {
        if(price<=1000)
        {

            price=(price*98)/100;
        }
        if((price>1000)&&(price<=3000))
        {
            price=(price*90)/100;
        }
        if(price>3000)
        {
            price=(price*85)/100;
        }
    }
    void display() {
        System.out.println("Book Name= " + Bname);
        System.out.println("Book Price= " + price);
        System.out.println("Book after discount= " + price);
    }

    public static void main(String[] args) {
        BookFair s=new BookFair();
        s.input();
        s.calculate();
        s.display();
    }
}
