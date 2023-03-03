package by.denisenko.one.cars;

public class DefaultCar extends AbstractCar {
    public String TypeEngine;
    public String getTypeEngine() {
        return TypeEngine;
    }
    public void setTypeEngine(String typeEngine) {
        TypeEngine = typeEngine;
    }

    public DefaultCar(String mark, String model, String color, float engineVolume, Privod privod, int cost, float oil, int averageSpeed, String typeEngine) {
        super(mark, model, color, engineVolume, privod, cost, oil, averageSpeed);
        TypeEngine = typeEngine;
    }
}
