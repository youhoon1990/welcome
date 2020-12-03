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

	      // PieChart그리기
	      // 제목 , 데이터
	      dataSet = getData();
	      JFreeChart chart = ChartFactory.createPieChart("boxoffice", dataSet);

	      PiePlot plot = (PiePlot) chart.getPlot();
	      plot.setLabelFont(new Font("굴림", Font.BOLD, 16));
	      
	      frame = new ChartFrame("boxoffice", chart);
	      frame.setBounds(100, 100, 450, 300);
	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      
	      
	   }

	   private DefaultPieDataset getData() {

	      // csv파일을 읽어오기
	      // comma separated values
	      try {
	         CSVReader reader = new CSVReader(new FileReader("C:\\Users\\smhrd\\Desktop\\boxoffice2019.csv"));

	         String[] list;
	         int check = 0;
	         // csv파일안에 데이터가 많아서, 이 중에서 5개만 가지고 올거라서 그걸 check
	         while ((list = reader.readNext()) != null) {
	            check++;
	            if (check > 1) { // 맨 위에 있는 column 제외
	               // PieDataset은 (문자, 숫자)
	               dataSet.setValue(list[0], Long.parseLong(list[1].replace(" ", "")));
	            }
	            if (check > 5) {
	               //5개까지만 데이터를 가져오겠다!
	               break;
	            }

	         }

	      } catch (IOException e) {
	         e.printStackTrace();
	      }

	      return dataSet;
	   }

}


