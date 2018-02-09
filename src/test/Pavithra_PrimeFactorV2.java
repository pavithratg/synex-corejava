package test;

import java.util.HashSet;
import java.util.Set;

public class Pavithra_PrimeFactorV2 {

	static Set<Integer> set;

	static {
		set = new HashSet<>();
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(7);
	}

	public static void main(String[] args) {

		printNumber(10);
		// System.out.println(isDivisible(21, 3));

	}

	public static void printNumber(int k) {
		int count = 1;
		int i = 1;

		boolean flag = false;

		while (count < k) {

			if (isDivisible(i, 3) || isDivisible(i, 5) || isDivisible(i, 7))
				flag = true;

			if (flag) {
				System.out.print(i + " ");
				count++;
				flag = false;
			}
			if (count == k)
				break;

			i++;
		}
		System.out.println("\n" + i);

	}

	public static boolean pow(int x, int y) {

		while (x >= y) {

			if (x % y != 0) {
				return false;
			}

			if (x == y) {
				return true;
			}
			x = x / y;
		}

		return false;

	}

	public static boolean isDivisible(int x, int y) {
		boolean flag = false;

		for (Integer integer : set) {
			if (y == integer)
				continue;
			if (x % integer == 0) {
				x /= integer;
			}

		}

		flag = pow(x, y);

		return flag;

	}

}
