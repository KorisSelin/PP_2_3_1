package web.DAO;

import web.Models.Car;

import java.util.List;

public interface CarDAO {

    List<Car> getAllCars();

    List<Car> getCarsListCount(Integer count);

}
