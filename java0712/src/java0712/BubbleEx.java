package java0712;
import java.util.*;

public class BubbleEx {

	public static void printArr(int a[]) {
		for (int n : a) {
			System.out.print(n+",");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int a[] = {10, 3, 1, 4, 2};
         
		  for (int i=0; i < a.length-1; i++) {
			  for (int j=a.length-1; j>i; j--) {
			   if(a[j]<a[j-1]) {
				   int tmp = a[j];
				   a[j] = a[j-1];
				   a[j-1] = tmp;
				   System.out.println("\t교환(j-1="+(j-1)+", j="+j+")");
				   printArr(a);
			   }
		  }
		  printArr(a);
	}	
	printArr(a);

		  System.out.println();
	}

}
