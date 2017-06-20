package beginner;

import java.util.Arrays;

public class ReverseArray {
	static int[] a;

	public static void reverseIteration() {
		int start = 0;
		int end = a.length - 1;
		while (start <= end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}
	}

	public static void reverseRecursive(int start, int end) {
		if (start <= end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
			reverseRecursive(start, end);
		}
	}

	public static void main(String[] args) {
		a = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		System.out.println("Original Array" + Arrays.toString(a));
		reverseIteration();
		System.out.println("Reversed - Array(Iteration):" + Arrays.toString(a));
		reverseRecursive(0, a.length - 1);
		System.out.println("Reversed Again - Array(Recursion):" + Arrays.toString(a));
	}
}