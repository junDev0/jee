/**
 * 
 */
package member;

import java.text.SimpleDateFormat;
import java.util.List;

import bank.AccountService;
import bank.AccountServiceImpl;

/**
 * @date     : 2016. 6. 17.
 * @author   : jun.dev
 * @fileName : StudentImplement.java
 * @story    : 
 */
public class MemberServiceImpl implements MemberService{
	MemberBean st = new MemberBean();
	MemberDAO dao = MemberDAO.getInstance(); //싱글톤 패턴
	AccountService accService = AccountServiceImpl.getInstance();
	private static MemberServiceImpl instance = new MemberServiceImpl();
	MemberBean session;
	
	public static MemberServiceImpl getInstance() {
		return instance;
	}

	private MemberServiceImpl() {
		
	}

	@Override
	public String regist(MemberBean bean) {
		String msg = "";
		boolean result = dao.insert(bean);
		if(result == true){
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
		String result = "";
		if(session !=null){
			bean.setId(session.getId());
		if(dao.infoUpdate(bean) == 1){
		result = "내정보 수정이 완료되었습니다.";
		}
		}
		System.out.println(result);
		return result;
	}

	@Override
	public String delete(MemberBean bean) {
		String result = "";
		if(session !=null){
			bean.setId(session.getId());
		if(dao.infoDelete(bean) == 1){
		result = "계정 삭제가 완료되었습니다.";
		}
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
	public MemberBean findById(String id) {
		MemberBean result = new MemberBean();
		if(dao.findById(id)!=null){
			result = dao.findById(id);
			accService.map();
		}
		return result;
	}

	@Override
	public List<MemberBean> findByName(String name) {
		return dao.findByName(name);
	}

	@Override
	public String login(MemberBean bean) {
		String result = "";
		if (dao.login(bean)) {
			result = bean.getId();
			session = dao.findById(bean.getId());
			accService.map();
		}else{
			result = "로그인실패";
		}
	
	return result;
	}
	@Override
	public MemberBean findBy() {
		if(session != null){
			return this.findById(session.getId());
		}
		return null;
	}

	@Override
	public int findByGen(String gender) {
		return dao.genCount(gender);
	}		



}
