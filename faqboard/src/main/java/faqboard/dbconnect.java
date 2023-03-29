package faqboard;

import java.sql.*;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dbconnect {


	@Autowired
	BasicDataSource dataSource;
	
	@RequestMapping("test1.do")
	public String abc() {
		
		try {
			
			Connection con = dataSource.getConnection();
			System.out.println(con);
			System.out.println("연결");
			
		}catch (Exception e) {
			System.out.println("no connect");
			
		}
		return "test";
		
		
	}
	

}
