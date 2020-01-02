package jdbcsrc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class ReadEmp {
	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = DriverManager.getConnection(
										"jdbc:oracle:thin:@localhost:1521:XE",
										"scott", "tiger");
		System.out.println(conn);
		Statement stmt = conn.createStatement();
		Scanner scan = new Scanner(System.in);
		System.out.print("검색할 부서 번호를 입력하세요 : ");
		String num = scan.nextLine();
		scan.close();
		String sql = "select ename, sal, deptno from emp " 
										+ "where deptno = "+ num;
		ResultSet rs = stmt.executeQuery(sql);	
		
		
		
/*		if(rs.next()) {
			System.out.println(rs.getString("ename") + ":" 
					+ rs.getInt("sal") + ":" + rs.getInt("deptno"));	
		// if문에서 이미 한번 next를 보내기 때문에 여기서도 수행 문장을 부여해야 놓치지 않고 모든 직원들의 정보를 조회 할 수 있게된다.
			while(rs.next()) {
				System.out.println(rs.getString("ename") + ":" 
						+ rs.getInt("sal") + ":" + rs.getInt("deptno"));
		// if문에 만약 수행문장을 부여하지 않고 while문에만 작성하였다면 처음 조회되는 직원의 정보는 계속 빼먹고 조회하게 된다.		
			} 
		} else {
			System.out.println(num + "번 부서에 근무하는 직원이 없습니다.");
		}		
*/		
		
		if(rs.next()) {
			do{
			System.out.println(rs.getString("ename") + ":" 
					+ rs.getInt("sal") + ":" + rs.getInt("deptno"));	
			}while(rs.next()); {	// do while 문을 사용하면 불필요한 식의 중복을 막을 수 있으며 이땐 꼭 while문 뒤에 ;를 써야한다.
			} 
		} else {
			System.out.println(num + "번 부서에 근무하는 직원이 없습니다.");
		}
		System.out.println("------------끝-------");
		rs.close();
		stmt.close();
		conn.close();
	}
}
