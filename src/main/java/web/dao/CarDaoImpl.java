package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDaoImpl implements CarDao {

    private final List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(1, "Audi", "A6"));
        carList.add(new Car(2, "BMV", "X5"));
        carList.add(new Car(3, "LADA", "15"));
        carList.add(new Car(4, "RENO", "LOGAN"));
        carList.add(new Car(5, "MERS", "Q5"));
    }

    @Override
    public List<Car> listCars(int count) {
        if (count >= 5) {
            return carList;
        }
        return carList.stream().limit(count).toList();
    }
}
