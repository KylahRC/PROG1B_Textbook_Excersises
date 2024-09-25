package Ex11;

public class Blanket {
    private String size;
    private String color;
    private String material;
    private double price;

    public Blanket() {
        this.size = "Twin";
        this.color = "white";
        this.material = "cotton";
        this.price = 30.00;
    }

    public void setSize(String size) {
        switch (size.toLowerCase()) {
            case "double":
                this.size = size;
                this.price = 30.00 + 10.00;
                break;
            case "queen":
                this.size = size;
                this.price = 30.00 + 25.00;
                break;
            case "king":
                this.size = size;
                this.price = 30.00 + 40.00;
                break;
            default:
                this.size = "Twin";
                this.price = 30.00;
                break;
        }
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaterial(String material) {
        switch (material.toLowerCase()) {
            case "wool":
                this.material = material;
                this.price += 20.00;
                break;
            case "cashmere":
                this.material = material;
                this.price += 45.00;
                break;
            default:
                this.material = "cotton";
                this.price = 30.00;
                break;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Blanket [size=" + size + ", color=" + color + ", material=" + material + ", price=$" + price + "]";
    }
}
