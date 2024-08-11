import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ScannerSample {

	public static void main(String[] args) throws FileNotFoundException {
		//Please notice that the test_in.txt should put under your project root directory,
		//otherwise, your should use absolute path
		FileInputStream fis = new FileInputStream("test_in.txt");
		System.setIn(fis);

		Scanner in = new Scanner(System.in);
		int total = in.nextInt();
        //You can try the following code to replace the right code, just add =, then see what will happen
		//while (total-- >=0){
		while (total-- > 0) {
			int n = in.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}
			//simple output
			System.out.println(Arrays.toString(arr));
			//follow the format that the problem 1's description
			int[] output = arr;
			for (int i = 0; i < n; i++) {
				System.out.printf("%d", output[i]);
				if (i != n - 1)
					System.out.print(" ");
			}
			System.out.println();
		}
		in.close();
	}

}
