package ru.mirea.task22;

public class Client {

    private final ChairFactory chairFactory = new ChairFactory();

    public Client() {
    }

    public Chair sit(ChairType type){
        Chair chair = chairFactory.createChair(type);
        System.out.println("Стул" + chair.name + "? Держите");
        return chair;
    }
}
