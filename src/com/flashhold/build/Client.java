package com.flashhold.build;

public class Client {
    public static void main(String[] args) {
        Director director=new Director();
        Builder builder=new ConcreteBuilder();
        director.Construct(builder);
        Computer computer = builder.getComputer();
        computer.show();
    }
}
