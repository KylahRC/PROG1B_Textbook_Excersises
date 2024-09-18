package Ex3;

public class TeeShirt
{
    int orderNumber;
    String size;
    String colour;
    double price;

    public int getOrderNumber()
    {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber)
    {
        this.orderNumber = orderNumber;
    }

    public String getSize()
    {
        return size;
    }

    public void setSize(String size)
    {
        this.size = size;
        if(size.equals("XXL"))
        {
            price = 22.99;
        }
        else if(size.equals("XXXL"))
        {
            price = 22.99;
        }
        else
        {
            price = 19.99;
        }
    }

    public String getColour()
    {
        return colour;
    }

    public void setColour(String colour)
    {
        this.colour = colour;
    }

    public double getPrice()
    {
        return price;
    }

}
