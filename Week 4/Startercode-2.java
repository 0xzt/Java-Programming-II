/**********************************************************************
*	Program:	Startercode 
* 	Purpose: 	Class assignment:  
*                       Students - Given starter code, students write code that uses the
*                       Locale object (language, country, etc.) *
*		        The questions marks (?) in the code are to be completed by the students.
*		        Add comments/documentation to the code lines
*	Programmer:	Zachary Taylor			
*	Class:		PRG/421r13, Java Programming II			
*	Instructor:	Roland Morales			
*	Creation Date:	8/3/19	
*
*	Comments:
*		For additional information,  refer to: 
*		OCA/OCP Java SE7, Programmer I & II Study Guide 
*		Chapter 8: String Processing, Data Formatting, Resource Bundles
*		Section: Working with Dates, Numbers, and Currencies
*	
***********************************************************************/

package startercode; 
import java.text.DateFormat; 
import java.text.NumberFormat; 
import java.util.Currency; 
import java.util.Date; 
import java.util.Locale; 

public class Startercode { 
    public static void main(String[] args) { 
        long number = 5000000L; 

        NumberFormat numberFormatDefault = NumberFormat.getInstance(); 
        System.out.println("Number Format using Default Locale: "+numberFormatDefault.format(number)); 
        NumberFormat numberFormatLocale = NumberFormat.getInstance(Locale.US); 
        System.out.println("Number Format using US Locale: "+numberFormatLocale.format(number)); 

        NumberFormat numberFormatDefaultCurrency = NumberFormat.getCurrencyInstance(); 
        System.out.println("Currency Format using Default Locale:"+numberFormatDefaultCurrency.format(number)); 

        NumberFormat numberFormatLocaleCurrency = NumberFormat.getCurrencyInstance(Locale.US); 

        System.out.println("Currency Format using US Locale: "+numberFormatLocaleCurrency.format(number)); 

        Currency currency = Currency.getInstance(Locale.US); 
        System.out.println(currency.getDisplayName()+" ("+currency.getCurrencyCode()+")"+currency.getDisplayName()); 
          
        Date currentDate = new Date(); 
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.US); 
        System.out.println("Date Format in US Locale: "+dateFormat.format(currentDate)); 

    } 

  
}
