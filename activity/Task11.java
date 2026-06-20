

public class Task11 {
    public static void main(String[] args) {
        Books book1 = new Books("Java Programming", "John Smith", 2021,39.99);
        Books book2 = new Books("Python Basics", "Jane Doe", 2020,29.99);
        Books book3 = new Books("C++ Essentials", "Michael Johnson", 2019,49.99);
        
        System.out.println("Book1: " + "\n"+book1);
        System.out.println("Book2: " + "\n"+book2);
        System.out.println("Book3: " + "\n"+book3);

    }
}

class Books{
    private String title;
    private String author;
    private int yearPublished;
    private double price;

    public Books(String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n" +
        "Author: " + author + "\n" +
        "Year Published: " + yearPublished + "\n" +
        "Price: " + price + "\n" 
        ;
    }
}
