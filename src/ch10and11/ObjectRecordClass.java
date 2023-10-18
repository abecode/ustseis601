package ch10and11;

import java.util.ArrayList;

public class ObjectRecordClass {
    private static ArrayList<ObjectRecordClass> instances = new ArrayList<ObjectRecordClass>();
    public static void main(String[] args) {
        ObjectRecordClass instance1 = ObjectRecordClass.getInstance();
            ObjectRecordClass instance2 = ObjectRecordClass.getInstance();    
            System.out.println("Hello, World!");
            System.out.println("there are " + instances.size() + " instances"); 
            for (ObjectRecordClass instance : instances) {
                System.out.println(instance);
            }
    }
    static ObjectRecordClass getInstance() {
        ObjectRecordClass instance = new ObjectRecordClass();
        instances.add(instance);
        return instance;
        
    }
}
