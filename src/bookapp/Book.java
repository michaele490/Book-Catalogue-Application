/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookapp;

/**
 * Book.java
 * 12/08/2023
 * @author Michael E.
 */
import java.io.Serializable;
public class Book implements Serializable{
    //Note: For this class I wasn't sure whether it was meant to be abstract or not. Because 'Book' can represent physical copies of books
    private String idNum;//Even though this variable will hold numbers it is not necessary to store in an int except calculations will be done with value
    private String title;
    private String author;
    private double cost;

    public Book() {//Default constructor
        idNum = " ";
        title = " ";
        author = " ";
        cost = 0.0;
    }

    public Book(String idNum, String title, String author, double cost) {//Overloaded constructor
        this.idNum = idNum;
        this.title = title;
        this.author = author;
        this.cost = cost;
    }
    //Unsure which type of constructor will be more efficient for building this application right now but I put them both in so I have the choice to use either later

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public String getDetails(){
        return "ID: "+ idNum + "\nTitle: " + title + "\nAuthor: " + "\nCost: " + cost;
    }
}
