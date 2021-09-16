package ru.mirea.task2;

public class Book {
    private String Author;
    private int years;
    public Book(String n, int a)
    {
        Author = n;
        years = a;
    }
    public Book()
    {
        Author = "Pup";
        years = 0;
    }
    public Book(String n)
    {
        Author = n;
        years = 0;
    }

    public void setYears(int age)
    {
        this.years=years;
    }
    public void setAuthor(String Author)
    {
        this.Author=Author;
    }
    public String getAuthor(String Author)
    {
        return Author;
    }
    public int getYears(int age)
    {
        return years;
    }
    public String toString()
    {
        return this.Author +", years "+ this.years;
    }

}
