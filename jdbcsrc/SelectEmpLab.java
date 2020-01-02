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
		
		String sql = "select ename, to_char(sal,'9,999'), to_char(hiredate, 'yyyy\"��\" mm\"��\" dd\"��\"') hiredate from emp";
		
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
						System.out.print(rs.getString("ename")+ " ������");
						System.out.println(" ������ " + rs.getString(2) + "���Դϴ�.");
					} while (rs.next());
				} else {
					System.out.println("������ ����");
				}
			}
			else {	
				if(rs.next() ) {				
					do {
						System.out.print(rs.getString("ename")+ " ������ ");
						System.out.println(rs.getString("hiredate") + "�� �Ի��Ͽ����ϴ�.");
					} while (rs.next());
				} else {
					System.out.println("������ ����");
			}
			}
		} catch (Exception e) {
			System.err.println("���� �߻� : " + e);
		}
	}
}