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
	    MemberServiceImpl service = new MemberServiceImpl();    
	        
		while (true) {
			
			switch (JOptionPane.showInputDialog("1.등록 2.보기 3.수정 4.삭제 0.종료")) {
			case "1":
			String spec = JOptionPane.showInputDialog("이름,아이디,비밀번호,주민번호 ex)880101-1");
			String specArr[] = spec.split(",");
			service.registStudent(specArr[0], specArr[1], specArr[2], specArr[3],
					new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis()));
			JOptionPane.showMessageDialog(null, "등록이 완료되었습니다.");
			break;
			case "2":
				JOptionPane.showMessageDialog(null, service.showStudent());
				break;
			case "3":
				String pwModify = JOptionPane.showInputDialog("새비밀번호를 입력하세요");
				JOptionPane.showMessageDialog(null,service.updateStudent(pwModify));
				break;
			case "4":
				JOptionPane.showMessageDialog(null, service.deleteStudent());
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
