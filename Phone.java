public class Phone {

    private String model;
    private String color;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public Phone() {
        this.model = "samsung";
        this.color = "green";
    }

    @Override
    public boolean equals(Object other) {
        // même objet en mémoire
        if (this == other) {
            return true;
        }

        // pas un Phone
        if (!(other instanceof Phone)) {
            return false;
        }

        Phone o = (Phone) other;
        return this.model.equals(o.model) && this.color.equals(o.color); 
    }

    @Override
    public String toString() {
        return "Phone model " + model + ", color " + color;
    }
}
