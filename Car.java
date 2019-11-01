/*
Implement a class called Car with the following properties and behaviors.

A Car has a make (Toyota, Ford, BMW, etc.) and a model (Highlander, Fiesta, M3, etc.)
A Car has a certain fuel efficiency (measured in miles/gallon)
A Car has a certain amount of fuel in the gas tank (in gallons)
A Car can drive and fuel to the tank (driving a car changes the amount of fuel in the tank)

You must also include appropriate accessor and mutator methods for the Car class and a toString method that prints out a report on the current state of the car.

Create a client class with 3 instances of the car class. The client class should test all of the methods from the Car class and print out relevant information to prove the proper functionality of your Car class.

*/
public class Car{
  /*
  The attributes of a car (instance variables)
  */
  private String make;
  private String model;
  private double mpg; //miles per gallons
  private double tankSize; //in gallons
  private double amtFuel; //in gallons

  /*
  Constructor for the car initializes the instance variables for the Car.
  */

  public Car(String carMake, String carModel, double carMpg, double carTankSize){
    make = carMake;
    model = carModel;
    mpg = carMpg;
    tankSize = carTankSize;
    amtFuel = tankSize;
  }
  /*
  The accessor method for the face variable (a getter)
  */
  public String getMake(){
    return make;
  }
  public String getModel(){
    return model;
  }

  public void drive(double miles){
    
  }

  public String toString(){
    String result = "";
    result += "Make: " + make + "\n";
    result += "Model: " + model + "\n";
    result += "Mpg: " + mpg + "\n";
    result += "Tank size: " + tankSize + "\n";
    result += "Fuel amount: " + amtFuel + "\n";
    return result;
  }
}
