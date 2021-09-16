package ru.mirea.task4;

public class TestAuthor {
    public static void main(String [] args){
        Author a1 = new Author("Ivan Popov","ivPopov@somewhere.com", 'M');
        System.out.println(a1);
        a1.setEmail("ivPopov@where.com");
        System.out.println(a1.getEmail());
        System.out.println(a1);
    }
}
