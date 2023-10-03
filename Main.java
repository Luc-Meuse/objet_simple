public class Main {
    public static void main(String[] args){
     
        Phone p1=new Phone();
        p1.model = "iPhone14";
        p1.color = "black";

        System.out.println(p1);

        Phone p2=new Phone();
        p2.model = "Nokia";
        p2.color = "blue";

        System.out.println(p2);

        Phone p3 = new Phone();
        System.out.println(p3);

        System.out.println("phone 2 is the same as phone 3");
        System.out.println(p2.equals(p3)); 

    
    }
}