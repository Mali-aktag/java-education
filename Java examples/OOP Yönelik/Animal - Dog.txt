public class Animal{
	  // public String name;
	   	String name = "Animal";
	    //  constructor
	    public Animal(String name) {
	        this.name = name;
	    }
	    
	   public void sound() {
	        System.out.println("Animal makes a sound");
	    }
	}

*******

public class Dog extends Animal {
	//String name = "Dog";
	public Dog(String name) {
		super(name);
		
	}
	
    public void display() {
    //    System.out.println("Dog's name is " + name);
     System.out.println("Animal's name: " + super.name);  // Üst sınıfın değişkeni
    }
    
   public void sound() {
        System.out.println("Dog barks");
    }

   public void callSuperMethod() {
        // Üst sınıfın sound() metodunu çağırıyoruz
        super.sound();
    }

}

*************

public class Main_ {

	public static void main(String[] args) {
		 Dog myDog = new Dog("Buddy");
	        myDog.display();
	        
	     myDog.sound();  // Dog sınıfındaki sound() çağrılır
	     myDog.callSuperMethod();  // Üst sınıftaki sound() çağrılır
	}

}
