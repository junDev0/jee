package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

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
	//디자인패턴 - 싱글톤
	private static MemberDAO instance = new MemberDAO(); 

	public static MemberDAO getInstance() {
		return instance;
	}

	private MemberDAO() {
	}

	public int exeUpdate(String sql) {
		int updateResult = 0;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ORACLE_ID, Constants.ORACLE_PW);
			stmt = con.createStatement();
			updateResult = stmt.executeUpdate(sql);
			System.out.println(updateResult);
		} catch (Exception e) {
		}
		return updateResult;
	}

	public void exeQuery(String sql){
		
	}
}
