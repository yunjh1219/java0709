package java0711;

public class Max {
  public static void main(String[] args) {
	  int a[] = {15, 3, 10, 2, 8};
	  int max = a[0]; 
	 
	  for(int i=1; i<a.length; i++){
		 if (max < a[i]) {
			max = a[i];
		 }
		  
	  } 
	  
	  //최댓값을 출력
	  System.out.println("최대값: "+ max);
  }
}
