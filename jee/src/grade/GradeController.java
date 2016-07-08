package grade;

import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import javafx.scene.chart.PieChart.Data;
import sun.security.jca.GetInstance;

public class GradeController {
		/**
		 * 클라이언트에서 프로그램 개발 요청이 왔습니다. 
		 * 이름과 국,영,수 세과목점수를 입력받아서() [홍길동 : 총점 ***점,
		 * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요. 단) 평균은 소수점이하는 절삭합니다 평균점수가 90점 이상 A
		 * 80점 이상이면 B 70점 이상이면 C 60점 이상이면 D 50점 이상이면 E 50점 미만이면 F 학점입니다라고 출력되게 해주세요
		 * [단]switch-case 문으로 해결하세요
		 */
		public static void main(String[] args) {
			// --------------연산부 (알고리즘)-----------------------
			GradeService service = GradeServiceImpl.getInstance();
			GradeBean bean = null;
			while (true) {
				switch (JOptionPane.showInputDialog("===성적기록부===\n "
										+ "1.추가 2.수정 3.삭제 4.전체조회 5.학점조회 6.시퀀스조회 7.응시생수"
										+ "0.종료")) {
				case "1":
					String stData[] = JOptionPane.showInputDialog("아이디,자바,SQL,HTML5,자바스크립트,응시월").split(",");
					bean = new GradeBean(stData[0],Integer.parseInt(stData[1]),Integer.parseInt(stData[2]),
							Integer.parseInt(stData[3]),Integer.parseInt(stData[4]),stData[5]);
					JOptionPane.showMessageDialog(null, service.insert(bean));
					break;
				case "2": 
					String modifyData[] = JOptionPane.showInputDialog("시퀀스번호,수정과목(ex:자바 or SQL or HTML5 or 자바스크립트),수정점수").split(",");
					bean = new GradeBean();
					bean.setSeq(modifyData[0]);
					switch (modifyData[1]) {
					case "자바":bean.setJava(Integer.parseInt(modifyData[2]));break;
					case "SQL":bean.setSql(Integer.parseInt(modifyData[2]));break;
					case "HTML5":bean.setHtml(Integer.parseInt(modifyData[2]));break;
					case "자바스크립트":bean.setJavascript(Integer.parseInt(modifyData[2]));break;
					default: JOptionPane.showMessageDialog(null, "과목명을 정확히 입력해주세요.");continue;
					}
					JOptionPane.showMessageDialog(null, service.update(bean, modifyData[1]));
					break;
				case "3":
					bean = new GradeBean();
					bean.setSeq(JOptionPane.showInputDialog("삭제할 시퀀스를 입력하세요"));
					JOptionPane.showMessageDialog(null, service.delete(bean));
					break;
				case "4":
/*					List<GradeBean> totalList = service.list();
					if(totalList == null){
						JOptionPane.showMessageDialog(null, "데이터가 없습니다.");
						continue;
					}
					String listResult = "";
					for (int i = 0; i < totalList.size(); i++) {
						listResult += totalList.get(i).toString()+"\n";
					}
					JOptionPane.showMessageDialog(null, listResult);
*/					
					GradeUI ui = new GradeUI();
					break;
				case "5": 
					List<GradeBean> hakjumList = service.findByHakjum(JOptionPane.showInputDialog("검색할 학점 입력"));
					if(hakjumList == null){
						JOptionPane.showMessageDialog(null, "입력한 학점에 맞는 데이터가 없습니다.");
						continue;
					}
					String gradeResult = "";
					for (int i = 0; i < hakjumList.size(); i++) {
						gradeResult += hakjumList.get(i).toString()+"\n";
					}
					JOptionPane.showMessageDialog(null, gradeResult);
					break;	
				case "6": 
					String id = JOptionPane.showInputDialog("검색할 아이디를 입력하세요.");
					List<GradeBean> idList = service.finBySeq(id);
					if(idList == null){
						JOptionPane.showMessageDialog(null, "입력한 학점에 맞는 데이터가 없습니다.");
						continue;
					}
					String idResult = "";
					for (int i = 0; i < idList.size(); i++) {
						idResult += idList.get(i).toString()+"\n";
					}
					JOptionPane.showMessageDialog(null, idResult);
					break;	
				case "7":
					String month = JOptionPane.showInputDialog("시험일자를 입력하세요 ex)2016-06");
					/*List<GradeBean> monthExamList = service.findByMonth(month);
					if(monthExamList == null){
						JOptionPane.showMessageDialog(null, "입력한 시험일자에 맞는 데이터가 없습니다.");
						continue;
					}
					String examResult = "";
					for (int i = 0; i < monthExamList.size(); i++) {
						examResult += monthExamList.get(i).toString()+"\n";
					}
					JOptionPane.showMessageDialog(null, examResult);*/
					JOptionPane.showMessageDialog(null, service.count(month));
					break;	
				case "0":JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");return;

				default:
					break;
				}
				
			}
		}
	}


