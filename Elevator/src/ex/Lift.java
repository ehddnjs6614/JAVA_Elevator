package ex;

public abstract class Lift {
	//틀을 먼저잡고 매게변수를 생각 ,
	//인터페이스말고 앱스트렉트로 한이유  : 인터페이스로 해두되지만 , 층수는 랜덤으로 수정할수있으니 
	static int floor = 0;
	
	abstract void up(); //강제성
	abstract void down(); //강제성
	abstract void start(int choice); //강제성
	abstract void stop(); //강제성 
	abstract void go(); //엘레베이터 입장 
	
	
	
	
}
