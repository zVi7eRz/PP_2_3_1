package web.service;

import org.springframework.stereotype.Controller;
import web.model.Car;

import java.util.List;
@Controller
public interface CarService {
    List<Car> getCount(List<Car> cars, int count);
}
