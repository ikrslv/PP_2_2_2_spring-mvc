package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {

    private List<Car> carsList = new ArrayList<>();

    {
        carsList.add(new Car(1, "Audi A6", 2018));
        carsList.add(new Car(2, "Lada Granta", 2021));
        carsList.add(new Car(3, "Toyota Corolla", 2017));
        carsList.add(new Car(4, "BMW 1", 2015));
        carsList.add(new Car(5, "KIA Sportage", 2022));
    }

    public List<Car> getCarsList() {
        return carsList;
    }

    public void setCarsList(List<Car> carsList) {
        this.carsList = carsList;
    }

    @Override
    public List<Car> getCars(List<Car> list, Integer count) {
        if (count == null || count > 5) {
            return list;
        } else {
            return list.stream().limit(count).collect(Collectors.toList());
        }
    }
}
