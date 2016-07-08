package grade;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 * @date     : 2016. 7. 6.
 * @author   : jun
 * @fileName : MyJPanel.java
 * @story    :
 */

public class MyJPanel extends JPanel{
	 private boolean DEBUG = false;
	 GradeService service = GradeServiceImpl.getInstance();
     public MyJPanel() {
          super(new GridLayout(1, 0));

          List<GradeBean> list = service.list();
          JTable table = new JTable(new MyTableModel(list));
          table.setPreferredScrollableViewportSize(new Dimension(500, 70));
          table.setFillsViewportHeight(true);
          // Create the scroll pane and add the table to it.
          JScrollPane scrollPane = new JScrollPane(table);
          // Add the scroll pane to this panel.
          add(scrollPane);
     }
}
