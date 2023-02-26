package by.denisenko.one.cars;

public class Truck extends AbstractCar {
    public float LoadCapacity;
    public float getLoadCapacity() {
        return LoadCapacity;
    }
    public void setLoadCapacity(float loadCapacity) {
        LoadCapacity = loadCapacity;
    }

    public Truck(String mark, String model, String color, float engineVolume, Privod privod, int cost, float oil, int averageSpeed, float loadCapacity) {
        super(mark, model, color, engineVolume, privod, cost, oil, averageSpeed);
        LoadCapacity = loadCapacity;
    }
}
