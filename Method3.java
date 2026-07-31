package myprog;

public class Method3 {
	public int add(int a, int b) {
        return (a + b);
    }
 public static void main(String[] args) {
	 Method3 obj = new Method3 ();
        int sum = obj.add(10, 20);

        System.out.println("Sum = " + sum);
    }
}

