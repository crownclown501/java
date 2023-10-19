package cyp3;
public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Thread medico1 = new Thread(new Medico(hospital));
        Thread medico2 = new Thread(new Medico(hospital));
        Thread medico3 = new Thread(new Medico(hospital));

        medico1.start();
        medico2.start();
        medico3.start();
        
        // Generar pacientes
        int i;
        for (i = 0; i < 10; i++) {
            Thread paciente = new Thread(new Paciente(hospital));
            paciente.start();}
        }
}
