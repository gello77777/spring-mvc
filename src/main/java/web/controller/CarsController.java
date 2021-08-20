package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servece.CarService;

@Controller
public class CarsController {
    @Autowired
    private CarService carServiceImp;

    @GetMapping(value = "/cars")
    public String printCarInfo(@RequestParam(name = "count", required = false) Integer count, ModelMap modelMap) {
        if (count == null || count >= 5) {
            modelMap.addAttribute("cars", carServiceImp.CarListCreate());
        } else {
            modelMap.addAttribute("cars", carServiceImp.GetCarsListCount(count));
        }
        return "cars";
    }

}