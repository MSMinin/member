package add_user;

import java.util.Scanner;

import login.*;

public class mainClass01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		signUp sign = new signUpImpl();
		login l = new loginImp();
		int num, result = 0;
		String id = null;
		while(true) {
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인 및 회원정보");
			System.out.println("3. 주문");
			System.out.println("4. 관리자");
			System.out.print(">>>");
			num = input.nextInt();
			switch (num) {

			case 1:
				sign.display();
				break;
			case 2: 
				if(result == 0) {
					id = l.signIn();
					if(id.equals("admin")) {
						System.out.println("관리자로 로그인했습니다.");
						result = 2;
					}else {
						result = l.select(id);
					}
				}else if(result == 1){
					System.out.println("현재 로그인 중인 ID : " + id);
					result = l.select(id);
				}else if (result == 2) {
					System.out.println("관리자");
				}
				
				break;
			case 3: 
				break;
			case 4: break;
			}
		}
	}
}
