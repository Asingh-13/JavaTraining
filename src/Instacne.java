import java.util.ArrayList;

public class Instacne {
    public static void main(String [] args){
        int variable = StaticInstance.variable;

        StaticInstance s = new StaticInstance();
        int var2 = s.variableTwo;

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
    }
}
