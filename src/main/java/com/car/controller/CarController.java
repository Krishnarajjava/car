package com.car.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.car.entity.Car;
import com.car.service.CarService;

@RestController
public class CarController {
	@Autowired
	CarService cs;

	@PostMapping(value = "/setCar")
	public String setCar(@RequestBody Car c) {
		return cs.setCar(c);
	}
	@PostMapping(value="/allCar")
	public String allCar(@RequestBody List<Car> ca) {
		return cs.allCar(ca);
	}
	@DeleteMapping(value="/deleteItem/{a}")
	public String delete(@PathVariable int a) {
		return cs.delete(a);
	}
	@PutMapping(value="/Update/{b}")
	public String update(@RequestBody Car c,@PathVariable int b) {
		return cs.update(c,b);
	}
	@PatchMapping(value="/patch/{z}")
	public String updateByPatch(@RequestBody Car x,@PathVariable int z) {
		return cs.updatebyPatch(x,z);
	}
	}
