package java_project_a;

import java.util.Arrays;
import java.util.Comparator;

public class SecondHighestnoInArray {
	public static void main(String[] args) {
		Integer[] arr = {20,10,5,67,18,31,4,8,32,33};
		  Integer s =        Arrays.stream(arr).distinct().sorted((o1,o2)->o2.compareTo(o1)).skip(1).findFirst()
		        .get();
		  System.out.println(s);
	}

}
