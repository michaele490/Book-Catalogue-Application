/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookapp;

/**
 * EBook.java
 * 12/08/2023
 * @author Michael E.
 */
public class EBook extends Book{
    private String fileFormat;

    public EBook() {
        super();
        fileFormat = " ";
    }
    
    public EBook(String fileFormat, String idNum, String title, String author, double cost) {
        super(idNum, title, author, cost);
        this.fileFormat = fileFormat;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }
    
    @Override
    public String getDetails(){
        String original = super.getDetails();
        return original + "\nFile Format: " + fileFormat;
    }
}
