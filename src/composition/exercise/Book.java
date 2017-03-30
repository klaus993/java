package composition.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Klaus on 30/3/2017.
 */
public class Book {

    String name;
    Author[] authors;
    double price;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book (String name, Author[] authors, double price, int qty) {
        this(name, authors, price);
        this.qty = qty;
    }

    @Override
    public String toString() {
        List<String> authorList = new ArrayList<>();
        Author[] authors = this.getAuthors();
        for (Author author : authors) {
            authorList.add(author.toString());
        }
        return "Book[name=" + this.getName() + authorList.toString() + ",price=" + this.getPrice() + ",qty=" + this.getQty() + "]";
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    int qty;

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}
