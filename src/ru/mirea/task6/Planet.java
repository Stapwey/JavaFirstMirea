package ru.mirea.task6;
public class Planet implements Nameable {
    private String name;
    Planet(String name){
        this.name = name;
    }
    public void print() {
        System.out.println("Планета "+getName());
    }
    public String getName(){
        return name;
    }
}
