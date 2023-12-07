package com.car.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.car.entity.Car;
import com.car.repository.CarRepository;

@Repository
public class CarDao {
	@Autowired
	CarRepository cr;

	public String setCar(Car c) {
		cr.save(c);
		return "Saved";
	}

	public String allCar(List<Car> ca) {
		cr.saveAll(ca);
		return "Saved All";
	}

	public String delete(int a) {
		cr.deleteById(a);
		return "Deleted" ;
	}

	public String update(Car c, int b) {
		Car x=cr.getById(b);
		x.setBrand(c.getBrand());
		x.setPrice(c.getPrice());
		x.setModel(c.getModel());
		x.setNoOfTyres(c.getNoOfTyres());
		cr.save(x);
		return "Updated";
	}

	public String updatePatch(Car x, int z) {
		Car v=cr.getById(z);
		v.setNoOfTyres(x.getNoOfTyres());
		cr.save(v);
		return "Using Patch Updated";
	}

}
