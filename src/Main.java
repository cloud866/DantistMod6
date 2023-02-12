public class Main {
    public static void main(String[] args) {
        Dentist dentist = new Dentist();
        Patient patient = new Adult();
        System.out.println(patient.openMouth().size());
        patient.checkTeeth();
        dentist.cure(patient);
        System.out.println(patient.openMouth().size());
        patient.checkTeeth();
    }
}