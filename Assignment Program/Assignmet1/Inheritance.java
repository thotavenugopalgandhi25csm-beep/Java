package assignment;
interface riya{
	 int x=10;
	void venu();
}
//interface extends interface
interface raji extends riya {
	int z=15;
	void lucky();
}
//class extends interfaces
class revanth implements riya, raji{
	@Override
	 public void venu() {
		System.out.print("Iam venugopal");
	}
	@Override
	public void lucky() {
		System.out.print("gandhi");
	}
}
public class Inheritance {
	public static void main(String[] args) {
	revanth r=new revanth();
		r.venu();
		r.lucky();
	}
}
