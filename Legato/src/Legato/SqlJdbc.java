package Legato;

import java.util.*;
import java.sql.*;
import java.util.Scanner;
public class SqlJdbc {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while (true) {
		System.out.println("Please enter 1 toaddcustomer \n"

					+ "2 for displaying \n" + "3 for exit ");
			int option = s.nextInt();
			Connection con=createConnection();
			switch (option) {

			case 1:

				addcustomer(con);

				break;

			case 2:

				displayCustomer(con);

				break;

			case 3:

				updatecustomer();

				break;

				
				
				
			case 4:

				System.exit(0);

				break;

			default:

				System.out.println("Please enter correct option ");


			}
		}

		}

		// TODO Auto-generated method stub
		private static void displayCustomer(Connection con) {
			
		// TODO Auto-generated method stub
			try
			{
				Connection con2=createConnection();
				String sql="select * from customer";
				PreparedStatement pstmt=con.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next())
				{
					System.out.println("id="+rs.getInt(1)+"name="+rs.getString(1)+"addres="+rs.getString(2));
					
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

		private static void addcustomer(Connection con) {
		// TODO Auto-generated method stub
			try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			//create the connection
	 		Connection con1=createConnection();
	     System.out.println("connected successfully");
         Scanner sc=new Scanner(System.in);
	System.out.println("plese enter custid");
	int id2=sc.nextInt();
	
	String sql2 = "select * from o1.customer where customerId = ?";
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
		System.out.println("plese enter custid");
		int id=sc.nextInt();
		System.out.println("plese enter cname");
		String name=sc.next();
		System.out.println("plese enter cadd");
		String add=sc.next();
	String sql1="insert into vaidhya.customer values(?,?,?)";
	PreparedStatement pstmt=con1.prepareStatement(sql1);//
	pstmt.setInt(1,id);                                  
	pstmt.setString(2,name);                             
	pstmt.setString(3, add);                             

	                                                     
	int rs=pstmt.executeUpdate();             
	System.out.println("one row updated"+rs); 
	pstmt.close();                                          
	con1.close();                                            
	                                                      
	}                                                     
			}
			catch (ClassNotFoundException | SQLException e) { 
				// TODO Auto-generated catch block              
				e.printStackTrace();       
			}
		}
				                                                  

		
	
		

		private static Connection createConnection() {
			
		// TODO Auto-generated method stub
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				//create the connection
		 		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vaidhya", "root","Lavairis_405");
//load the driver
		 		return con;
			}
			catch (ClassNotFoundException | SQLException e) { 
				// TODO Auto-generated catch block              
				e.printStackTrace();    
				return null;
			}
			
			
		}
		static void updatecustomer()
		{
			try {
				Connection con=createConnection();
				Scanner scr=new Scanner(System.in);
				System.out.println("enter empidd");
				int empidd=scr.nextInt();
				System.out.println("enter the empname");
				String empname=scr.next();
				System.out.println("enter the age");
				int age=scr.nextInt();
				System.out.println("enter the salary");
				int salary=scr.nextInt(); 

				
				String queryy="update empp set empname=?,age=?,salary=? where empidd=?";			
			PreparedStatement s=con.prepareStatement(queryy);
		
		s.setString(1,empname);
		s.setInt(2, age);
		s.setInt(3, salary);
		s.setInt(4, empidd);


			
			
			//String sql="insert into db.empp values(400,'rajesh',20,20000)";
				//String sql="delete from empp where empname='rajesh'";
				//String sql="insert into empp values("+empidd+",'"+str+"',"+age+","+salary+")";
				
			
				int i=s.executeUpdate();
				System.out.println("one row updated"+i);
			s.close();
			con.close();
				}
				catch(SQLException e){ 
					System.out.println(e);
					}  
		}
			}  
		
		
		
		
		


