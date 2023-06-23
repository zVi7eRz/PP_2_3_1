package web.service;


import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;
import java.util.List;
@Service
public class CarServiceImp implements CarService {
    private final CarDao carDao;

    public CarServiceImp(CarDao carDao) {
        this.carDao = carDao;
    }


    @Override
    public List<Car> getCount(List<Car> cars, int count) {
        return cars.stream().limit(count).toList();
    }

    @Override
    public List<Car> getListCar() {
        return carDao.getListCar();
    }
}
