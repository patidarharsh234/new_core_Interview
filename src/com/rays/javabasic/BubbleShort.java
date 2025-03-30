package com.rays.javabasic;

public class BubbleShort {

	public static void main(String[] args) {

		// Output Write but This is not actual bubble sorting.
//		int[] num = { 10, 24, 89, 1, 0, 58 };
//
//		int temp = 0;
//
//		for (int i = 0; i < num.length; i++) {
//			for (int j = i + 1; j < num.length; j++) {
//				if (num[i] > num[j]) {
//
//					temp = num[i];
//					num[i] = num[j];
//					num[j] = temp;
//				}
//			}
//
//			System.out.println(num[i]);
//		}

		// actual bubble sorting:-
		int[] num = { 10, 24, 89, 1, 0, 58 };

		int temp = 0;

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - 1 - i; j++) { // -i : reduce number of running loop , -1: because j+1 count
															// last index if you don't give this then comes
															// outOfBoundIndex Exception.
				if (num[j] > num[j + 1]) {
					// Swap num[j] and num[j+1]
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}

			}

		}

		// Print the sorted array
		System.out.println("Sorted Array:");
		for (int n : num) {
			System.out.print(n + ",");
		}

	}

}
