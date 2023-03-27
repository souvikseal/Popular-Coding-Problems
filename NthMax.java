package test;

import java.util.*;

public class NthMax {
	public static void main(String[] args) {
		System.out.println(new NthMax().getSecondMax(new int[] { 2, 3, 4, 5, 6, 6 }));
		System.out.println(new NthMax().getNthMax(new int[] { 2, 3, 4, 5, 6, 6 }, 6));
	}

	private int getSecondMax(int[] a) {
		int max = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int ctr = 0;
		List<Integer> blockedIndices = new ArrayList<>();
		for (int i : a) {
			max = Math.max(max, i);
		}
		for (int i : a) {
			if (i == max) {
				blockedIndices.add(ctr);
			}
			ctr++;
		}
		ctr = 0;
		for (int i : a) {
			if (!blockedIndices.contains(ctr)) {
				max2 = Math.max(max2, i);
			}
			ctr++;
		}
		return max2;
	}
	
	private int getNthMax(int[] a, int n) {
		int max = -1;
		List<Integer> blockedIndices = new ArrayList<>();
		int ctr = 0;
		while (ctr < n) {
			max = Integer.MIN_VALUE;
			for (int i = 0; i < a.length; i++) {
				if (!blockedIndices.contains(i)) {
					max = Math.max(max, a[i]);
				}
			}
			for (int i = 0; i < a.length; i++) {
				if (a[i] == max) {
					blockedIndices.add(i);
				}
			}
			ctr++;
		}
		return max == Integer.MIN_VALUE? -1: max;
	}
}
