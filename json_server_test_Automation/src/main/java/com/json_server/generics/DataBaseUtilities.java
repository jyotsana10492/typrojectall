package com.json_server.generics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.LinkedHashMap;

/**
 * 
 * @author JYOTSANA
 *
 */

public class DataBaseUtilities {
public static Connection connectToDB() {
	Connection connection = null;
	
	
	try {
		
		
		String url;
		connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hibernate");
		return connection;
	
	
}
	
	catch (SQLException e)	
	{
	e.printStackTrace();
}
return null;
}


public static LinkedHashMap getDataFromDB(String query) {
	Connection con = null;
	LinkedHashMap data=new LinkedHashMap ();
	try 
	{
		
		con=connectToDB();
		ResultSet result=con.createStatement().executeQuery(query);
		ResultSetMetaData rMdata= result.getMetaData();
	
	for (int i =0;i<rMdata.getColumnCount();i++)
{
	
	data.put(rMdata.getColumnName(i),result.getString(i));
}
return data;	
}
	catch (SQLException e)	{
	e.printStackTrace();
	}
	finally {
try 
{
	con.close();
	
}


catch (SQLException e)	{
	e.printStackTrace();}
	
	return null;
	
	}}}	
	
	
	
	
	
	
	
	
	

