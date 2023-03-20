package ch4and5;

public class SingletonObject {

    private static SingletonObject obj = null;

    public SingletonObject() {
        if (obj != null) {
            return obj;
        }
    }
    
    

    
}
