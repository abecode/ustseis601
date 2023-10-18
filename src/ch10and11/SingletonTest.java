package ch10and11;

public class SingletonTest {
    private static SingletonTest instance;
    public static void main(String[] args) {
        SingletonTest s1 = SingletonTest.getInstance();
        SingletonTest s2 = SingletonTest.getInstance();
        System.out.println("s1 == s2: " + (s1 == s2));
    } 
    public static SingletonTest getInstance() {
        if (instance == null) {
            instance = new SingletonTest();
        }
        return instance;
    }
}
