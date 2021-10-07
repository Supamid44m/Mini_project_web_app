/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.HashMap;
import java.util.Map;
import model.Car;

/**
 *
 * @author supam
 */
public class CarsData {

    final private Map<String, Car> cars = new HashMap<>();
    final private static CarsData instance = new CarsData();

    CarsData() {
        cars.put("Laferrari", new Car("Laferrari", "ferrari", "2"));
        cars.put("Vios", new Car("Vios", "Toyota", "5"));
        cars.put("City", new Car("City", "Honda", "5"));
        cars.put("Model3", new Car("Model3", "Tesla", "5"));
        
    }

    public static CarsData getInstance() {
        return instance;
    }
    public Car getCar(String name) {
        return cars.get(name);
    }
}
