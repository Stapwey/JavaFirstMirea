package ru.mirea.task3;

public class Human {
    private String name;
    private int age;
    private boolean head;
    private boolean hand;
    private boolean leg;

    public void setHead(boolean head){
        this.head=head;
    }

    public void setHand(boolean hand) {
        this.hand = hand;
    }

    public void setLeg(boolean leg) {
        this.leg = leg;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHand() {
        return hand;
    }

    public boolean isLeg() {
        return leg;
    }

    public boolean isHead() {
        return head;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        return name + ", "+ age + "лет. "+".";
    }

}
