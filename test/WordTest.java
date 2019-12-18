package test;

import java.util.Scanner;

public class WordTest {
	public static void main(String[] args) {
		WordCount a = new WordCount();
		System.out.println("결과 1  : "+a.counter("java jdbc sql html5 css javascript", true));
		System.out.println("결과 2  : "+a.counter("java jdbc sql html5 css javascript", false));
	}
}

class WordCount {	
	int counter(String text, boolean word){
		Scanner sc = new Scanner(System.in);
		if(word == true) {
			return sc.nextShort(text);
		}
		else if(word == false)
			return sc.nextLong(text);

	}
}		

