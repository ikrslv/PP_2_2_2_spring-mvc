package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller

public class CarsController {

    private CarServiceImpl carService;

    public CarsController(CarServiceImpl carService) {
        this.carService = carService;
    }


    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        model.addAttribute("cars", carService.getCars(carService.getCarsList(), count));
        return "cars";
    }


}
