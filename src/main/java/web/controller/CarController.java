package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;
import web.Models.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count,
                            Model model) {
//        Car toyota = new Car("Toyota", 2022, 220);
//        Car ford = new Car("Ford", 2020, 225);
//        Car honda = new Car("Honda", 2019, 226);
//        Car lexus = new Car("Lexus", 2018, 210);
//        Car infinity = new Car("Infinity", 2019, 210);
//        Collections.addAll(firstArrCar, toyota, ford, honda, lexus, infinity);

//        for (int i = 0; i < count; i++) {
//            secondArrCars.add(firstArrCar.get(i));}
//        model.addAttribute("messagesCar", secondArrCars);
//        return "cars";

        List<Car> list = carService.getCarsListCount(count);
        model.addAttribute("cars", list);
        model.addAttribute("count", count);
        return "cars";
    }

}
