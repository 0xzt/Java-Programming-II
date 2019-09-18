/************************************************************************************
* Program:  PRG/421 Week 1
* Purpose:  Bicycle Demo
* Programmer:  Zack Taylor        
* Class:       PRG/421      
* Creation Date:  7/10/19
*************************************************************************************/


package bicycledemo;

/**
@author zack
**/

public class RoadBike extends Bicycle {
    private int cadence = 0;
    private int speed = 0;
    private int gear = 1;

    private int maximumMPH;

    void changeCadence(int newValue) {
         cadence = newValue;
    }

    void changeGear(int newValue) {
         gear = newValue;
    }

    void speedUp(int increment) {
         speed += increment;   
    }

    void applyBrakes(int decrement) {
         speed -= decrement;
    }

    void printStates() {
         System.out.println("cadence:" +
             cadence + " speed:" + 
             speed + " gear:" + gear);
    }
}
