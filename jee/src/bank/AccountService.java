/**
 * 
 */
package bank;

/**
 * @date     : 2016. 6. 20.
 * @author   : jun.dev
 * @fileName : AccountService.java
 * @story    : 
 */
public interface AccountService {
	//1.개설 2.입금 3.조회. 4.출금 5.통장내역 6.통장해지 0.종료
	//1.개설
	public abstract void openAccount(String name,String id,String pw);
	//2.입금
	public abstract void deposit(int input);
	//3.조회
	public abstract String findAccount();
	//4.출금
	public abstract String withdraw(int output);
	//5.통장내역
	public abstract String showAccount();
	//6.통장해지
	public abstract String deleteAccount();
}
