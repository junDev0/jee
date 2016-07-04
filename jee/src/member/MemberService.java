/**
 * 
 */
package member;

import java.util.List;

/**
 * @date     : 2016. 6. 17.
 * @author   : jun.dev
 * @fileName : StudentService.java
 * @story    : 
 */
public interface MemberService {
	public String regist(MemberBean bean);
	public List<MemberBean> show();
	public String update(MemberBean bean); //pw만 수정가능
	public String delete(MemberBean bean);
	public int count();
	public String findById(String id);
	public List<MemberBean> findByName(String name);
}
