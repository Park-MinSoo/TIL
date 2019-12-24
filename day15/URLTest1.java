package day15;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLTest1 {
	public static void main(String[] args) throws Exception {	//throws�� �ϴ� ���� ó���� �ұ����� ����ó���̴�.
		URL url = new URL("https://movie.naver.com/");	//�ڹٿ��� URL�̶�� Ŭ������ �����Ѵ�.
		InputStream is = url.openStream();	// ���������� ��û�� �̶� �Ͼ�� �Ǵ� ���̴�.
		BufferedReader br = new BufferedReader(new InputStreamReader(is, "UTF-8"));	// byteStream�� ���� ��Ʈ������ �ٲٱ� ���� InputStreamReader�� ���
		String line = null;
		while (true) {
			line = br.readLine();
			if (line == null)
				break;
			System.out.println(line);
		}
	}
}
//	����� utf-8 �̹Ƿ� �ѱ��� ������ �ȴ�. InputStreamReader(is, "UTF-8")�� �̷��� utf -8�� ������ش�. �ҹ��ڵ� ��������� R������ �빮�ڸ� �ν��ϹǷ� �빮�ڷ� �����Ұ�.