package ex;

import java.util.Random;
import java.util.Scanner;

public class Building {
	public static void main(String[] args) {
		Elevator e= new Elevator();
		Random r = new Random();
		int cnt = 0;
		int floor =0;
		String check ="";
		int[] arElevator = new int[5];
		
        cnt = r.nextInt(6);
		for (int i = 0; i < cnt; i++) {
			arElevator[i] =1;
		}
		
		while (true) {
			//최대 : 10층
			//최소 : -3층
			//0~13 -3 > -3 ~ 10
			floor = r.nextInt(e.maxFloor + (e.minFloor*-1)+1) + e.minFloor;
			if(floor!=0) break;
		}
		if(cnt ==0) {
	System.out.println("현재 탑승 인원 : 없음");	
		}else {
			System.out.println("현재 탑승 인원 :" + cnt + "명(최대5명)");
		}
		System.out.println("Y: 타기          N: 보내기");
		check = new Scanner(System.in).next().toUpperCase();
		if (check.equals("Y")) {
			cnt++;
			try {
				arElevator[cnt -1] =1;
				Elevator.floor = floor;
				e.go();
			} catch (Exception e1) {
				System.out.println("정원 초과");
			}
		}
		
	}
}
