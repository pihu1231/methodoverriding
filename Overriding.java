package CoreJava;

public class Overriding extends Methodoverriding {
	public void parent(){
		System.out.println("hello iam child");
	}
public static void main(String [] args) {
	Overriding o = new Overriding();
	o.parent();
	
}
}
