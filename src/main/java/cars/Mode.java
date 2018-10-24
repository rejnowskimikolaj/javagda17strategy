package cars;

public interface Mode {
    double howMuchSpeedIncreasesForAcceleration();
    double howMuchSpeedDecreasesForDecceleration();
    double howMuchEngineWearIncreasesForDecceleration();
    double howMuchEngineWearIncreasesForAcceleration();
    double howMuchBreaksWearIncreasesForDecceleration();
    double howMuchGasReleasedIncreasesForAcceleration();
}
