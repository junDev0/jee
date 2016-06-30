/**
 * 
 */
package member;

/**
 * @date     : 2016. 6. 17.
 * @author   : jun.dev
 * @fileName : StudentService.java
 * @story    : 
 */
public interface MemberService {
	public void registStudent(String name,String id, String pw,  String ssn,String regDate);
	public String showStudent();
	public String updateStudent(String pw); //pw만 수정가능
	public String deleteStudent();
}
