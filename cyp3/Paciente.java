package cyp3;

class Paciente implements Runnable {
    private final Hospital hospital;

    public Paciente(Hospital hospital) {
        this.hospital = hospital;
    }

    @Override
    public void run() {
        try {
            hospital.pacienteLlega();
            // Realiza la consulta médica
            hospital.pacienteSale();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}

