package com.techpalle;

import java.sql.*;

public class A 
{
    Connection con=null;
    Statement s=null;
    PreparedStatement ps=null;
  
    public void creating()
    {
    	try 
    	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
		s=con.createStatement();
		s.executeUpdate("create table emp2(name varchar(50),salary int,eid int)");
		s.close();
		con.close();
    	
    	} 
    	catch (ClassNotFoundException e) 
    	{
			e.printStackTrace();
		} 
    	catch (SQLException e) 
    	{
			e.printStackTrace();
		}
    }
    	public void inserting(String ename, int sal,int id)
    	    {
    	 try
    	   {
    		 Class.forName("com.mysql.cj.jdbc.Driver");
    		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
    		 ps=con.prepareStatement("insert into emp2 values(?,?,?)");
    		 ps.setString(1, ename);
    		 ps.setInt(2, sal);
    		 ps.setInt(3, id);
             ps.executeUpdate();
    		 ps.close();
    		 con.close();
    		 
    			 }
    			 catch (ClassNotFoundException e)
    			 {
    				
    				 e.printStackTrace();
    			}
    			 catch (SQLException e) 
    			 {
    				e.printStackTrace();
    			}
		
    		  }
    	
    	public void updating(String ename, int salary,int id)
	    {
	 try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
		 ps=con.prepareStatement("update emp2 set name=?,salary=? where eid=?");
		 ps.setString(1, ename);
		 ps.setInt(2, salary);
		 ps.setInt(3,id);
		 ps.executeUpdate();
		 ps.close();
		 con.close();
		 
			 }
			 catch (ClassNotFoundException e)
			 {
				
				 e.printStackTrace();
			}
			 catch (SQLException e) 
			 {
				e.printStackTrace();
			}
	    }
	 
	 
	 public void deleting(int id)
	    {
	 try
	   {
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","admin");
		 ps=con.prepareStatement("delete from emp2 where eid=?");
		 ps.setInt(1, id);
		 ps.executeUpdate();
		 ps.close();
		 con.close();
		 
			 }
			 catch (ClassNotFoundException e)
			 {
				
				 e.printStackTrace();
			}
			 catch (SQLException e) 
			 {
				e.printStackTrace();
			}

	
}
	
	
}

