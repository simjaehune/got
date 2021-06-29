package helloworld;

import java.util.Scanner;

public class everpro2 {
	static everpro everpro = new everpro();
	static everarray everarray = new everarray();
	
	public static void main(String arg[]) {
		
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("이용 날짜를 입력하세요. (ex 210624)");
			everpro.date = scan.nextInt();
			System.out.println("이용 고객의 나이를 입력하세요.");
			everpro.user_id = scan.nextInt();
			System.out.println("사려는 티켓 갯수를 입력하세요");
			everpro.ea = scan.nextInt();
			System.out.println("우대사항을 입력하세요. \r\n"
					+ "1. 없음 \r\n"
					+ "2. 장애인\r\n"
					+ "3. 국가유공자\r\n"
					+ "4. 다자녀\r\n"
					+ "5. 임산부");
			everpro.discount = scan.nextInt();
			everpro.age();
			everpro.woo();
			
			everarray.savedate.add(everpro.date);
			everarray.savehuman.add(everpro.human);
			everarray.saveea.add(everpro.ea);
			everarray.saveresult.add(everpro.result);
			everarray.savewoodea.add(everpro.woodea);
		
		System.out.println("추가입력하시겠습니까 (1. 추가, 2. 종료) : ");
		everpro.type = scan.nextInt();
		everpro.ordercount++;
	    } while(everpro.type == 1);
		everpro.print();
	}
}
