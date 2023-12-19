package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class CarController {
    List<Car> firstArrCar = new ArrayList<>();
    List<Car> secondArrCars = new ArrayList<>();

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", required = false) int count,
                          Model model) {
        Car toyota = new Car("Toyota", 2022, 220);
        Car ford = new Car("Ford", 2020, 225);
        Car honda = new Car("Honda", 2019, 226);
        Car lexus = new Car("Lexus", 2018, 210);
        Car infinity = new Car("Infinity", 2019, 210);
        Collections.addAll(firstArrCar, toyota, ford, honda, lexus, infinity);

        for (int i = 0; i < count; i++) {
            secondArrCars.add(firstArrCar.get(i));}
        model.addAttribute("messagesCar", secondArrCars);
        return "carsIndex";
    }

}
