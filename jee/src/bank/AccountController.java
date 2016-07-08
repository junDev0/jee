/**
 * 
 */
package bank;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import global.Constants;
import grade.GradeDAO;

/**
 * @date     : 2016. 6. 15.
 * @author   : jun.dev
 * @fileName : BankController.java
 * @story    : 
 */
//bank , member 랑 연합
public class AccountController {
	
	public static void main(String[] args) {
		AccountService service = AccountServiceImpl.getInstance();
		AccountMemberBean bean = null;
		while (true) {
			switch (JOptionPane.showInputDialog("1.통장개설 2.입금 3.조회. 4.출금  5. 수정(비번) 6.통장해지"
					 						+ "\n 7.조회(전체) 8.조회(계좌번호) 9.조회(이름) 10.조회(전체통장수)")) {

			case "1":
				String joinData[] = JOptionPane.showInputDialog("이름,아이디,패스워드,주민번호(ex:880101-1) 입력").split(",");
				bean = new AccountMemberBean(joinData[0],joinData[1],joinData[2],joinData[3]);
				JOptionPane.showMessageDialog(null, service.openAccount(bean));
				break;
			case "2":
				String depositInfo[] = JOptionPane.showInputDialog("계좌번호,입금금액 입력").split(",");
				bean = new AccountMemberBean();
				bean.setAccountNO(Integer.parseInt(depositInfo[0]));
				bean.setMoney(Integer.parseInt(depositInfo[1]));
				JOptionPane.showMessageDialog(null, service.deposit(bean));
				break;	
			case "3":
				String accNum = JOptionPane.showInputDialog("계좌번호");
				bean = new AccountMemberBean();
				bean.setAccountNO(Integer.parseInt(accNum));
				JOptionPane.showMessageDialog(null, "잔액 : "+service.findByAcc(bean).getMoney()+"원");
				break;	
			case "4": 
				String withdrawInfo[] = JOptionPane.showInputDialog("계좌번호,출금금액 입력").split(",");
				bean = new AccountMemberBean();
				bean.setAccountNO(Integer.parseInt(withdrawInfo[0]));
				bean.setMoney(Integer.parseInt(withdrawInfo[1]));
				JOptionPane.showMessageDialog(null, service.withdraw(bean));
				break;	
			case "5":
				String userInfo[] = JOptionPane.showInputDialog("아이디,비밀번호,새비밀번호").split(",");
				bean = new AccountMemberBean();
				bean.setId(userInfo[0]);
				bean.setPw(userInfo[1]);
				bean.setModifyPw(userInfo[2]);
				JOptionPane.showMessageDialog(null, service.updateAccount(bean));
				break;
			case "6": 
				String accNum3 = JOptionPane.showInputDialog("계좌번호");
				bean = new AccountMemberBean();
				bean.setAccountNO(Integer.parseInt(accNum3));
				JOptionPane.showMessageDialog(null, service.deleteAccount(bean));				
				break;	
			case "7": 
				List<?> totalList = service.accountList();
				String totalResult = "";
				if(totalList == null){
					JOptionPane.showMessageDialog(null, "데이터가 없습니다.");
					continue;
				}
				for (int i = 0; i < totalList.size(); i++) {
					totalResult += totalList.get(i).toString()+"\n";  
				}
				JOptionPane.showInputDialog(totalResult);
				break;
				
			case "8": 
				String accNum2 = JOptionPane.showInputDialog("계좌번호");
				bean = new AccountMemberBean();
				bean.setAccountNO(Integer.parseInt(accNum2));
				JOptionPane.showMessageDialog(null, service.findByAcc(bean).toString());
				break;
			case "9":
				String name = JOptionPane.showInputDialog("이름 입력");
				List<AccountMemberBean> nameList = service.findByName(name);
				String nameResult = "";
				if(nameList == null){
					JOptionPane.showMessageDialog(null, "데이터가 없습니다.");
					continue;
				}
				for (int i = 0; i < nameList.size(); i++) {
					nameResult += nameList.get(i).toString()+"\n";  
				}
				JOptionPane.showInputDialog(nameResult);
				break;
			case "10": 
				JOptionPane.showMessageDialog(null, service.count()+"개");
				break;				
			case "0": return;	
			default:
				break;
			}
		}
	}
}
