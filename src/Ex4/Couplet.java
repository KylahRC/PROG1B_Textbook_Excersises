package Ex4;

public class Couplet extends Poem
{


    @Override public void setNumLines(int numLines)
    {
        this.numLines = 2;
    }

    @Override public void setPoemName(String poemName)
    {
        this.poemName = poemName;
    }
}
