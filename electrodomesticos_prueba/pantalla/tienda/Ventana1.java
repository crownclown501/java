package tienda;
public class Ventana1 extends javax.swing.JFrame {
// Variables declaration - do not modify                     
private javax.swing.JRadioButton Alta;
private javax.swing.JRadioButton Añadir;
private javax.swing.JRadioButton Baja;
private javax.swing.JRadioButton Modificar;
private javax.swing.JRadioButton Consulta;
private javax.swing.JButton Next;
private javax.swing.ButtonGroup buttonGroup1;
private javax.swing.JRadioButton cobra;
private javax.swing.JDesktopPane jDesktopPane1;
      
    public Ventana1() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
                            
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        Alta = new javax.swing.JRadioButton();
        Baja = new javax.swing.JRadioButton();
        Modificar = new javax.swing.JRadioButton();
        Consulta = new javax.swing.JRadioButton();
        
        Next = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jDesktopPane1.setBackground(new java.awt.Color(51, 153, 0));
        jDesktopPane1.setForeground(new java.awt.Color(102, 204, 255));

        buttonGroup1.add(Alta);
        Alta.setText("Dar de alta un producto");
        Alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltaActionPerformed(evt);
            }
        });

        buttonGroup1.add(Baja);
        Baja.setText("Dar de baja un producto");

        buttonGroup1.add(Modificar);
        Modificar.setText("Modificar un producto");

        buttonGroup1.add(Consulta);
        Consulta.setText("Mostrar lista de productos a comprar");

       

        Next.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Next.setText("Next");
        Next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NextActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(Alta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Baja, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Modificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(Consulta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jDesktopPane1.setLayer(Next, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cobra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Alta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Baja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Consulta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Añadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Next, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(Alta)
                        .addGap(18, 18, 18)
                        .addComponent(Baja)
                        .addGap(18, 18, 18)
                        .addComponent(Modificar)
                        .addGap(18, 18, 18)
                        .addComponent(Consulta)
                        .addGap(18, 18, 18)))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }                      

    private void NextActionPerformed(java.awt.event.ActionEvent evt) {                                     
       if (Alta.isSelected())
     {
         /*frmAgregar agregar = new frmAgregar();
         agregar.setVisible(true);
         this.dispose();*/
     }
       /*else if(Baja.isSelected())
     {
         Baja baja = new Baja();
         baja.setVisible(true);
         this.dispose();
     }else if(Modificar.isSelected())
     {
         Modificar modificar = new Modificar();
         modificar.setVisible(true);
         this.dispose();
     }else if(Mostrar.isSelected())
     {
         Mostrar mostrar = new Mostrar();
         mostrar.setVisible(true);
         
     }
     }*/
    }                                    

    private void AltaActionPerformed(java.awt.event.ActionEvent evt) {                                     
        
    }                                    

 
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

              
}
