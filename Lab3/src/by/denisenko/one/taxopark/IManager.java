package by.denisenko.one.taxopark;

import by.denisenko.one.cars.AbstractCar;

import java.util.ArrayList;

public interface IManager {
    int GetTaxoparkCost();
    void SortTaxopark();
    public ArrayList<AbstractCar> GetCarBySpeed(int start, int end);
}
