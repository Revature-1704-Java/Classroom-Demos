package com.revature;

import com.revature.singleton.MySingleton;
import com.revature.factory.HondaFactory;
import com.revature.beans.Car;
import com.revature.logging.LoggingFun;

public class App {   
    private static HondaFactory hf = new HondaFactory();
    
    public static void main( String[] args ) {
        MySingleton ms = MySingleton.getInstance();
        MySingleton again = MySingleton.getInstance();

        System.out.println(ms == again);

        Car carOne = hf.getCar("crv", "Grey");
        Car carTwo = hf.getCar("civic", "White");
        System.out.println(carOne);
        System.out.println(carTwo);

        LoggingFun logger = new LoggingFun();
        logger.someMethod();
    }
}
