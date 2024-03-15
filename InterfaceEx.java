package interfaces;

interface Testinter
{
	int a=10; // By default variables are static and final
	void display(); // By default methods are public
}

public class InterfaceEx implements Testinter {
	
	public void display()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		
		InterfaceEx ie = new InterfaceEx();
		ie.display();
		
	}

}



interface My_restaurents {
	   void eat();
	}
	interface My_journey {
	   void travel();
	}
	class Holiday implements My_restaurents, My_journey {
	   public void eat() {
	      System.out.println("I am trying this food");
	   }
	   public void travel() {
	      System.out.println("I am trying this route");
	   }
	}
	public class My_trip {
	   public static void main(String args[]) {
	      Holiday my_schedule = new Holiday();
	      my_schedule.eat();
	      my_schedule.travel();
	   }
	}