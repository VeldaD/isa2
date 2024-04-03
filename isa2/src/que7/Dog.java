package que7;

public class Dog {
	private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    // Setter methods
    public void setName(String name) { 
        this.name = name; 
    } 

    public void setBreed(String breed) { 
        this.breed = breed; 
    } 

    // Getter methods
    public String getName() { 
        return name; 
    } 

    public String getBreed() { 
        return breed; 
    } 

    public static void main(String[] args) { 
        // Create two instances of the Dog class 
        Dog dog1 = new Dog("Goldy", "Golden Retriever"); 
        Dog dog2 = new Dog("Frosty", "Beagle"); 

        // Modify the attributes using the setter methods 
        dog1.setName("Bunny"); 
        dog2.setBreed("Shitzu"); 

        // Print the updated values 
        System.out.println(dog1.getName() + " is a " + dog1.getBreed() + "."); 
        System.out.println(dog2.getName() + " is a " + dog2.getBreed() + ".");
	}

}
