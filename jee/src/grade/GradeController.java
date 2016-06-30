package grade;

import java.util.Scanner;

import javax.swing.JOptionPane;

import javafx.scene.chart.PieChart.Data;

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
			GradeServiceImpl service = new GradeServiceImpl();
			while (true) {
				switch (JOptionPane.showInputDialog("===성적기록부===\n 1.등록 2.종료")) {
				case "1":
					String stData[] = JOptionPane.showInputDialog("이름,국어,영어,수학").split(",");
					int ok = service.gradeCheck(Integer.parseInt(stData[1]),Integer.parseInt(stData[2]) //점수오버 체크 
												,Integer.parseInt(stData[3]));
					if(ok==1){ //점수체크 분기
						JOptionPane.showMessageDialog(null, "1이상 100이하의 점수만 입력하세요.");
						continue;
					}
					service.gradeInit(stData[0], Integer.parseInt(stData[1]), //이름 각 점수별 세팅 
							Integer.parseInt(stData[2]), Integer.parseInt(stData[3]));
					service.gradeTotal(); // 토탈점수
					service.gradeAvg(); // 평균점수
					JOptionPane.showMessageDialog(null, service.gradeResult(service.gradeRank())); //학점 계산 및 출력
					break;
				case "2":JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");return;

				default:
					break;
				}
				
			}
		}
	}


