package by.denisenko.one.main;

import by.denisenko.one.cars.*;
import by.denisenko.one.taxopark.Taxopark;

import java.io.FileInputStream;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {
    static Logger LOGGER;
    static {
        try(FileInputStream ins = new FileInputStream("D:\\2 kurs\\sem2\\JAVA\\Labs\\Lab3\\log\\log.config")){
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(Main.class.getName());
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }
    public static void main(String[] args) {
        try {
            LOGGER.log(Level.INFO,"Начало main, создаем DefaultCar");
            DefaultCar car1 = new DefaultCar("BMW","E34", "black", 3.0F, Privod.BACK, 3500, 12.0F, 80, "Gas");
            LOGGER.log(Level.INFO,"Cоздаем SportCar");
            SportCar car2 = new SportCar("Maserati", "MC20", "Sky", 3.0F, Privod.BACK, 342030,30.0F, 150,360);
            LOGGER.log(Level.INFO,"Cоздаем Truck");
            Truck car3 = new Truck("Scania", "R420", "Green", 11.0F, Privod.FRONT,28500,40.0F, 70,30);
            //System.out.println(car1.toString());
            //System.out.println(car2.toString());
            //System.out.println(car3.toString());
            LOGGER.log(Level.INFO,"Создаём Таксопарк");
            Taxopark<AbstractCar> taxopark = new Taxopark<AbstractCar>();
            LOGGER.log(Level.INFO,"Добавляем SportCar в Таксопарк");
            taxopark.Add(car2);
            LOGGER.log(Level.INFO,"Добавляем DefaultCar в Таксопарк");
            taxopark.Add(car1);
            LOGGER.log(Level.INFO,"Добавляем Truck в Таксопарк");
            taxopark.Add(car3);
            taxopark.ShowCars();
            System.out.println();
            int TaxoParkCost = taxopark.manager.GetTaxoparkCost();
            System.out.println();
            taxopark.manager.SortTaxopark();
            System.out.println();
            var resGetCarsBySpeed = taxopark.manager.GetCarBySpeed(40,140);
            for(AbstractCar item : resGetCarsBySpeed){
                System.out.println(item.toString());
            }
        }
        catch (Exception e){
            LOGGER.log(Level.WARNING,"что-то пошло не так" , e);
        }
    }
}