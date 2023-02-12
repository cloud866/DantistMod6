import java.util.Random;

public class Dentist {
    public void cure(Patient patient) {
        Random random = new Random();
        if (patient.openMouth().size() > 28) {
            System.out.println("Удаляю зубы мудрости");

            while (patient.openMouth().size() > 28) {
                patient.openMouth().remove(28);
            }
        }

        //patient.openMouth().stream().map(tooth -> {return tooth.isHealthy() ? tooth : true;});

        for(int i = 0; i < patient.openMouth().size(); i++) {
            if (!patient.openMouth().get(i).isHealthy())
                if (random.nextBoolean()) {
                    System.out.println("Зуб неиздечим");
                    patient.openMouth().remove(i);
                    i--;
                } else {
                    patient.openMouth().get(i).setHealthy(true);
                }
        }
    }
}
