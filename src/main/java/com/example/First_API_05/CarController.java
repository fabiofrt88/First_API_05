package com.example.First_API_05;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cars")
public class CarController {


    private CarDTO cars;

    @GetMapping(value = "/get")
    public CarDTO getCars(){
        System.out.println("CarDTO has been called");
        return new CarDTO("01", "Audi",25000);
    }

    // GET  >>>> Su postman >>>>>       http://localhost:8080/

    @PostMapping(value = "/post")
    public String postCars(@RequestBody CarDTO car){
        System.out.println(car);
        return HttpStatus.CREATED.toString();
    }

    /*  POST >>>> su postman >>>>>
    {   "id": "005",
        "modelName": "Audi",
        "price": 25000.00
        }     */

}