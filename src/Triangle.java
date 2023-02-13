public class Triangle {
    double area;
    int height;
    int length;

    void setArea() {
        area = (height * length) / 2;
    }
    public static void main(String[] args){
        main1();
        main2();
    }

    public static void main1(){
        int x = 0; 
        Triangle[] ta = new Triangle[4];
        while (x < 4) {
            ta[x] = new Triangle();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);
            x = x + 1;
        }
        int y = x;
        x = 27;
        Triangle t5 = ta[2];
        ta[2].area = 343;
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }
    public static void main2(){
        Triangle t = new Triangle();
        t.height = 3;
        t.length = 5;
        t.setArea();
        System.out.println("Triangle " + t + ", height = " + t.height +
                            "length = " + t.length + 
                            "area = " + t.area);
    }
}
