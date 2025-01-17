
public class ArithmeticOperator {

    public int instanceVariable;

    public static int staticVariable;



    public static void main(String[] args) {



        int localVariable = 10;
        System.out.println("Local Variable - " + localVariable);
        System.out.println("Static Variable - " + staticVariable);
        int [] arr = new int[]{2,3,4,5};
        ArithmeticOperator am = new ArithmeticOperator();
        int a = am.sum(10,20);


        byte b1 = 10;
        byte b2 = 20;
        byte b3 = (byte)(b1 + b2);

        float multiple = 10.0f * 10;

//        int devide = 0/0;
//       System.out.println(devide);

        double devideByZeor = 0.0 / 0;

//        System.out.println(devideByZeor);

        am.sum(10,20);
        am.sum(20,20);
        am.sum(30,20);
        am.multiply(20,30);

        System.out.println(staticVariable);

    }

    public int sum(int a , int b){

        System.out.println(instanceVariable);

        System.out.println(staticVariable);

        System.out.println("Sum of a + b  is " + (a+b));
        return a + b;
    }

    public double multiply(double a , double b){

        System.out.println("Multiply of a * b  is " + (a*b));
        return a * b;
    }


}
