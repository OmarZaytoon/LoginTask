package com.example.dao;
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.example.connections.ConnectionHandler;
import com.example.types.ItemList;
import com.example.types.User;


public class MainDao{

	public User login(User user) {
			User returnUser=null;
			String query="SELECT * FROM users WHERE username=? AND password=?";
			ConnectionHandler connectionHandler=new ConnectionHandler();
		    try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=connectionHandler.createConnection();
				PreparedStatement preparedStatement=connection.prepareStatement(query);
				preparedStatement.setString(1, user.getUsername());
				preparedStatement.setString(2, user.getPassword());
				ResultSet resultSet=preparedStatement.executeQuery();
				if(resultSet.next()) {
					returnUser=new User();
					returnUser.setUsername(resultSet.getString("username"));
					returnUser.setId(resultSet.getInt("user_id"));
					returnUser.setName(resultSet.getString("name"));
				}
				connectionHandler.CloseConnection(connection);
		    } catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			return returnUser;	
	}
	
	public ArrayList<ItemList> getItems() {
		ArrayList<ItemList>list=new ArrayList<ItemList>();
		String query="SELECT * FROM list";
		ConnectionHandler connectionHandler=new ConnectionHandler();
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=connectionHandler.createConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				ItemList itemList=new ItemList(resultSet.getString("row_title"),resultSet.getInt("row_id"));
				list.add(itemList);
			}
			connectionHandler.CloseConnection(connection);
	    } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	    System.out.println(list.size());
	    return list;	
}
	public boolean AddItem(String row_title) {
		boolean flag=false;
		String query="INSERT INTO list (`row_title`) VALUES (?)";
		ConnectionHandler connectionHandler=new ConnectionHandler();
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=connectionHandler.createConnection();
			PreparedStatement preparedStatement=connection.prepareStatement(query);
			preparedStatement.setString(1, row_title);
			preparedStatement.executeUpdate();
			connectionHandler.CloseConnection(connection);
			flag=true;
	    } catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	    return flag;
	}

}
