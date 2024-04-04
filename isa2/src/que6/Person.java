package que6;
//velda 237

public class Person {
	private String name;
    private int age;

    public Person(String Name,int Age) {
		this.name= Name;
		this.age= Age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Main.java
		
	   Person person1 = new Person("Joylin", 20);
	   Person person2 = new Person("Noela", 20);
       System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
       System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");
		    

	}

}
