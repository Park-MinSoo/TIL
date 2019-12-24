package day15;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CopyExam {
	
	 public static String timeToStrDate(long time) {
 		DateFormat formatter = 
 				new SimpleDateFormat("yyyy-MM-dd");
 		return formatter.format(time);
 	}
    public static void main(String args[]) {
        FileReader reader = null;
        BufferedReader br = null;
        String d1 = timeToStrDate(new Date().getTime());
        FileWriter  writer = null; 
        try {
            reader = new FileReader("c:/hardy/sample.txt");
            br = new BufferedReader(reader);
            writer = new FileWriter("c:/iotest/sample_" + d1 + ".txt",true); 
            while (true) {
                String data = br.readLine();
                if (data == null) 
                    break; 
                writer.write(data+"\n");        
            }  
            System.out.println("���� �Ϸ�Ǿ����ϴ�.");
        } catch (FileNotFoundException fnfe) {
            System.out.println("ó���ϴ� ���� ������ �߻��߽��ϴ�.");
        } catch (IOException ioe) {
            System.out.println("ó���ϴ� ���� ������ �߻��߽��ϴ�.");
        } finally {
           try {
         	   br.close();
                reader.close();
                writer.close();
           } catch (Exception e) {
         	  e.printStackTrace();
           }
        }             
 }
}
