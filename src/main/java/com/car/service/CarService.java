package com.car.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.car.dao.CarDao;
import com.car.entity.Car;

@Service
public class CarService {
	@Autowired
	CarDao cd;

	public String setCar(Car c) {
		return cd.setCar(c);
	}

	public String allCar(List<Car> ca) {
		
		return cd.allCar(ca);
	}

	public String delete(int a) {
		return cd.delete(a);
	}

	public String update(Car c, int b) {
		return cd.update(c, b);
	}

	public String updatebyPatch(Car x, int z) {
		return cd.updatePatch(x,z);
	}

}
