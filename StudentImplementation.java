package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentImplementation implements StudentInterface
{

	@Override
	public void SaveStudent()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the student id");
		int id = scanner.nextInt();
		System.out.println("enter the student name");
		String name = scanner.next();
		System.out.println("enter the student age");
		int age = scanner.nextInt();
		System.out.println("enter the student marks");
		Double marks = scanner.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDataBase", "root", "root");
			PreparedStatement preparedstatement = 
					connection.prepareStatement("insert into student values(?,?,?,?)");
			preparedstatement.setInt(1, id);
			preparedstatement.setString(2, name);
			preparedstatement.setInt(3, age);
			preparedstatement.setDouble(4, marks);
			preparedstatement.execute();
			connection.close();
			System.out.println("DATA IS SAVED----!!!!!");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void DeleteStudent()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the student age");
		int age = scanner.nextInt();
		System.out.println("enter the student marks");
		Double marks = scanner.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDataBase", "root", "root");
			PreparedStatement preparedstatement = 
					connection.prepareStatement("delete from student where age>? and marks<?");
			
			preparedstatement.setInt(1, age);
			preparedstatement.setDouble(2, marks);
			preparedstatement.execute();
			connection.close();
			System.out.println("DATA IS DELETED----!!!!!");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void UpdateStudent() 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the student age");
		int age = scanner.nextInt();
		System.out.println("enter the student marks");
		Double marks = scanner.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDataBase", "root", "root");
			PreparedStatement preparedstatement = 
					connection.prepareStatement("update student set age=? where marks=?");
			
			preparedstatement.setInt(1, age);
			preparedstatement.setDouble(2, marks);
			preparedstatement.execute();
			connection.close();
			System.out.println("Data has been updated----!!!!!");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void GetStudentByMarks()
	{
		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter the student name");
//		String name = scanner.next();
		System.out.println("enter the student marks");
		Double marks = scanner.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDataBase", "root", "root");
			PreparedStatement preparedstatement = 
					connection.prepareStatement("select * from student where marks=?");
			preparedstatement.setDouble(1, marks);
			preparedstatement.execute();
			connection.close();
			System.out.println("DATA IS DISPLAYED----!!!!!");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}

	@Override
	public void GetAllStudent()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the student id");
		int id = scanner.nextInt();
		System.out.println("enter the student name");
		String name = scanner.next();
		System.out.println("enter the student age");
		int age = scanner.nextInt();
		System.out.println("enter the student marks");
		Double marks = scanner.nextDouble();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDataBase", "root", "root");
			PreparedStatement preparedstatement = 
					connection.prepareStatement("insert into student values(?,?,?,?)");
			preparedstatement.setInt(1, id);
			preparedstatement.setString(2, name);
			preparedstatement.setInt(3, age);
			preparedstatement.setDouble(4, marks);
			preparedstatement.execute();
			connection.close();
			System.out.println("DATA IS SAVED----!!!!!");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	

}
