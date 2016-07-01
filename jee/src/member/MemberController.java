/**
 * 
 */
package member;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 * @date     : 2016. 6. 16.
 * @author   : jun.dev
 * @fileName : SchoolController.java
 * @story    : 
 */
public class MemberController {
	/**
	 * 1.등록 : ssn,id,pw,name,gender 입력받음 ssn:주민번호
	 * 2.조회 : name,id,gender 조회
	 * 
	 */
	public static void main(String[] args) {
	    MemberServiceImpl service = MemberServiceImpl.getInstance();   
	        
		while (true) {
			
			switch (JOptionPane.showInputDialog("1.등록 2.보기 3.수정 4.삭제 0.종료")) {
			case "1":
			MemberBean stu = new MemberBean();	
			String spec = JOptionPane.showInputDialog("이름,아이디,비밀번호,주민번호 ex)880101-1");
			String specArr[] = spec.split(",");
			stu.setName(specArr[0]);
			stu.setId(specArr[1]);
			stu.setPw(specArr[2]);
			stu.setSsn(specArr[3]);
			stu.setRegDate(new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis()));
			String result = service.regist(stu);
			JOptionPane.showMessageDialog(null, result);
			break;
			case "2":
				JOptionPane.showMessageDialog(null, service.show());
				break;
			case "3":
				String pwModify = JOptionPane.showInputDialog("새비밀번호를 입력하세요");
				JOptionPane.showMessageDialog(null,service.update(pwModify));
				break;
			case "4":
				JOptionPane.showMessageDialog(null, service.delete());
				break;
				
			case "0": 
				int ok = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				if(ok == 0){
					return;
				}
				break;

			default: JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
			break;
			}
			
		}
	}
}
