package hwanjan;

import java.util.Scanner;

public class hwanone {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner myInput = new Scanner(System.in);
		final double wonperEUR = 1347.42;
		final double wonperUSD = 1132.60;
		final double wonperJPY = 1025.85;
		final double wonperCNY = 175.11;
		double korWon;
		double resultex;
		int returnWon;
		int resultexInt;
		int businessType;
		double exchange = 0;
		String money = null;
		String EUR = "EUR";
		String USD = "USD";
		String JPY = "JPY";
		String CNY = "CNY";
		
		while(true) {
		System.out.println("환전할 원화는 : ");
		korWon = myInput.nextDouble();
		System.out.println("유로환전은 1, 달러환전은 2, 엔화환전은3, 위안환전은4, 시스템종료는 5 입력");
		businessType = input.nextInt();
		
		if(businessType == 1) {
		exchange = wonperEUR;
		money = EUR;
		} else if(businessType == 2) {
	    exchange = wonperUSD;
	    money = USD;
		} else if(businessType == 3) {
	    exchange = wonperJPY;
	    money = JPY;
		} else if(businessType == 4) {
		    exchange = wonperCNY;
		    money = CNY;
		} else if(businessType ==5 ) {
			System.out.println("종료합니다.");
		break;
		}
		
		resultex = korWon / exchange;
		resultexInt = (int) resultex;
		returnWon = (int)((resultex - resultexInt) * exchange) ;
		returnWon = returnWon / 10*10;
				
		System.out.printf("환전 결과는 %d" + money +", 거스름돈 %d원 입니다.", resultexInt, returnWon);
		// 1달러, 2달러, 5달러, 10달러, 20달러, 50달러, 100달러
		
		int resultex100, resultex50, resultex20, resultex10, resultex5, resultex2, resultex1;
		
		resultex100 = resultexInt / 100;
		resultexInt = resultexInt-resultex100 * 100;
		
		resultex50 = resultexInt / 50;
		resultexInt = resultexInt-resultex50 * 50;
		
		resultex20 = resultexInt / 20;
		resultexInt = resultexInt-resultex20 * 20;
		
		resultex10 = resultexInt / 10;
		resultexInt = resultexInt-resultex10 * 10;
		
		resultex5 = resultexInt / 5;
		resultexInt = resultexInt-resultex5 * 5;
		
		resultex2 = resultexInt / 2;
		resultexInt = resultexInt-resultex2 * 2;
		
		resultex1 = resultexInt / 1;
		resultexInt = resultexInt-resultex1 * 1;
		
		System.out.printf("100"+money+" : %d장\n", resultex100);
		System.out.printf("50"+money+" : %d장\n", resultex50);
		System.out.printf("20"+money+" : %d장\n", resultex20);
		System.out.printf("10"+money+" : %d장\n", resultex10);
		System.out.printf("5"+money+" : %d장\n", resultex5);
		System.out.printf("2"+money+" : %d장\n", resultex2);
		System.out.printf("1"+money+" : %d장\n", resultex1);
		
		int returnWon1000, returnWon500, returnWon100, returnWon50, returnWon10;
		
		returnWon1000 = returnWon / 1000;
		returnWon = returnWon-returnWon1000 * 1000;
		
		returnWon500 = returnWon / 500;
		returnWon = returnWon-returnWon500 * 500;
		
		returnWon100 = returnWon / 100;
		returnWon = returnWon-returnWon100 * 100;
		
		returnWon50 = returnWon / 50;
		returnWon = returnWon-returnWon50 * 50;
		
		returnWon10 = returnWon / 10;
		returnWon = returnWon-returnWon1000 * 10;
		
		System.out.printf("1000Won : %d장\n", returnWon1000);
		System.out.printf("500Won : %d개\n", returnWon500);
		System.out.printf("100Won : %d개\n", returnWon100);
		System.out.printf("50Won : %d개\n", returnWon50);
		System.out.printf("10Won : %d개\n", returnWon10);
		}
	}
}





	