/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import conexionBD.MySQL;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Rubén
 */
public final class JCredito extends javax.swing.JFrame {

    DefaultTableModel m;
    String nombre, dni, direccion;

    /**
     * Creates new form JCredito
     */
    public JCredito() {
        try {
            initComponents();
            FechaHoy();
            jLabelIDCLIENTE.setVisible(false);
            jLabelIDCREDITO.setVisible(false);
            cargarClientes();
            cargarcodDETALLE();
            this.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(JCredito.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CLIENTES = new javax.swing.JDialog();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TABLABASECLIENT = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex) {
                return false; //Disallow the editing of any cell
            }
        };
        ;
        Adicionar_Clientes = new javax.swing.JButton();
        botonExit = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldBUSCAR = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lbFecha = new javax.swing.JLabel();
        txtcliente = new javax.swing.JTextField();
        lbCliente = new javax.swing.JLabel();
        btnBuscaCliente1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldMONTO = new javax.swing.JTextField();
        jLabelIDCLIENTE = new javax.swing.JLabel();
        jButtonGuardar = new javax.swing.JButton();
        jLabelIDCREDITO = new javax.swing.JLabel();
        FECHA = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();

        CLIENTES.setTitle("BÚSQUEDA DE CLIENTES");
        CLIENTES.setResizable(false);
        CLIENTES.setType(java.awt.Window.Type.UTILITY);
        CLIENTES.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TABLABASECLIENT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TABLABASECLIENT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TABLABASECLIENTMousePressed(evt);
            }
        });
        jScrollPane3.setViewportView(TABLABASECLIENT);

        jPanel7.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 700, 290));

        Adicionar_Clientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Adicionar_Clientes.setText("SELECCIONAR");
        Adicionar_Clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Adicionar_ClientesActionPerformed(evt);
            }
        });
        jPanel7.add(Adicionar_Clientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 180, 50));

        botonExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        botonExit.setText("SALIR");
        botonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonExitActionPerformed(evt);
            }
        });
        jPanel7.add(botonExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 180, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Buscar:");
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jTextFieldBUSCAR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextFieldBUSCARKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldBUSCARKeyTyped(evt);
            }
        });
        jPanel7.add(jTextFieldBUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 200, 30));

        CLIENTES.getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 470));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconImage(getIconImage());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 255, 102)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Panel de Créditos");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 570, 50));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbFecha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbFecha.setText("Fecha :");
        jPanel3.add(lbFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 110, -1, 30));

        txtcliente.setEditable(false);
        txtcliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtcliente.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtcliente.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPanel3.add(txtcliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 320, 40));

        lbCliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCliente.setText("Cliente:");
        jPanel3.add(lbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 40));

        btnBuscaCliente1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnBuscaCliente1.setText("Buscar");
        btnBuscaCliente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaCliente1ActionPerformed(evt);
            }
        });
        jPanel3.add(btnBuscaCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 110, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Monto de crédito $");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 120, 30));

        jTextFieldMONTO.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMONTO.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextFieldMONTOFocusGained(evt);
            }
        });
        jTextFieldMONTO.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldMONTOKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldMONTOKeyTyped(evt);
            }
        });
        jPanel3.add(jTextFieldMONTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 80, 30));
        jPanel3.add(jLabelIDCLIENTE, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 40, 40));

        jButtonGuardar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(0, 0, 255), new java.awt.Color(51, 51, 255)));
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 80, 40));
        jPanel3.add(jLabelIDCREDITO, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 50, 30));

        FECHA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.add(FECHA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 150, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Abonar a un Crédito");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 170, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 570, 230));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnBuscaCliente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaCliente1ActionPerformed
        // TODO add your handling code here:
        cargarClientes();
        CLIENTES.setSize(732, 494);
        CLIENTES.setLocationRelativeTo(null);
        CLIENTES.setModal(true);
        CLIENTES.setVisible(true);
    }//GEN-LAST:event_btnBuscaCliente1ActionPerformed

    private void jTextFieldMONTOFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextFieldMONTOFocusGained
        // TODO add your handling code here:
        jTextFieldMONTO.selectAll();
    }//GEN-LAST:event_jTextFieldMONTOFocusGained

    private void jTextFieldMONTOKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMONTOKeyReleased
        // TODO add your handling code here:
        char caracter = evt.getKeyChar();
        if (((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE)
                && (caracter != '.')) {
            JOptionPane.showMessageDialog(null, "No se permite el ingreso de letras");
            evt.consume();
            jTextFieldMONTO.setText("");
        }
    }//GEN-LAST:event_jTextFieldMONTOKeyReleased

    private void jTextFieldMONTOKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldMONTOKeyTyped
        // TODO add your handling code here:
        if (jTextFieldMONTO.getText().length() == 9) {
            JOptionPane.showMessageDialog(null, "Sólo se permiten nueve caracteres");
            jTextFieldMONTO.requestFocus();
            evt.consume();
        } else if (jTextFieldMONTO.getText().length() == 9) {
        }
    }//GEN-LAST:event_jTextFieldMONTOKeyTyped

    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        if (FECHA.getDate() == null) {
            JOptionPane.showMessageDialog(null, "DEBES ELEGIR UNA FECHA");
        } else {

            if (this.txtcliente.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Falta Seleccionar El Cliente", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
                this.txtcliente.requestFocus();
            } else if (this.jTextFieldMONTO.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Falta Indicar El Monto Del Crédito", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
                this.jTextFieldMONTO.requestFocus();
            } else if (this.FECHA.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Seleccione una Fecha", "VERIFICAR", JOptionPane.WARNING_MESSAGE);
            } else {
                int ban = 0;
                int status = 1;
                try {
                    TransformarFecha();
                    MySQL obj = new MySQL();
                    obj.MySQLConnect();
                    obj.comando = obj.conexion.createStatement();
                    PreparedStatement insertar = null;

                    String consultaCaso = "INSERT INTO credito(id_credito, fecha_credito, importe_credito, cliente_id_cliente, deuda_credito, status) " + "VALUES(?,?,?,?,?,?)";
                    insertar = obj.conexion.prepareStatement(consultaCaso);

                    insertar.setString(1, jLabelIDCREDITO.getText().trim());
                    insertar.setString(2, TransformarFecha().trim());
                    insertar.setString(3, jTextFieldMONTO.getText().trim());
                    insertar.setString(4, jLabelIDCLIENTE.getText().trim());
                    insertar.setString(5, jTextFieldMONTO.getText().trim());
                    insertar.setInt(6, status);

                    int n = insertar.executeUpdate();

                    if (n > 0) {
                        JOptionPane.showMessageDialog(null, "El Crédito Se Agregó Satisfactoriamente");
                        ban = 1;
                    }
                    limpiar();
                    if (ban == 1) {
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(JCredito.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void Adicionar_ClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Adicionar_ClientesActionPerformed
        try {
            int fsel = TABLABASECLIENT.getSelectedRow();
            if (fsel == -1) {
                JOptionPane.showMessageDialog(null, "Debe Seleccionar un Cliente ", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            } else {
                m = (DefaultTableModel) TABLABASECLIENT.getModel();
                dni = TABLABASECLIENT.getValueAt(fsel, 0).toString();
                nombre = TABLABASECLIENT.getValueAt(fsel, 1).toString();
                txtcliente.setText("" + nombre + "");
                jLabelIDCLIENTE.setText("" + dni + "");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No Se Pudo Agregar El Cliente");
        }
        CLIENTES.dispose();
    }//GEN-LAST:event_Adicionar_ClientesActionPerformed

    private void botonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonExitActionPerformed
        CLIENTES.dispose();
    }//GEN-LAST:event_botonExitActionPerformed

    private void jTextFieldBUSCARKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBUSCARKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {// llama el evento cuanto presiona ENTER
            buscarClientes();
        }
    }//GEN-LAST:event_jTextFieldBUSCARKeyPressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Abono ad = new Abono();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldBUSCARKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldBUSCARKeyTyped
        // TODO add your handling code here:
        buscarClientes();
    }//GEN-LAST:event_jTextFieldBUSCARKeyTyped

    private void TABLABASECLIENTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TABLABASECLIENTMousePressed
        // TODO add your handling code here:

        //a
        if (evt.getClickCount() == 2) {
            try {
                int fsel = TABLABASECLIENT.getSelectedRow();
                if (fsel == -1) {
                    JOptionPane.showMessageDialog(null, "Debe Seleccionar un Cliente ", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
                } else {
                    m = (DefaultTableModel) TABLABASECLIENT.getModel();
                    dni = TABLABASECLIENT.getValueAt(fsel, 0).toString();
                    nombre = TABLABASECLIENT.getValueAt(fsel, 1).toString();
                    txtcliente.setText("" + nombre + "");
                    jLabelIDCLIENTE.setText("" + dni + "");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No Se Pudo Agregar El Cliente");
            }
            CLIENTES.dispose();
        }

    }//GEN-LAST:event_TABLABASECLIENTMousePressed

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
            java.util.logging.Logger.getLogger(JCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCredito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Adicionar_Clientes;
    private javax.swing.JDialog CLIENTES;
    private com.toedter.calendar.JDateChooser FECHA;
    private javax.swing.JTable TABLABASECLIENT;
    private javax.swing.JButton botonExit;
    private javax.swing.JButton btnBuscaCliente1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelIDCLIENTE;
    private javax.swing.JLabel jLabelIDCREDITO;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextFieldBUSCAR;
    private javax.swing.JTextField jTextFieldMONTO;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JTextField txtcliente;
    // End of variables declaration//GEN-END:variables

    public String TransformarFecha() {
        String formato = "dd-MM-yyyy";
        //Formato
        Date date = FECHA.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        return sdf.format(date);
    }

    public String FechaHoy() {
        initComponents();
        Calendar c2 = new GregorianCalendar();
        FECHA.setCalendar(c2);        
        return c2 + "";
    }

    public void cargarClientes() {
        try {
            String titulos[] = {"ID", "NOMBRE COMPLETO", "DOMICILIO", "TELEFONO"};
            m = new DefaultTableModel(null, titulos);
            JTable p = new JTable(m);
            String fila[] = new String[4];
            String consulta = "SELECT *  FROM  cliente where cliente.status=1";
            MySQL obj = new MySQL();
            obj.MySQLConnect();
            obj.comando = obj.conexion.createStatement();
            ResultSet r = obj.comando.executeQuery(consulta);
            int index = 1;
            while (r.next()) {

                fila[0] = r.getString(1).trim();
                fila[1] = r.getString(2).trim();
                fila[2] = r.getString(3).trim();
                fila[3] = r.getString(5).trim();

                m.addRow(fila);
                index++;
            }
            TABLABASECLIENT.setModel(m);
            TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<>(m);
            TABLABASECLIENT.setRowSorter(elQueOrdena);
            this.TABLABASECLIENT.setModel(m);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al extraer los datos de la tabla", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void buscarClientes() {
        try {
            String titulos[] = {"ID", "NOMBRE COMPLETO", "DOMICILIO", "TELEFONO"};
            String valor = jTextFieldBUSCAR.getText().trim();
            m = new DefaultTableModel(null, titulos);
            JTable p = new JTable(m);
            String fila[] = new String[4];
            String consulta = "SELECT *  FROM  cliente where nombre_cliente like '%" + valor + "%' and cliente.status=1";
            MySQL obj = new MySQL();
            obj.MySQLConnect();
            obj.comando = obj.conexion.createStatement();
            ResultSet r = obj.comando.executeQuery(consulta);
            int index = 1;
            while (r.next()) {

                fila[0] = r.getString(1).trim();
                fila[1] = r.getString(2).trim();
                fila[2] = r.getString(3).trim();
                fila[3] = r.getString(5).trim();

                m.addRow(fila);
                index++;
            }
            TABLABASECLIENT.setModel(m);
            TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<>(m);
            TABLABASECLIENT.setRowSorter(elQueOrdena);
            this.TABLABASECLIENT.setModel(m);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al extraer los datos de la tabla", "ADVERTENCIA", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargarcodDETALLE() throws SQLException {

        MySQL obj = new MySQL();
        obj.MySQLConnect();
        obj.comando = obj.conexion.createStatement();
        String consulta = "", c = "";
        consulta = "select count(id_credito) from credito";

        ResultSet r = obj.comando.executeQuery(consulta);
        int conteo = 0;
        try {
            if (r.next()) {
                conteo = r.getInt(1);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        if (conteo == 0) {
            int add = conteo + 1;
            jLabelIDCREDITO.setText(String.valueOf(add).trim());
        } else {
            cargarcodnotaDETALLE();
        }
    }

    public void cargarcodnotaDETALLE() throws SQLException {

        MySQL obj = new MySQL();
        obj.MySQLConnect();
        obj.comando = obj.conexion.createStatement();
        String consulta = "", c = null;
        consulta = "select max(id_credito) from credito";
        ResultSet r = obj.comando.executeQuery(consulta);
        try {
            while (r.next()) {
                c = r.getString(1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "NO SE PUDO EJECUTAR LA CONSULTA");
        }
        int add = Integer.parseInt(c) + 1;
        jLabelIDCREDITO.setText(String.valueOf(add).trim());
    }

    void limpiar() throws SQLException {
        txtcliente.setText("");
        jTextFieldMONTO.setText("");
        FECHA.setCalendar(null);
        cargarcodDETALLE();
    }
}
