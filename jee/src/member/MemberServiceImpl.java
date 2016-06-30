/**
 * 
 */
package member;

import java.text.SimpleDateFormat;

/**
 * @date     : 2016. 6. 17.
 * @author   : jun.dev
 * @fileName : StudentImplement.java
 * @story    : 
 */
public class MemberServiceImpl implements MemberService{
	MemberBean st;

	@Override
	public void registStudent(String name, String id, String pw, String ssn, String regDate) {
		st = new MemberBean(name,id,pw,ssn,regDate);
	}

	@Override
	public String showStudent() {
		return st.toString();
	}

	@Override
	public String updateStudent(String pw) {
		String result = "계정을 먼저 만들어주세요";
		if(st.getPw()!=null){
		st.setPw(pw);
		result = "비밀번호 수정이 완료되었습니다.";
		}
		return result;
	}

	@Override
	public String deleteStudent() {
		st = null;
		return "초기화가 완료되었습니다.";
	}



}
