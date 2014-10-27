
public class Swap {
	public static void swap(int a, int b){
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void main(String[] args) {
		int a=10;
		int b = 5;
		
		System.out.printf("a = %d, b = %d", a, b);
		swap(a,b);
		System.out.printf("a = %d, b = %d", a, b);
	}
}
