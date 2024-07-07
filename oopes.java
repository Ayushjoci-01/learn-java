// Classes and Objects
// Class -> Template hota hai

class Pen {
    String color;
    String type;

    // Functions which are defined inside the class are called methods
    public void write() {
        System.out.println("Writing something");
    }
}

public class Oppes {
    public static void main(String args[]) {
        Pen pen1 = new Pen(); // Corrected the capitalization of "Pen"
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();
    }
}
