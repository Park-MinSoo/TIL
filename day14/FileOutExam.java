package day14;

import java.io.*;
import java.util.GregorianCalendar;

public class FileOutExam {
    public static void main(String args[]) {
        FileWriter writer = null;
        String path = "C:/iotest";
        File isDir = new File(path);
        if (!isDir.exists()) {
        	isDir.mkdirs();
        }
        try  {
        	writer = new FileWriter("c:/iotest/today.txt",true);
    		GregorianCalendar gc = new GregorianCalendar();
    		gc = new GregorianCalendar(1995, 3, 29);	//month의 경우 -1
    		GregorianCalendar today = new GregorianCalendar();
    		int f = today.get(GregorianCalendar.DAY_OF_WEEK);
    		GregorianCalendar todaytt = new GregorianCalendar();
    		int yr = todaytt.get(GregorianCalendar.YEAR);
    		int mh = todaytt.get(GregorianCalendar.MONTH)+1;
    		int dy = todaytt.get(GregorianCalendar.DATE);
    
            char t;
            switch (f) {
            case 1:
            	t = '일';
            	break;
            case 2:
            	t = '월';
                break;
            case 3:
            	t = '화';
                break;
            case 4:
            	t = '수';
                break;
            case 5:
            	t = '목';
                break;
            case 6:
            	t = '금';
                break;
            default :
            	t = '토';
                break;
            }
            writer.write("오늘은 " + yr + "년 " + mh + "월 " + dy + "일입니다.");
            writer.write("\n");
            writer.write("오늘은 " + t + "요일입니다.");
            writer.write("\n");
            int n = gc.get(GregorianCalendar.DAY_OF_WEEK);
            char c;
            switch (n) {
            case 1:
            	c = '일';
            	break;
            case 2:
            	c = '월';
                break;
            case 3:
            	c = '화';
                break;
            case 4:
            	c = '수';
                break;
            case 5:
            	c = '목';
                break;
            case 6:
            	c = '금';
                break;
            default :
            	c = '토';
                break;
            }
            writer.write("박민수는 " + c + "요일에 태어났습니다.");
            System.out.println("저장이 완료되었습니다.");
            
        } catch (IOException ioe) {
            System.out.println("파일에 저장하는 동안 오류가 발생했습니다.");
        }
            
            finally {
                try {
                	if (writer != null)
                		writer.close();
                } catch (Exception e) {
              }
          }
      } 
  }