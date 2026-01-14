package variables_datatypes_inputs;

public class TypeConversion {
    public static void main(String[] args){
        // implicit type casting
        long big = 45;
        float dec = 3;

        //The 'f' tells Java "treat this 3.4 as a float"
        double d = 3.4f;

        // explicit type casting
        float eDec = (float)3.4;
        long eBig = (long)3.4;
        int eInt = (int)3.4;

        System.out.println(big);
        System.out.println(dec);
        System.out.println(d);
        System.out.println(eDec);
        System.out.println(eBig);
        System.out.println(eInt);
    }
}
