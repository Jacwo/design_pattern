package com.flashhold.build;

public class Director {
    public void Construct(Builder builder){
        builder.buildCpu();
        builder.buildHD();
        builder.buildMainboard();
    }
}
