package web.models;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private Integer id;
    private String model;
    private int year;

    public Car(Integer id, String model, int year) {
        this.id = id;
        this.model = model;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
