package helloworld;

import java.util.ArrayList;

public class everpro {
	static everarray everarray = new everarray();
	

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
	public static int ordercount = 0;
	public static int type;
	
	public static void woo() {
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
	public static void age() {
		if (user_id >= 20) {
			result = adult_price;
			human = adl;
			} else {
		    result = kid_price;
		    human = kid;
			}
	}
	public static void print() {
		System.out.println("가격은 " + result + "원 입니다");
		System.out.println("감사합니다.");
		System.out.println("=============== 에버랜드 =====================");
		for(int index = 0; index < ordercount; index++) {
		System.out.println("날짜:" + everarray.savedate.get(index) + " " + everarray.savehuman.get(index) + " X " + everarray.saveea.get(index) +"명 "+ everarray.saveresult.get(index) + "원 " + everarray.savewoodea.get(index) + " 감사합니다");
		System.out.println("============================================");
	}
}
}