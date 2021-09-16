package ru.mirea.task5;

public abstract class Dish {
    private String colour;
    public static class Mug extends Dish{
        private int area;
        public void drink(){
            System.out.println("Пью из кружки");
        }

    }

    public static class Knife extends Dish{
        private int length;
        public void cut(){
            System.out.println("Нож режет");
        }



    }

}
