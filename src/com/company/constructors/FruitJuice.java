package com.company.constructors;

import java.util.*;

public class FruitJuice {
    int product_code, pack_size, product_price;
    String flavour, pack_type;
    FruitJuice() {
        product_code = 0;
        product_price = 0;
        pack_size = 0;
        flavour = "";
        pack_type = "";
    }
    void input() {
        Scanner n =new Scanner(System.in);
        System.out.print("Enter the Product Code: ");
        product_code =n.nextInt();
        System.out.print("Enter the Product Flavour: ");
        flavour=n.next();
        System.out.print("Enter the Product Pack Type: ");
        pack_type=n.next();
        System.out.print("Enter the Product Pack Size: ");
        pack_size =n.nextInt();
        System.out.print("Enter the Product Price: ");
        product_price=n.nextInt();
    }
    void discount() {
        product_price =product_price - 10;
    }

    void display() {
        System.out.println("Product Code= " + product_code);
        System.out.println("Product Flavour= " + flavour);
        System.out.println("Product Pack Type= " + pack_type);
        System.out.println("Product Pack Size= " + pack_size);
        System.out.println("Product Price= " + product_price);
    }
    public static void main(String[] args) {
        FruitJuice a=new FruitJuice();
        a.input();
        a.discount();
        a.display();
    }
}
