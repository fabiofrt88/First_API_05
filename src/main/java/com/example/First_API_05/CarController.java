package com.example.First_API_05;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CarController {


    private CarDTO cars;

    @GetMapping(value = "/")
    public String getCars(@RequestParam String carID, @RequestParam String model, @RequestParam (required = false) Double price){
        System.out.println("CarDTO has been called");
        return "The id: " + carID + "| Model name: " + model + "| Price: " + price;
    }

    // GET  >>>> Su postman >>>>>       http://localhost:8080/?carID=005&model=Audi&price=25000.00

    @PostMapping(value = "/post")
    public String postCars(@RequestBody CarDTO cars){
        System.out.println("CarDTO post");
        return cars.toString();
    }

    /*  POST >>>> su postman >>>>>
    {   "id": "005",
        "modelName": "Audi",
        "price": 25000.00
        }     */

}