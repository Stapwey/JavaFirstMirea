package ru.mirea.task6;

public class Chair implements Priceable {
    private int price;
    Chair(int price){
        this.price = price;
    }
    public void print() {
        System.out.println("Стоимость стула "+getPrice()+"р");
    }
    public int getPrice(){
        return price;
    }
}
