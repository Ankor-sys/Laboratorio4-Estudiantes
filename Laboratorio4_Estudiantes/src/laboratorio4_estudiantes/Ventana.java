/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio4_estudiantes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author SEBAS
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
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

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_buscar = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_correo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_edad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_celular = new javax.swing.JTextField();
        label_status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Ingresa el código del alumno: ");

        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("Nombre");

        jButton1.setText("Registrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Correo");

        jLabel5.setText("Edad:");

        txt_edad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_edadActionPerformed(evt);
            }
        });

        jLabel6.setText("Celular");

        label_status.setText("Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txt_ID)
                    .addComponent(jLabel2)
                    .addComponent(txt_nombre)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(label_status))
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txt_correo)
                    .addComponent(txt_edad)
                    .addComponent(jLabel6)
                    .addComponent(txt_celular))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_celular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(label_status)))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Codigo que permite actualizar registros en la base de datos
        try {
            String ID = txt_buscar.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "Cagada1234");
            PreparedStatement pst = cn.prepareStatement("update estudiantes set ID_Estudiante = ?, NombreEstudiante = ? , CorreoEstudiante = ?, Edad =?, NumeroCelular = ? where ID_Estudiante = " + ID);

            pst.setString(1, txt_ID.getText().trim());
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_correo.getText().trim());
            pst.setString(4, txt_edad.getText().trim());
            pst.setString(5, txt_celular.getText().trim());
            pst.executeUpdate();

            label_status.setText("Modificación exitosa.");

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Codigo que permite borrar registros en la base de datos
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "Cagada1234");
            PreparedStatement pst = cn.prepareStatement("delete from estudiantes where ID_Estudiante = ?");

            pst.setString(1, txt_buscar.getText().trim());
            pst.executeUpdate();

            txt_ID.setText("");
            txt_nombre.setText("");
            txt_correo.setText("");
            txt_edad.setText("");
            txt_celular.setText("");

            label_status.setText("Registro eliminado.");

        } catch (Exception e) {
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Codigo que permite consultar registros en la base de datos
        try{
            //local host y el nombre de la base de datos y la contraseñña
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "Cagada1234");
            //Esto permitirá el buscar registro a traves del ID
            PreparedStatement pst = cn.prepareStatement("select * from estudiantes where ID_Estudiante = ?");
            //El parametro 1 es de que solo un ? esta llenando y entra lo del txt
            pst.setString(1, txt_buscar.getText().trim());

            //El result del query, lo que ira a traer
            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                txt_ID.setText(rs.getString("ID_Estudiante"));
                txt_nombre.setText(rs.getString("NombreEstudiante"));
                txt_correo.setText(rs.getString("CorreoEstudiante"));
                txt_edad.setText(rs.getString("Edad"));
                txt_celular.setText(rs.getString("Celular"));
                JOptionPane.showMessageDialog(null, "Alumno registrado.");
            } else {
                JOptionPane.showMessageDialog(null, "Alumno no registrado.");
            }

        }catch (Exception e){

        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Codigo que permite insertar registros en al base de datos
        try{
            //local host y el nombre de la base de datos y la contraseña
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ins", "root", "Cagada1234");
            //Esto permitirá el insert
            PreparedStatement pst = cn.prepareStatement("insert into estudiantes values(?,?,?,?,?)");
            //El primer parametro de cada setString es cada ?
            pst.setString(1, txt_ID.getText().trim());
            pst.setString(2, txt_nombre.getText().trim());
            pst.setString(3, txt_correo.getText().trim());
            pst.setString(4, txt_edad.getText().trim());
            pst.setString(5, txt_celular.getText().trim());
            pst.executeUpdate();

            txt_ID.setText("");
            txt_nombre.setText("");
            txt_correo.setText("");
            txt_edad.setText("");
            txt_celular.setText("");
            label_status.setText("Registro exitoso.");
        }catch (Exception e){

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_edadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_edadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_edadActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txt_ID;
    private javax.swing.JTextField txt_buscar;
    private javax.swing.JTextField txt_celular;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_edad;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
