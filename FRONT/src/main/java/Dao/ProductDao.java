package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Dto.NoticeDto;

public class ProductDao {
	
	Connection connection; // sql 연결 인터페이스 
	ResultSet resultSet; // sql 결과 순회 인터페이스 
	
	public static ProductDao instance = new ProductDao(); // 현재 클래스에 현재객체 선언;
	public static ProductDao getinstance() {
		return instance;
	}
	
	public ProductDao() {
		try {
			// sql 드라이버 : sql 마다 다름
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3307/jspweb?serverTimezone=UTC", "root" , "1234" );
			
		}catch (Exception e) {
		}
	}

	
	// 1. 제품등록
		
	
	// 2. 제품 목록 조회 
	
	// 3. 제품 개별 조회 
	
	// 4. 제품 수정 
	
	// 5. 제품 삭제 
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
