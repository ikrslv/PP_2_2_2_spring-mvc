package web.dao;

import web.models.Car;

import java.util.List;

public interface CarDao {

    public List<Car> getCars(List<Car> list, Integer count);

    public List<Car> getCarsList();

}
