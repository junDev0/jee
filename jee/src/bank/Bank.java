/**
 * 
 */
package bank;

/**
 * @date     : 2016. 6. 15.
 * @author   : jun.dev
 * @fileName : Bank.java
 * @story    : 
 */
public class Bank {
	 //인스턴스 변수는 초기화를 하지 않는다.
	private String name;
	private int money;
	private String bankName;
	private String pw;
	private String id;
	
	private int account;
	
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	
}
