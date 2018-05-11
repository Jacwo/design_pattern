package com.flashhold.build;

public class ConcreteBuilder extends Builder {
    Computer computer=new Computer();
    @Override
    public void buildCpu() {
        computer.add("cpu");
    }

    @Override
    public void buildHD() {
        computer.add("HD");
    }

    @Override
    public void buildMainboard() {
        computer.add("Mainboard");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
