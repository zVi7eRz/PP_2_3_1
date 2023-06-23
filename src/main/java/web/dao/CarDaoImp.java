package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;
import java.util.List;
@Repository
public class CarDaoImp implements CarDao {

    @Override
    public List<Car> getListCar() {
        return List.of(
                new Car("blue", "BMW", 345334L),
                new Car("blue", "BMW", 345334L),
                new Car("yellow", "LADA", 464123L),
                new Car("green", "SKODA", 67831L),
                new Car("orange", "OPEL", 4351L),
                new Car("white", "BMW", 54353004L)
        );
    }
}
