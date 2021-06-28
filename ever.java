package helloworld;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class ever {
	public static void main(String arg[]) {
		int user_id;
		int kid_price = 25000;
		int adult_price = 50000;

		int date;
		int ea;
		int result;
		int discount;
		String adl = "성인";
		String kid = "아이";
		String human =null;
		String woodea =null;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("이용 날짜를 입력하세요. (ex 210624)");
		date = scan.nextInt();
		System.out.println("이용 고객의 나이를 입력하세요.");
		user_id = scan.nextInt();
		System.out.println("사려는 티켓 갯수를 입력하세요");
		ea = scan.nextInt();
		System.out.println("우대사항을 입력하세요. \r\n"
				+ "1. 없음 \r\n"
				+ "2. 장애인\r\n"
				+ "3. 국가유공자\r\n"
				+ "4. 다자녀\r\n"
				+ "5. 임산부");
		discount = scan.nextInt();
		
		if (user_id >= 20) {
		result = adult_price;
		human = adl;
		} else {
	    result = kid_price;
	    human = kid;
		}
		
		if(discount == 1) {
		result = (int) ((result * ea) * 1);
		woodea = "정상가";
		} else if(discount == 2) {
		result = (int) ((result * ea) * 0.8);
		woodea = "장애인 우대";
	    } else if(discount == 3) {
	    result = (int) ((result * ea) * 0.8);
	    woodea = "국가유공자 우대";
	    } else if(discount == 4) {
		result = (int) ((result * ea) * 0.8);
		woodea = "다자녀우대";
		} else {
		result = (int) ((result * ea) * 0.8);
		woodea = "임산부 우대";
		}
	    
		System.out.println("가격은 " + result + "원 입니다");
		System.out.println("감사합니다.");
		System.out.println("=============== 에버랜드 =====================");
		System.out.println("날짜:" + date + " " + human + " X " + ea +"명 "+ result + "원 " + woodea + " 감사합니다");
		System.out.println("============================================");

	}
	}
