package cars;

public class TurboMode implements Mode {

    public double howMuchSpeedIncreasesForAcceleration() {
        return 8.0;
    }

    public double howMuchSpeedDecreasesForDecceleration() {
        return 0;
    }

    public double howMuchEngineWearIncreasesForDecceleration() {
        return 0;
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
