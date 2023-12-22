package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.Models.Car;

import java.util.List;
@Service
public class CarServiceImpl implements CarService {
    private CarDAO carDAO;
    @Autowired
    public CarServiceImpl (CarDAO carDAO){ this.carDAO = carDAO ;}
    
    @Override
    public List<Car> getCarsListCount(Integer count) {
        return carDAO.getCarsListCount(count);
    }
}
