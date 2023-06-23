package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    private final CarService carService;
    private final List<Car> CARS = Arrays.asList(
            new Car("blue", "BMW", 345334L),
            new Car("yellow", "LADA", 464123L),
            new Car("green", "SKODA", 67831L),
            new Car("orange", "OPEL", 4351L),
            new Car("white", "BMW", 54353004L));
    @Autowired
    public CarController() {
        carService = new CarServiceImp();
    }


    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("messages", carService.getCount(CARS, count));
        return "cars";
    }
}
