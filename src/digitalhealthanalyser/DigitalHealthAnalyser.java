/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalhealthanalyser;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author lewi0146
 */
public class DigitalHealthAnalyser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String fileName = "data" + File.separator + "FDHRCRepo.xml";

        // the below code could be part of your Parser class        
        SAXBuilder sax = new SAXBuilder();
        FileReader file = null;
        Document doc = null;
        try {
            file = new FileReader(fileName);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found: " + fileName);
            return;
        }
        try {
            doc = sax.build(file);
        } catch (JDOMException ex) {
            System.out.println("Error reading XML file: " + fileName + ", " +ex.getMessage());
            return;
        } catch (IOException ex) {
            System.out.println("IOException: " +ex.getMessage());
            return;
        }
        
        // get the root element ("<xml>")
        Element data = doc.getRootElement();

        // get the "records", element with the tag <records>
        Element records = data.getChild("records");

        // get all the records contained in the records
        List<Element> recordList = records.getChildren("record");

        System.out.println("Number of records: " + recordList.size());

        // You could create and test your DigitalHealthRecord class here
        ArrayList l = new ArrayList<>();
        l.add("Me");
        DigitalHealthRecord record1 = new DigitalHealthRecord("25", "Record 1", l, "2014", "I don't know", "Hello World");
        System.out.println(record1.toString());
    }

}
