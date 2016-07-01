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
	MemberDAO dao = MemberDAO.getInstance(); //싱글톤 패턴
	private static MemberServiceImpl instance = new MemberServiceImpl();
	
	
	public static MemberServiceImpl getInstance() {
		return instance;
	}

	private MemberServiceImpl() {
		
	}

	@Override
	public String regist(MemberBean bean) {
		String msg = "";
		String sql = "insert into member_bean "
				+ "values('"+bean.getId()+"','"+bean.getPw()+"','"+bean.getName()+"','"+bean.getRegDate()+"',"
						+ "'"+bean.getGender()+"',"+"'"+bean.getSsn()+"','"+bean.getAge()+"')";
		int result = dao.exeUpdate(sql);
		if(result == 1){
			msg = "회원가입 축하합니다.";
		}else{
			msg = "회원가입 실패";
		}

		return msg;
	}

	@Override
	public String show() {
		return st.toString();
	}

	@Override
	public String update(String pw) {
		String result = "계정을 먼저 만들어주세요";
		if(st.getPw()!=null){
		st.setPw(pw);
		result = "비밀번호 수정이 완료되었습니다.";
		}
		return result;
	}

	@Override
	public String delete() {
		st = null;
		return "초기화가 완료되었습니다.";
	}
	/*		String sql = "create table member_bean("
	+ "id varchar(20),"
	+ "pw varchar(20),"
	+ "name varchar(20),"
	+ "regDate varchar(20),"
	+ "gender varchar(20),"
	+ "ssn varchar(20),"
	+ "age int"
	+ ")";
	String dropSql = "drop table member_bean";
	String sqlSelect = "select * from member_bean";
	 */		


}
