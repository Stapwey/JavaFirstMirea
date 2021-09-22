package ru.mirea.task6;

public class Car implements Nameable {
    private String name;
    Car(String name){
        this.name = name;
    }
    public void print() {
        System.out.println("Машина "+getName());
    }
    public String getName(){
        return name;
    }
}
