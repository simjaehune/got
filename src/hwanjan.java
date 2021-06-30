package hwanjan;

import java.util.Scanner;

public class hwanjan {
	public static void main(String[] args) {
		
		hwanjandata tempdata = new hwanjandata();
		hwanjanpro pro = new hwanjanpro();
		
		Scanner input = new Scanner(System.in);
		Scanner myInput = new Scanner(System.in);
		
		while(true) {
		System.out.println("환전할 원화는 : ");
		tempdata.korWon = myInput.nextDouble();
		System.out.println("유로환전은 1, 달러환전은 2, 엔화환전은3, 위안환전은4, 시스템종료는 5 입력");
		tempdata.businessType = input.nextInt();
		
		if(tempdata.businessType == 1) {
		tempdata.exchange = tempdata.wonperEUR;
		tempdata.money = tempdata.EUR;
		} else if(tempdata.businessType == 2) {
		tempdata.exchange = tempdata.wonperUSD;
		tempdata.money = tempdata.USD;
		} else if(tempdata.businessType == 3) {
		tempdata.exchange = tempdata.wonperJPY;
		tempdata.money = tempdata.JPY;
		} else if(tempdata.businessType == 4) {
			tempdata.exchange = tempdata.wonperCNY;
			tempdata.money = tempdata.CNY;
		} else if(tempdata.businessType ==5 ) {
			System.out.println("종료합니다.");
		break;
		}
		
		tempdata.resultex = tempdata.korWon / tempdata.exchange;
		tempdata.resultexInt = (int) tempdata.resultex;
		tempdata.returnWon = (int)((tempdata.resultex - tempdata.resultexInt) * tempdata.exchange) ;
		tempdata.returnWon = tempdata.returnWon / 10*10;
				
		System.out.printf("환전 결과는 %d" + tempdata.money +", 거스름돈 %d원 입니다.", tempdata.resultexInt, tempdata.returnWon);
		// 1달러, 2달러, 5달러, 10달러, 20달러, 50달러, 100달러
		
		int resultex100, resultex50, resultex20, resultex10, resultex5, resultex2, resultex1;
		
		resultex100 = tempdata.resultexInt / 100;
		tempdata.resultexInt = tempdata.resultexInt-resultex100 * 100;
		
		resultex50 = tempdata.resultexInt / 50;
		tempdata.resultexInt = tempdata.resultexInt-resultex50 * 50;
		
		resultex20 = tempdata.resultexInt / 20;
		tempdata.resultexInt = tempdata.resultexInt-resultex20 * 20;
		
		resultex10 = tempdata.resultexInt / 10;
		tempdata.resultexInt = tempdata.resultexInt-resultex10 * 10;
		
		resultex5 = tempdata.resultexInt / 5;
		tempdata.resultexInt = tempdata.resultexInt-resultex5 * 5;
		
		resultex2 = tempdata.resultexInt / 2;
		tempdata.resultexInt = tempdata.resultexInt-resultex2 * 2;
		
		resultex1 = tempdata.resultexInt / 1;
		tempdata.resultexInt = tempdata.resultexInt-resultex1 * 1;
		
		System.out.printf("100"+tempdata.money+" : %d장\n", resultex100);
		System.out.printf("50"+tempdata.money+" : %d장\n", resultex50);
		System.out.printf("20"+tempdata.money+" : %d장\n", resultex20);
		System.out.printf("10"+tempdata.money+" : %d장\n", resultex10);
		System.out.printf("5"+tempdata.money+" : %d장\n", resultex5);
		System.out.printf("2"+tempdata.money+" : %d장\n", resultex2);
		System.out.printf("1"+tempdata.money+" : %d장\n", resultex1);
		
		
		tempdata.returnWon1000 = tempdata.returnWon / 1000;
		tempdata.returnWon = tempdata.returnWon-tempdata.returnWon1000 * 1000;
		
		tempdata.returnWon500 = tempdata.returnWon / 500;
		tempdata.returnWon = tempdata.returnWon-tempdata.returnWon500 * 500;
		
		tempdata.returnWon100 = tempdata.returnWon / 100;
		tempdata.returnWon = tempdata.returnWon-tempdata.returnWon100 * 100;
		
		tempdata.returnWon50 = tempdata.returnWon / 50;
		tempdata.returnWon = tempdata.returnWon-tempdata.returnWon50 * 50;
		
		tempdata.returnWon10 =tempdata. returnWon / 10;
		tempdata.returnWon = tempdata.returnWon-tempdata.returnWon1000 * 10;
		
		System.out.printf("1000Won : %d장\n", tempdata.returnWon1000);
		System.out.printf("500Won : %d개\n", tempdata.returnWon500);
		System.out.printf("100Won : %d개\n", tempdata.returnWon100);
		System.out.printf("50Won : %d개\n", tempdata.returnWon50);
		System.out.printf("10Won : %d개\n", tempdata.returnWon10);
		}
	}
}





	