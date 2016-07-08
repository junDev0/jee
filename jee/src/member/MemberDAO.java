package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import global.Constants;

/**
 * @date     : 2016. 7. 1.
 * @author   : jun
 * @fileName : MemberDAO.java
 * @story    :
 */

public class MemberDAO {
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	//디자인패턴 - 싱글톤
	private static MemberDAO instance = new MemberDAO(); 

	public static MemberDAO getInstance() {
		return instance;
	}

	private MemberDAO() {
	}
	
	public int insert(MemberBean bean){
		String sql = "insert into member_bean "
				+ "values('"+bean.getId()+"','"+bean.getPw()+"','"+bean.getName()+"','"+bean.getRegDate()+"',"
						+ "'"+bean.getGender()+"',"+"'"+bean.getSsn()+"','"+bean.getAge()+"')";
		return this.exeUpdate(sql);
	}
	public int infoUpdate(MemberBean bean){
		String sql = "update member_bean set pw = '"+bean.getPw()+"'"
					+ " where id ='"+bean.getId()+"'";
		return this.exeUpdate(sql);
		
	}
	public int infoDelete(MemberBean bean){
		String sql = "delete from member_bean where id = '"+bean.getId()+"'";
		return this.exeUpdate(sql);
		
	}


	public int exeUpdate(String sql) {
		int updateResult = 0;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			updateResult = stmt.executeUpdate(sql);
			System.out.println(updateResult);
		} catch (Exception e) {
		}
		return updateResult;
	}
	
	//list
	public List<MemberBean> list(){
		String sql = "select * from member_bean";
		List <MemberBean> list = new ArrayList<MemberBean>();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				list.add(new MemberBean(rs.getString("name"), rs.getString("id"),
										rs.getString("pw"), rs.getString("ssn"), rs.getString("regDate")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	// findByPK
	public MemberBean findById(String id){
		String sql = "select * from member_bean where id ='"+id+"'";
		MemberBean bean = null;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				bean = new MemberBean(rs.getString("name"), rs.getString("id"), 
									  rs.getString("pw"), rs.getString("ssn"), rs.getString("regDate"));
			}
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bean;
	}
	//findByNotPK
	public List<MemberBean> findByName(String name){
		String sql = "select * from member_bean where name ='"+name+"'";
		List <MemberBean> list = new ArrayList<MemberBean>();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()){
				list.add(new MemberBean(rs.getString("name"), rs.getString("id"),
										rs.getString("pw"), rs.getString("ssn"), rs.getString("regDate")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;	}
	//count
	public int count(){
		String sql = "select count(*) as count from member_bean";
		int count = 0;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.USER_ID, Constants.USER_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
	        if(rs.next()) count = rs.getInt("count");
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
}
