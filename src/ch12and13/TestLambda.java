package ch12and13;

/* this example shows the using lambdas and anonymous 
 * inner classes as ways to implement interfaces
 *
 * Lambdas are newer and clearer, but you may see
 * anonymous inner classes used in older code
 * 
 * For more info, see https://www.geeksforgeeks.org/closures-in-java-with-examples/
 * and https://www.geeksforgeeks.org/anonymous-inner-class-java/
 * 
 */
interface SalutationInterface {
    public String sayHello();
}
 
class TestLambda {
 
    // Driver code
    public static void main(String[] args)
    {
        // Lambda Expression
        System.out.println("first, the modern lambda");
        SalutationInterface obj = () ->
        {
            return "Hello, Lambda!";
        };
 
        // Calling the above interface
        System.out.println(obj.sayHello());

        //argument defined anonymous inner class
        System.out.println("older method: anonymous inner class");
        
        SalutationInterface obj2 = new SalutationInterface() {
            public String sayHello(){
                return "Hello, anonymous inner whatever...";
            }
        };
        System.out.println(obj2.sayHello());
    }
}


