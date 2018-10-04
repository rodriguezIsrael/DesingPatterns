/**
 * 
 */
package com.desingPatterns.creational.factory_method.factory;

import com.desingPatterns.creational.factory_method.enums.CarTypeEnum;
import com.desingPatterns.creational.factory_method.products.Car;

/**
 * @since 24/09/2018
 *
 * @author Israel Rodriguez
 */
public interface CarFactory {

	/**
	 * 
	 */
	public Car makeCar(CarTypeEnum carType) throws Exception;

}
