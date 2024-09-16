package Ex2;

public class ScentedCandle extends Candle
{
    private String scent;

    public String getScent()
    {
        return scent;
    }

    public void setScent(String scent)
    {
        this.scent = scent;
    }

    @Override
    public void setHeight(int height)
    {
        super.setHeight(height);
        this.setPrice(height * 3); // $3 per inch
    }

    private void setPrice(double price)
    {
        // This method is used to set the price in the parent class
        super.setHeight((int) (price / 3));
    }

    @Override
    public double getPrice()
    {
        return super.getHeight() * 3;
    }
}

//public class ScentedCandle extends Candle
//{
//    String scent;
//
//    public String getScent()
//    {
//        return scent;
//    }
//
//    public void setScent(String scent)
//    {
//        this.scent = scent;
//    }
//
//    @Override public void setHeight(int height, int multiplier)
//    {
//        multiplier = 3;
//    }
//
//}
