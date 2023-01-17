package com.greedy.section01.poker;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
		
		Application app = new Application();
		int num1 = (int) ((Math.random() * 10) + 1);
		
		while(true) {

			int num2 = (int) ((Math.random() * 10) + 1);

			Scanner sc = new Scanner(System.in);
			System.out.println("===== 카드 게임을 시작합니다. =====");
			System.out.println("1. 운명을 건 카드 뽑기");
			System.out.println("2. 느낌이 좋다. 승부다!!");
			System.out.println("3. 느낌은 개뿔. 다음 기회를 노린다...");
			System.out.println("9. 카드 게임 종료");
			System.out.print("메뉴 선택 : ");
			int no = sc.nextInt();
			
			switch(no) {
				case 1 :
						app.drawCard(num1);
						break;
				case 2 :
						app.gameCard(num1, num2);
						num1 = (int) ((Math.random() * 10) + 1);
						break;
				case 3 :
					app.dieCard();
					num1 = (int) ((Math.random() * 10) + 1);
					break;
				case 9 :
					System.out.println("[ 카드 게임을 종료합니다. ]");
					return;
				default :
					System.out.println("[ 잘못된 번호를 선택하셨습니다. ]");
					break;
			}
			
		}
		
		
	}
	
	Card card1 = new Card01();
	Card card2 = new Card02();
	Card card3 = new Card03();
	Card card4 = new Card04();
	Card card5 = new Card05();
	Card card6 = new Card06();
	Card card7 = new Card07();
	Card card8 = new Card08();
	Card card9 = new Card09();
	Card card10 = new Card10();
	
	public void drawCard(int num1) {
		
		switch(num1) {
			case 1 :
				card1.select();
				return;
			case 2 :
				card2.select();
				return;
			case 3 :
				card3.select();
				return;
			case 4 :
				card4.select();
				return;
			case 5 :
				card5.select();
				return;
			case 6 :
				card6.select();
				return;
			case 7 :
				card7.select();
				return;
			case 8 :
				card8.select();
				return;
			case 9 :
				card9.select();
				return;
			case 10 :
				card10.select();
				return;
			
		};
		
	}
	
	public void gameCard(int num1, int num2) {
		
		if(num1 > num2) {
			System.out.println("[ 딜러 : " + num1 + " ]");
			System.out.println("[ 유저 : " + num2 + " ]");
			System.out.println("[ 딜러가 이겼습니다. ]");
//			System.out.println("[ 딜러 : " + (++sum1) + "승 / 유저 : " + sum2 + "승 ]");
			
		} else if(num1 == num2) {
			System.out.println("[ 딜러 : " + num1 + " ]");
			System.out.println("[ 유저 : " + num2 + " ]");
			System.out.println("[ 비겼습니다. ]");
		} else {
			System.out.println("[ 딜러 : " + num1 + " ]");
			System.out.println("[ 유저 : " + num2 + " ]");
			System.out.println("[ 유저가 이겼습니다!!! ]");
//			System.out.println("[ 딜러 : " + sum1 + "승 / 유저 : " + (++sum2) + "승 ]");
		}
		
	}
	
	public void dieCard() {
		System.out.println("[ 당신은 배짱이 물벼락만 하군요. 겁쟁이는 돌아가세요~~ ]");
	}



}
