public class CarClient{
  public static void main(String[]args){
    Car myCar = new Car("Subaru", "Crosstrek", 29.7, 13.0);

    System.out.println(myCar);

    myCar.drive(12.2); //Drive the car for 12.2 miles

    System.out.println("Drove 12.2 miles: " + myCar);

    myCar.addFuel(10.5); //add 10.5 gallons of fuel to tankSize

    System.out.println("Added 10.5 gallons of fuel: " + myCar);

    Car myCar2 = new Car("Toyota", "Camry", 35.2, 17.5);

    System.out.println(myCar2);

    myCar2.drive(15.0);

    System.out.println("Drove 15.0 miles: " + myCar2);

    myCar2.addFuel(12.3);

    System.out.println("Added 12.3 gallons of fuel: " + myCar2);

    Car myCar3 = new Car("Honda", "Civic", 33.5, 16.8);

    myCar3.drive(13.7);

    System.out.println("Drove 13.7 miles: " +)
  }
}
