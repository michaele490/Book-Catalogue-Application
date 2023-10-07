/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookapp;

/**
 * AudioBook.java
 * 12/08/2023
 * @author Michael E.
 */
public class AudioBook extends Book{
    private String narrator;    

    public AudioBook() {
        super();
        narrator = " ";
    }
    
    public AudioBook(String narrator, String idNum, String title, String author, double cost) {
        super(idNum, title, author, cost);
        this.narrator = narrator;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }
    
    @Override
    public String getDetails(){
        String original = super.getDetails();
        return original + "\nNarrator: " + narrator;
    }
}
