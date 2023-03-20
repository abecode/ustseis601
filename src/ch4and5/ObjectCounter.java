package ch4and5;

public class ObjectCounter {

    private static int objectCount = 0;
     
    public static int getObjectCount() {
        return objectCount;
    }

    public ObjectCounter() {
        objectCount += 1;
    }

    public static void main(String[] args) {
        ObjectCounter oc1 = new ObjectCounter();
        ObjectCounter oc2 = new ObjectCounter();
        ObjectCounter oc3 = new ObjectCounter();
        System.out.println(oc1.getObjectCount());
        System.out.println(oc2.getObjectCount());
        System.out.println(oc3.getObjectCount());
        System.out.println(oc1.equals(oc2));
        System.out.println(oc2.equals(oc3));

    }
    
}
