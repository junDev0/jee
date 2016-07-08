package bank;

import java.util.Comparator;

/**
 * @date     : 2016. 7. 8.
 * @author   : jun
 * @fileName : NameAcc.java
 * @story    :
 */

public class AccountNoAscSort implements Comparator<AccountMemberBean>{

	@Override
	public int compare(AccountMemberBean first, AccountMemberBean second) {
		int a = 0;
		if(first.getAccountNO()>second.getAccountNO()){
			a = -1;
		}else{
			if (first.getAccountNO()<second.getAccountNO()) {
				a = 1;
			} else {
				a = 0;
			}
		}
		return a;
	}

}
