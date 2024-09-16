package Ex2;

public class Candle
{
    private String color;
    private int height;
    private double price;

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
        this.price = height * 2; // $2 per inch
    }

    public double getPrice()
    {
        return price;
    }
}

//public class Candle
//{
//    String colour;
//    int height;
//    int price;
//    int multiplier;
//
//    public String getColour()
//    {
//        return colour;
//    }
//
//    public void setColour(String colour)
//    {
//        this.colour = colour;
//    }
//
//
//    public void setHeight(int height, int multiplier)
//    {
//        this.height = height;
//        this.multiplier = 2;
//    }
//
//    public int getHeight()
//    {
//        return height;
//
//    }
//    public int getPrice()
//    {
//        setHeight(height, multiplier);
//        return (height) * multiplier;
//    }
//}
