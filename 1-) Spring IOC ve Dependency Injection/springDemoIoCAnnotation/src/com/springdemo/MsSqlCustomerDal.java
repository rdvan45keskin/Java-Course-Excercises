package com.springdemo;

import org.springframework.beans.factory.annotation.Value;

//import org.springframework.stereotype.Component;
//database parametresini buna verdik
//@Component("database")
public class MsSqlCustomerDal implements ICustomerDal{
	@Value("${database.connectionString}")
	String connectionString;
	public String getConnectionString() {
		return connectionString;
	}
	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
	@Override
	public void add() {
		System.out.println("Connection String : "+this.connectionString);
		System.out.println("MsSql Veritabanına Eklendi");
	}
}
