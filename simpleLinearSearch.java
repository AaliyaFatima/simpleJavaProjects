package practice_Java;

import java.util.*;
public class simpleLinearSearch {
	public static void main(String args []) {
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		int last=-1;
		int[] arr=new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		int num=sc.nextInt();
		for(int i=0; i<arr.length; i++) {
			if(num == (arr[i])) {
				last = i;
				break;	
			}
		}
		System.out.print(last);
		sc.close();		
	}
}
