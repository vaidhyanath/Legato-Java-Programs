package Legato;

import java.util.*;
import java.sql.*;
import java.util.Scanner;
public class ArpithaSql {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while (true) {
		System.out.println("Please enter 1 to add the book \n"	+ "2 for displaying \n" + "3 for exit ");
			int option = s.nextInt();
			Connection con=createConnection();
			
			
			switch (option) {

			case 1:
				addbook(con);

				break;
				
				
			case 2:
				displaybook(con);

				break;
				
			case 3:
				System.exit(0);

				break;

			   default:
  
				   System.out.println("Please enter correct option ");


			}
		}

		}

		private static void displaybook(Connection con)
		  
		{
			try
			{
				Connection con2=createConnection();
				String sql="select * from bk";
				PreparedStatement pstmt=con.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					System.out.println("id="+rs.getInt(1)+"name="+rs.getString(2)+"author="+rs.getString(3));
					
				}
				rs.close();
				pstmt.close();
				con2.close();
				
				
				
			}
			catch (SQLException e) {               
				e.printStackTrace();       
			}
		
	}

		private static void addbook(Connection con) {
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
	 		Connection con1=createConnection();
	     System.out.println("connected successfully");
         Scanner sc=new Scanner(System.in);
	System.out.println("plese enter bookid");
	int id2=sc.nextInt();
	
	String sql2 = "select * from bk where BookId = ?";
	PreparedStatement pstmt1=con.prepareStatement(sql2);
	pstmt1.setInt(1,id2);
	ResultSet rs1 = pstmt1.executeQuery();
	boolean flag = false;
	
	
	while(rs1.next())
		
	{
		flag=true;
		break;
	}
	if(flag) {
		System.out.println("please enter another id");
		pstmt1.close();
	}
	else
	{
		
		System.out.println("plese enter bookname");
		String name=sc.next();
		System.out.println("plese enter bookauthor");
		String author =sc.next();
		
		
	String sql1="insert into Mybooks.bk values(?,?,?)";
	
	 PreparedStatement pstmt=con1.prepareStatement(sql1);
                               
	pstmt.setString(2,name);                             
	pstmt.setString(3,author);                             

	                                                     
	int rs=pstmt.executeUpdate();             
	System.out.println("one row updated"+rs); 
	pstmt.close();                                          
	con1.close();                                            
	                                                      
	}                                                     
			}
			catch (ClassNotFoundException | SQLException e) { 
		             
				e.printStackTrace();       
			}
		}
				                                                  
		private static Connection createConnection() {
			
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				
		 		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Mybooks", "root","Lavairis_405");
		 		return con;
			}
			catch (ClassNotFoundException | SQLException e) { 
	             
				e.printStackTrace();    
				return null;
			}
			
			
		}
						
				}