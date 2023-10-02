public class Phone {

    String model;
    String color;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Phone() {
        this.model = "Iphone 13";
        this.color = "Green";
    }
      
    public void showInfo(){
        System.out.println("Phone model " + model + ", color " + color);
    }
}
