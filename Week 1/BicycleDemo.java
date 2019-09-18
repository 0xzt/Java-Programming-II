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

public class BicycleDemo {
    public static void main(String[] args) {

        // Create two different 
        // Bicycle objects
        MountainBike bike1 = new MountainBike();
        MountainBike bike2 = new MountainBike();
        RoadBike bike3 = new RoadBike();
        RoadBike bike4 = new RoadBike();

        // Invoke methods on 
        // those objects
        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();
        
        bike2.changeCadence(40);
        bike2.speedUp(20);
        bike2.changeGear(3);
        bike2.changeCadence(35);
        bike2.speedUp(15);
        bike2.changeGear(2);
        bike2.printStates();

        bike3.changeCadence(50);
        bike3.speedUp(10);
        bike3.changeGear(2);
        bike3.changeCadence(40);
        bike3.speedUp(10);
        bike3.changeGear(3);
        bike3.printStates();

        bike4.changeCadence(40);
        bike4.speedUp(15);
        bike4.changeGear(3);
        bike4.printStates();

        System.out.println("There are " + bike4.getBicycleCount() + " bicycles.");
    }

}

