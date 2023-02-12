import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Child implements Patient {
    private final List<Tooth> tooth;

    public Child() {
        Random random = new Random();
        List<Tooth> tooth = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
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

