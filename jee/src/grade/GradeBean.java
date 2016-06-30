package grade;

/**
 * @date     : 2016. 6. 21.
 * @author   : jun.dev
 * @fileName : GradeBean.java
 * @story    : 
 */
public class GradeBean { //입력된것으 정
	private int kor,eng,math;
	private String name;

	public GradeBean(String name,int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public String getName() {
		return name;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "결과 [이름"+name+""
				+ "\n국어=" + kor + "점 "
				+ "\n영어=" + eng + "점 "
				+ "\n수학=" + math + "점";
	}
	
	
	
}
