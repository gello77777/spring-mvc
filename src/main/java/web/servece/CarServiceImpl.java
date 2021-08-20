package web.servece;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> CarListCreate() {
        List<Car> cars = new ArrayList<>();


            cars.add(new Car("Car1", "Red", 111));
            cars.add(new Car("Car2", "Blue", 222));
            cars.add(new Car("Car3", "Grey", 333));
            cars.add(new Car("Car4", "Red", 444));
            cars.add(new Car("Car5", "Green", 555));
        return cars;
    }

    @Override
    public List<Car> GetCarsListCount(Integer count) {
        return CarListCreate().subList(0, count);
    }
}
