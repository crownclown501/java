package cyp3;


class Medico implements Runnable {
    private final Hospital hospital;
    private int pacientesAtendidos = 0;
    private final int maxPacientes = 10; 

    public Medico(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public void run() {
        while (pacientesAtendidos < maxPacientes) {
            try {
                hospital.medicoAtiendePaciente();
                pacientesAtendidos++;

                // Si ha atendido a todos los pacientes, salir del bucle y terminar el hilo
                if (pacientesAtendidos == maxPacientes) {
                    break;
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}


