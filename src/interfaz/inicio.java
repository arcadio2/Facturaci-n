package interfaz;

import Controller.consultas;


public class inicio extends javax.swing.JFrame {
  
    public inicio() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contrue = new javax.swing.JLabel();
        register = new javax.swing.JButton();
        addCompra = new javax.swing.JButton();
        facture = new javax.swing.JButton();
        facts = new javax.swing.JButton();
        comprar = new javax.swing.JButton();
        Probar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        contrue.setForeground(new java.awt.Color(102, 255, 102));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(420, 350));
        setMinimumSize(new java.awt.Dimension(420, 350));
        setPreferredSize(new java.awt.Dimension(420, 350));
        getContentPane().setLayout(null);

        register.setText("Registrar cliente");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        getContentPane().add(register);
        register.setBounds(30, 30, 130, 23);

        addCompra.setText("Agregar compra");
        addCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCompraActionPerformed(evt);
            }
        });
        getContentPane().add(addCompra);
        addCompra.setBounds(30, 70, 130, 23);

        facture.setText("Buscar facturas");
        facture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factureActionPerformed(evt);
            }
        });
        getContentPane().add(facture);
        facture.setBounds(30, 110, 130, 23);

        facts.setText("Facturas cliente");
        facts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                factsActionPerformed(evt);
            }
        });
        getContentPane().add(facts);
        facts.setBounds(30, 150, 130, 23);

        comprar.setText("Comprar nueva");
        comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comprarActionPerformed(evt);
            }
        });
        getContentPane().add(comprar);
        comprar.setBounds(30, 200, 130, 23);

        Probar.setText("Probar conexion");
        Probar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProbarActionPerformed(evt);
            }
        });
        getContentPane().add(Probar);
        Probar.setBounds(30, 250, 130, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\Users\\Asus\\Documents\\NetBeansProjects\\Prueba12\\src\\fondo\\1.png")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(260, 20, 126, 112);

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Users\\Asus\\Documents\\NetBeansProjects\\Prueba12\\src\\fondo\\aaaaaa.gif")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 430, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void factsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factsActionPerformed
        FacturasC factura = new FacturasC();
        factura.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_factsActionPerformed

    private void addCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCompraActionPerformed
        AddCompra compra =new AddCompra();
        compra.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addCompraActionPerformed

    private void comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comprarActionPerformed
        Comprar comprar = new Comprar();
        comprar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_comprarActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        Register registro = new Register();
        registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_registerActionPerformed

    private void factureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_factureActionPerformed
        Facturas factura = new Facturas();
        factura.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_factureActionPerformed

    private void ProbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProbarActionPerformed
        // consultas con = new consultas();
        if(consultas.getConnection()==null){
            contrue.setText("Conexión fallida");
        }else{
            contrue.setText("Conexión exitosa");
        }
    }//GEN-LAST:event_ProbarActionPerformed

    
    
  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Probar;
    private javax.swing.JButton addCompra;
    private javax.swing.JButton comprar;
    private javax.swing.JLabel contrue;
    private javax.swing.JButton facts;
    private javax.swing.JButton facture;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables
}
