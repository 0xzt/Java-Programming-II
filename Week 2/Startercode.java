/**********************************************************************
*	Program:	Week 2 Code Assignment	
* 	Purpose: 	Console/file input and output
*	Programmer:	Zack Taylor 		
*	Class:		PRG/421, Java Programming II			
*	Instructor:	Roland Morales			
*	Creation Date:	7/19/2019
* 	Comments:  	Fill in code 
*
***********************************************************************/


package demo;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.BufferedReader;
import java.io.IOException;

/**
 * @author Zack Taylor
 *  I made some changes to the code mainly because when I loaded it in to NetBeans
 *  it made me add a bunch of restructuring so I found it easier to work within the
 *  same page instead of multiple. I left this piece the same but the code below should 
 *  meet the requirements:
 * -Reads file input.txt
 * -Writes file data.txt
 * -Accepts user input
 * -Uses console output
 */


public class Startercode {
    
    public static void main(String[] args) throws IOException {
        // prompts and accepts user input
        Scanner input = new Scanner(System.in); //opens the Scanner for using keyboard
        double data; //stores a number as type double for later use
        System.out.println("Enter numeric value "); //provides instruction to the user
        
        data = input.nextDouble(); //captures the next double entered by user
        
        // accepts file input
        String fileName = "input.txt";                  // name of the file to open
        String line = null;				// will reference one line at a time

        try {
            FileReader fileReader = 		         //  FileReader reads text file 
            new FileReader(fileName);      		 //   reads in data from the file 

            BufferedReader myBufferedReader = new BufferedReader(fileReader); //added a buffered reader to verify

            while((line = myBufferedReader.readLine()) != null) {
                System.out.println(line);      	   	             // displays the file contents by line
            }   
                myBufferedReader.close();              		// close file
        }
        catch(FileNotFoundException e2) { //this will catch the exception thrown when the file cannot be found
            System.out.println("File not found.");
        }
        catch(IOException e) { //this will catch the exception thrown when there is an i/o error
            System.out.println("Input error: file could not be opened.");
        } 
        
        try {						// coding block to output data to file
            PrintStream fileStdout = new PrintStream(new FileOutputStream("data.txt")); // output file name is data.txt

            System.out.println("==============");      // output to console,  numbers up through "data"
            for(int i = 0; i <= data; i++) fileStdout.println("" + i);

        }
        catch(FileNotFoundException e3) { //thrown by FileOutputStream
            System.out.println("File was not found.");
        }
        
    }
}