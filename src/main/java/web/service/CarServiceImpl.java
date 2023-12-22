package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.DAO.CarDAO;
import web.Models.Car;

import java.util.List;

public class CarServiceImpl implements CarService {
    @Autowired
    private CarDAO carDAO;

    @Override
    public List<Car> getCarsListCount(Integer count) {
        return carDAO.getCarsListCount(count);
    }
}
