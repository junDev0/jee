package grade;

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
					
					String stData[] = JOptionPane.showInputDialog("이름,국어,영어,수학").split(",");
					bean = new GradeBean(stData[0], Integer.parseInt(stData[1]), 
							Integer.parseInt(stData[2]), Integer.parseInt(stData[3]));
					JOptionPane.showMessageDialog(null, service.insert(bean)); //학점 계산 및 출력
					break;
				case "2": break;
				case "0":JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");return;

				default:
					break;
				}
				
			}
		}
	}


