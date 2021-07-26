package com.company.constructors;

import java.util.*;

public class LaptopBuy {
    double price,dis,amt;
    String name;
    LaptopBuy(String n,double b)
    {
        name=n;
        price=b;
    }
    void discount()
    {
        if(price<=25000)
        {
            dis=price*5.0/100;
            amt=(price*95)/100;
        }
        if((price>25001)&&(price<=50000))
        {
            dis=price*7.5/100;;
            amt=(price*92.5)/100;
        }
        if((price>50001)&&(price<=100000))
        {
            dis=price*10.0/100;
            amt=(price*90)/100;
        }
        if(price>100000)
        {
            dis=price*15.0/100;
            amt=(price*85 )/100;
        }
    }
    void display()
    {
        System.out.println("Customer Name= "+name);
        System.out.println("Laptop Price= "+price);
        System.out.println("Discount on Laptop in this Price= "+dis);
        System.out.println("Amount to be paid after Discount= "+amt);
    }

    public static void main(String[] args) {
        double x;
        String y;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter The Customer Name: ");
        y=s.nextLine();
        System.out.print("Enter The Laptop Price: ");
        x=s.nextDouble();
        LaptopBuy n=new LaptopBuy(y,x);
        n.discount();
        n.display();
    }
}
