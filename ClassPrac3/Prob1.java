package ClassPrac3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prob1 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Emp emp = new Emp();

		System.out.print("이름을 입력해주세요  :\t");
		String str1 = br.readLine();
		emp.setName(str1);

		System.out.print("아이디를 입력해주세요  :\t");
		String str2 = br.readLine();
		emp.setId(str2);

		emp.setBaseSalry(50000);
		System.out.println( emp.toString() );
//		System.out.println( "봉급 = " + emp.getSalary( 30 ) );
		
	}

}
