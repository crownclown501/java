import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana1 extends javax.swing.JFrame
{
    private javax.swing.JButton btnAceptar;
    private javax.swing.JLabel jLabel;
    private javax.swing.JRadioButton Alta;
    private javax.swing.JRadioButton Baja;
    private javax.swing.JRadioButton Modificar;
    private javax.swing.JRadioButton Mostrar;
    private javax.swing.JRadioButton Añadir;
    private javax.swing.JRadioButton Cobrar;
    
	public Ventana1()
	{
		startComp();
		ButtonGroup btg = new ButtonGroup();
		
		btg.add(Alta);
		btg.add(Baja);
		btg.add(Modificar);
		btg.add(Mostrar);
		btg.add(Añadir);
		btg.add(Cobrar);

       // btgproductoperecedero1
	}
	@SuppressWarnings("unchecked")

	private void startComp()
	{
		Alta = new javax.swing.JRadioButton();
		Baja = new javax.swing.JRadioButton();
		Modificar = new javax.swing.JRadioButton();
		Mostrar	= new javax.swing.JRadioButton();
		Añadir = new javax.swing.JRadioButton();
		Cobrar = new javax.swing.JRadioButton();
		jLabel = new javax.swing.JLabel();
		btnAceptar = new javax.swing.JButton();
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Sistema");
		
		Alta.setText(" Dar de alta un producto");
		
		Baja.setText("Dar de baja un producto");
		
		Modificar.setText("Modificar un producto");
		
		Mostrar.setText("Mostrar lista de productos a comprar");
			
		Añadir.setText("Añadir producto a lista de comprar");
		
		Cobrar.setText("Cobrar cliente");

		jLabel.setText("Elige una opcion");

		btnAceptar.setText("Aceptar");
		btnAceptar.addActionListener(new java.awt.event.ActionListener()
		{
			public void actionPerformed(java.awt.event.ActionEvent evt)
			{
				btnAceptarActionPerformed(evt);
			}
		});


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                    .addGap(22, 22, 22)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            
                            .addComponent(jLabel)
                            .addComponent(Alta)
                            .addComponent(Baja)
			                .addComponent(Modificar)
			                .addComponent(Mostrar)
			                .addComponent(Añadir)
                            .addComponent(Cobrar)))
                    
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnAceptar)
                        .addGap(0, 0, Short.MAX_VALUE))
                );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel)
                .addGap(18, 18, 18)
                .addComponent(Alta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Baja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Modificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Mostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		        .addComponent(Añadir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		        .addComponent(Cobrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnAceptar)
                .addContainerGap(21, Short.MAX_VALUE))
        );
 
        pack();

	}

	private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt)
	{
		String info = "Elegiste la opcion ";
		JRadioButton[] opc={Alta,Baja,Modificar,Mostrar,Añadir,Cobrar};
		for( int i = 0; i < opc.length;i++)
		{
			if (opc[i].isSelected())
			{
				info += opc[i].getText();
			}
		}
		JOptionPane.showMessageDialog(this, info, "Muestra de datos", JOptionPane.INFORMATION_MESSAGE);
	}

    public static void main(String args[]) 
    {
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) 
            {
                if ("Nimbus".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) 
        {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() 
            {
                new Ventana1().setVisible(true);
            }
        });
    }	
}