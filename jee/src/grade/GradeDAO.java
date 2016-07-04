package grade;

/**
 * @date     : 2016. 7. 4.
 * @author   : jun
 * @fileName : GradeDAO.java
 * @story    :
 */

public class GradeDAO {
	private static GradeDAO instance = new GradeDAO();
	


	public static GradeDAO getInstance() {
		return instance;
	}



	private GradeDAO() {
	}
}
