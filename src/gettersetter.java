
public class gettersetter {

	public static void main(String[] args) {
		
		Greeting greeting = new Greeting();
		greeting.setName("dave");
		greeting.setMessage("hello,"+ greeting.getName());
		System.out.println(greeting.getMessage());
	
	}
	
	
} 
