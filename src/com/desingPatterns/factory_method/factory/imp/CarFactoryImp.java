/**
 * 
 */
package com.desingPatterns.factory_method.factory.imp;

import com.desingPatterns.factory_method.enums.CarTypeEnum;
import com.desingPatterns.factory_method.factory.CarFactory;
import com.desingPatterns.factory_method.products.Car;
import com.desingPatterns.factory_method.products.imp.Camaro;
import com.desingPatterns.factory_method.products.imp.Ferrary;

/**
 * @since 24/09/2018
 *
 * @author Israel Rodriguez
 */
public class CarFactoryImp implements CarFactory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.desingPatterns.factory_method.CarFactory#makeCar()
	 */
	@Override
	public Car makeCar(CarTypeEnum carType) throws Exception {
		Car car;
		switch (carType) {
		case FERRARI:
			car = new Ferrary();
			break;

		case CAMARO:
			car = new Camaro();
			break;

		default:
			car = null;
			System.out.println("ERROR::: Type car invalid...");
			break;
		}

		return car;
	}

}
