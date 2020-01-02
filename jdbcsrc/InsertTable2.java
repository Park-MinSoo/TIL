package jdbcsrc;

import java.sql.*;

public class InsertTable2 {
	public static void main(String args[]) throws Exception {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT into product values"+
						"('"+args[0]+"', '"+args[1]+"', '"+args[2]+"',"+
					          args[3]+","+ args[4]+")");	//executeUpdate는 항상 Auto Commit이 된다.
			// 이런식으로 statement는 인용부호를 ' 나 " 일일이 다주어야한다. 바로 이것이 statement의 단점이다.
			System.out.println("데이터들을 추가하였습니다.");
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("오류 발생 : " + e);
		}
	}
}
