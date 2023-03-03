package by.denisenko.one.taxopark;

import by.denisenko.one.cars.AbstractCar;

import java.util.ArrayList;
import java.util.Collections;
public class Taxopark<T extends AbstractCar> {
    public ArrayList<T> cars = new ArrayList<T>();
    public void Add(T car){
        cars.add(car);
    }
    public void Remove(T car){
        cars.remove(car);
    }
    public void ShowCars(){
        for(T car : cars){
            System.out.println(car.toString());
        }
    }
    public Manager manager = new Manager();
    public class Manager implements IManager{

        public int GetTaxoparkCost(){
            int res = 0;
            for (T car: cars) {
                res += car.Cost;
            }
            System.out.println("Taxopark cost:" + res);
            return res;
        }
        public void SortTaxopark(){
            Collections.sort(cars,AbstractCar.COMPARE_BY_OIL);
            for(T car : cars){
                System.out.println(car.toString());
            }
        }
        public ArrayList<AbstractCar> GetCarBySpeed(int start, int end){
            ArrayList<AbstractCar> res = new ArrayList<AbstractCar>();
            for(T car: cars){
                if(car.AverageSpeed<=end && car.AverageSpeed>=start){
                    res.add(car);
                }
            }
            return res;
        }
    }
}
