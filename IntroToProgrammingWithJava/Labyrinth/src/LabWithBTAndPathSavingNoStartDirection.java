import static java.lang.System.out;
public class LabWithBTAndPathSavingNoStartDirection {
	private static char[][] lab = {
		{' ', ' ', ' ', '*', ' ', ' ', ' '},
		{'*', '*', ' ', '*', ' ', '*', ' '},
		{' ', ' ', ' ', ' ', ' ', ' ', ' '},
		{' ', '*', '*', '*', '*', '*', ' '},
		{' ', ' ', ' ', ' ', ' ', ' ', 'e'}
	};
	
	private static char[] path = new char[lab[0].length * lab.length];
	private static int position = 0;
	
	private static void findPath(int row, int col) {
		if(col < 0 || row < 0 || col >= lab[0].length || row >= lab.length) {
			return;
		}
		char direction = 's';
		path[position] = direction;
		position++;
		
		if (lab[row][col] == 'e'){
			printPath(path, 1, position-1);
		}
		
		if (lab[row][col] == ' '){
			lab[row][col] = 's';
			
			findPath(row, col-1, 'L'); //left
			findPath(row-1, col, 'U'); //up
			findPath(row, col+1, 'R'); //right
			findPath(row+1, col, 'D'); //down
			
			lab[row][col] = ' ';
		}
		
		position--;
	}
	
	private static void findPath(int row, int col, char direction) {
		if(col < 0 || row < 0 || col >= lab[0].length || row >= lab.length) {
			return;
		}
		
		path[position] = direction;
		position++;
		
		if (lab[row][col] == 'e'){
			printPath(path, 1, position-1);
		}
		
		if (lab[row][col] == ' '){
			lab[row][col] = 's';
			
			findPath(row, col-1, 'L'); //left
			findPath(row-1, col, 'U'); //up
			findPath(row, col+1, 'R'); //right
			findPath(row+1, col, 'D'); //down
			
			lab[row][col] = ' ';
		}
		
		position--;
	}
	
	private static void printPath(char[] path, int startPos, int endPos) {
		out.print("Found path to the exit: ");
		for(int pos = startPos; pos <= endPos; pos++) {
			out.print(path[pos]);
		}
		out.println();
	}
	
	public static void main(String[] args) {
		findPath(0, 0);
	}
}
