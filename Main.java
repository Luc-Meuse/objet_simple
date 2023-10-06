public class Main {
    public static void main(String[] args) {

        Phone p1 = new Phone();
        p1.setModel("iPhone14");
        p1.setColor("black");

        System.out.println(p1);

        Phone p2 = new Phone();
        p2.setModel("Nokia");
        p2.setColor("blue");

        System.out.println(p2);

        Phone p3 = new Phone();
        System.out.println(p3);

        System.out.println("Phone 2 is the same as phone 3?");
        System.out.println(p2.equals(p3));

    }
}