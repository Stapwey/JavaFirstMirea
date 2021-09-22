package ru.mirea.task6;

public class Table implements Priceable {
    private int price;
    Table(int price){
        this.price = price;
    }
    public void print() {
        System.out.println("Стоимость стола "+getPrice()+"р");
    }
    public int getPrice(){
        return price;
    }
}
