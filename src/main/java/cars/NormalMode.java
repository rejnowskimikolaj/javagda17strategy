package cars;

public class NormalMode implements Mode {


    @Override
    public double howMuchSpeedIncreasesForAcceleration() {
        return 0;
    }

    @Override
    public double howMuchSpeedDecreasesForDecceleration() {
        return 0;
    }

    @Override
    public double howMuchEngineWearIncreasesForDecceleration() {
        return 0;
    }

    @Override
    public double howMuchEngineWearIncreasesForAcceleration() {
        return 0;
    }

    @Override
    public double howMuchBreaksWearIncreasesForDecceleration() {
        return 0;
    }

    @Override
    public double howMuchGasReleasedIncreasesForAcceleration() {
        return 0;
    }
}
