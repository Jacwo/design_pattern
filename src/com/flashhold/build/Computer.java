package com.flashhold.build;

import java.util.ArrayList;
import java.util.List;

public class Computer {
    private List<String> parts=new ArrayList<>();
    public void add(String part){
        parts.add(part);
    }
    public void show(){
        for (int i=0;i<parts.size();i++) {
            System.out.println(parts.get(i));
        }
        System.out.println("组装完成");
    }
}
