package bank;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;

import grade.GradeServiceImpl;

/**
 * @date     : 2016. 7. 8.
 * @author   : jun
 * @fileName : BankUI.java
 * @story    :
 */

public class BankUI extends JFrame{

	private static final long serialVersionUID = 1L;
	JPanel wrapper_panel,flow_panel;
	JList<String> itemList;
	@SuppressWarnings("static-access")
	public BankUI() {
		this.setLayout();
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setSize(550,300);
		this.setVisible(true);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		
	}
	
	private void setLayout(){
		wrapper_panel = new JPanel();
		flow_panel = new JPanel(new FlowLayout());
		itemList = new JList(GradeServiceImpl.getInstance().list().toArray());
		itemList.setSelectedIndex(0);
		itemList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		wrapper_panel.add(itemList);
		this.add(wrapper_panel);
		
	}
}
