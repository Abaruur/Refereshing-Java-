public class AritheticOperatorsDemo {

    public AritheticOperatorsDemo() {

        int x, y = 10, z = 5;

        x = y + z;
        System.out.println("+ operator resulted in " + x);

        x = y - z;

        System.out.println("- operator resulted in  " + x);

        x = y * z;

        System.out.println("* operator resulted in " + x);

        x = y / z;

        System.out.println("/ operator resulted in " + x);

        x = y % z;

        System.out.println("% operator resulted in " + x);

        x = y++;

        System.out.println("Postfix ++ operator resulted in " + x);

        x = ++z;

        System.out.println("Prefix ++ operator resulted in " + x);

        x = -y;

        System.out.println("Unary operator resulted in " + x);

        // Some examples of special cases

        int tooBig = Integer.MAX_VALUE + 1; // -2147483648 which is Integer.MIN_VALUE.

        int tooSmall = Integer.MIN_VALUE - 1; // 2147483547 which is Integer.MAX_VALUE.

        System.out.println("tooBig becomes " + tooBig);
        System.out.println("tooSmall becomes " + tooSmall);

        double d1 = 12 / 8; // result: 1 by integer division. d1 gets the value 1.0
        double d2 = 12.0F / 8; // result: 1.5
        System.out.println("d1 is " + d1);
        System.out.println("d2 is " + d2);

    }

    public static void main(String[] args) {
        new AritheticOperatorsDemo();
    }
}
