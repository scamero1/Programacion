package varios;

public class Piramide {
	public static void main(String[] args) {
		int filas = 5;

		for (int i = 1; i <= filas; ++i) {

			for (int s = 0; s < filas - i; ++s) {
				System.out.print("  ");
			}

			for (int j = 1; j <= i; ++j) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}