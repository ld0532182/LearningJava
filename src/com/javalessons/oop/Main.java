package com.javalessons.oop;

public class Main {
    public static void main(String[] args) {

        System.out.println("Dog's count " + Dog.getDogsCount());
        Dog lab = new Dog();
        lab.setName("Charley");
        lab.setBreed("Lab");
        lab.setSize(Size.AVERAGE);
        lab.bite();


        Dog sheppard = new Dog();
        sheppard.setName("Mike");
        sheppard.setBreed("Sheppard");
        sheppard.setSize(Size.BIG);
        sheppard.bite();

        Dog doberman = new Dog();
        doberman.setName("Jack");
        doberman.setBreed("Doberman");
        doberman.setSize(Size.SMALL);
        doberman.bite();

        System.out.println("Lab's name is " + lab.getName());
        System.out.println("Sheppard's name is " + sheppard.getName());
        System.out.println("Lab has " + Dog.PAWS + " paws");

        Size s = Size.SMALL;
        Size s1 = Size.valueOf("SMALL");
        System.out.println(s1);
    }
}
