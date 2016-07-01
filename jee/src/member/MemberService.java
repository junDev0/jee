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
	public String regist(MemberBean bean);
	public String show();
	public String update(String pw); //pw만 수정가능
	public String delete();
}
