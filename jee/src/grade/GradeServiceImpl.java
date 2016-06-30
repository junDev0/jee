package grade;

public class GradeServiceImpl implements GradeService {
	
	GradeBean bean;
	
	// 학생 이름 및 과목별 점수 입력.
	@Override
	public void gradeInit(String name, int kor, int eng, int math) {
		bean = new GradeBean(name,kor,eng,math);
	}

	// 과목별 점수 체크 
	@Override
	public int gradeCheck(int kor,int eng,int math) {
			return ((kor >= 101 || kor<0)&&(eng >= 101 || eng<0)&&(math >= 101 || math<0))?1:0;
		
	}
	
	// 총점
	@Override
	public int gradeTotal() {
		return bean.getKor() + bean.getEng() + bean.getMath();
	}

	// 평균
	@Override
	public int gradeAvg() {
		return this.gradeTotal()/3;
	}
	
	// 학점 구하기
	@Override
	public String gradeRank() {
		String result = "";
		if (this.gradeAvg() >= 90) {
			result = "A";
		} else if (this.gradeAvg() >= 80) {
			result = "B";
		} else if (this.gradeAvg() >= 70) {
			result = "C";
		} else if (this.gradeAvg() >= 60) {
			result = "D";
		} else if (this.gradeAvg() >= 50) {
			result = "E";
		} else if (this.gradeAvg() >= 49) {
			result = "F";
		} else {
		}
		
		return result;
	}

	//결과출력
	@Override
	public String gradeResult(String result) {
		return bean.toString()+"\n총점:"+this.gradeTotal()+"점\n평균"+this.gradeAvg()+"점\n학점="+result;
	}






}
