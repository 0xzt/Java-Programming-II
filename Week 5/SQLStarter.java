/**********************************************************************
*	Program:	SQLcode 	
* 	Purpose: 	To analyze and document JDBC API calls.
*	Programmer:	Zack Taylor			
*	Class:		PRG/421, Java Programming II			
*	Instructor:	Roland Morales	
*	Creation Date:	8/10/19	
*
* Comments: The purpose of the JDBC API calls in this program
*           is to retrieve data from a relational database.
*           To complete this assignment, analyze the code and replace
*           the numbered comments as instructed below. 
***********************************************************************/

package sqlcommand;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLstarter {
   public static void main(String[] args) {

      try { // start of the try/catch block of code
         String host = "jdbc:mysql://localhost:3306/"; // This value is provided in the instructions for this
                                                       // assignment.
         String uName = "student"; // This value is provided in the instructions for this assignment.
         String uPass = "prg421"; // This value is provided in the instructions for this assignment.

         Connection conn = DriverManager.getConnection(host, uName, uPass);
         Statement stmt = conn.createStatement();

         // Select values from the tables
         String sql = "select  Emp id, FName, LName, Addr, City, State, Zip from Employee_table, Union, select Paysch, 401k, Spouse from Payroll-table;";
         ResultSet rs = stmt.executeQuery(sql); // cursor pointing to its current row of data

         System.out.println("Displaying student information: "); // display values from the tables

         String Emp_id = rs.getString("Emp id");
         String FName = rs.getString("FName ");
         String LName = rs.getString("LName ");
         String Addr = rs.getString("Addr ");
         String Zip = rs.getString("Zip");
         String Paysch = rs.getString("Paysch ");
         String _401k = rs.getString("401k");
         String Spouse = rs.getString("Spouse");

         String Stu_id = "9055356773";
         String Stu_Name = "Zachary Taylor";

         System.out.println(Stu_id + ",  " + Stu_Name);
         while (rs.next()) {
            System.out.println(Emp_id + ",  " + FName + ",  " + LName + ",  " + Addr + ",  " + Zip + ",  " + Paysch
                  + ",  " + _401k + ",  " + Spouse);
         }

      } catch (SQLException err) {
         System.out.println(err.getMessage());

      }

   }

}