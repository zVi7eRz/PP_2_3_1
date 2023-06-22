package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<Car> messages = new ArrayList<>();
        CarService carService = new CarServiceImp();

        messages.add(new Car("blue", "BMW", 345334L));
        messages.add(new Car("yellow", "LADA", 464123L));
        messages.add(new Car("green", "SKODA", 67831L));
        messages.add(new Car("orange", "OPEL", 4351L));
        messages.add(new Car("white", "BMW", 54353004L));

        if (5 > count && count >= 0) {
            messages = carService.getCount(messages, count);
        }

        model.addAttribute("messages", messages);
        return "cars";
    }
}
