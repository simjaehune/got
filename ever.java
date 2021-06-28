package helloworld;

import java.util.Scanner;

public class ever1 {
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
		String[] savehuman = new String[100];
		String[] savewoodea = new String[100];
		int[] savedate = new int[100];
		int[] saveea = new int[100];
		int[] saveresult = new int[100];
		int ordercount = 0;
		int type;
		
		do {
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
		
		savedate[ordercount] = date;
		savehuman[ordercount] = human;
		saveea[ordercount] = ea;
		saveresult[ordercount] = result;
		savewoodea[ordercount] = woodea;
		
		System.out.println("추가입력하시겠습니까 (1. 추가, 2. 종료) : ");
		type = scan.nextInt();
		ordercount++;
	    } while(type == 1);
	    
		System.out.println("가격은 " + result + "원 입니다");
		System.out.println("감사합니다.");
		System.out.println("=============== 에버랜드 =====================");
		for(int index = 0; index < ordercount; index++) {
		System.out.println("날짜:" + savedate[index] + " " + savehuman[index] + " X " + saveea[index] +"명 "+ saveresult[index] + "원 " + savewoodea[index] + " 감사합니다");
		System.out.println("============================================");

	}
	}
}
