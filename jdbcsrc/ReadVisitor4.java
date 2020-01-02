package jdbcsrc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class ReadVisitor4 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		String sql = "select name, to_char(writedate, 'yyyy\"년\" mm\"월\" dd\"일\"') writedate, memo from visitor"; 
		try (	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "jdbctest", "jdbctest");
				Statement stmt = conn.createStatement();			
				ResultSet rs = stmt.executeQuery(sql);)
		//	Java 5 부터는 try에서 객체생성을 하고 알아서 스스로 catch 후 close를 하게 할 수 있다.
		// 위 3가지는 인터페이스므로 드라이버가 제공하는 규격화된 자식 클래스들 인것이다.					
		{	
			while (rs.next()) {
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("writedate")+"\t");
				System.out.println(rs.getString("memo"));
			}
		} catch (Exception e) {
			System.err.println("오류 발생 : " + e);
		} 
	}
}
