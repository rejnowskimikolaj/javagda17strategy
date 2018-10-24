package cars;

public class EcoMode implements Mode {

    public double howMuchSpeedIncreasesForAcceleration() {
        return 3;
    }

    public double howMuchSpeedDecreasesForDecceleration() {
        return 3;
    }

    public double howMuchEngineWearIncreasesForDecceleration() {
        return 0.1;
    }

    public double howMuchEngineWearIncreasesForAcceleration() {
        return 0;
    }

    public double howMuchBreaksWearIncreasesForDecceleration() {
        return 0;
    }

    public double howMuchGasReleasedIncreasesForAcceleration() {
        return 0;
    }
}
