package helloworld;

import java.util.ArrayList;
import java.util.Scanner;

public class ever2 {
	public static int user_id;
	public static int kid_price = 25000;
	public static int adult_price = 50000;
	public static int date;
	public static int ea;
	public static int result;
	public static int discount;
	public static String adl = "성인";
	public static String kid = "아이";
	public static String human =null;
	public static String woodea =null;
	public static ArrayList<String> savehuman = new ArrayList<String>();
	public static ArrayList<String> savewoodea = new ArrayList<String>();
	public static ArrayList<Integer> savedate = new ArrayList<Integer>();
	public static ArrayList<Integer> saveea = new ArrayList<Integer>();
	public static ArrayList<Integer> saveresult = new ArrayList<Integer>();
	public static int ordercount = 0;
	public static int type;
	
	
	public static void main(String arg[]) {
		
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
		age();
		woo();
		savedate.add(date);
		savehuman.add(human);
		saveea.add(ea);
		saveresult.add(result);
		savewoodea.add(woodea);
		
		System.out.println("추가입력하시겠습니까 (1. 추가, 2. 종료) : ");
		type = scan.nextInt();
		ordercount++;
	    } while(type == 1);
	    print();

	}
	private static void woo() {
		// TODO Auto-generated method stub
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
		
	}
	private static void age() {
		if (user_id >= 20) {
			result = adult_price;
			human = adl;
			} else {
		    result = kid_price;
		    human = kid;
			}
	}
	private static void print() {
		System.out.println("가격은 " + result + "원 입니다");
		System.out.println("감사합니다.");
		System.out.println("=============== 에버랜드 =====================");
		for(int index = 0; index < ordercount; index++) {
		System.out.println("날짜:" + savedate.get(index) + " " + savehuman.get(index) + " X " + saveea.get(index) +"명 "+ saveresult.get(index) + "원 " + savewoodea.get(index) + " 감사합니다");
		System.out.println("============================================");
	}
}
}
