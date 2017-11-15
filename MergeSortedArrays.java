package samplepack;

public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] a = { 0 };
		int[] b = { -1, 2 };
		int[] result = merge(a, b);
		for (int i : result) {
			System.out.println(i);
		}
	}

	public static int[] merge(int[] a, int[] b) {
		int[] temp = new int[a.length + b.length];
		for (int i = 0, j = 0, k = 0; i < a.length || j < b.length; k++) {
			if (i == a.length) {
				temp[k] = b[j];
				j++;
			} else {
				if (j == b.length) {
					temp[k] = a[i];
					i++;
				} else {
					if (a[i] < b[j]) {
						temp[k] = a[i];
						i++;
					} else {
						temp[k] = b[j];
						j++;
					}
				}
			}

		}
		return temp;
	}
}
