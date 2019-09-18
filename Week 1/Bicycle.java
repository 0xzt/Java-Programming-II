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

abstract class Bicycle {
    private static int bicycleCount = 0;
    
    Bicycle() {
        bicycleCount++;
    }
    
    public int getBicycleCount() {
        return(bicycleCount);
    }
    
    void changeCadence() {
    }
    
    void changeGear() {
    }
    
    void speedUp() {
    }
    
    void applyBrakes() {
    }
    
    void printStates() {
    }

}
