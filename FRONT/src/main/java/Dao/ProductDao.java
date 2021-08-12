package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Dto.NoticeDto;
import Dto.ProductDto;

public class ProductDao {
	
	Connection connection; // sql ���� �������̽� 
	ResultSet resultSet; // sql ��� ��ȸ �������̽� 
	
	public static ProductDao instance = new ProductDao(); // ���� Ŭ������ ���簴ü ����;
	public static ProductDao getinstance() {
		return instance;
	}
	
	public ProductDao() {
		try {
			// sql ����̹� : sql ���� �ٸ�
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/jspweb?serverTimezone=UTC", "root" , "1234" );
			
		}catch (Exception e) {
		}
	}

	
	// 1. ��ǰ���
	public boolean productwrite( ProductDto productDto ) {
		
		//1.SQL�ۼ� 
		String SQL = "insert into product("
				+ "product_name,product_comment,product_price,product_manufacturer,"
				+ "product_category,product_stock,product_releasedate,product_img)"
				+ "values(?,?,?,?,?,?,?,?)";
		
		//2.SQL����
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			preparedStatement.setString(1, productDto.getProduct_name());
			preparedStatement.setString(2, productDto.getProduct_comment());
			preparedStatement.setInt(3, productDto.getProduct_price());
			preparedStatement.setString(4, productDto.getProduct_manufacturer());
			preparedStatement.setString(5, productDto.getProduct_category());
			preparedStatement.setInt(6, productDto.getProduct_stock());
			preparedStatement.setString(7, productDto.getProduct_releasedate());
			preparedStatement.setString(8, productDto.getProduct_img());
		//3.SQL����	
			preparedStatement.executeUpdate();
		//4.SQL���
		//5.��ȯ
			return true;
		}
		catch (Exception e) {}
		return false;
	
	}
	// 2. ��ǰ ��� ��ȸ 
	public ArrayList<ProductDto> productlist() {
		
		ArrayList< ProductDto >productDtos = new ArrayList<ProductDto>();
		
		String SQL = "select * from product";
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(SQL);
			resultSet = preparedStatement.executeQuery();
		
			while( resultSet.next() ) {
				ProductDto productDto = new ProductDto( 
							resultSet.getInt(1) ,
							resultSet.getString(2) ,
							resultSet.getString(3) ,
							resultSet.getInt(4) ,
							resultSet.getString(5) ,
							resultSet.getString(6) ,
							resultSet.getInt(7) ,
							resultSet.getString(8) ,
							resultSet.getString(9) ,
							resultSet.getInt(10) ,
							resultSet.getInt(11) ,
							resultSet.getInt(12) );
				productDtos.add(productDto);
			}
			return productDtos;
		}
		catch (Exception e) {}
		return null;
	}
	
	
	
	
	
	
	// 3. ��ǰ ���� ��ȸ 
	
	// 4. ��ǰ ���� 
	
	// 5. ��ǰ ���� 
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	

}
