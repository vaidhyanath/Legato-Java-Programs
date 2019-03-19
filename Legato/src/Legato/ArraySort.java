package Legato;

public class ArraySort {

	public static void main(String[] args) {
		String[] vaidhya = new String[] { "violetss", "indigo", "blue", "green", "yellow", "orange","red" };
		for (int i = 0; i < vaidhya.length; i++) {
			for (int j = i + 1; j < vaidhya.length; j++) {
				String tmp = "";
				if ((vaidhya[i].compareTo(vaidhya[j]) > 0)) {
					tmp = vaidhya[i];
					vaidhya[i] = vaidhya[j];
					vaidhya[j] = tmp;
				}
			}
			System.out.println(vaidhya[i]);
		}

	}
}