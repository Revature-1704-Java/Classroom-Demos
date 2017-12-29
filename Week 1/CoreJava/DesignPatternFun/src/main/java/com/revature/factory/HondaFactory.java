package com.revature.factory;

import com.revature.beans.Car;

public class HondaFactory {
  public Car getCar(String whatCar, String color) {
    if ("civic".equals(whatCar)) {
      return new Car("Honda", 2018, "Civic", color);
    } else if ("crv".equals(whatCar)) {
      return new Car("Honda", 2018, "CRV", color);
    }

    return null;
  }
}