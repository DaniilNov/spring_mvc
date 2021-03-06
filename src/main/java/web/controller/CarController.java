package web.controller;


import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class CarController {

    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public String printCars(ModelMap car) {

        List<Car> cars = new ArrayList<>();
        cars.add(0, new Car(1, "Toyota", 123));
        cars.add(1, new Car(2, "Nissan", 456));
        cars.add(2, new Car(3, "Honda", 789));
        car.addAttribute("carsOfController", cars);
        return "cars";


    }

//    @RequestMapping(value = "/cars", method = RequestMethod.GET, params = "locale")
//    public String printTable() {
//        return null;
//
//    }
}
