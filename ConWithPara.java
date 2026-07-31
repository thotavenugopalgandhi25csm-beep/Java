package myprog;

public class ConWithPara {
    
	 public int add(int a, int b) {
	        return (a + b);
	    }
	 public static void main(String[] args) {
	    	ConWithPara obj = new ConWithPara();
	        int sum = obj.add(10, 20);

	        System.out.println("Sum = " + sum);
	    }
	}