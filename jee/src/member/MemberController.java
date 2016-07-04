/**
 * 
 */
package member;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
			
			switch (JOptionPane.showInputDialog("--- 회원이 보는 화면 --- \n"
												+ "1.회원가입 2.로그인 3.내정보보기4.내정보수정(비번)5.탈퇴\n"
												+ "--- 관리자화면 ---\n"
												+ "11.회원목록 12.검색(ID) 13.검색(이름) 14.검색(성별) 15.회원수"
												+"\n0.종료")) {
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
			case "2":break;
			case "3":
				JOptionPane.showMessageDialog(null, service.show());
				break;
			case "4":
				MemberBean stu2 = new MemberBean();	
				String infoModify[] = JOptionPane.showInputDialog("변경할 아이디,새비밀번호를 입력하세요").split(",");
				stu2.setId(infoModify[0]);
				stu2.setPw(infoModify[1]);
				JOptionPane.showMessageDialog(null,service.update(stu2));
				break;
			case "5":
				MemberBean stu3 = new MemberBean();
				String infoDel = JOptionPane.showInputDialog("삭제할 아이디를 입력하세요.");
				stu3.setId(infoDel);
				JOptionPane.showMessageDialog(null, service.delete(stu3));
				break;
				
			case "0": 
				int ok = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				if(ok == 0){
					return;
				}
				break;
			case "11": 
				List<MemberBean> list = service.show();
				String listResult = "";
				for (int i = 0; i < list.size(); i++) {
					listResult += list.get(i).toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, listResult);
				break;	
			case "12": 
				String id = JOptionPane.showInputDialog("검색할 아이디 입력");
				String idResult = service.findById(id);
				JOptionPane.showConfirmDialog(null, idResult);
				break;	
			case "13": 
				String name = JOptionPane.showInputDialog("검색할 이름 입력");
				List<MemberBean> nameList = service.findByName(name);
				String nameResult = "";
				for (int i = 0; i < nameList.size(); i++) {
					nameResult += nameList.get(i).toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, nameResult);
				break;	
			case "14": break;	
			case "15": 
				JOptionPane.showMessageDialog(null, String.valueOf(service.count())+"명");
				break;	
			default: JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
			break;
			}
			
		}
	}
}
