/**
 * 
 */
package member;

import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @date     : 2016. 6. 17.
 * @author   : jun.dev
 * @fileName : StudentImplement.java
 * @story    : 
 */
public class MemberServiceImpl implements MemberService{
	MemberBean st = new MemberBean();
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
		
		int result = dao.insert(bean);
		if(result == 1){
			msg = "회원가입 축하합니다.";
		}else{
			msg = "회원가입 실패";
		}

		return msg;
	}

	@Override
	public List<MemberBean> show() {
		return dao.list();
	}

	@Override
	public String update(MemberBean bean) {
		String result = "계정을 먼저 만들어주세요";
		if(dao.infoUpdate(bean) == 1){
		result = "비밀번호 수정이 완료되었습니다.";
		}
		return result;
	}

	@Override
	public String delete(MemberBean bean) {
		String result = "계정을 먼저 만들어주세요";
		if(dao.infoDelete(bean) == 1){
		result = "계정 삭제가 완료되었습니다.";
		}
		return result;
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

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return dao.count();
	}

	@Override
	public String findById(String id) {
		String result = "해당 아이디가 없습니다.";
		if(dao.findById(id)!=null){
			result = dao.findById(id).toString();
		}
		return result;
	}

	@Override
	public List<MemberBean> findByName(String name) {
		return dao.findByName(name);
	}		


}
