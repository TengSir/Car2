package com.oracle.cars.model;
/**
 * 这是汽车模块的dao类，里面提供与汽车相关的数据库操作方法
 * @author Administrator
 *
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

public class CarDAO {

	/**
	 * 这是查询显示所有的车辆的dao方法
	 * @return
	 */
	public  List<Car>  listAll(){
		List<Car>  cars=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cars2", "root", "root");
			QueryRunner run = new QueryRunner();
			ResultSetHandler<List<Car>> h = new BeanListHandler<Car>(Car.class);
			cars= run.query(connection,"SELECT * FROM car", h);
		} catch (Exception e) {
			cars=new ArrayList<>();
			e.printStackTrace();
		}
		
		return cars;
	}
}
