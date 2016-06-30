package grade;

public interface GradeService {
	public void gradeInit(String name,int kor,int eng, int math);
	public int gradeCheck(int kor, int eng, int math);
	public int gradeTotal();
	public int gradeAvg();
	public String gradeRank();
	public String gradeResult(String result);
}
