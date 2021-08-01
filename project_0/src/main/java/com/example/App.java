package com.example;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.example.database.ConnectionFactory;
import com.example.entity.Account;

public class App {

	public static void main(String[] args) throws SQLException {
		
		// TODO Auto-generated method stub

		Connection connection = ConnectionFactory.getConnection();

		String sql1 = "select * from Account where number = '2' ";
		Statement stm1 = connection.createStatement();
		ResultSet rs1 = stm1.executeQuery(sql1);
		rs1.next();
		Account fromAccount = new Account(rs1.getString(1), rs1.getDouble(2));

		String sql2 = "select * from Account where number = '1' ";
		Statement stm2 = connection.createStatement();
		ResultSet rs2 = stm2.executeQuery(sql2);
		rs2.next();
		Account toAccount = new Account(rs2.getString(1), rs2.getDouble(2));
		
        if(fromAccount.getBalance()>500) {
		fromAccount.setBalance(fromAccount.getBalance() - 500);
		toAccount.setBalance(toAccount.getBalance() + 500);

		String sql3 = "update Account set balance=? where number = ?";
		PreparedStatement ps = connection.prepareStatement(sql3);
		ps.setDouble(1, fromAccount.getBalance());
		ps.setString(2, fromAccount.getNumber());
		ps.executeUpdate();

		String sql4 = "update Account set balance=? where number = ? ";
		PreparedStatement ps2 = connection.prepareStatement(sql4);
		ps2.setDouble(1, toAccount.getBalance());
		ps2.setString(2, toAccount.getNumber());
		ps2.executeUpdate();

		System.out.println("sucess..");
		
		 Statement stmt = connection.createStatement();
         ResultSet rs = stmt.executeQuery("select * from account");
         rs.next();
         
         System.out.println("Account_no:"+fromAccount.getNumber());
    	 System.out.println("Balance:"+fromAccount.getBalance()); 
    	 
    	 System.out.println("---------------------------------------------------");
    	 
    	 System.out.println("Account_no: "+toAccount.getNumber());
    	 System.out.println("Balance:"+toAccount.getBalance()); 
         
        }else {
        	System.out.println("no sufficient balance..");
        }

		connection.close();

	}

}
