package java0709;


//문제1 > x=10, y=20 일 때 두 변수의 값을 바꿔보세요 (swap)

public class Swap {
	
	public static void swap(int a, int b) {
		int tmp = a;
		a = b;
		b = tmp;
		System.out.printf("x=%d, y=%d",a,b);
	}
	public static void main(String[] args) {
	   int x = 10;
	   int y = 20;
	   System.out.printf("x=%d, y=%d\n", x, y);
	   swap(x,y);
	}
}
