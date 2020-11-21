package com.KosolapovNikolai;

public class Cat {

    public void meow(){
        System.out.println("Meow!");
    }

    public void meowFromArray(String[] sounds , int index) throws ArrayIndexOutOfBoundsException{
        System.out.println(sounds[index]);
    }
}
