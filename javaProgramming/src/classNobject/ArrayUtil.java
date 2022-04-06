package classNobject;

public class ArrayUtil {
	public static int[] concat(int[] a, int[] b) {

		int arrayLength = a.length + b.length;

		int[] c = new int[arrayLength];

		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];

		}

		for(int i = 0; i<b.length; i++) {
			int index = a.length + i;
			c[index] = b[i];
		}

		return c;

	}

	public static void print(int[] a) {

		System.out.print("[");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println("]");
	}
}
