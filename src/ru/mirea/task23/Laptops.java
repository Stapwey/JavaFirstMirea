package ru.mirea.task23;

public class Laptops {
    private int year = 0;
    private String mark = "";
    private String model ="";
    public Laptops(int year, String mark, String model){
        this.year = year;
        this.mark = mark;
        this.model = model;
    }
    public int hashCode() {
        int result = model == null ? 0 : model.hashCode();
        result = 31 * result + year;
        return result;
    }

    public static void main(String[] args){
        Laptops smart1 = new Laptops(2011, "Acer", "X5000");
        Laptops smart2 = new Laptops(2011, "Asus", "X5000");
        Laptops smart3 = new Laptops(2012, "Lenovo", "X12");
        Laptops smart4 = new Laptops(2001, "HP", "WWW123");
        Laptops smart5 = new Laptops(2011, "MSI", "Modern12");

        //Сравнение объектов
        if(smart1.hashCode()==smart5.hashCode()) {
            System.out.println("Ноутбук " + smart1.mark + " " + smart1.model + " равен ноутбуку " + smart5.mark + " " + smart5.model);
        }
        else System.out.println("Ноутбук " + smart1.mark + " " + smart1.model + " НЕ равен ноутбуку " + smart5.mark + " " + smart5.model);
        System.out.println("Хеш-код Ноутбука " + smart1.mark + " " + smart1.model+  ": " + smart1.hashCode());
        System.out.println("Хеш-код Ноутбука " + smart5.mark + " " + smart5.model+  ": " + smart5.hashCode());
        System.out.println("");
        if(smart1.hashCode()==smart2.hashCode()) {
            System.out.println("Ноутбук " + smart1.mark + " " + smart1.model + " равен ноутбуку " + smart2.mark + " " + smart2.model);
        }
        else System.out.println("Ноутбук " + smart1.mark + " " + smart1.model + " НЕ равен ноутбуку " + smart2.mark + " " + smart2.model);
        System.out.println("Хеш-код Ноутбука " + smart1.mark + " " + smart1.model+  ": " + smart1.hashCode());
        System.out.println("Хеш-код Ноутбука " + smart2.mark + " " + smart2.model+  ": " + smart2.hashCode());
        System.out.println("");
        if(smart1.hashCode()==smart3.hashCode()) {
            System.out.println("Ноутбук " + smart1.mark + " " + smart1.model + " равен ноутбуку " + smart3.mark + " " + smart3.model);
        }
        else System.out.println("Ноутбук " + smart1.mark + " " + smart1.model + " НЕ равен ноутбуку " + smart3.mark + " " + smart3.model);
        System.out.println("Хеш-код ноутбука " + smart1.mark + " " + smart1.model+  ": " + smart1.hashCode());
        System.out.println("Хеш-код ноутбука " + smart3.mark + " " + smart3.model+  ": " + smart3.hashCode());
        System.out.println("");
        if(smart1.hashCode()==smart4.hashCode()) {
            System.out.println("Ноутбук " + smart1.mark + " " + smart1.model + " равен ноутбуку " + smart4.mark + " " + smart4.model);
        }
        else System.out.println("Ноутбук " + smart1.mark + " " + smart1.model + " НЕ равен ноутбуку " + smart4.mark + " " + smart4.model);
        System.out.println("Хеш-код ноутбука " + smart1.mark + " " + smart1.model+  ": " + smart1.hashCode());
        System.out.println("Хеш-код ноутбука " + smart5.mark + " " + smart4.model+  ": " + smart4.hashCode());


    }
}
