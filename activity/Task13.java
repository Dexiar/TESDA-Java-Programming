public class Task13 {
    public static void main(String[] args) {
       Car car1 = new Car("Toyota", "Camry", 2022, 4);
       car1.displayDetails();
    }
}

class Vehicle{
  String vehicleMake;
  String vehicleModel;
  int year;

  public Vehicle (String vehicleMake, String vehicleModel, int year){
    this.vehicleMake = vehicleMake;
    this.vehicleModel = vehicleModel;
    this.year = year;
  }

}

class Car extends Vehicle{
    int numberOfDoors;
    public Car(String vehicleMake, String vehicleModel, int year, int numberOfDoors) {
        super(vehicleMake, vehicleModel, year);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails(){
        System.out.println("Car Details: ");
        System.out.println("Make: " + vehicleMake);
        System.out.println("Model: " + vehicleModel);
        System.out.println("Year: " + year);
        System.out.println("Number of Doors: " + numberOfDoors);
    }

}




