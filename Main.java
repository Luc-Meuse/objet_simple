public class Main {
    public static void main(String[] args){
    
        Phone p1=new Phone();
        p1.model = "iPhone14";
        p1.color = "black";

        p1.showInfo();

        Phone p2=new Phone();
        p2.model = "Nokia";
        p2.color = "blue";

        p2.showInfo();

        Phone p3 = new Phone();
        p3.showInfo();
    }
}