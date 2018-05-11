package com.flashhold.singleton;

public class Singleton {
    //饿汉式
  /*  private static  Singleton singleton=new Singleton();
    private  Singleton(){};
    public static  Singleton getInstance(){
        return singleton;
    }*/
  //懒汉式
  private static  Singleton singleton;
    private  Singleton(){};
    public static synchronized Singleton getInstance(){
        if(singleton==null){
            singleton=new Singleton();
        }
        return singleton;
    }
    public static void main(String []args){
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());

    }
}
