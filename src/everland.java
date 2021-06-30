package myever;

import java.util.ArrayList;
import java.util.Scanner;

public class everland {
	
	public static void main(String arg[]) {
		/*
		public ArrayList<DataClass> arrdata = new ArrayList<DataClass>();

		public void confirmData(String ticket, int count, int price, 
				String age, String b, int isEventCoupon) {
		DataClass item = new DataClass();
		item.ticket = ticket;
		item.count = count;
		item.price = price;
		item.age = age;
		item.b = b;
		item.isEventCoupon = isEventCoupont;
		arrData.add(item)
		}
		*/
		
		everdata data = new everdata();
		
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("이용 날짜를 입력하세요. (ex 210624)");
			data.date = scan.nextInt();
			System.out.println("이용 고객의 나이를 입력하세요.");
			data.user_id = scan.nextInt();
			System.out.println("사려는 티켓 갯수를 입력하세요");
			data.ea = scan.nextInt();
			System.out.println("우대사항을 입력하세요. \r\n"
					+ "1. 없음 \r\n"
					+ "2. 장애인\r\n"
					+ "3. 국가유공자\r\n"
					+ "4. 다자녀\r\n"
					+ "5. 임산부");
			data.discount = scan.nextInt();
			
		everpro.age();
			
		everpro.woo();
			
		everpro.arrpro();
			
		System.out.println("추가입력하시겠습니까 (1. 추가, 2. 종료) : ");
		data.type = scan.nextInt();
		data.ordercount++;
	    } while(data.type == 1);
		System.out.println("가격은 " + data.result + "원 입니다");
		System.out.println("감사합니다.");
		System.out.println("=============== 에버랜드 =====================");
		for(int index = 0; index < data.ordercount; index++) {
		System.out.println("날짜:" + data.arr.savedate.get(index) + " " + data.arr.savehuman.get(index) + " X " + data.arr.saveea.get(index) +"명 "+ data.arr.saveresult.get(index) + "원 " + data.arr.savewoodea.get(index) + " 감사합니다");
		System.out.println("============================================");
	}
}
}
