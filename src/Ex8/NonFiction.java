package Ex8;

public class NonFiction extends Book {
    public NonFiction(String title) {
        super(title);
        setPrice();
    }

    @Override
    public void setPrice() {
        super.setPrice(37.99);
    }
}
