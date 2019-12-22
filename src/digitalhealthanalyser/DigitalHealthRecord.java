/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package digitalhealthanalyser;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author BILL0084
 */
public class DigitalHealthRecord {
    private String recNumber;       // ID
    private String title;
    private ArrayList authors;
    private String publicationYear;
    private String refType;         //Reference Type
    private String textAbstract;

    /**
     * Gets the ID of the text
     * @return String recNumber
     */
    public String getRecNumber() {
        return recNumber;
    }

    /**
     * Gets the Title of the text
     * @return String title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the Authors of the text
     * @return ArrayList authors
     */
    public ArrayList getAuthors() {
        return authors;
    }

    /**
     * Gets the Publication Year of the text
     * @return String publicationYear
     */
    public String getPublicationYear() {
        return publicationYear;
    }

    /**
     * Gets the Reference Type of the text
     * @return String refType
     */
    public String getRefType() {
        return refType;
    }

    /**
     * Gets the Abstract of the text
     * @return String textAbstract
     */
    public String getTextAbstract() {
        return textAbstract;
    }

    public DigitalHealthRecord(String recNumber, String title, ArrayList authors, String publicationYear, String refType, String textAbstract) {
        this.recNumber = recNumber;
        this.title = title;
        this.authors = authors;
        this.publicationYear = publicationYear;
        this.refType = refType;
        this.textAbstract = textAbstract;
    }
    
    /**
     * Prints out the relevant information of the DigitalHealthAnalyzer object
     * @return String DigitalHealthAnalyzer information
     */
    @Override
    public String toString() {
        return "ID: " + recNumber +
               ", Title: " + title +
               ", Authors: " + authors.toString() +
               ", Publication Year: " + publicationYear +
               ", Reference Type: " + refType +
               ", Abstract: " + textAbstract;
    }
}
