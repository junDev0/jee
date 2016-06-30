package global;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import javax.swing.JOptionPane;



/**
 * @date     : 2016. 6. 30.
 * @author   : jun
 * @fileName : FileEx.java
 * @story    :
 */

public class FileEx {
	public static void main(String[] args) {
		StringBuffer sb= new StringBuffer();
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		BufferedReader br = null;
		FileReader fr = null;
		String msg = "";
		File delFile = null;
		File updateFile = null;
		String fileName = "";
		try {
			
			while (true) {
				switch (JOptionPane.showInputDialog("1.생성 2.쓰기 3.읽기 4.수정.5.삭제 0.종료")) {
				case "1":
					fileName = null;
					fileName=JOptionPane.showInputDialog("파일명을 입력하세요");
					file = new File("C:\\eclipse\\workspase\\ExFile\\"+fileName+".txt");
					fw = new FileWriter(file,true);
					bw = new BufferedWriter(fw);
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					break;
				case "2":
					msg = JOptionPane.showInputDialog("메세지 입력");
					bw.write(msg);
					bw.newLine();
					fw.flush();
					bw.flush();
					break;
				case "3":
					while ((msg = br.readLine())!=null) {
						JOptionPane.showMessageDialog(null, msg);
					}
					br.close();
					break;
				case "4":
					if(fileName.equals("")){
						String updateFileName=JOptionPane.showInputDialog("수정할 파일명을 입력하세요");					
						updateFile = new File("C:\\eclipse\\workspase\\ExFile\\"+updateFileName+".txt");	
					}else{
						updateFile = file;
					}
					bw = new BufferedWriter(new FileWriter(updateFile));
					String updateMsg = JOptionPane.showInputDialog("수정할 메세지");
					bw.write(updateMsg);
					bw.flush();
					break;
				case "5":
					if(fileName.equals("")){
						String delFileName=JOptionPane.showInputDialog("삭제할 파일명을 입력하세요");					
						delFile = new File("C:\\eclipse\\workspase\\ExFile\\"+delFileName+".txt");	
					}else{
						delFile = file;
					}
					
						delFile.delete();
						fileName = "";
					break;
				case "0":
					fw.close();
					bw.close();
					fr.close();
					br.close();
					return;

				default:
					break;
				}
				
					
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally {
			try {
				fw.flush();
				bw.flush();
				fw.close();
				bw.close();
				fr.close();
				br.close();				
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}
