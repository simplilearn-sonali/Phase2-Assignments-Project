package com.simplilearn.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.simplilearn.dao.AdminDao;
import com.simplilearn.dto.Flight;
import com.simplilearn.dto.Place;

public class AdminService {

	AdminDao dao;

	public AdminService() {
		dao = new AdminDao();
	}
	
	public String passwordFetch(String password) throws ClassNotFoundException, SQLException {
		
		String message;
		message = dao.passwordFetch(password);
		
		return message;
		
	}

	public ArrayList<String> getAirlines()  {
		return dao.readAirlines();
	}
	public ArrayList<Flight> getFlights()  {
		return dao.readFlights();
	}
	public ArrayList<Flight> getFlights(String source, String dest)  {
		return dao.readFlights(source, dest);
	}
	public ArrayList<Place> getPlaces()  {
		return dao.readPlaces();
	}
	public boolean fetchPassword(String password){
		String password1 = null;
		password1 = dao.readPassword();

		if(password.equals(password1)){
			return true;
		}
		else
			return false;
	}
}
