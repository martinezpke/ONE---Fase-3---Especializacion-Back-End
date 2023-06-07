
public class Matrix {
	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			for(int multiplicaion = 0; multiplicaion <= 10; multiplicaion++) {
				if (i == 5) {
					break;
				}
				int result = i*multiplicaion;
				System.out.print(result);
				System.out.print(" ");
				
				
			}
			System.out.println();
		}
	}
}
