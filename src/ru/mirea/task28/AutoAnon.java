package ru.mirea.task28;

public class AutoAnon {
    public void moving() {
        System.out.println("Поехали");
    }

    public static void main(String[] args) {
        AutoAnon anonAutoStop = new AutoAnon() {
            @Override
            public void moving() {
                System.out.println("Приехали");
            }
        };

        AutoAnon notAnonAutoStop = new AutoAnon().new AutoStop();

        anonAutoStop.moving();
        notAnonAutoStop.moving();
    }

    private class AutoStop extends AutoAnon {
        @Override
        public void moving() {
            System.out.println("Приехали");
        }
    }
}
