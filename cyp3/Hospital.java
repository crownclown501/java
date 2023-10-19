package cyp3;

import java.util.concurrent.*;

class Hospital {
    private final Semaphore equipoSemaphore = new Semaphore(2);
    private final Semaphore medicoSemaphore = new Semaphore(3);

    public void pacienteLlega() throws InterruptedException {
        enfermeraAtiendePaciente();
    }

    private void enfermeraAtiendePaciente() throws InterruptedException {
        // Adquiere un equipo para tomar signos vitales
        equipoSemaphore.acquire();
        // Realiza la toma de signos vitales
        Thread.sleep(1000); // Simula la toma de signos durante 1 segundo
        // Asigna al paciente a un médico según la razón de su consulta
        medicoSemaphore.acquire();
        // Realiza la asignación al médico
        System.out.println("Paciente asignado a un médico");
        // Libera el equipo para tomar signos vitales
        equipoSemaphore.release();
        // El paciente espera a ser atendido por el médico
        System.out.println("Paciente esperando consulta médica");
    }

    public void pacienteSale() {
        // El paciente ha sido atendido por el médico y se va
        System.out.println("Paciente sale del hospital");
        medicoSemaphore.release(); // Libera al médico para atender a otros pacientes
    }

    public void medicoAtiendePaciente() throws InterruptedException {
        // El médico atiende al paciente
        Thread.sleep(2000); // Simula la consulta médica durante 2 segundos
        System.out.println("Médico termina consulta");
    }
}
