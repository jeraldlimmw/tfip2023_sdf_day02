package auto;

public class Main {

    public static void main(String args[]){

        Car myCar = new Car(); // instantiate an instance of Car

        myCar.setMake("Toyota");
        myCar.setRegistration("s1234d");
        myCar.comments = "This is my car";

        System.out.printf("make: %s, registration: %s\n", 
                          myCar.getMake(), myCar.getRegistration());
        System.out.printf("comments: %s\n", myCar.comments);

        Car myOtherCar = new Car();

        myOtherCar.setMake("Honda");
        myOtherCar.setRegistration("s2345d");
        System.out.printf("myOtherCar make: %s, registration %s\n", 
                          myOtherCar.getMake(), myOtherCar.getRegistration());
        System.out.printf("myOtherCar service: %b\n", myOtherCar.needToService());

        FlyingCar myFlyingCar = new FlyingCar();
        myFlyingCar.setRegistration("s1234a");
        System.out.printf("myFlyingCar registration: %s\n", myFlyingCar.getRegistration());

        // FlyingCar is a Car
        Car c = new FlyingCar("s1231x");

        // Car need not be a FlyingCar
        // FlyingCar fc = new Car(); - runtime error
        // can assign up, cannot assign down or across

        c = new ElectricCar(); // ElectricCar is a Car

        if (c instanceof FlyingCar) {
            // Cast it to FlyingCar
            myFlyingCar = (FlyingCar)c;
            System.out.println("c is a flying car");
            myFlyingCar.climb(4f);
        } else if (c instanceof ElectricCar) {
            ElectricCar ec = (ElectricCar)c;
            System.out.println("c is an electric car");
        } else {
            System.out.println("c is a car");
        }

        // cast c into something it is not = Cast.Class.Exception (runtime error)
        // myFlyingCar = (FlyingCar)c;
    }
    
}
