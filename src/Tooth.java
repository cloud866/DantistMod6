import java.util.Random;

public class Tooth {
    private boolean isHealthy;

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public Tooth() {
        Random random = new Random();
        this.isHealthy = random.nextBoolean();
    }
}
