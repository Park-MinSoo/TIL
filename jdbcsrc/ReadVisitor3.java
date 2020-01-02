package jdbcsrc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadVisitor3 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
			stmt = conn.createStatement();
			String sql = "select name, to_char(writedate, 'yyyy\"년\" mm\"월\" dd\"일\"') writedate, memo from visitor";
					// \를 꼭 붙여서 java 컴파일러에게 "(더블 인용 부호를) 한쌍으로 보지 못하게 해주어야 한다.
					// 즉, 전체적으로 ""(더블 인용부호) 인 문장안에 또 ""가 쓰일때에는 꼭 \로 구분을 해주어야한다.
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("writedate")+"\t");
				System.out.println(rs.getString("memo"));
			}
		} catch (Exception e) {
			System.err.println("오류 발생 : " + e);	//System.err 이라는 클래스를 처음 사용해 보았다.
		} finally {
			try {
				if(rs != null)	// 객체가 생성되지 않았는데 close 되어버리면 nullPointException이 발생하므로 null인지 확인 하는 것도 중요하다.
					rs.close();
				if(stmt != null)
					stmt.close();
				if(conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
