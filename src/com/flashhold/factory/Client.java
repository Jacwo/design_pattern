package com.flashhold.factory;

public class Client {
    public static void main(String[] args) {
        IFactory factory=new Factory();
        IProduct product=  factory.createProduct();
        product.productMethod();
       // System.out.println();
    }
}
