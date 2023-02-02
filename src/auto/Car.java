package auto;

public class Car {

    // members
    private String registration;
    private String make;
    private boolean started = false;
    private int counter = 0; // need not be exposed to user, no get/set
    public String comments;

    // constructors
    public Car() { }

    // getters/setters
    // cmd + shift + p > souce action > generate getters and setters
    // can make them into one line for easy viewing
    public void setRegistration(String r) { this.registration = r; }
    public String getRegistration() { return registration; }

    public String getMake() { return make; }
    public void setMake(String make) { this.make = make; }

    public boolean isStarted() { return started; }
    // public void setStarted(boolean started) { this.started = started; }
    /* not needed because we created a method to start
        Is there a consequence if we allow people to set started? 
        This method does not change the counter. */

    // methods
    public void start() {
        if (this.started) {
            System.out.println("Car is running");
        } else {
            this.started = true;
            this.counter++;
            System.out.println("Vroom! Vroom!");
        }
    }

    public void stop() {
        if (!this.started) {
            System.out.println("The car is not running");
        } else {
            this.started = false;
            System.out.println("Splutter splutter stop");
        }
    }

    public boolean needToService() {
        return this.counter > 5; // becomes 
    }

    public void serviceCar() {
        System.out.println("Servicing car");
        this.counter = 0;
    }
}