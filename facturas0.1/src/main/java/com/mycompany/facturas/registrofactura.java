/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.facturas;

import javax.swing.JOptionPane;

public class registrofactura extends javax.swing.JFrame {
    int facturaindex = 0;
    String facturas[][] = new String[100][5];
/**
 *
 * @author aleja
 */

    /**
     * Creates new form registrofactura
     */
    public registrofactura() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        factura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        timbrado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        provehedor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        monto10 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        monto5 = new javax.swing.JTextField();
        guardar = new javax.swing.JButton();
        imprimir = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panel = new javax.swing.JTextArea();
        editar = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel1.setText("Registro de Facturas ");

        jLabel2.setText("Numero de Factura:");

        jLabel3.setText("Numero de Timbrado:");

        jLabel4.setText("Provehedor:");

        jLabel5.setText("Monto Gravado al 10%:");

        jLabel6.setText("Monto Gravado al 5%");

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        imprimir.setText("Imprimir");
        imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimirActionPerformed(evt);
            }
        });

        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });

        panel.setEditable(false);
        panel.setColumns(20);
        panel.setRows(5);
        jScrollPane1.setViewportView(panel);

        editar.setText("Editar");
        editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(guardar, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(factura)
                                        .addComponent(timbrado)
                                        .addComponent(provehedor)
                                        .addComponent(monto10)
                                        .addComponent(monto5, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buscar)
                                        .addGap(18, 18, 18)
                                        .addComponent(eliminar)))
                                .addGap(10, 10, 10)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(imprimir)
                        .addGap(18, 18, 18)
                        .addComponent(editar)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(timbrado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(provehedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(monto10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(monto5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(guardar)
                    .addComponent(imprimir)
                    .addComponent(eliminar)
                    .addComponent(buscar)
                    .addComponent(editar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
                                     
    String campo1 = factura.getText(); // Numero de Factura
    String campo2 = timbrado.getText();
    String campo3 = provehedor.getText();
    String campo4 = monto10.getText();
    String campo5 = monto5.getText();

    // Verificar si todos los campos están completos
    if (campo1.isEmpty() || campo2.isEmpty() || campo3.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, complete todos los campos.");
        return;
    }

    // Verificar si el número de factura ya existe
    for (int i = 0; i < facturaindex; i++) {
        if (facturas[i][0].equals(campo1)) {
            JOptionPane.showMessageDialog(null, "Factura ya existe.");
            return;
        }
    }

    // Guardar los datos en la matriz
    facturas[facturaindex][0] = campo1;
    facturas[facturaindex][1] = campo2;
    facturas[facturaindex][2] = campo3;
    facturas[facturaindex][3] = campo4;
    facturas[facturaindex][4] = campo5;

    facturaindex++;
    // Limpiar los campos de registro después de guardar
    factura.setText("");
    timbrado.setText("");
    provehedor.setText("");
    monto10.setText("");
    monto5.setText("");
    JOptionPane.showMessageDialog(null, "Factura Guardada");

    }//GEN-LAST:event_guardarActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
     String codigoBuscar = factura.getText();
        boolean encontrado = false;
        // Verificar si todos los campos estan completos
        if (codigoBuscar.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese el Numero de la Factura");
            return;
        }
        for (int i = 0; i < facturaindex; i++) {
            if (facturas[i][0].equals(codigoBuscar)) {
                // Mostrar los datos encontrado en los campos de texto
                timbrado.setText(facturas[i][1]);
                provehedor.setText(facturas[i][2]);
                monto10.setText(facturas[i][3]);
                monto5.setText(facturas[i][4]);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Codigo no encontrado.");
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
       String codigoEliminar = factura.getText();
        boolean encontrado = false;

        if (codigoEliminar.isEmpty()) {
            // muestra un mensaje de error y no guarda los datos
            JOptionPane.showMessageDialog(null, "Por favor, ingrese el codigo.");
            return;
        }
        for (int i = 0; i < facturaindex; i++) {
            if (facturas[i][0].equals(codigoEliminar)) {

                for (int j = i; j < facturaindex - 1; j++) {
                    facturas[j] = facturas[j + 1];
                }
                facturaindex--;
                encontrado = true;
                JOptionPane.showMessageDialog(null, "Factura Eliminada Correctamente.");
                break; // Salimos del bucle al encontrar y eliminamos la factura
            }
        }

        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Codigo no encontrado.");
        }
        // Limpiamos el campo de texto despues de eliminar
        factura.setText("");
        timbrado.setText("");
        provehedor.setText("");
        monto10.setText("");
        monto5.setText("");
    }//GEN-LAST:event_eliminarActionPerformed

    private void imprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimirActionPerformed
     
        // Creamos un StringBuilder para construir la cadena de texto que mostrara los datos 
        StringBuilder dfactura = new StringBuilder();

        for(int i = 0; i < facturaindex; i++){
            // Agregamos los datos de las facturas al StringBuilder
            dfactura.append("\t Factura Resgistrada\n")
            .append("Numero de Factura: ").append(facturas[i][0]).append("\n")
            .append("Timbrado: ").append(facturas[i][1]).append("\n")
            .append("Provehedor: ").append(facturas[i][2]).append("\n")
            .append("Monto 10%: ").append(facturas[i][3]).append("\n")
            .append("Monto 5%: ").append(facturas[i][4]).append("\n\n");
        }

        // Establecemos el texto generado en el campo 
        panel.setText(dfactura.toString());
    }//GEN-LAST:event_imprimirActionPerformed

    private void editarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarActionPerformed
                                    
    String codigoBuscar = factura.getText();
    boolean encontrado = false;

    // Verificar si todos los campos están completos
    if (codigoBuscar.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese el Numero de la Factura");
        return;
    }

    for (int i = 0; i < facturaindex; i++) {
        if (facturas[i][0].equals(codigoBuscar)) {
            // Actualizar los datos encontrados en la matriz
            facturas[i][1] = timbrado.getText();
            facturas[i][2] = provehedor.getText();
            facturas[i][3] = monto10.getText();
            facturas[i][4] = monto5.getText();

            encontrado = true;
            JOptionPane.showMessageDialog(null, "Factura Actualizada Correctamente.");
            break;
        }
    }

    if (!encontrado) {
        JOptionPane.showMessageDialog(null, "Codigo no encontrado.");
    }

    // Limpiar los campos de texto después de editar
    factura.setText("");
    timbrado.setText("");
    provehedor.setText("");
    monto10.setText("");
    monto5.setText("");

 
    }//GEN-LAST:event_editarActionPerformed

   
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
            java.util.logging.Logger.getLogger(registrofactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrofactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrofactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrofactura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrofactura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JButton editar;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField factura;
    private javax.swing.JButton guardar;
    private javax.swing.JButton imprimir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monto10;
    private javax.swing.JTextField monto5;
    private javax.swing.JTextArea panel;
    private javax.swing.JTextField provehedor;
    private javax.swing.JTextField timbrado;
    // End of variables declaration//GEN-END:variables
}
