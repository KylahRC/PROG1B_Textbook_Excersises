package Ex7;

public class Rock {
    private int sampleNumber;
    private String description;
    private double weight;

    public Rock(int sampleNumber, double weight) {
        this.sampleNumber = sampleNumber;
        this.weight = weight;
        this.description = "Unclassified";
    }

    public int getSampleNumber() {
        return sampleNumber;
    }

    public String getDescription() {
        return description;
    }

    public double getWeight() {
        return weight;
    }

    protected void setDescription(String description) {
        this.description = description;
    }
}
