public class Constructors {
    int intVariable;
    String stringVariable;
    boolean booleanVariable;
    char charVariable;

    public Constructors(){
        intVariable = 10;
        stringVariable = "Hello";
        booleanVariable = true;
        charVariable = 'A';
    }
    public Constructors(int intVar, String strVar, boolean boolVar, char charVar){
        intVariable = intVar;
        stringVariable = strVar;
        booleanVariable = boolVar;
        charVariable = charVar;
    }


   
    public void printVariables(){
        System.out.println("integer:"+intVariable);
        System.out.println("string:"+stringVariable);
        System.out.println("boolean:"+booleanVariable);
        System.out.println("char:"+charVariable);

    }
}
