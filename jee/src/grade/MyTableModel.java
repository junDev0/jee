package grade;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.table.AbstractTableModel;

/**
 * @date     : 2016. 7. 6.
 * @author   : jun
 * @fileName : MyTableModel.java
 * @story    :
 */

public class MyTableModel extends AbstractTableModel{
	private String[] columnNames = { "First Name", "Last Name", "Sport",
            "# of Years", "Vegetarian" };
  List<GradeBean> list = null;

  MyTableModel(List<GradeBean> list) {
       this.list = list;
  }

  public int getColumnCount() {
       return columnNames.length;
  }

  public int getRowCount() {
       return list.size();
  }

  public String getColumnName(int col) {
       return columnNames[col];
  }

  public Object getValueAt(int row, int col) {

       GradeBean object = list.get(row);

       switch (col) {
       case 0:
            return object.getGrade();
       case 1:
            return object.getGrade();
       case 2:
            return object.getGrade();
       case 3:
            return object.getGrade();
       case 4:
            return object.getGrade();
       default:
            return "unknown";
       }
  }

  public Class getColumnClass(int c) {
       return getValueAt(0, c).getClass();
  }


/**
* Create the GUI and show it. For thread safety, this method should be
* invoked from the event-dispatching thread.
*/
private static void createAndShowGUI() {
  // Create and set up the window.
  JFrame frame = new JFrame("TableDemo");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

  // Create and set up the content pane.
  MyJPanel newContentPane = new MyJPanel();
  newContentPane.setOpaque(true); // content panes must be opaque
  frame.setContentPane(newContentPane);

  // Display the window.
  frame.pack();
  frame.setVisible(true);
}
}
