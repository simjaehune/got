package helloworld;

import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class everland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int todayYear, todayDate, birthYear, birthMonth, birthDay, birthDate, reservationDate, benefit, count, manAge, price = 0;
		String ticket, socialNumber, age;
        String b = "";
        	   
		String pattern1 = "yyyyMMdd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern1);
		//시간 포맷을 위의 pattern1 yyyy년, MM월, dd 날짜로 포맷
		String today = simpleDateFormat.format(new Date());
		//String today 에 Date값을 입력해줌.
		//java.util.date를 이용한 값.
		System.out.println(today);
		todayYear = Integer.parseInt(today.substring(0,4));
	    todayDate = Integer.parseInt(today.substring(4,8));
	    //int 값 오늘 년도와 오늘 날짜를 today의 0~4번 째까지 Date를 4~8번째까지 저장
	    
	    while(true ) {
	    	//전체에 대한 와일문 시작
	    	while(true) {
				System.out.println("--------------------------------------");
	   	    	System.out.println("이용날짜를 입력해주세요.(숫자로만 20210628)");
	   	    	System.out.print(": ");
	   	    	Scanner myInput1 = new Scanner(System.in);
	   	    	// 스캐너를 통해 myInput1 값을 입력받음.
	   	    	reservationDate = myInput1.nextInt();
	   	    	// reservationDate는 myInput1
		
				if(reservationDate == 20210703 || reservationDate == 20210704 || reservationDate == 20210710 || reservationDate == 20210711 || reservationDate == 20210717 
					 || reservationDate == 20210718 || reservationDate == 20210724 || reservationDate == 20210725 || reservationDate == 20210729 || reservationDate == 20210730 
					 || reservationDate == 20210731 || reservationDate == 20210801 || reservationDate == 20210802 || reservationDate == 20210803 || reservationDate == 20210807 
					 || reservationDate == 20210808 || reservationDate == 20210814 || reservationDate == 20210815 || reservationDate == 20210821 || reservationDate == 20210822 
					 || reservationDate == 20210828 || reservationDate == 20210829 || reservationDate == 20210903 || reservationDate == 20210906 || reservationDate == 20210907 
					 || reservationDate == 20210908 || reservationDate == 20210909 || reservationDate == 20210910 || reservationDate == 20210913 || reservationDate == 20210914 
					 || reservationDate == 20210915 || reservationDate == 20210916 || reservationDate == 20210917 || reservationDate == 20210923 || reservationDate == 20210924 
					 || reservationDate == 20210927 || reservationDate == 20210928 || reservationDate == 20210929 || reservationDate == 20210930 || reservationDate == 20211001 
					 || reservationDate == 20211004 || reservationDate == 20211005 || reservationDate == 20211006 || reservationDate == 20211007 || reservationDate == 20211008 
					 || reservationDate == 20211011 || reservationDate == 20211012 || reservationDate == 20211013 || reservationDate == 20211014 || reservationDate == 20211015 
					 || reservationDate == 20211018 || reservationDate == 20211019 || reservationDate == 20211020 || reservationDate == 20211021 || reservationDate == 20211022
					 || reservationDate == 20211025 || reservationDate == 20211026 || reservationDate == 20211027 || reservationDate == 20211028 || reservationDate == 20211029 
					 || reservationDate == 20211101 || reservationDate == 20211102 || reservationDate == 20211103 || reservationDate == 20211104 || reservationDate == 20211105 
					 || reservationDate == 20211108 || reservationDate == 20211109 || reservationDate == 20211110 || reservationDate == 20211111 || reservationDate == 20211112 
					 || reservationDate == 20211113 || reservationDate == 20211114 || reservationDate == 20211120 || reservationDate == 20211121 || reservationDate == 20211127 
					 || reservationDate == 20211128) {
					ticket = "B 티켓";
					break;
				} else if(reservationDate == 20210904 || reservationDate == 20210905 || reservationDate == 20210911 || reservationDate == 20210912 || reservationDate == 20210918
					 || reservationDate == 20210919 || reservationDate == 20210920 || reservationDate == 20210921 || reservationDate == 20210922 || reservationDate == 20210925
					 || reservationDate == 20210926 || reservationDate == 20211002 || reservationDate == 20211003 || reservationDate == 20211009 || reservationDate == 20211010
					 || reservationDate == 20211016 || reservationDate == 20211017 || reservationDate == 20211023 || reservationDate == 20211024 || reservationDate == 20211030
					 || reservationDate == 20211031 || reservationDate == 20211106 || reservationDate == 20211107) {
					ticket = "A 티켓";
					break;
				} else if(reservationDate == 20210628 || reservationDate == 20210629 || reservationDate == 20210630 || reservationDate == 20210701 || reservationDate == 20210702
					 || reservationDate == 20210705 || reservationDate == 20210706 || reservationDate == 20210707 || reservationDate == 20210708 || reservationDate == 20210709
					 || reservationDate == 20210712 || reservationDate == 20210713 || reservationDate == 20210714 || reservationDate == 20210715 || reservationDate == 20210716
					 || reservationDate == 20210719 || reservationDate == 20210720 || reservationDate == 20210721 || reservationDate == 20210722 || reservationDate == 20210723
					 || reservationDate == 20210726 || reservationDate == 20210727 || reservationDate == 20210728 || reservationDate == 20210804 || reservationDate == 20210805
					 || reservationDate == 20210806 || reservationDate == 20210809 || reservationDate == 20210810 || reservationDate == 20210811 || reservationDate == 20210812
					 || reservationDate == 20210813 || reservationDate == 20210816 || reservationDate == 20210817 || reservationDate == 20210818 || reservationDate == 20210819
					 || reservationDate == 20210820 || reservationDate == 20210823 || reservationDate == 20210824 || reservationDate == 20210825 || reservationDate == 20210826
					 || reservationDate == 20210827 || reservationDate == 20210830 || reservationDate == 20210831 || reservationDate == 20210901 || reservationDate == 20210902
					 || reservationDate == 20211115 || reservationDate == 20211116 || reservationDate == 20211117 || reservationDate == 20211118 || reservationDate == 20211119
					 || reservationDate == 20211122 || reservationDate == 20211123 || reservationDate == 20211124 || reservationDate == 20211125 || reservationDate == 20211126
					 || reservationDate == 20211129 || reservationDate == 20211130) {
					ticket = "C 티켓";
					break;
				} else {
					System.out.println("다시 입력해 주세요.");
					continue;
					// break 만나는 즉시 반복문 전체 탈출
					// continue 만나면 해당 반복부분 탈출 후 다음 반복실행
				}
			}
			
			if(ticket == "A 티켓") {
				price = price + 60000;
			} else if(ticket == "B 티켓") {
				price = price + 56000;
			} else {
				price = price + 50000;
			}
			
			System.out.println(ticket);
			System.out.println("ㅡ");

			while(true) {
				System.out.print("주민번호 앞자리를 입력하세요.(숫자로만 951123)(0 누르면 처음으로)\n");
				System.out.print(": ");
				Scanner myInput2 = new Scanner(System.in);
				socialNumber = myInput2.nextLine();
				if(socialNumber.equals("0")) {
					break;
				} else if(socialNumber.length() != 6) {
					System.out.println("다시 입력해 주세요.");
					continue;
					//socialNumber의 길이가 6이 아니면 다시입력
				} else if(socialNumber.length() == 6) {
					birthMonth = Integer.parseInt(socialNumber.substring(2,4));
					//Integer.parseInt(String s) 숫자형의 문자열을 인자 값으로 받으면 해당 값을 10진수의 Integer 형으로 반환
					birthDay = Integer.parseInt(socialNumber.substring(4,6));
					if((1 <= birthMonth && birthMonth <= 12) && (1 <= birthDay && birthDay <= 32)) {	
						break;
					} else {
						System.out.println("다시 입력해 주세요.");
						continue;
					}					
				} else {
					break;
				}
			}
			if (socialNumber.equals("0")) {
				continue;			
			} else {
				
			}
			
			birthYear = Integer.parseInt(socialNumber.substring(0,2));
			birthDate = Integer.parseInt(socialNumber.substring(2,6));
	
			if(0 <= birthYear && birthYear <= 30) {
				birthYear += 2000;
			} else {
				birthYear += 1900;
			}
			manAge = todayYear - birthYear;
			if(todayDate < birthDate) {
				manAge = manAge - 1;
			} else {
				manAge = manAge + 0;
			}
			
			System.out.printf("만 %d\n", manAge);
			
			if((19 <= manAge) && (manAge <= 64 ))  {
				age = "어른";	
			} else if(65 <= manAge) {
				age = "경로";
			} else if((3 <= manAge) && (manAge <= 12 )) {
				age = "어린이";
				if(ticket == "A 티켓") {
					price = 48000;
				} else if(ticket == "B 티켓") {
					price = 44000;
				} else {
					price = 40000;
				}
			} else if(manAge < 3) {
				age = "36개월미만";
				price = 0;
			} else {
				age = "청소년";
			}

			System.out.println("ㅡ");
					
			while(true) {
				System.out.println("몇개를 주문하시겠습니까?(0 누르면 처음으로)");
				System.out.print(": ");
				Scanner myInput3 = new Scanner(System.in);
				count = myInput3.nextInt();
				if(count == 0) {
					break;
				} else {
					break;
				}
			}
			
			if(count == 0) {
				continue;
			}
				System.out.println("ㅡ");
					
			while(true) {
				System.out.println("우대사항을 선택하세요.(0 누르면 처음으로)");
				System.out.println("1. 없음 (나이 우대는 자동처리)");
				System.out.println("2. 장애인");
				System.out.println("3. 국가유공자");
				System.out.println("4. 다자녀");
				System.out.println("5. 임산부");
				System.out.print(": ");
				Scanner myInput4 = new Scanner(System.in);
				benefit = myInput4.nextInt();
				if(0 <= benefit && benefit <=5 ) {
					break;
				} else {
					System.out.println("다시 입력해 주세요.");
					continue;
				}
			}
			if(benefit == 0) {
				continue;
			}
							
			switch(benefit) {
			case 1: b = "우대적용 없음"; break;
			case 2: b = "장애인 우대적용"; 
			if(ticket == "A 티켓") {
				if(age == "어른") {
					price = 36000;
				} else if(age == "36개월미만") {
					price = 0;
				} else {price = 28000;}
			} else if(ticket == "B 티켓") {
				if(age == "어른") {
					price = 33000;
				} else if(age == "36개월미만") {
					price = 0;
				} else {price = 26000;}
			} else {
				if(age == "어른") {
					price = 30000;
				} else if(age == "36개월미만") {
					price = 0;
				} else {price = 24000;}
			} break;
			case 3: b = "국가유공자 우대적용"; 
			if(ticket == "A 티켓") {
				if(age == "어른") {
					price = 30000;
				} else if(age == "36개월미만") {
					price = 0;
				} else {price = 24000;}
			} else if(ticket == "B 티켓") {
				if(age == "어른") {
					price = 28000;
				} else if(age == "36개월미만") {
					price = 0;
				} else {price = 22000;}
			} else {
				if(age == "어른") {
					price = 25000;
				} else if(age == "36개월미만") {
					price = 0;
				} else {price = 20000;}
			} break;
			case 4: b = "다자녀 우대적용"; 
			if(ticket == "A 티켓") {
				if(age == "어른" || age == "청소년") {
					price = 48000;
				} else if(age == "36개월미만") {
					price = 0;
				} else {price = 38000;}
			} else if(ticket == "B 티켓") {
				if(age == "어른" || age == "청소년") {
					price = 44000;
				} else if(age == "36개월미만") {
					price = 0;
				} else {price = 35000;}
			} else {
				if(age == "어른" || age == "청소년") {
					price = 40000;
				} else if(age == "36개월미만") {
					price = 0;
				} else {price = 32000;}
			} break;
			case 5: b = "임산부 우대적용"; 
			if(ticket == "A 티켓") {
				if(age == "36개월미만") {
					price = 0;
				} else {price = 51000;}
			} else if(ticket == "B 티켓") {
				if(age == "36개월미만") {
					price = 0;
				} else {price = 47000;}
			} else {
				if(age == "36개월미만") {
					price = 0;
				} else {price = 42000;}
			} break;
			}
			
			System.out.println("ㅡ");
			System.out.printf("가격은 %d 입니다.\n", price*count);
			System.out.println("감사합니다.");
			System.out.println();
			System.out.println("=============== 에버랜드 ===============");
			System.out.printf("%s  %s  X  %d  %d  %s\n", ticket, age, count, price*count, b);
			System.out.println("======================================");
			System.out.println();
			System.out.println("--------------------------------------");
			System.out.println();
			System.out.println();
					
		}		
	}		    
}