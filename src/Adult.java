import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Adult implements Patient {
    private final List<Tooth> tooth;

    public Adult() {
        Random random = new Random();
        List<Tooth> tooth = new ArrayList<>();

        int count = 27 + random.nextInt(4);

        for (int i = 0; i < count; i++) {
            tooth.add(new Tooth());
        }
        this.tooth = tooth;
    }

    @Override
    public List<Tooth> openMouth() {
        return tooth;
    }

    @Override
    public void checkTeeth() {
        for (Tooth teeth : tooth) {
            if (!teeth.isHealthy()) {
                System.out.println("У меня болит зуб");
                return;
            }
        }

        System.out.println("Все зубы здоровые");
    }
}
