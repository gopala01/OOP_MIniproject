package com.company;

import java.util.ArrayList;

public class Protagonist implements Mammal{
    //An implementation of Mammal, our main hero. We choose their name, age and all other aspects
    private final String name;
    private final int age;
    private int points;
    private Bag bag;
    private int health;

    public Protagonist(){
        this.name = "";
        this.age = 0;
        this.points = 0;
        this.bag = new Bag();
        this.health = 10;
    }

    public Protagonist(String name, int age){
        this.name = name;
        this.age = age;
        this.points = 0;
        this.bag = new Bag();
        this.health = 10;
    }

    //Always starts with points of 0 and health of 10

    public String getName(){
        return this.name;
    }


    public int getAge(){return this.age;}

    public int getPoints(){
        return this.points;
    }

    public void addPoints(int n){this.points = this.points + n;}

    public void addItem(Item item){
        this.bag.add(item);
    }

    public void removeItem(Item item){
        for (int i = 0; i < bag.getSize(); i++) {
            if (bag.getItem(i).equals(item)){
                this.bag.removeItem(item);

            }
        }

    }

    public Item getItem(int index){
        return this.bag.getItem(index);
    }


    public int getNumItems(){
        return this.bag.getSize();
    }
    public int getHealth(){
        return this.health;
    }

    public void heal(int n){this.health = this.health + n;}

    public void removeHealth(int damage){
        this.health = this.health - damage;
    }

    public void getAllItems(){
        for (int i = 0; i < this.bag.getSize(); i++) {
            System.out.println((i+1) + "" + this.bag.getItem(i));
        }
    }




    @Override
    public void eat() {
        this.health = this.health + 2;
    }

    @Override
    public void run() {
        System.out.println("HUFF!");
    }

    //The implementation of the interface Mammal
}
