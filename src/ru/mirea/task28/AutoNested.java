package ru.mirea.task28;

public class AutoNested {
    private String sign;
    private int id;//номер машины, три цифры
    private Wheels frontWheels = new Wheels(30), backWheels = new Wheels(27);


    public AutoNested(String sign, int id) {
        this.sign = sign;
        this.id = id;
    }

    private class Wheels {
        private int d;//диаметр колеса

        private Wheels(int d) {
            this.d = d;
        }

        public int getD() {
            return d;
        }

        public void setD(int d) {
            this.d = d;
        }

        @Override
        public String toString() {
            return "Wheels{" +
                    "d=" + d +
                    '}';
        }
    }

    public String getSign() {
        return sign;
    }

    public int getId() {
        return id;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AutoNestedClass{" +
                "\nsign='" + sign + '\'' +
                "\nid=" + id +
                "\nfrontWheels=" + frontWheels.toString() +
                "\nbackWheels=" + backWheels.toString() +
                "\n}";
    }

    public static void main(String[] args) {
        AutoNested a1 = new AutoNested("BMW", 771);
        System.out.println(a1.toString());
    }
}
