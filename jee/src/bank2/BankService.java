/**
 * 
 */
package bank2;

import java.util.ArrayList;
import java.util.List;

/**
 * @date     : 2016. 6. 20.
 * @author   : jun.dev
 * @fileName : AccountService.java
 * @story    : 
 */
public interface BankService {
	//11.개설 12.조회(전체조회) 13.조회(계좌번호조회) 14.조회(이름) 15.통장내역 16.수정(비번수정가능) 17.통장해지
	
	//CREATE : 11.개설
	public abstract void openAccount(AccountBean bean);
	//READ : 12.조회(전체 조회)
	public abstract List<AccountBean> accountList();
	//READ : 13.조회(계좌번호 조회)
	public AccountBean findByAccountNo(String accountNo);
	//READ : 14.조회(이름)
	public List<AccountBean> findByName(String name);
	//READ : 15.조회(전체통장수)
	public int count();
	//READ : 16.통장내역 
	public void showAccount();
	//UPDATE : 수정(사용자의 요청에 의해 비번만 수정가능) 계좌번호,비밀번호 받는 조건
	public String updateAccount(String accountNo,String oldPw,String nowPw); 
	//DELETE : 17.통장해지
	public abstract String deleteAccount(String name, String id, String pw);
	

}
