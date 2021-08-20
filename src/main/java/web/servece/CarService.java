package web.servece;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> CarListCreate();
    List<Car> GetCarsListCount(Integer count);
}
