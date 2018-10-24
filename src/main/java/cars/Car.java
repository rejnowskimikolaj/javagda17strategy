package cars;

public class Car {
    private double speed;
    private double engineWear;
    private double breaksWear;
    private double gasReleased;
    private Mode mode = new NormalMode();

    public void increaseSpeed(){

        speed+=mode.howMuchSpeedIncreasesForAcceleration();
        engineWear+=mode.howMuchEngineWearIncreasesForAcceleration();
        gasReleased+=mode.howMuchGasReleasedIncreasesForAcceleration();

    }
    public void decreaseSpeed(){

        speed-=mode.howMuchSpeedDecreasesForDecceleration();
        engineWear+=mode.howMuchEngineWearIncreasesForDecceleration();
        breaksWear+=mode.howMuchBreaksWearIncreasesForDecceleration();
    }


    public Car(double speed, double engineWear, double breaksWear, double gasReleased, Mode mode) {
        this.speed = speed;
        this.engineWear = engineWear;
        this.breaksWear = breaksWear;
        this.gasReleased = gasReleased;
        this.mode = mode;
    }

    public Car(Mode mode) {
        this.mode = mode;
    }

    public Car() {
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }


   public double getEngineWear(){
       return engineWear;
   }
   public double getGasReleased(){
        return gasReleased;
   }
   public double getBreaksWear(){

       return breaksWear;
   }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", engineWear=" + engineWear +
                ", breaksWear=" + breaksWear +
                ", gasReleased=" + gasReleased +
                ", mode=" + mode +
                '}';
    }
}