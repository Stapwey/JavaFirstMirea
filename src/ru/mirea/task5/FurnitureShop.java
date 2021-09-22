package ru.mirea.task5;

public class FurnitureShop {
    public static void main(String[] args) {
        Furniture chair = new Furniture.Chair("Десять", 2300, "дуб",10);
        System.out.println("Производитель: " + chair.getManufacturer());
        System.out.println("Стоймость: " + chair.getPrice());
        System.out.println("Материал: " + chair.getMaterial());
        System.out.println("Высота спинки "+ ((Furniture.Chair) chair).getBackrestheight());
    }
}
