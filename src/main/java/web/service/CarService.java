package web.service;

import web.Models.Car;

import java.util.List;

public interface CarService {

    List<Car> getCarsListCount (Integer count);
}
