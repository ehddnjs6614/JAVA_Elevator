package ex;

import java.util.Scanner;

public class Elevator extends Lift { //lift 상속받았으니 이거써야함.

	final int maxFloor = 10;
	final int minFloor = -3;
	
	
	@Override
	void up() {
		floor++;
		System.out.println("올라갑니다");
	}

	@Override
	void down() {
		floor--;
		System.out.println("내려갑니다");
	}

	@Override
	void start(int choice) {
		if(choice < floor) {
			for (int i = 0; i <= floor-choice+i; i++) {
				if(floor!=0){
					System.out.println(floor +"층");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
				down();
				
			}
			stop();
		}else if(choice != floor) {
		for (int i = 0; i < choice - floor+i; i++) {
			if(floor!=0) {
				System.out.println(floor+"층");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
				}
			}
			up();
			}	
			stop();
		}else {
			System.out.println("같은 층 선택 불가");
		}
	}

	@Override
	void stop() {
		 System.out.println("띵 ~ 도착");
		
	}

	@Override
	void go() {
		int choice = 0;
		String msg ="";
		while (true) {
			msg = "층수를 입력하세요 (현재층 :"+ floor+"층)";
			System.out.println(msg);
			choice = new Scanner(System.in).nextInt();
			if (choice > maxFloor || choice < minFloor) {
				System.out.println("b3층 부터 10층까지만 가능합니다.");
			}else {
				break;
			}
		}
		start(choice);
	}

	
	
	     
}
