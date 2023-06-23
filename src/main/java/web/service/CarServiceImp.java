package web.service;


import web.model.Car;
import java.util.List;

public class CarServiceImp implements CarService {

    @Override
    public List<Car> getCount(List<Car> cars, int count) {
        return cars.stream().limit(count).toList();
    }
}
