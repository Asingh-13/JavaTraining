public class StaticInstance {
    static int variable = 10;
    int variableTwo = 20;

    public static void main(String[] args) {
        System.out.println(variable);


//        StaticInstance staticObject = new StaticInstance();
//        staticObject.nonStatic();
    }

    public void nonStatic(){
        System.out.println(variable);
        System.out.println(variableTwo);


        // Inside a regular function can I use a non static variable ?
    }
}
