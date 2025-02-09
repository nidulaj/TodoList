package loginPackage;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import DB.DBConnection;

public class user {

	
	
	
	//connect DB
	private static boolean isSucess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	public static int currentID = 0;
	
	//insert data function
	public static boolean insertData( String firstName, String lastName, String email, String username, String password) {
	
		boolean isSuccess = false;
		try {
			//DBconncetion call
			con= DBConnection.getConnection();
			stmt = con.createStatement();
			
			//SQL query
			String sql = "INSERT INTO user(firstName, lastName, email, username, password) VALUES ('"+firstName+"', '"+lastName+"', '"+email+"', '"+username+"', '"+password+"')";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}else {
				isSuccess =false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

	
	
	public static boolean validate(String username, String password){
		//ArrayList<userModel> user = new ArrayList<>();
		boolean isSuccess = false;
		try {
			//DBconnection
			con= DBConnection.getConnection();
			stmt = con.createStatement();
			
			//Query
			String sql = "SELECT * FROM user WHERE username = '"+username+"' and password='"+password+"'";
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int DBid = rs.getInt(1);
				String DBfirstName = rs.getString(2);
				String DBlastName = rs.getString(3);
				String DBemail = rs.getString(4);
				String DBusername = rs.getString(5);
				String DBpassword = rs.getString(6);
				byte[] DBProfilePhotoData = rs.getBytes(7);
				
				ImageIcon DBprofilePhoto;
		            if (DBProfilePhotoData != null) {
		                DBprofilePhoto = new ImageIcon(DBProfilePhotoData);
		            } else {
		                DBprofilePhoto = new ImageIcon("src/image/user.png"); // Ensure this file exists
		                
		            }
				
				userModel um = new userModel(DBid, DBfirstName, DBlastName, DBemail, DBusername, DBpassword, DBprofilePhoto);
				//user.add(um);
				isSuccess = true;
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	//update data
	public static boolean updatePassword( String username, String password) {
		
		boolean isSuccess = false;
		try {
			//DBconncetion call
			con= DBConnection.getConnection();
			stmt = con.createStatement();
			
			//SQL query
			String sql = "UPDATE user SET password ='"+password+"' WHERE username ='"+username+"'";			
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}else {
				isSuccess =false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	//update profile
	public static boolean updateProfile( String firstName, String lastName, String email, String username) {
		
		boolean isSuccess = false;
		int id = userModel.getId();
		try {
			//DBconncetion call
			con= DBConnection.getConnection();
			stmt = con.createStatement();
			
			//SQL query
			String sql = "UPDATE user SET firstName ='"+firstName+"', lastName ='"+lastName+"', email ='"+email+"', username ='"+username+"' WHERE id ='"+id+"'";			
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}else {
				isSuccess =false;
			}
			
			readDataAfterUpdate(id);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	//DELETE data
	public static boolean deleteData() {
		
		boolean isSuccess = false;
		int id = userModel.getId();
		try {
			//DBconnection
			con= DBConnection.getConnection();
			stmt = con.createStatement();
			
			//SQL Query
			String sql = "DELETE FROM user WHERE id='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			logout();
			
			if(rs>0) {
				isSuccess = true;
			}else {
				isSuccess =false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
		
	}
	

	
	//save image to database
	public static void saveImageToDatabase(File file) {
		int id = userModel.getId();
		 try (Connection con = DBConnection.getConnection();
		         FileInputStream fis = new FileInputStream(file)) {

		        String sql = "UPDATE user SET profilePhoto = ? WHERE id = ?";
		        PreparedStatement pstmt = con.prepareStatement(sql);

		        // Setting the binary stream and user ID
		        pstmt.setBinaryStream(1, fis, (int) file.length());
		        pstmt.setInt(2, id);
			pstmt.executeUpdate();
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static boolean readDataAfterUpdate(int id){
		//ArrayList<userModel> user = new ArrayList<>();
		boolean isSuccess = false;
		try {
			//DBconnection
			con= DBConnection.getConnection();
			stmt = con.createStatement();
			
			//Query
			String sql = "SELECT * FROM user WHERE id = '"+id+"'";
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int DBid = rs.getInt(1);
				String DBfirstName = rs.getString(2);
				String DBlastName = rs.getString(3);
				String DBemail = rs.getString(4);
				String DBusername = rs.getString(5);
				String DBpassword = rs.getString(6);
				byte[] DBProfilePhotoData = rs.getBytes(7);
				
				ImageIcon DBprofilePhoto;
		            if (DBProfilePhotoData != null) {
		                DBprofilePhoto = new ImageIcon(DBProfilePhotoData);
		            } else {
		                DBprofilePhoto = new ImageIcon("src/image/user.png"); // Ensure this file exists
		                
		            }
				
				userModel um = new userModel(DBid, DBfirstName, DBlastName, DBemail, DBusername, DBpassword, DBprofilePhoto);
				//user.add(um);
				isSuccess = true;
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	//log out
	public static void logout() {
		userModel.setId(0);
		userModel.setFirstName(null);
		userModel.setLastName(null);
		userModel.setEmail(null);
		userModel.setUsername(null);
		userModel.setPassword(null);
	}
	
	

}
