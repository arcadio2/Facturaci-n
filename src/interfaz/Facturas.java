/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import Controller.*;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Asus
 */
public class Facturas extends javax.swing.JFrame {

    /**
     * Creates new form Facturas
     */
    public Facturas() { //constructor 
        initComponents();
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla2.getTableHeader().setReorderingAllowed(false);
        tabla3.getTableHeader().setReorderingAllowed(false);
        panel.setVisible(false);
        panel3.setVisible(false);
        text2.setVisible(false); 
        text1.setVisible(false); 
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Regresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        id_factura = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        text1 = new javax.swing.JLabel();
        numclient = new javax.swing.JLabel();
        panel = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        panel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabla4 = new javax.swing.JTable();
        text2 = new javax.swing.JLabel();
        numfact = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Ingresa el ID de factura");

        Buscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("DATOS DEL CLIENTE");

        tabla.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Correo", "Num cliente", "Fecha facturación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(3).setHeaderValue("Fecha facturación");
        }

        text1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        text1.setForeground(new java.awt.Color(255, 204, 0));
        text1.setText("Facturas del cliente:");

        numclient.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        tabla2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabla2.setForeground(new java.awt.Color(102, 102, 102));
        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Num Facturación", "Fecha Facturación", "RFC"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla2.setGridColor(new java.awt.Color(153, 153, 153));
        tabla2.setSelectionBackground(new java.awt.Color(153, 255, 153));
        jScrollPane2.setViewportView(tabla2);
        if (tabla2.getColumnModel().getColumnCount() > 0) {
            tabla2.getColumnModel().getColumn(0).setResizable(false);
            tabla2.getColumnModel().getColumn(1).setResizable(false);
            tabla2.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(0, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        tabla3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabla3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod Producto", "Categoria", "Nombre producto", "Precio", "Cantidad", "Importe"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabla3);
        if (tabla3.getColumnModel().getColumnCount() > 0) {
            tabla3.getColumnModel().getColumn(0).setResizable(false);
            tabla3.getColumnModel().getColumn(1).setResizable(false);
            tabla3.getColumnModel().getColumn(2).setResizable(false);
            tabla3.getColumnModel().getColumn(3).setResizable(false);
            tabla3.getColumnModel().getColumn(4).setResizable(false);
            tabla3.getColumnModel().getColumn(5).setResizable(false);
        }

        tabla4.setBorder(new javax.swing.border.MatteBorder(null));
        tabla4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tabla4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Subtotal", null},
                {"Descuento", null},
                {"IVA", null},
                {"TOTAL NETO", null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabla4);
        if (tabla4.getColumnModel().getColumnCount() > 0) {
            tabla4.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout panel3Layout = new javax.swing.GroupLayout(panel3);
        panel3.setLayout(panel3Layout);
        panel3Layout.setHorizontalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 827, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel3Layout.setVerticalGroup(
            panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 35, Short.MAX_VALUE))
        );

        text2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        text2.setForeground(new java.awt.Color(255, 204, 0));
        text2.setText("Detalles Factura:");

        numfact.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("D:\\Users\\Asus\\Documents\\NetBeansProjects\\Prueba12\\src\\fondo\\2.png")); // NOI18N
        jLabel3.setText("jLabel3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(815, 815, 815))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numclient)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(id_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(Buscar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(text2)
                        .addGap(18, 18, 18)
                        .addComponent(numfact, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(id_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buscar))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(text1)
                    .addComponent(numclient))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numfact, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(text2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//boton regresar
    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        inicio inicio= new inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        try{
            DefaultTableModel modelo = (DefaultTableModel) tabla2.getModel();
            modelo.setRowCount(0);//Limpiar la tabla
            DefaultTableModel modelo2 = (DefaultTableModel) tabla3.getModel();
            modelo2.setRowCount(0);//Limpiar la tabla
            consultas consultas = new consultas(); 
            Factura facturacion = new Factura(); 
            //manda el valor que escribimos y lo convierte a int
            facturacion = consultas.getFactura(Integer.parseInt(id_factura.getText())); 
            if(facturacion.isExiste()){ //is existe : variable bool de la clase factura para saber si existe
                // Valores que se le asignan a la tabla con el resiltado del objeto
                tabla.setValueAt (facturacion.getNombre() + " " + facturacion.getApellido_p() + " " + facturacion.getApellido_m(), 0, 0);
                tabla.setValueAt (facturacion.getCorreo(), 0, 1);
                tabla.setValueAt (facturacion.getId_cliente(), 0, 2);
                tabla.setValueAt (facturacion.getFecha_facturacion(), 0, 3);
           
                text1.setVisible(true);

                numclient.setText("" + facturacion.getId_cliente()); //lo convierte a string le idcliente
                panel.setVisible(true);
                /**ACABA LA PRIMER TABLA**/
                
                
                ArrayList<Allfacturas> facturas_cliente = new ArrayList<>(); 
                //se iguala a un metodo de consultas que retonrna un arraylist de allfacturas
                facturas_cliente = consultas.getAllFacturas(facturacion.getId_cliente()); 
                //el objeto se crea para agregar a la tabla 
                Object [] fila = new Object[3]; 
                for(Allfacturas e:facturas_cliente){ //for each tipo de dato, variable: arraylist name
                    fila[0] = e.getId_factura();
                    fila[1] = e.getFecha_factura();
                    fila[2] = e.getRFC();
                    modelo.addRow(fila); //Recorre arraylist y añade lo que encuentra 
                   //tabla2.addRowSelectionInterval(1, 2);
                }
                /*FIN DE SEGUNDA TABLA**/
                
                panel3.setVisible(true);
                text2.setVisible(true); 
                numfact.setText(""+id_factura.getText());
                ArrayList<Detalle> detalles = new ArrayList<>();
                //arraylist que se iguala a un metodo de consultas y el parametro es idfactura
                detalles = consultas.getDetalles(Integer.parseInt(id_factura.getText())); 
                 Object [] fila2 = new Object[6]; 
                for(Detalle e:detalles){
                    fila2[0] = e.getId_producto(); 
                    fila2[1] = e.getCategoria(); 
                    fila2[2] = e.getProducto();
                    fila2[3] = "$"+e.getPrecio();
                    fila2[4] = e.getCantidad();
                    fila2[5] = "$"+e.getImporte();
                    modelo2.addRow(fila2);//agrega como fila cada que itera
                   //tabla2.addRowSelectionInterval(1, 2);
                }
                tabla4.setValueAt ("$"+facturacion.getSubtotal(), 0, 1);
                tabla4.setValueAt ("$"+facturacion.getDescuento(), 1, 1);
                tabla4.setValueAt ("$"+facturacion.getIVA(), 2, 1);
                tabla4.setValueAt ("$"+facturacion.getTOTAL(), 3, 1);
            }else{
                tabla.setValueAt ("" , 0, 0);
                tabla.setValueAt ("", 0, 1);
                tabla.setValueAt ("", 0, 2);
                tabla.setValueAt ("", 0, 3);
                tabla.setValueAt ("", 0, 4);
                tabla.setValueAt ("", 0, 5);
                panel.setVisible(false);
                panel3.setVisible(false);
                text2.setVisible(false); 
                text1.setVisible(false); 
                numfact.setText("");
                numclient.setText("");
                JOptionPane.showMessageDialog(null, "No existe factura con ese código");
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
            tabla.setValueAt ("" , 0, 0);
                tabla.setValueAt ("", 0, 1);
                tabla.setValueAt ("", 0, 2);
                tabla.setValueAt ("", 0, 3);
     
          
                panel.setVisible(false);
                panel3.setVisible(false);
                text2.setVisible(false); 
                text1.setVisible(false); 
                numfact.setText("");
                numclient.setText("");
            JOptionPane.showMessageDialog(null, "No existe factura con ese código");
        }
        
    //tabla.setValueAt (facturacion.getId_factura(), 0, 0);
    }//GEN-LAST:event_BuscarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Facturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton Regresar;
    private javax.swing.JTextField id_factura;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel numclient;
    private javax.swing.JLabel numfact;
    private javax.swing.JPanel panel;
    private javax.swing.JPanel panel3;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla2;
    private javax.swing.JTable tabla3;
    private javax.swing.JTable tabla4;
    private javax.swing.JLabel text1;
    private javax.swing.JLabel text2;
    // End of variables declaration//GEN-END:variables
}
