import java.awt.EventQueue;
import java.awt.Font;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

import au.com.bytecode.opencsv.CSVReader;

public class ex01Chart {

	   private JFrame frame;
	   private DefaultPieDataset dataSet = new DefaultPieDataset();

	   public static void main(String[] args) {
	      EventQueue.invokeLater(new Runnable() {
	         public void run() {
	            try {
	               ex01Chart window = new ex01Chart();
	               window.frame.setVisible(true);
	            } catch (Exception e) {
	               e.printStackTrace();
	            }
	         }
	      });
	   }

	   public ex01Chart() {
	      initialize();
	   }

	   private void initialize() {

	      // PieChart�׸���
	      // ���� , ������
	      dataSet = getData();
	      JFreeChart chart = ChartFactory.createPieChart("boxoffice", dataSet);

	      PiePlot plot = (PiePlot) chart.getPlot();
	      plot.setLabelFont(new Font("����", Font.BOLD, 16));
	      
	      frame = new ChartFrame("boxoffice", chart);
	      frame.setBounds(100, 100, 450, 300);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      
	   }

	   private DefaultPieDataset getData() {

	      // csv������ �о����
	      // comma separated values
	      try {
	         CSVReader reader = new CSVReader(new FileReader("C:\\Users\\smhrd\\Desktop\\boxoffice2019.csv"));

	         String[] list;
	         int check = 0;
	         // csv���Ͼȿ� �����Ͱ� ���Ƽ�, �� �߿��� 5���� ������ �ðŶ� �װ� check
	         while ((list = reader.readNext()) != null) {
	            check++;
	            if (check > 1) { // �� ���� �ִ� column ����
	               // PieDataset�� (����, ����)
	               dataSet.setValue(list[0], Long.parseLong(list[1].replace(" ", "")));
	            }
	            if (check > 5) {
	               //5�������� �����͸� �������ڴ�!
	               break;
	            }

	         }

	      } catch (IOException e) {
	         e.printStackTrace();
	      }

	      return dataSet;
	   }

}


