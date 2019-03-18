package Legato;

import java.util.*;
import java.sql.*;
import java.util.Scanner;
public class SqlJdbcBooks {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while (true) {
		System.out.println("Please enter 1 to add book \n"

					+ "2 for displaying \n" + "3 for exit ");
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

		// TODO Auto-generated method stub
		private static void displaybook(Connection con) {
			
		// TODO Auto-generated method stub
			try
			{
				Connection con2=createConnection();
				String sql="select * from book";
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
				// TODO Auto-generated catch block              
				e.printStackTrace();       
			}
		
	}

		private static void addbook(Connection con) {
		// TODO Auto-generated method stub
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
	 		Connection con1=createConnection();
	     System.out.println("connected successfully");
         Scanner sc=new Scanner(System.in);
System.out.println("please enter bookid");
	int id2=sc.nextInt();
	
	String sql2 = "select * from book where BookId = ?";
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
		//System.out.println("plese enter bookid");
		//int id=sc.nextInt();
		System.out.println("please enter bookname");
		String name=sc.next();
			
		System.out.println("please enter bookauthor");
		String author =sc.next();
		try {
			pattern(author);
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	
	
	String sql1="insert into books.book values(?,?,?)";
	PreparedStatement pstmt=con1.prepareStatement(sql1);//
	//pstmt.setInt(1,id);                                  
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
		static void pattern (String author) throws SQLException
		{
			String pattern="^[A-Za-z]+$";
			if(author.matches(pattern))
			{
				System.out.println("Correct name");
			
			}
			else
			{
				System.out.println("Please enter name in a correct format");
			
				
			}
			
		}		                                                  

		
	
		

		private static Connection createConnection() {
			
		// TODO Auto-generated method stub
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
		
		 		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/books", "root","Lavairis_405");
		 		return con;
			}
			catch (ClassNotFoundException | SQLException e) {         
				e.printStackTrace();    
				return null;
			}
			
			
		}
		
		
		
		
		
						
				}
			  
		
		
		
		
		


