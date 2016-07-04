package grade;

import java.util.List;

public interface GradeService {
	//총 7개의 기본 패턴이 존재
	//exeUpdate
	public int insert(GradeBean bean);
	public int update(GradeBean bean);
	public int delete(GradeBean bean);
	//exeQ
	public List<GradeBean> list();
	public List<GradeBean> findByHakjum();
	public GradeBean finBySeq(int seq);
	public int count();

}
