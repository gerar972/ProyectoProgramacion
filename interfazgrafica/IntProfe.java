/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfazgrafica;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ben10
 */
public class IntProfe extends javax.swing.JFrame{
    
    public static DefaultTableModel tabla;
    public static DefaultTableModel tabla1;
    public static DefaultTableModel tabla2;
    /**
     * Creates new form IntProfe
     */
    public IntProfe() {
        initComponents();
        tabla=new DefaultTableModel();
        tabla.addColumn("Nombre");
        tabla.addColumn("Apellido");
        tabla.addColumn("Matricula");
        tabla.addColumn("Fecha Ingreso");
        this.jTable2.setModel(tabla);
        tabla1=new DefaultTableModel();
        tabla1.addColumn("Materia");
        tabla1.addColumn("Calificacion");
        this.jTable3.setModel(tabla1);
        tabla2=new DefaultTableModel();
        tabla2.addColumn("Maestros");
        this.jTable6.setModel(tabla2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        darAlta = new javax.swing.JButton();
        hacerCambio = new javax.swing.JButton();
        txt_materia = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_calificacion = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_columna = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_fila = new javax.swing.JTextField();
        txt_nuevoDato = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        darAltaMaestro = new javax.swing.JButton();
        txt_maestro = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setText("PROFESOR");

        darAlta.setBackground(new java.awt.Color(255, 255, 255));
        darAlta.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 20)); // NOI18N
        darAlta.setForeground(new java.awt.Color(0, 204, 51));
        darAlta.setText("GUARDAR");
        darAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darAltaActionPerformed(evt);
            }
        });

        hacerCambio.setBackground(new java.awt.Color(255, 255, 255));
        hacerCambio.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 20)); // NOI18N
        hacerCambio.setForeground(new java.awt.Color(51, 153, 255));
        hacerCambio.setText("CAMBIAR");
        hacerCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hacerCambioActionPerformed(evt);
            }
        });

        txt_materia.setBackground(new java.awt.Color(255, 51, 102));
        txt_materia.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_materia.setForeground(new java.awt.Color(255, 255, 255));
        txt_materia.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_materia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("Materia:");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("Nueva Calificacion:");

        txt_calificacion.setBackground(new java.awt.Color(255, 51, 102));
        txt_calificacion.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_calificacion.setForeground(new java.awt.Color(255, 255, 255));
        txt_calificacion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_calificacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellidos", "Matricula", "Fecha Ingreso"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 153, 255));
        jButton1.setText("RECUPERAR DATOS DE TABLA DE ADMINISTRADOR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 153, 255));
        jButton2.setText("REGRESAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_columna.setBackground(new java.awt.Color(255, 51, 102));
        txt_columna.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_columna.setForeground(new java.awt.Color(255, 255, 255));
        txt_columna.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_columna.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 255));
        jLabel7.setText("Fila:");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 255));
        jLabel8.setText("Columna:");

        txt_fila.setBackground(new java.awt.Color(255, 51, 102));
        txt_fila.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_fila.setForeground(new java.awt.Color(255, 255, 255));
        txt_fila.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_fila.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_nuevoDato.setBackground(new java.awt.Color(255, 51, 102));
        txt_nuevoDato.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_nuevoDato.setForeground(new java.awt.Color(255, 255, 255));
        txt_nuevoDato.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_nuevoDato.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 20)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 255));
        jLabel9.setText("Nuevo Dato:");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Materia", "Calificacion"
            }
        ));
        jScrollPane2.setViewportView(jTable3);

        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(51, 153, 255));
        jButton3.setText("PASAR CALIFICACION Y MATERIA A ESTUDIANTE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Maestros"
            }
        ));
        jScrollPane3.setViewportView(jTable6);

        jButton4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(51, 153, 255));
        jButton4.setText("VER MAESTROS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        darAltaMaestro.setBackground(new java.awt.Color(255, 255, 255));
        darAltaMaestro.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 20)); // NOI18N
        darAltaMaestro.setForeground(new java.awt.Color(0, 204, 51));
        darAltaMaestro.setText("AGREGAR MAESTRO");
        darAltaMaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                darAltaMaestroActionPerformed(evt);
            }
        });

        txt_maestro.setBackground(new java.awt.Color(255, 51, 102));
        txt_maestro.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        txt_maestro.setForeground(new java.awt.Color(255, 255, 255));
        txt_maestro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_maestro.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 153, 255));
        jLabel10.setText("Agregar Maestro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_maestro, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_fila, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_columna, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nuevoDato, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(210, 210, 210)
                                .addComponent(darAlta))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(26, 26, 26)
                                .addComponent(jButton1))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(darAltaMaestro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addGap(68, 68, 68))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(hacerCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(158, 158, 158))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(502, 502, 502))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txt_maestro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_calificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_fila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_columna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nuevoDato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hacerCambio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(darAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(darAltaMaestro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jTable2.setModel(IntAdmin.tabla);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (JOptionPane.showConfirmDialog(null, "¿Quieres regresar al inicio de sesion?", "¡Aviso!", JOptionPane.YES_OPTION) == JOptionPane.YES_OPTION) {
            IniciarSesion obj = new IniciarSesion();
            obj.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void darAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darAltaActionPerformed
        // TODO add your handling code here:
        String []info=new String[5];
        info[0]=txt_materia.getText();
        info[1]=txt_calificacion.getText();
        
        tabla1.addRow(info);
        txt_materia.setText("");
        txt_calificacion.setText("");
        
    }//GEN-LAST:event_darAltaActionPerformed

    private void hacerCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hacerCambioActionPerformed
        // TODO add your handling code here:
        int fila=Integer.parseInt(txt_fila.getText());
        int columna=Integer.parseInt(txt_columna.getText());
        tabla1.setValueAt(txt_nuevoDato.getText(),fila,columna); 
    }//GEN-LAST:event_hacerCambioActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        IntEstudiante abrir = new IntEstudiante();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String[]encabezado=new String []{"Maestros"};
        String[][] table={{"Ulise Marinero Aguilar"},{"Ulises Marinero Aguilar"},{"Juana Elisa Escalante Vega"},{"Candy Obdulia Sosa Jimenez"},{"Virginia Lagunes Barradas"}};
        tabla2=new DefaultTableModel(table,encabezado);
        jTable6.setModel(tabla2);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void darAltaMaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_darAltaMaestroActionPerformed
        // TODO add your handling code here:
        String []info=new String[5];
        info[0]=txt_maestro.getText();
        
        
        tabla2.addRow(info);
        txt_maestro.setText("");
        
    }//GEN-LAST:event_darAltaMaestroActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton darAlta;
    private javax.swing.JButton darAltaMaestro;
    private javax.swing.JButton hacerCambio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable6;
    private javax.swing.JTextField txt_calificacion;
    private javax.swing.JTextField txt_columna;
    private javax.swing.JTextField txt_fila;
    private javax.swing.JTextField txt_maestro;
    private javax.swing.JTextField txt_materia;
    private javax.swing.JTextField txt_nuevoDato;
    // End of variables declaration//GEN-END:variables
}
