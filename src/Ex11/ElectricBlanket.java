package Ex11;

public class ElectricBlanket extends Blanket {
    private int heatSettings;
    private boolean hasAutoShutoff;

    public ElectricBlanket() {
        super();
        this.heatSettings = 1;
        this.hasAutoShutoff = false;
    }

    public int getHeatSettings() {
        return heatSettings;
    }

    public void setHeatSettings(int heatSettings) {
        if (heatSettings < 1 || heatSettings > 5) {
            this.heatSettings = 1;
        } else {
            this.heatSettings = heatSettings;
        }
    }

    public boolean isHasAutoShutoff() {
        return hasAutoShutoff;
    }

    public void setHasAutoShutoff(boolean hasAutoShutoff) {
        this.hasAutoShutoff = hasAutoShutoff;
        if (hasAutoShutoff) {
            setPrice(getPrice() + 5.75);
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", heatSettings=" + heatSettings + ", hasAutoShutoff=" + hasAutoShutoff + "]";
    }
}

