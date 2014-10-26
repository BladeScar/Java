import java.util.Scanner;


public class NestedLoopsRecursion {
	public static int numberOfLoops;
	public static int numberOfIterations;
	public static int[] Loops;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("N= ");
		numberOfLoops = input.nextInt();
		
		System.out.print("K= ");
		numberOfIterations = input.nextInt();
		
		input.close();
		
		Loops = new int[numberOfLoops];
		
		nestedLoops(0);
	}
	
	public static void nestedLoops (int currentLoop) {
		if(currentLoop == numberOfLoops){
			printLoops();
			return;
		}
		
		for(int counter = 1; counter <= numberOfIterations; counter++){
			Loops[currentLoop] = counter;
			nestedLoops(currentLoop + 1);
		}
	}
	
	public static void printLoops() {
		for(int i = 0; i < numberOfLoops; i++){
			System.out.printf("%d ", Loops[i]);
		}
		System.out.println();
	}
	
}
