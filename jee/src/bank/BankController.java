/**
 * 
 */
package bank;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import global.Constants;

/**
 * @date     : 2016. 6. 15.
 * @author   : jun.dev
 * @fileName : BankController.java
 * @story    : 
 */
public class BankController {
	String s = "";
	public static void main(String[] args) {
		AccountServiceImpl service = new AccountServiceImpl();
		AccountBean bean = new AccountBean();
		BankService bkService = new BankServiceImpl();
		List<AccountBean> list = new ArrayList<AccountBean>();
		String bankResult ="";
		try {
			Class klass = Class.forName("bank.AccountBean");
		} catch (Exception e) {
			e.printStackTrace();
		}
		while (true) {
			switch (JOptionPane.showInputDialog("1.개설. 2.입금 3.조회. 4.출금 5.통장내역 6.통장해지 -사용자"
											+ "\n===================================\n"
											+ "	11.개설 12.조회(전체조회) 13.조회(계좌번호조회) 14.조회(이름) "
											+ "15.통장내역 16.수정(비번수정가능) 17.통장해지 - 관리자\n0.종료")) {
			case "1":
				String spec = JOptionPane.showInputDialog("이름,ID,PW");
				String result[] = spec.split(",");
				service.openAccount(result[0],result[1],result[2]);
				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액?");
				service.deposit(Integer.parseInt(inputMoney));
				JOptionPane.showMessageDialog(null, "잔액 : "+service.findAccount()+"원");
				break;
			case "3":
				JOptionPane.showMessageDialog(null, "잔액 : "+service.findAccount()+"원");
				break;
			case "4":
				String outputMoney = JOptionPane.showInputDialog("출금액?");
				JOptionPane.showMessageDialog(null, service.withdraw(Integer.parseInt(outputMoney)));
				break;
			case "5":
				JOptionPane.showMessageDialog(null,service.showAccount());
				break;
			case "6":
				JOptionPane.showMessageDialog(null,service.deleteAccount());
				break;
			case "11": 
				String inputData[] = JOptionPane.showInputDialog("이름,아이디,패스워드").split(",");
				bean = new AccountBean();
				bean.setAccountNO();
				bean.setName(inputData[0]);
				bean.setId(inputData[1]);
				bean.setPw(inputData[2]);
				bkService.openAccount(bean); break;
			case "12": 
				JOptionPane.showMessageDialog(null, bkService.toString());
				break;
			case "13": 
				String inputAccountNo = JOptionPane.showInputDialog("검색 계좌번호 입력");
				bean = bkService.findByAccountNo(inputAccountNo);
				JOptionPane.showMessageDialog(null, bean.getName()==null?"계좌번호없음":bean.toString());
				break;
			case "14": 
				String inputName = JOptionPane.showInputDialog("검색 이름 입력");
				List<AccountBean> name = bkService.findByName(inputName);
				JOptionPane.showMessageDialog(null, name!=null?name.toString():"해당 고객없음");
				break;
			case "15": 
				JOptionPane.showMessageDialog(null, "총계좌수"+bkService.count()+"개");
				break;
			case "16":
				String num = JOptionPane.showInputDialog("계좌번호 입력");
				String oldPw = JOptionPane.showInputDialog("비밀번호 입력");
				String newPw = JOptionPane.showInputDialog("새비밀번호 입력");
				JOptionPane.showMessageDialog(null, bkService.updateAccount(num, oldPw,newPw));
				break;
			case "17": 
				String delSpec = JOptionPane.showInputDialog("이름,ID,PW");
				String delResult[] = delSpec.split(",");
				service.openAccount(delResult[0],delResult[1],delResult[2]);
				break;
			
			case "0":
				JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				return;
				
			default:JOptionPane.showMessageDialog(null, "1~4의 메뉴를 입력해주세요");
			return;
			}
		}
	}
}
