class CopyConstructors{
    int number1;
    int number2;
    //Default Constructor
    public CopyConstructors(){
        number1 = 12;
        number2 = 13;
    }
    //Parameterized Constructor
    public CopyConstructors(int num1, int num2){
        number1 = num1; 
        number2 = num2;

    

    }
    //copy constructor
    public CopyConstructors(CopyConstructors obj){
        this.number1=obj.number1;
        this.number2=obj.number2;
        
    }
    //Print varible
    public void printVarible(){
        System.out.println("Number1: "+number1);
        System.out.println("Number2: "+number2);
    }
}