package day13;

import java.util.ArrayList;
import java.util.Iterator;


public class ListTest {

	public static void main(String[] args) {
		int array[] = {3,4,2,5,2,3,6,7,5,7,9};
		
		ArrayList<Integer> list =new CreateList().convertList(array);
		
		Iterator<Integer> it =list.iterator();
		while (it.hasNext()){
			System.out.println(it.next());
		}
	}
}
class CreateList {
	public ArrayList<Integer>convertList(int array[]) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i= array.length-1; i>=0; i--) {
			list.add(array[i]);
		}	
		return list;		
	}	
}

