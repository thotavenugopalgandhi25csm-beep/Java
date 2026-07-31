package myprog;

public class Method {
	
	    String getName() {
	        return "venu";
	    }

	    public static void main(String[] args) {
	        Method obj = new Method();
	        String name = obj.getName();

	        System.out.println("Name: " + name);
	    }
	}

