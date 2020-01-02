package jdbcsrc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

public class SelectEmpLab {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}	
		
		String sql = "select ename, to_char(sal,'9,999'), to_char(hiredate, 'yyyy\"년\" mm\"월\" dd\"일\"') hiredate from emp";
		
		boolean randomBoolean;
		if (Math.random() < 0.5) {
			randomBoolean = true ;
		}
		else {
			randomBoolean = false;
		}		
		//boolean rand = new Random().nextBoolean();
		
		try (	Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "scott", "tiger");
				Statement stmt = conn.createStatement();			
				ResultSet rs = stmt.executeQuery(sql);) {	
			if (randomBoolean == true) {
				if(rs.next() ) {				
					do {
						System.out.print(rs.getString("ename")+ " 직원의");
						System.out.println(" 월급은 " + rs.getString(2) + "원입니다.");
					} while (rs.next());
				} else {
					System.out.println("데이터 없음");
				}
			}
			else {	
				if(rs.next() ) {				
					do {
						System.out.print(rs.getString("ename")+ " 직원은 ");
						System.out.println(rs.getString("hiredate") + "에 입사하였습니다.");
					} while (rs.next());
				} else {
					System.out.println("데이터 없음");
			}
			}
		} catch (Exception e) {
			System.err.println("오류 발생 : " + e);
		}
	}
}