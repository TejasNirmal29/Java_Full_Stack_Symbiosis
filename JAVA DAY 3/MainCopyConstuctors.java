class MainCopyConstuctors{
    public static void main(String[] args) {
        CopyConstructors obj1 = new CopyConstructors();
        
        CopyConstructors obj2 = new CopyConstructors(obj1);
        obj2.printVarible();
    }
}