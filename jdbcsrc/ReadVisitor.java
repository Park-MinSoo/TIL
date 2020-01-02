package jdbcsrc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadVisitor {
	public static void main(String[] args) throws Exception {
		//1. JDBC Driver 로딩 - Class.forName()
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. DBMS 에 접속 - DriverManager.getConnection("jdbc url", "계정", "암호")	//연결정보를 담고있는 객체인 것
		Connection conn = DriverManager.getConnection(
										"jdbc:oracle:thin:@localhost:1521:XE",
										"jdbctest", "jdbctest");
		System.out.println(conn);
		//3. Statement/PreparedStatement 객체 생성	// Statement의 단점을 해결하기 위해 PreparedStatement를 사용하는 것
		Statement stmt = conn.createStatement();
		//4. 처리하려는 기능에 따라서 SQL 문을 전달하고 수행시킨다.
		String sql = "select name, writedate, memo from visitor";
		ResultSet rs = stmt.executeQuery(sql);
		//5. 결과 처리
		while(rs.next()) {	// next는 행단위를 옮겨가는 것이다.next는 boolean형 이므로 true라면 한행이라도 있는 것이고 false라면 아무 것도 없는 것이다.
			System.out.println(rs.getString("name") + ":" 
								+ rs.getDate("writedate") + ":" + rs.getString("memo"));
		}
		System.out.println("------------끝-------");
		rs.close();
		stmt.close();
		conn.close();
	}
}
