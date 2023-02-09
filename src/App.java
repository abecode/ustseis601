public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        System.out.println("Hello World xx ");
        System.console( );
        for (String key : System.getenv().keySet()) {
            System.out.println("key:" + key + " value:" + System.getenv(key));
        }
        /*
        System.out.println("multi
        line");
         */
        final String s=null;
        System.out.println("multiline\n" + "你好👋");
        System.out.println(2+2 + "hi");
        System.out.println("hi" + 2+2);
        System.out.println('h');
        //System.out.println('串')；
        char c = '串';
        System.out.println(c);
        System.out.println((int)3.5);
    }
}
