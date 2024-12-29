class FirstProgram{
    public static void main(String... a) {
        System.out.println("Hello World");
       
}
}
/*class $FirstProgram{
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}*/
/*class FirstProgram{
    static void main(String[] args) {
        System.out.println("Hello World");
    }
}*/

/*
Instance variables (also known as member variables) are variables that:
- Are declared inside a class but outside any method
- Are created when an object is instantiated and destroyed when the object is destroyed
- Can have access modifiers (public, private, protected)
- Have default values if not explicitly initialized
- Can be accessed by any method in the class

Example:
class Student {
    // These are instance variables
    private String name;        // default value: null
    public int age;            // default value: 0
    protected double gpa;      // default value: 0.0
    boolean isEnrolled;        // default value: false
    
    // Methods can access these instance variables
    public void printInfo() {
        System.out.println(name + " is " + age + " years old");
    }
}
*/
/*
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
Instance methods are methods that:
- Are declared inside a class without the static keyword
- Can only be called on objects of the class (need to create an instance first)
- Can access instance variables directly
- Can access other instance methods directly
- Can use the 'this' keyword to refer to the current object

Example:
class Student {
    // Instance variables
    String name;
    int age;
    
    // These are instance methods
    void setName(String name) {
        this.name = name;    // Can access instance variables
    }
    
    void setAge(int age) {
        this.age = age;
    }
    
    void printInfo() {
        System.out.println(name + " is " + age + " years old");
    }
}

// How to use instance methods:
Student student = new Student();    // Create an instance
student.setName("John");           // Call instance method
student.setAge(20);               // Call instance method
student.printInfo();              // Call instance method
*/


