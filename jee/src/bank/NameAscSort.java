package bank;

import java.util.Comparator;

/**
 * @date     : 2016. 7. 8.
 * @author   : jun
 * @fileName : NameAcc.java
 * @story    :
 */

public class NameAscSort implements Comparator<AccountMemberBean>{

	@Override
	public int compare(AccountMemberBean first, AccountMemberBean second) {
		
		return first.getName().compareTo(second.getName());
	}

}
