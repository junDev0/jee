package bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import global.Constants;

/**
 * @date     : 2016. 7. 1.
 * @author   : jun
 * @fileName : BackDAO.java
 * @story    :
 */

public class BankDAO {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		int updateResult = 0;
		String executeResult = "";
		String sql = "create table account("
				+ "account_no int primary key,"
				+ "name varchar2(20),"
				+ "money int,"
				+ "pw varchar2(20),"
				+ "id varchar2(20)"
				+ ")";
		String sqldrop = "drop table account";
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ORACLE_ID, Constants.ORACLE_PW);
			stmt = con.createStatement();
			updateResult = stmt.executeUpdate(sql);
		} catch (Exception e) {
		}
		System.out.println("DB다녀온 결과 : "+ updateResult);
	}
}
