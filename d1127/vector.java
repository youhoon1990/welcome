package d1127;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.*;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class vector extends JPanel {
JPanel top = new JPanel();
JPanel bottom = new JPanel();
JButton update = new JButton("Update");
JTable table;
Vector<String> rowOne;
Vector<String> rowTwo;
DefaultTableModel tablemodel;
public vector() {
       this.setLayout(new BorderLayout());
       rowOne = new Vector<String>();
       rowOne.addElement("Row1-1");
       rowOne.addElement("Row1-2");
       rowOne.addElement("Row1-3");
       rowTwo = new Vector<String>();
       rowTwo.addElement("Row2-2");
       rowTwo.addElement("Row2-3");
       rowTwo.addElement("Row2-4");
       Vector<Vector> rowData = new Vector<Vector>();
       rowData.addElement(rowOne);
       rowData.addElement(rowTwo);
       Vector<String> columnNames = new Vector<String>();
       columnNames.addElement("Column One");
       columnNames.addElement("Column Two");
       columnNames.addElement("Column Three");
       tablemodel = new DefaultTableModel(rowData, columnNames);
       table = new JTable(tablemodel);
       //  table.setValueAt("aa", 0, 0);    
       update.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               updatedata();
           }
           private void updatedata() {
               rowOne = new Vector<String>();
               rowOne.addElement("updated Row1-1");
               rowOne.addElement("updated Row1-2");
               rowOne.addElement("updated Row1-3");
               rowTwo = new Vector<String>();
               rowTwo.addElement("updated Row2-2");
               rowTwo.addElement("updated Row2-3");
               rowTwo.addElement("updated Row2-4");
               // tablemodel.addRow(rowTwo);
               tablemodel.fireTableDataChanged();
               table.setModel(tablemodel);
               System.out.println("button pressed");
               // table.setValueAt("aa", 0, 0);    
           }
       });
       JScrollPane scrollPane = new JScrollPane(table);
       top.add(scrollPane);
       bottom.add(update);
       add(top, BorderLayout.NORTH);
       add(bottom, BorderLayout.SOUTH);
}
	
	public static void main(String[] args) {
	       JFrame frame = new JFrame();
	       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	       vector obj = new vector();
	       frame.add(obj);
	       //frame.setSize(400, 300);
	       frame.pack();
	       frame.setVisible(true);
	}
	}