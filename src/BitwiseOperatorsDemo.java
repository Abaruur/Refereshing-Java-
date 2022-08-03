public class BitwiseOperatorsDemo {


    public BitwiseOperatorsDemo() {

        int x = 0xFAEF;  // 1111101011101111
        int y = 0xF8E9;  //1111100011101001
        int z;
        System.out.println("x & y :" + (x & y));
        System.out.println("x | y : " + (x | y));
        //x XOR Y
        System.out.println("x ^ y :" + (x ^ y));
        System.out.println("~x : " + (~x));
        System.out.println("x << y :" + (x << y));
        System.out.println("x >> y : " + (x >> y));
        System.out.println("x >>> y : " + (x >>> y));

        //There is no unsigned left shift operator
    }

    public static void main(String[] args) {
        new BitwiseOperatorsDemo();

        // Bitwise operator precedence.
        int a = 1 | 2 ^ 3 & 5;
        int b = ((1 | 2) ^ 3) & 5;
        int c = 1 | (2 ^ (3 & 5));

        System.out.println(a + "," + b + "," + c + "  Bitwise operator precedence");
        // Ternary Operator
        System.out.println("===================== Ternary Operators ================================================== ");

        int age = 18;
        String result;
        if(age < 100){
             result = "Less than 100";
        } else {
            result = "Greater than 100";
        }
        System.out.println(result);

        // Equivalent to the above
         int age2 = 18;
         String result2 = age2 < 100 ? "Less than 100" : "Greater than 100";

         // Floating Point Arithmetic
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 -0.1);  // displays 0.50000000000000001, not 0.5
        System.out.println(1.0 - 0.9); // displays 0.0999999999998, not 0.1

    }
}
