/*
 * Program: Datasort 
 * Purpose: Individual: Week Three Coding Assignment
 * Programmer: Zack Taylor			
 * Class: PRG/421, Java Programming II			
 * Instructor: Roland Morales			
 * Creation Date: 07/27/19	
 */

package demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author zack
 */

public class Datasort {
    public static void main (String [] args) throws FileNotFoundException, IOException { //added throw exceptions
        File fin = new File("in.txt");    // input file
        File fout = new File("out.txt");   // create an out file 

        // Java FileInputStream class obtains input bytes from a file
        FileInputStream fis = new FileInputStream(fin);     
        FileOutputStream fos = new FileOutputStream(fout); //added FileOutputStream for file later created.

        // buffering characters so as to provide for the efficient reading of characters, arrays, and lines
        BufferedReader in = new BufferedReader(new InputStreamReader(fis));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(fos)); // output stream to BufferedWriter

        // declare an array in-line, ready for the sort
        String aLine;
        ArrayList<String> al = new ArrayList<> (); 

        int i = 0;
        while ((aLine = in.readLine()) != null) {

            // will sort all values included where length is greater than 0
            if (aLine.trim().length() > 0) { //only includes lines read when aLine has a length of more than 0 (ensures that blank lines aren't written to the new file)
                al.add(aLine); //adds String stored in aLine to ArrayList 'al'
                i++; //added this line to help keep count of the total items
                    }
            }


        Collections.sort(al);    // sorted content to the output  file
        {
            for (String s : al) { // must declare variable 's', use for loop to repeat this for each String in the ArrayList 'al'
                System.out.println(s); //prints the data to the console
                out.write(s); //writes the String to the file
                out.newLine(); //adds a new line to the file (necessary if more data will be writen to the file and keeps all data separate on new lines)
        }
        // close the 2 files
        in.close(); //closes the BufferedReader object 'in'
        out.close(); //closes the BufferedReader object 'out'
        }
    }

}