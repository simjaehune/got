package helloworld;

import java.util.Scanner;

public class arr1 {
	public static void main(String[] args) {
		String[] name = new String[100];
		int[] englishpoint = new int[100];
		int[] mathpoint = new int[100];
		Scanner myInput = new Scanner(System.in);
		int count = 0;
		int type;
		int[] sum = new int[100];
		int[] avg = new int[100];
		
		do {
			System.out.println("이름을 입력하세요.");
			name[count] = myInput.next();
			System.out.println("영어 점수는 몇점입니까?");
			englishpoint[count] = myInput.nextInt();
			System.out.println("수학 점수는 몇점입니까?");
			mathpoint[count] = myInput.nextInt();
			System.out.println("추가입력하시겠습니까 (1. 추가, 2. 종료) : ");
			type = myInput.nextInt();
			count++;
		} while(type == 1);
		System.out.println("이름   " + "영어 점수   " + "수학 점수   " + "총점   " +  "평균");
		for(int index = 0; index < count; index++) {
			sum[index]=englishpoint[index]+mathpoint[index];
			avg[index]=sum[index]/2;
			System.out.printf("%s\t%d\t%d\t%d\t%d\n", name[index], englishpoint[index], mathpoint[index], sum[index], avg[index]);
		}
		
		myInput.close();
	}
}


		
	




