public class TestStdIn {
    public static void main(String[] args){
        System.out.print("There are " + args.length + " arguments: ");
        int x = 0;
        while (x < args.length) {
            System.out.print(args[x] + ", ");
            x = x + 1;
        }

    }
}
