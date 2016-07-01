package test;

/**
 * @date     : 2016. 7. 1.
 * @author   : jun
 * @fileName : StaticInit.java
 * @story    :
 */

public class StaticInit {
	public static void main(String[] args) {
		StaticInitClass a1 = new StaticInitClass();
		System.out.println("---------------");
		StaticInitClass a2 = new StaticInitClass();
		System.out.println("---------------");
		StaticInitClass a3 = new StaticInitClass();
		System.out.println("---------------");
	}
}
