package test;

import bank.AccountBean;
import member.MemberBean;

/**
 * @date     : 2016. 7. 1.
 * @author   : jun
 * @fileName : ReflectionTest.java
 * @story    :
 */

public class ReflectionTest2 {
	public static void main(String[] args) {
		try {
			AccountBean bean = (AccountBean) Class.forName("bank.AccountBean").newInstance();
			bean.setId("hong");
			bean.setName("홍길동");
			bean.setMoney(1000);
			bean.setAccountNO();
			System.out.println(bean.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
