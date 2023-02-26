package by.denisenko.one.cars;

public class SportCar extends AbstractCar{
    public int MaxSpeed;
    public int getMaxSpeed() {
        return MaxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        MaxSpeed = maxSpeed;
    }

    public SportCar(String mark, String model, String color, float engineVolume, Privod privod, int cost, float oil, int averageSpeed, int maxSpeed) {
        super(mark, model, color, engineVolume, privod, cost, oil, averageSpeed);
        MaxSpeed = maxSpeed;
    }
}
