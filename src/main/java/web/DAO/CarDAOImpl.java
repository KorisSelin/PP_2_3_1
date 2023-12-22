package web.DAO;

import org.springframework.stereotype.Repository;
import web.Models.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {
    private static List<Car> carList;

//    static {
//        carList = new ArrayList<>();
//        Car toyota = new Car("Toyota", 2022, 220);
//        Car ford = new Car("Ford", 2020, 225);
//        Car honda = new Car("Honda", 2019, 226);
//        Car lexus = new Car("Lexus", 2018, 210);
//        Car infinity = new Car("Infinity", 2019, 210);
//        Collections.addAll(carList, toyota, ford, honda, lexus, infinity);
//    }
    public CarDAOImpl(){
                carList = new ArrayList<>();
        Car toyota = new Car("Toyota", 2022, 220);
        Car ford = new Car("Ford", 2020, 225);
        Car honda = new Car("Honda", 2019, 226);
        Car lexus = new Car("Lexus", 2018, 210);
        Car infinity = new Car("Infinity", 2019, 210);
        Collections.addAll(carList, toyota, ford, honda, lexus, infinity);
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public List<Car> getCarsListCount(Integer count) {
        List<Car> list = getAllCars();
        if (count == null || count < 0 || count > list.size()){
            count = list.size();
        }
        return list.stream().limit(count).toList();
    }
}
