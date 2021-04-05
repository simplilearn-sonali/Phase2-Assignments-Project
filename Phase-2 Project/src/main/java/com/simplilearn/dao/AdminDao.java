package com.simplilearn.dao;

import com.simplilearn.dto.Flight;
import com.simplilearn.dto.Place;

import javax.swing.plaf.nimbus.State;
import java.sql.*;
import java.util.ArrayList;

public class AdminDao {
	
	public String  passwordFetch(String password) throws ClassNotFoundException, SQLException {
		Connection con = DatabaseConnection.initializeDatabase();
		
		String sql = "UPDATE ADMIN SET PASSWORD = ?;";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, password);
		int rowsUpdated = st.executeUpdate();
		st.close();
		con.close();
		if(rowsUpdated > 0) {
			return "Password changed successfully";
		}
		
		else {
			return "Password not changed";
		}
		
	}

	public ArrayList<String> readAirlines()  {
		ArrayList<String> airlines = new ArrayList<String>();
		Connection con = null;
		try {
			con = DatabaseConnection.initializeDatabase();
			String sql = "SELECT * FROM airlines;";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				airlines.add(rs.getString("name"));
			}
			rs.close();
			statement.close();
			con.close();
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return airlines;
	}
	public ArrayList<Flight> readFlights()  {
		ArrayList<Flight> flights = new ArrayList<Flight>();
		Connection con = null;
		try {
			con = DatabaseConnection.initializeDatabase();
			String sql = "SELECT * FROM flights;";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);

			while (rs.next()) {
				Flight flight = new Flight(rs.getString("place1"),
						rs.getString("place2"),
						rs.getInt("price"),
						rs.getInt("id"),
						rs.getString("airline"));
				flights.add(flight);
			}
			rs.close();
			statement.close();
			con.close();
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return flights;
	}

	public ArrayList<Place> readPlaces() {
		ArrayList<Place> places = new ArrayList<Place>();
		Connection con = null;
		try {
			con = DatabaseConnection.initializeDatabase();
			String sql = "SELECT * from places;";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);

			while(rs.next()) {
				Place place = new Place(rs.getString("place1"), rs.getString("place2"));
				places.add(place);
			}
			rs.close();
			statement.close();
			con.close();
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return places;
	}

	public ArrayList<Flight> readFlights(String source, String dest) {
		ArrayList<Flight> flights = new ArrayList<Flight>();
		Connection con = null;
		try {
			con = DatabaseConnection.initializeDatabase();
			String sql = "SELECT * FROM flights\n" +
					"where (place1=? AND place2=?) OR (place1=? AND place2=?);";
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, source);
			preparedStatement.setString(2, dest);
			preparedStatement.setString(3, dest);
			preparedStatement.setString(4, source);
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
				Flight flight = new Flight(rs.getString("place1"),
						rs.getString("place2"),
						rs.getInt("price"),
						rs.getInt("id"),
						rs.getString("airline"));
				flights.add(flight);
			}
			rs.close();
			preparedStatement.close();
			con.close();
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return flights;
	}
	public String readPassword() {
		Connection con = null;
		String password = null;
		try {
			con = DatabaseConnection.initializeDatabase();
			String sql = "SELECT * FROM admin;";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);

			while(rs.next()){
				password = rs.getString("password").toString();
			}
			rs.close();

			con.close();
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return password;
	}

}
