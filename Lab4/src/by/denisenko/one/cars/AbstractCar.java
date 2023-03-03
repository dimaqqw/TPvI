package by.denisenko.one.cars;

import java.util.Comparator;

public class AbstractCar {
    public String Mark;
    public void setMark(String mark) {
        Mark = mark;
    }
    public String getMark() {
        return Mark;
    }
    public String Model;
    public String getModel() {
        return Model;
    }
    public void setModel(String model) {
        Model = model;
    }
    public String Color;
    public String getColor() {
        return Color;
    }
    public void setColor(String color) {
        Color = color;
    }
    public float EngineVolume;
    public float getEngineVolume() {
        return EngineVolume;
    }
    public void setEngineVolume(float engineVolume) {
        EngineVolume = engineVolume;
    }
    public Privod privod;
    public Privod getPrivod() {
        return privod;
    }
    public void setPrivod(Privod privod) {
        this.privod = privod;
    }
    public int Cost;
    public int getCost() {
        return Cost;
    }
    public void setCost(int cost) {
        Cost = cost;
    }
    public float Oil;
    public float getOil() {
        return Oil;
    }
    public void setOil(float oil) {
        Oil = oil;
    }
    public int AverageSpeed;
    public int getAverageSpeed() {
        return AverageSpeed;
    }
    public void setAverageSpeed(int averageSpeed) {
        AverageSpeed = averageSpeed;
    }
    public static final Comparator<AbstractCar> COMPARE_BY_OIL = new Comparator<AbstractCar>() {
        public int compare(AbstractCar lhs, AbstractCar rhs) {
            return (int) (lhs.getOil() - rhs.getOil());
        }
    };
    @Override
    public String toString() {
        return "Car{" +
                "Mark='" + Mark + '\'' +
                ", Model='" + Model + '\'' +
                ", Color='" + Color + '\'' +
                ", EngineVolume=" + EngineVolume +
                ", privod=" + privod +
                ", Cost=" + Cost +
                ", Oil=" + Oil +
                ", Average Speed=" + AverageSpeed +
                '}';
    }
    public AbstractCar(String mark, String model, String color,float engineVolume,
                       Privod privod, int cost,float oil, int averageSpeed) {
        Mark = mark;
        Model = model;
        Color = color;
        EngineVolume = engineVolume;
        this.privod = privod;
        Cost = cost;
        Oil = oil;
        AverageSpeed = averageSpeed;
    }
}
