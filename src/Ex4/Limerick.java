package Ex4;

public class Limerick extends Poem
{


    @Override public void setNumLines(int numLines)
    {
        this.numLines = 5;
    }

    @Override public void setPoemName(String poemName)
    {
        this.poemName = poemName;
    }
}
