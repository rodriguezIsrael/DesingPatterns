/**
 * 
 */
package com.desingPatterns.creational.factory_method;

import com.desingPatterns.creational.factory_method.enums.CarTypeEnum;
import com.desingPatterns.creational.factory_method.factory.CarFactory;
import com.desingPatterns.creational.factory_method.factory.imp.CarFactoryImp;
import com.desingPatterns.creational.factory_method.products.Car;

/**
 * @since 24/09/2018
 *
 * @author Israel Rodriguez
 */
public class DEMO {

	public static void main(String... strings) {
		CarFactory carFactory = new CarFactoryImp();
		Car car;
		try {
			car = carFactory.makeCar(CarTypeEnum.CAMARO);

			car.run();
			car.stop();

			car = carFactory.makeCar(CarTypeEnum.FERRARI);
			car.run();
			car.stop();

			car = carFactory.makeCar(null);
			car.run();
			car.stop();

		} catch (Exception e) {
			System.out.println("ERROR:::: " + e.toString());

		}

	}

}
