package test;

/**
 * @date     : 2016. 7. 1.
 * @author   : jun
 * @fileName : StaticInitClass.java
 * @story    :
 */

public class StaticInitClass {
	static{
		System.out.println("스태틱 초기화 블록 실행중");
	}
	{		
		System.out.println("인스턴스 초기화 블록 실행중");
	}
	
	public StaticInitClass(){
		System.out.println("생성자 실행중");
	}
}
