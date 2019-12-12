package day8;
import day6.MethodLab3;
class SalaryExpr {	
	int bonus;
	
	SalaryExpr(){
		bonus = 0;
	}
	SalaryExpr(int bonus){
		this.bonus = bonus;	
	}
	int getSalary(int grade) {
		int result;
		if(grade == 1)
			result = bonus + 100;
		else if(grade == 2)
			result = bonus + 90;
		else if(grade == 3)
			result = bonus + 80;
		else
			result = bonus + 70;
		return result;
	}

}
public class SaleryExam {

	public static void main(String[] args) {
		
		int month = MethodLab3.getRandom(12);
		int grade = (int)((Math.random()*4)+1);
		
		SalaryExpr z1;

		if(month % 2 == 0) {
			z1 = new SalaryExpr(100);
		}
		else {
			z1 = new SalaryExpr();
		}
		System.out.printf(month + "월 " + grade +"등급의 월급은 " + "%d" + " 입니다.",z1.getSalary(grade));
	}

}
