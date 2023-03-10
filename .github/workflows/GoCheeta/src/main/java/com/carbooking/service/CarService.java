package com.carbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.carbooking.model.CarDto;
import com.carbooking.repo.Car;
import com.carbooking.repo.CarRepository;

@Component
public class CarService {
    @Autowired
    private CarRepository carRepository;
    public Car addCar(CarDto carDto){
        return carRepository.save(getCar(carDto));
    }
    private Car getCar(CarDto carDto) {

        Car car = new Car();
        car.setAvailability(carDto.isAvailability());
        car.setBrand(carDto.getBrand());
        car.setDriverId(carDto.getDriverId());
        car.setModel(carDto.getModel());
        car.setPrice(carDto.getPrice());
        car.setRegistrationNo(carDto.getRegistrationNo());
        car.setLocationId(carDto.getLocationId());
        //car.setLocation(getLocation(carDto));
        return car;
    }
    private Car getCarWithId(CarDto carDto) {

        Car car = new Car();
        car.setAvailability(carDto.isAvailability());
        car.setBrand(carDto.getBrand());
        car.setDriverId(carDto.getDriverId());
        car.setModel(carDto.getModel());
        car.setPrice(carDto.getPrice());
        car.setRegistrationNo(carDto.getRegistrationNo());
        car.setLocationId(carDto.getLocationId());
        //car.setLocation(getLocation(carDto));
        return car;
    }
    public Car getCar(String registrationNo) {
        return carRepository.findByRegistrationNo(registrationNo);
    }

    public List<Car> getAllCar() {
        return (List<Car>) carRepository.findAll();
    }
	public List<Car> getAllCarByDriverId(String driverId) {
		return carRepository.findByDriverId(driverId);
	}
	public void updateCar(CarDto carDto) {
		carRepository.save(getCar(carDto));
	}
	public void deleteCar(String registrationNo) {
		carRepository.deleteById(registrationNo);
	}
}
