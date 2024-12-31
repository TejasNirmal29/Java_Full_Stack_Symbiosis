public class ClassDefination {
    // instance variable
    int varable1;
    int varable2;

static {
    //System.out.println(varable1);
}
{
    varable1 = 10;
    varable2 = 20;
}

// method
public void printVarable(){
    System.out.println(varable1);
    System.out.println(varable2);

}

}
class Main{
    public static void main(String[] args) {
        ClassDefination obj = new ClassDefination();
        obj.printVarable();
    }
}

//class defination with num1 and numb2 and create parameterized constructor ,print the value of num1 and num2
