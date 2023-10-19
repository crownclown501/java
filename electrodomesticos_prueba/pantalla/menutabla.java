public class menutabla {
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                tabla t1= new tabla();
                t1.setVisible(true);
            }
        });
    }
}
