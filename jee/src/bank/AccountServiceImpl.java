/**
 * 
 */
package bank;

/**
 * @date     : 2016. 6. 20.
 * @author   : jun.dev
 * @fileName : AccountServiceImpl.java
 * @story    : 계좌 인터페이스
 */
public class AccountServiceImpl implements AccountService {
	//1.개설 2.입금 3.조회. 4.출금 5.통장내역 6.통장해지 0.종료
	AccountBean account;
	
	//1.개설
	@Override
	public void openAccount(String name, String id, String pw) {
		account = new AccountBean(name,id,pw);

	}
	//2.입금
	@Override
	public void deposit(int input) {
		int money = account.getMoney();
		money += input;
		account.setMoney(money);

	}
	//3.조회
	@Override
	public String findAccount() {
		return String.valueOf(account.getMoney());
	}
	//4.출금.
	@Override
	public String withdraw(int output) {
		String result = "잔액부족입니다.";
		int money = account.getMoney()+1000;
		if(output <= money){
			money-=output;
			account.setMoney(money);
			result = "출금후 잔액 "+money+"원입니다.";
		}
		return result;
	}
	//5.통장내역
	@Override
	public String showAccount() {
		return account.toString();
	}
	//6.통장해지
	@Override
	public String deleteAccount() {
		account = null;
		return "해지되었습니다.";
	}

}
