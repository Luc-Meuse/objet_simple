public class Phone {

    String model;
    String color;

public void showInfo(){
            System.out.println("Phone model " + model + ", color " + color);
}

public Phone(String model, String color) {
        this.model = model;
        this.color = color;
}

public Phone() {
        this.model = "samsung";
        this.color = "green;
}