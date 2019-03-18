package Legato;
import java.sql.*;
import java.util.Scanner;
public class Jdbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vaidhya","root","Lavairis_405");
				System.out.println("connected");
				//sql statement operations
				Statement stmt=con.createStatement();
				//User intput
				Scanner scn = new Scanner(System.in);
				//user name input
				System.out.println("enter name ");
				String name = scn.next();
				//user id input 
				System.out.println("enter id ");
				int id = scn.nextInt();
				//user address input
				System.out.println("enter address ");
				String addr = scn.next();
			   // String sql1 = "insert into o1.customer value("+id+",'"+name+"','"+addr+"')";
				//Similar to constructors
				String sql1 = "insert into o1.customer value(?,?,?)";
				
				PreparedStatement pstmt = con.prepareStatement(sql1);
				pstmt.setInt(1,id);
				pstmt.setString(2,name);
				pstmt.setString(3,addr);
 				int rs = pstmt.executeUpdate();
 				
                //insert into sql
				//String sql="insert into o1.customer value(5,'vdn','Blore')";
				//String sql="insert into o1.customer value(7,'vai','US')";
				//delete into sql
				//String sql="delete from o1.customer where customerName='vdn'";
			
				//String sql="select * from customer";
				//int i=stmt.executeUpdate(sql);
				
				
				//System.out.println("The value of inserted row are"+i);
				
				//ResultSet rs=stmt.executeQuery(sql);
				
				//while(rs.next())
				//{
					//System.out.println("customer id"+rs.getInt(1));
			//	}
				
				//stmt.close();
				//.args.con.close();
				
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}

}
