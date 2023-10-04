package ch6and7;

public class TestAndOr {
    public static void main(String[] args) {
        boolean returnValue;
        System.out.println("iAmTrue() || iAmFalse()");
        returnValue = iAmTrue() || iAmFalse();
        System.out.println(returnValue);
        System.out.println();

        System.out.println("iAmFalse() || iAmTrue()");
        returnValue = iAmFalse() || iAmTrue();
        System.out.println(returnValue);
        System.out.println();
        
        System.out.println("iAmTrue() && iAmFalse()");
        returnValue = iAmTrue() && iAmFalse();
        System.out.println(returnValue);
        System.out.println();

        System.out.println("iAmFalse() && iAmTrue()");
        returnValue = iAmFalse() && iAmTrue();
        System.out.println(returnValue);
        System.out.println();

        System.out.println("iAmFalse() & iAmTrue()");
        returnValue = iAmFalse() & iAmTrue();
        System.out.println(returnValue);
        System.out.println();

        System.out.println("8 = 1000, ie 1*2^3 + 0*2^2 + 0*2^1 + 0*2^0");
        System.out.println("7 = 111, ie 1*2^2 + 1*2^1 + 1*2^0");
        System.out.println(8|7);
        System.out.println(8&7);

    }

    public static boolean iAmTrue(){
        System.out.println("iAmTrue");
        return true;
    }
    public static boolean iAmFalse(){
        System.out.println("iAmFalse");
        return false;
    }
}
