public class BooleanOperators {
    
    public static boolean printAndReturnTrue() {
        System.out.println("true");
        return true;
    }
    public static boolean printAndReturnFalse() {
        System.out.println("false");
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println("Demonstrating && short circuit:");
        if (printAndReturnFalse() && printAndReturnTrue()) {
            System.out.println("This shouldn't be printed because false && true is false");
        }
        System.out.println();

        System.out.println("Demonstrating || short circuit:");
        if(printAndReturnTrue() || printAndReturnFalse()) {
            System.out.println("This will be printed because false || true is true");
        }
        System.out.println();

        System.out.println("Demonstrating & non-short circuit:");
        if (printAndReturnFalse() & printAndReturnTrue()) {
            System.out.println("This shouldn't be printed because false && true is false");
        }
        System.out.println();

        System.out.println("Demonstrating | non-short circuit:");
        if(printAndReturnTrue() | printAndReturnFalse()) {
            System.out.println("This will be printed because false || true is true");
        }
        System.out.println();

        System.out.println("Demonstrating bitwise operations");
        System.out.print("1|2 = 0001 | 0010 = 0011 = ");
        System.out.println(1|2);
        System.out.print("1&2 = 0001 & 0010 = 0000 = ");
        System.out.println(1&2);

        System.out.println("Demonstrating overflow");
        System.out.println((long)Math.pow(2,15));
        System.out.println((short)Math.pow(2,15));
        System.out.println((long)(Math.pow(2,15)-1));
        System.out.println((short)(Math.pow(2,15)-1));
        System.out.println(Integer.toBinaryString((int)Math.pow(2,15)));
        System.out.println(Integer.toBinaryString((int)Math.pow(2,15)-1));
        System.out.println(Integer.toBinaryString((short)(Math.pow(2,15)-1)));

        System.out.println("^ is not exponent, it's exclusive or");
        System.out.println(Integer.toBinaryString(2^2));

        
    }
}
