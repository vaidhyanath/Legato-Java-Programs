package Legato;


import java.sql.*;
import java.util.Scanner;


 public class ArpithaJDBC {

	public static void main(String[] args) {
		
			
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mybooks", "root","Lavairis_405");
				System.out.println("connected successfully");
				
				Statement stmt=con.createStatement();
				
		  Scanner scn = new Scanner(System.in);
				
				System.out.println("enter the book name ");
				
			     	String name = scn.next();
				
				System.out.println("enter the book id ");
				 
				int id = scn.nextInt();
				
				System.out.println("enter book  author ");
				String author = scn.next();
			  
				String sql1 = "insert into books.book value(?,?,?)";
				
				PreparedStatement pstmt = con.prepareStatement(sql1);
				pstmt.setInt(1,id);
				pstmt.setString(2,name);
				pstmt.setString(3,author);
 				int rs = pstmt.executeUpdate();
 				
               
				
				
			} catch (ClassNotFoundException | SQLException e) {
				
				e.printStackTrace();
			}
			
			
	}

}
