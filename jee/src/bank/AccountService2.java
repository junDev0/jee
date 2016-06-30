/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

import global.Constants;

/**
 * @date     : 2016. 6. 20.
 * @author   : jun.dev
 * @fileName : AccountService.java
 * @story    : 
 */
public class AccountService2 {
	//1.개설 2.입금 3.조회. 4.출금 5.통장내역 6.통장해지 0.종료
	AccountBean account;
	//1.개설
	public void openAccount(String name,String id,String pw){
		account = new AccountBean(name,id,pw);
		
	}
	//2.입금
	public void deposit(int input){
		int money = account.getMoney();
		money += input;
		account.setMoney(money);
	}
	//3.조회
	public String findAccount(){
		return String.valueOf(account.getMoney());
	}
	//4.출금
	public String withdraw(int output){
		String result = "잔액부족입니다.";
		int money = account.getMoney();
		if(output <= money){
			money-=output;
			account.setMoney(money);
			result = "출금후 잔액 "+money+"원입니다.";
		}
		return result;
	}
	//5.통장내역
	public String showAccount(){
		return account.toString();
	}
	//6.통장해지
	public String deleteAccount(){
		account = null;
		return "해지되었습니다.";
	}
}
