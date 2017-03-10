
public class A_La_Russe {
	public static int russe(int a, int b)
	 {
	 int[] X, Y;
	 X = new int[1000];
	 Y = new int[1000];
	 X[1] = a;
	 Y[1] = b;
	 int i = 1;
	 while (X[i] > 1)
	 {
	 X[i + 1] = X[i] / 2;
	 Y[i + 1] = Y[i] + Y[i];
	 i = i + 1;
	 }
	 int prod = 0;
	 while (i > 0) {
	 if ((X[i] % 2) != 0)
	 {
	 prod = prod + Y[i];
	 }
	 i = i - 1;
	 }
	 return prod;
	 }
	 public static void main(String[] args)
	 {
	 System.out.println(russe(52, 15));
	 }
	}


