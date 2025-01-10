public class Day04_13_01_2025 {
    static float totalMarks = 100;  // static variable

    double totalMarks2 = 100;    // Non Static

    public static void main(String[] args) {
        int markOfLakshay = 60;
        int marksOfRaskhit = 70;
        int markOfHemant = 30;

        double tmark = new Day04_13_01_2025().totalMarks2;

        Day04_13_01_2025 tMarksObject = new Day04_13_01_2025();

        double tMarks = tMarksObject.totalMarks2;


        passOrFailFunction(totalMarks,markOfLakshay,"Lakshay");
        passOrFailFunction(tMarks,marksOfRaskhit,"Rakshit");
        passOrFailFunction(100,markOfHemant,"Hemant");

    }

    public static void passOrFailFunction(double totalMarks, long marksOfStudent, String nameOfStudent){

        double percentage = marksOfStudent/totalMarks * 100;
        char passOrFail = 'P';
//        System.out.println(percentage);

        if (percentage>33.33){
            passOrFail = 'P';
        }
        else{
            passOrFail = 'F';
        }

        if(passOrFail == 80){
            System.out.println(nameOfStudent + "  is Passed");
        }
        if (passOrFail == 70){
            System.out.println(nameOfStudent + "   is Failed");
        }

    }


    public static void nonPrmitive(){

        String nameOfLakshay = "Lakshya";
        String nameOfRakshit = " Rakshit";
    }
}
