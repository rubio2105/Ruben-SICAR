/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import conexionBD.MySQL;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Rubén
 */
public class Abono extends javax.swing.JFrame {

    DefaultTableModel m;
    Icon grabar;
    Icon actualizar;
    Icon eliminar;
    String comisiontotal = "", comisionrestante = "", dineroempresa = "";
    String ultimopago = "";
    String idpaq = "", idvende = "";

    /**
     * Creates new form Abono
     */
    public Abono() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Crédito = new javax.swing.JDialog();
        jButtonAGREGAR = new javax.swing.JButton();
        jButtonSALIR = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMEMBRE = new javax.swing.JTable(){

            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };

        ;
        jTextFieldBUSQUEDA = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        txtNUMERO = new javax.swing.JTextField();
        lbNombre = new javax.swing.JLabel();
        lbCodigo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldDEUDA = new javax.swing.JTextField();
        jButtonBUSCAR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldABONO = new javax.swing.JTextField();
        jButtonABONAR = new javax.swing.JButton();
        txtNOMBRE = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        Crédito.setTitle("Búsqueda de Clientes");
        Crédito.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonAGREGAR.setText("SELECCIONAR");
        jButtonAGREGAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAGREGARActionPerformed(evt);
            }
        });
        Crédito.getContentPane().add(jButtonAGREGAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 150, -1));

        jButtonSALIR.setText("SALIR");
        jButtonSALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSALIRActionPerformed(evt);
            }
        });
        Crédito.getContentPane().add(jButtonSALIR, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 140, -1));

        jLabel4.setText("BUSCAR:");
        Crédito.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 20));

        jTableMEMBRE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null", "null"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableMEMBRE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMEMBREMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableMEMBREMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMEMBRE);

        Crédito.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 770, 210));

        jTextFieldBUSQUEDA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldBUSQUEDAKeyPressed(evt);
            }
        });
        Crédito.getContentPane().add(jTextFieldBUSQUEDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 250, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Abonos");
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNUMERO.setEditable(false);
        txtNUMERO.setBackground(new java.awt.Color(255, 255, 255));
        txtNUMERO.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        txtNUMERO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(txtNUMERO, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 120, 30));

        lbNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbNombre.setText("Nombre del Cliente:");
        jPanel4.add(lbNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 30));

        lbCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCodigo.setText("Numero de Crédito:");
        jPanel4.add(lbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 35, -1, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Deuda del Cliente:");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 120, 30));

        jTextFieldDEUDA.setEditable(false);
        jTextFieldDEUDA.setBackground(new java.awt.Color(255, 255, 255));
        jTextFieldDEUDA.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDEUDA.setText("0");
        jTextFieldDEUDA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDEUDAActionPerformed(evt);
            }
        });
        jPanel4.add(jTextFieldDEUDA, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 80, 30));

        jButtonBUSCAR.setBackground(new java.awt.Color(51, 153, 0));
        jButtonBUSCAR.setForeground(new java.awt.Color(255, 255, 255));
        jButtonBUSCAR.setText("Buscar");
        jButtonBUSCAR.setToolTipText("Busca el Crédito");
        jButtonBUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBUSCARActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 80, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Abono:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, 40));

        jTextFieldABONO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldABONO.setText("0");
        jTextFieldABONO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldABONOFocusGained(evt);
            }
        });
        jTextFieldABONO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldABONOKeyReleased(evt);
            }
        });
        jPanel4.add(jTextFieldABONO, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 70, 40));

        jButtonABONAR.setBackground(new java.awt.Color(51, 153, 0));
        jButtonABONAR.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonABONAR.setForeground(new java.awt.Color(255, 255, 255));
        jButtonABONAR.setText("ABONAR");
        jButtonABONAR.setToolTipText("Aplicar Abono al Crédito");
        jButtonABONAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonABONARActionPerformed(evt);
            }
        });
        jPanel4.add(jButtonABONAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 120, 40));

        txtNOMBRE.setEditable(false);
        txtNOMBRE.setBackground(new java.awt.Color(255, 255, 255));
        txtNOMBRE.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        txtNOMBRE.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNOMBRE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNOMBREKeyReleased(evt);
            }
        });
        jPanel4.add(txtNOMBRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 240, 30));

        btnLimpiar.setBackground(new java.awt.Color(51, 153, 0));
        btnLimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setToolTipText("Limpia los Campos de Texto");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        jPanel4.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 90, 40));

        jLabel3.setText("$");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 10, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDEUDAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDEUDAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDEUDAActionPerformed

    private void jButtonBUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBUSCARActionPerformed
        // TODO add your handling code here:
        limpiar();
        buscarCliente();
        Crédito.setSize(815, 410);
        Crédito.setLocationRelativeTo(null);
        Crédito.setModal(true);
        Crédito.setVisible(true);
    }//GEN-LAST:event_jButtonBUSCARActionPerformed

    private void jTextFieldABONOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldABONOFocusGained
        // TODO add your handling code here:
        jTextFieldABONO.selectAll();
    }//GEN-LAST:event_jTextFieldABONOFocusGained

    private void jTextFieldABONOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldABONOKeyReleased
        // TODO add your handling code here:
        if (!jTextFieldABONO.getText().matches("[0-9--]*")) {
            JOptionPane.showMessageDialog(null, "SOLO SE PERMITEN NUMEROS", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
            jTextFieldABONO.setText("");
            jTextFieldABONO.requestFocus();
        }
    }//GEN-LAST:event_jTextFieldABONOKeyReleased

    private void jButtonABONARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonABONARActionPerformed
        // TODO add your handling code here:
        if (txtNOMBRE.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Debes Seleccionar un crédito");
        } else {
            if (jTextFieldABONO.getText().equals("0")) {
                JOptionPane.showMessageDialog(null, "Indique la Cantidad a abonar");
            } else {
                int abono = 0;
                int deuda = 0;
                int resta = 0;
                int ban = 0;
                int status = -1;
                String id = txtNUMERO.getText().trim();

                abono = Integer.parseInt(jTextFieldABONO.getText().trim());
                deuda = Integer.parseInt(jTextFieldDEUDA.getText().trim());

                if (abono <= deuda) {
                    resta = deuda - abono;
                } else {
                    JOptionPane.showMessageDialog(null, "Cantidad erronea... mayor a la deuda");
                    ban = 1;
                }

                if (ban == 0) {
                    if (resta == 0) {
                        try {
                            MySQL obj = new MySQL();
                            obj.MySQLConnect();
                            obj.comando = obj.conexion.createStatement();
                            PreparedStatement insertar = null;

                            String consulta = ("update credito "
                                    + "set deuda_credito= ? ,"
                                    + "status= ? "
                                    + "where cliente_id_cliente= ? ");
                            insertar = obj.conexion.prepareStatement(consulta);
                            insertar.setInt(3, Integer.parseInt(id));
                            insertar.setString(1, String.valueOf(resta).trim());
                            insertar.setInt(2, status);
                            insertar.executeUpdate();

                            JOptionPane.showMessageDialog(null, "Abono realizado exitosamente, La Deuda ha sido pagada en su totalidad", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                            limpiar();
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "No se guardó el Abono al crédito, verifique", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        try {
                            MySQL obj = new MySQL();
                            obj.MySQLConnect();
                            obj.comando = obj.conexion.createStatement();
                            PreparedStatement insertar = null;

                            String consulta = ("update credito "
                                    + "set deuda_credito= ? "
                                    + "where cliente_id_cliente= ? ");
                            insertar = obj.conexion.prepareStatement(consulta);
                            insertar.setInt(2, Integer.parseInt(id));
                            insertar.setString(1, String.valueOf(resta).trim());
                            insertar.executeUpdate();

                            JOptionPane.showMessageDialog(null, "Abono realizado exitosamente, la deuda que queda es de: $" + resta + "", "Correcto", JOptionPane.INFORMATION_MESSAGE);
                            limpiar();
                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "No se guardó el Abono al crédito, verifique", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_jButtonABONARActionPerformed

    private void txtNOMBREKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNOMBREKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNOMBREKeyReleased

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiar();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButtonAGREGARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAGREGARActionPerformed
        String dni;
        String nombre;
        String deuda;
        String fecha;
        // TODO add your handling code here:
        try {
            int fsel = jTableMEMBRE.getSelectedRow();

            if (fsel == -1) {
                JOptionPane.showMessageDialog(null, "Debe Seleccionar Un Crédito ", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

            } else {

                m = (DefaultTableModel) jTableMEMBRE.getModel();
                dni = jTableMEMBRE.getValueAt(fsel, 0).toString().trim();
                deuda = jTableMEMBRE.getValueAt(fsel, 3).toString().trim();
                nombre = jTableMEMBRE.getValueAt(fsel, 1).toString().trim();
                fecha = jTableMEMBRE.getValueAt(fsel, 4).toString().trim();
                String consulta = "SELECT cliente.id_cliente, cliente.nombre_cliente, cliente.telefono_cliente, credito.deuda_credito, credito.fecha_credito\n"
                        + "FROM cliente INNER JOIN credito ON cliente.id_cliente = credito.cliente_id_cliente where\n"
                        + "cliente.id_cliente='" + Integer.parseInt(dni) + "'";
                MySQL obj = new MySQL();
                obj.MySQLConnect();
                obj.comando = obj.conexion.createStatement();
                ResultSet r = obj.comando.executeQuery(consulta);

                while (r.next()) {

                }
                txtNUMERO.setText("" + dni + "");
                jTextFieldDEUDA.setText("" + deuda + "");
                txtNOMBRE.setText("" + nombre + "");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el Crédito indicado");
        }
        Crédito.dispose();
    }//GEN-LAST:event_jButtonAGREGARActionPerformed

    private void jButtonSALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSALIRActionPerformed
              
        Crédito.dispose();
    }//GEN-LAST:event_jButtonSALIRActionPerformed

    private void jTableMEMBREMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMEMBREMousePressed
       
        if (evt.getClickCount() == 2) {
            String dni;
            String nombre;
            String deuda;
            String fecha;
            // TODO add your handling code here:
            try {
                int fsel = jTableMEMBRE.getSelectedRow();
                if (fsel == -1) {
                    JOptionPane.showMessageDialog(null, "Debe Seleccionar Un Crédito ", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);

                } else {

                    m = (DefaultTableModel) jTableMEMBRE.getModel();
                    dni = jTableMEMBRE.getValueAt(fsel, 0).toString().trim();
                    deuda = jTableMEMBRE.getValueAt(fsel, 3).toString().trim();
                    nombre = jTableMEMBRE.getValueAt(fsel, 1).toString().trim();
                    fecha = jTableMEMBRE.getValueAt(fsel, 4).toString().trim();
                    String consulta = "SELECT cliente.id_cliente, cliente.nombre_cliente, cliente.telefono_cliente, credito.deuda_credito, credito.fecha_credito\n"
                            + "FROM cliente INNER JOIN credito ON cliente.id_cliente = credito.cliente_id_cliente where\n"
                            + "cliente.id_cliente='" + Integer.parseInt(dni) + "'";
                    MySQL obj = new MySQL();
                    obj.MySQLConnect();
                    obj.comando = obj.conexion.createStatement();
                    ResultSet r = obj.comando.executeQuery(consulta);

                    while (r.next()) {

                    }
                    txtNUMERO.setText("" + dni + "");
                    jTextFieldDEUDA.setText("" + deuda + "");
                    txtNOMBRE.setText("" + nombre + "");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No se pudo agregar el Crédito indicado");
            }
            Crédito.dispose();
        }
    }//GEN-LAST:event_jTableMEMBREMousePressed

    private void jTextFieldBUSQUEDAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBUSQUEDAKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {// llama el evento cuanto presiona ENTER
            buscarClienteEspecifico();
        }
    }//GEN-LAST:event_jTextFieldBUSQUEDAKeyPressed

    private void jTableMEMBREMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMEMBREMouseClicked
        // TODO add your handling code here:
        //4
    }//GEN-LAST:event_jTableMEMBREMouseClicked

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
            java.util.logging.Logger.getLogger(Abono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Abono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Abono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Abono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Abono().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Crédito;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton jButtonABONAR;
    private javax.swing.JButton jButtonAGREGAR;
    private javax.swing.JButton jButtonBUSCAR;
    private javax.swing.JButton jButtonSALIR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableMEMBRE;
    private javax.swing.JTextField jTextFieldABONO;
    private javax.swing.JTextField jTextFieldBUSQUEDA;
    private javax.swing.JTextField jTextFieldDEUDA;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JTextField txtNOMBRE;
    private javax.swing.JTextField txtNUMERO;
    // End of variables declaration//GEN-END:variables

    public String TransformarFecha() {
        String formato = "dd-MM-yyyy";
        //Formato
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(formato);        
        return sdf.format(date);

    }
//Busqueda de todos los clientes. 
    public void buscarCliente() {
        try {
            String titulos[] = {"ID", "Nombre Completo", "Teléfono", "Deuda", " Fecha de Deuda"};
            m = new DefaultTableModel(null, titulos);
            JTable p = new JTable(m);
            String fila[] = new String[5];
            String DATO = jTextFieldBUSQUEDA.getText().trim();
            String consulta = "";
            consulta = "SELECT cliente.id_cliente, cliente.nombre_cliente, cliente.telefono_cliente, credito.deuda_credito, credito.fecha_credito\n"
                    + "FROM cliente INNER JOIN credito ON cliente.id_cliente = credito.cliente_id_cliente WHERE credito.status=1";
            MySQL obj = new MySQL();
            obj.MySQLConnect();
            obj.comando = obj.conexion.createStatement();
            ResultSet r = obj.comando.executeQuery(consulta);

            while (r.next()) {
                fila[0] = r.getString(1).trim();
                fila[1] = r.getString(2).trim();
                fila[2] = r.getString(3).trim();
                fila[3] = r.getString(4).trim();
                fila[4] = r.getString(5).trim();

                m.addRow(fila);
            }
            jTableMEMBRE.setModel(m);
            TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(m);
            jTableMEMBRE.setRowSorter(elQueOrdena);
            this.jTableMEMBRE.setModel(m);
            FormatoTabla();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Buscar el cliente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
    //Busqueda por nombre de cliente.
    public void buscarClienteEspecifico() {
        try {
            String titulos[] = {"ID", "Nombre Completo", "Teléfono", "Deuda", " Fecha de Deuda"};
            m = new DefaultTableModel(null, titulos);
            JTable p = new JTable(m);
            String fila[] = new String[5];
            String DATO = jTextFieldBUSQUEDA.getText().trim();
            String consulta = "";
            consulta = "SELECT cliente.id_cliente, cliente.nombre_cliente, cliente.telefono_cliente, credito.deuda_credito, credito.fecha_credito\n"
                    + "FROM cliente INNER JOIN credito ON cliente.id_cliente = credito.cliente_id_cliente where nombre_cliente like '%" + DATO + "%' and credito.status=1";
            MySQL obj = new MySQL();
            obj.MySQLConnect();
            obj.comando = obj.conexion.createStatement();
            ResultSet r = obj.comando.executeQuery(consulta);

            while (r.next()) {
                fila[0] = r.getString(1).trim();
                fila[1] = r.getString(2).trim();
                fila[2] = r.getString(3).trim();
                fila[3] = r.getString(4).trim();
                fila[4] = r.getString(5).trim();

                m.addRow(fila);
            }
            jTableMEMBRE.setModel(m);
            TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<TableModel>(m);
            jTableMEMBRE.setRowSorter(elQueOrdena);
            this.jTableMEMBRE.setModel(m);
            FormatoTabla();
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al Buscar el cliente", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void FormatoTabla() {
        jTableMEMBRE.getColumnModel().getColumn(0).setPreferredWidth(5);
        jTableMEMBRE.getColumnModel().getColumn(1).setPreferredWidth(70);
        jTableMEMBRE.getColumnModel().getColumn(2).setPreferredWidth(70);
        jTableMEMBRE.getColumnModel().getColumn(3).setPreferredWidth(10);
        jTableMEMBRE.getColumnModel().getColumn(4).setPreferredWidth(50);

    }

    //LIMPIAR LAS CASILLAS DE TEXTO
    public void limpiar() {
        txtNUMERO.setText("");
        txtNUMERO.requestFocus();
        txtNOMBRE.setText("");
        jTextFieldABONO.setText("");
        jTextFieldDEUDA.setText("");
    }

}
