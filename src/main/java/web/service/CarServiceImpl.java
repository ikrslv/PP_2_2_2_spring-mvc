package web.service;

import org.springframework.stereotype.Component;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    CarDao carDao = new CarDaoImpl();

    public List<Car> getCarsList() {
        return carDao.getCarsList();
    }


    @Override
    public List<Car> getCars(List<Car> list, Integer count) {
        return carDao.getCars(list,count);
    }
}
