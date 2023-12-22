package web.DAO;

import web.Models.Car;

import java.util.List;

public interface CarDAO {
    //    void add(User user);
//    List<User> listUsers();
//
//    User getUserByCar (String model, int series);
    List<Car> getAllCars();

    List<Car> getCarsListCount(Integer count);

}
