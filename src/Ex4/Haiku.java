package Ex4;

public class Haiku extends Poem
{
    @Override public void setNumLines(int numLines)
    {
        this.numLines = 3;
    }

    @Override public void setPoemName(String poemName)
    {
        this.poemName = poemName;
    }
}
