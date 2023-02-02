package auto;

public class FlyingCar extends Car {

    // members
    private float altitude = 0f; // f means float

    // constructors
    public FlyingCar() { }

    // overload constructor
    public FlyingCar(String registration) {
        this.setRegistration(registration);
    }

    // Getters and setters
    public float getAltitude() {
        return altitude;
    }

    public void setAltitude(float altitude) {
        this.altitude = altitude;
    }

    // methods
    public void climb(float feet) { // new behaviour
        if (this.altitude < 100) {
            this.altitude = Math.min(this.altitude + feet, 100);
        }
    }

    // default to climb 5 ft (overloading using diff parameters or return types)
    public void climb() {
        this.climb(5);
    }

    //annotate to override - allows Java to check that the method is found in parent
    @Override
    public String getRegistration() {
        // for s1234a, add F in front: Fs1234a
        return "F" + super.getRegistration(); 
            // extends only one level above.
            // no super.super.
    }

}
