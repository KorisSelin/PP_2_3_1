package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Models.Car;
import web.service.CarService;

import java.util.List;

@Controller
public class CarController {
    private CarService carService;

    @Autowired
    public CarController(CarService carService1){ this.carService = carService1;}

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count,
                            Model model) {

        List<Car> list = carService.getCarsListCount(count);
        model.addAttribute("carsHtml", list);
        model.addAttribute("count", count);
        return "cars";
    }

}
