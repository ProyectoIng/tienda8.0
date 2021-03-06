/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;

import Controlador.DaoUsuarioXml;
import Modelo.Usuario;
import TiendaVirtual.EscribeFichero;
import TiendaVirtual.LeerFichero;
import java.io.IOException;
import java.util.Calendar;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import org.apache.log4j.Logger;

/**
 *
 * @author luis
 */
public class PantallaCompradorRegistrar extends javax.swing.JFrame {

    static Usuario usuario;
    LeerFichero leer =  new LeerFichero();
    EscribeFichero escribe = new EscribeFichero();
    private static String idaux;//Auxiliar del id del usuario
    private static int intIdUsuario;//valor entero para poder sumar el id
    
    DaoUsuarioXml datosUsuario = new DaoUsuarioXml();//Creo el objeto de datosUsuario para insertar el usuario en el xml
    private boolean resultado = false;//un boolean para obtener un resultado de ingreso del usuario
    
    /**
     * Creates new form PantallaCompradorRegistrar
     */
    public PantallaCompradorRegistrar() {
        initComponents();
        JLBID.setVisible(false);
        JLBId.setVisible(false);
        setLocationRelativeTo(null);
        setResizable(false);
        
        try {//obtengo el id desde el archivo idUsuario
            idaux = leer.obtenerId("idUsuario.txt");
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(PantallaAdminAgregarProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JLBId.setText(idaux);//Le asigno al jlblid el id del archivo
       
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
        Logo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        JTFCorreo = new javax.swing.JTextField();
        JTFPassword = new javax.swing.JTextField();
        JTFNombre = new javax.swing.JTextField();
        JTFApellido = new javax.swing.JTextField();
        JTFCedula = new javax.swing.JTextField();
        JTFUsername = new javax.swing.JTextField();
        JBAgregarUsuario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        JTFDireccion = new javax.swing.JTextField();
        JTFMetodoDePago = new javax.swing.JTextField();
        JLBId = new javax.swing.JLabel();
        JLBID = new javax.swing.JLabel();
        jDFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jDFechaRegistro = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        Logo.setText("                      ");
        Logo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Logo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoMouseClicked(evt);
            }
        });

        jLabel2.setText("Ingresa");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(413, 413, 413)
                .addComponent(jLabel2)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Logo)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        JTFPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFPasswordActionPerformed(evt);
            }
        });

        JTFApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFApellidoActionPerformed(evt);
            }
        });

        JTFUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFUsernameActionPerformed(evt);
            }
        });

        JBAgregarUsuario.setText("Registrarme");
        JBAgregarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAgregarUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("CI/Pasaporte");

        jLabel6.setText("Username");

        jLabel7.setText("Correo");

        jLabel8.setText("Dirección Física");

        jLabel9.setText("Password");

        jLabel10.setText("Fecha de Nacimiento");

        jLabel12.setText("Método de Pago");

        jLabel13.setText("Fecha de Registro");

        JLBID.setText("ID:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4))
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addGap(53, 53, 53)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JTFCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(JTFPassword)
                            .addComponent(JTFApellido, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFUsername, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTFNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(JTFCorreo, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBAgregarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(143, 143, 143)
                                .addComponent(JLBID, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(JLBId, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTFMetodoDePago, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                                    .addComponent(JTFDireccion)
                                    .addComponent(jDFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jDFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(JTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JTFApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel10))
                    .addComponent(jDFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(JTFMetodoDePago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(JTFUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTFPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addComponent(jDFechaRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTFCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(JBAgregarUsuario))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLBID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLBId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PantallaIngresar().setVisible(true);
            }
        });
        this.dispose();

    }//GEN-LAST:event_jLabel2MouseClicked

    private void JTFPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFPasswordActionPerformed

    private void JTFApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFApellidoActionPerformed

    private void JTFUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFUsernameActionPerformed

    private void JBAgregarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAgregarUsuarioActionPerformed

        String nombre,apellido,cedula,username,password,correo,direccionFisica,fechaDeNacimiento,metodoDePago,fechaDeRegistro,rol,idUsuario,estadoUsuario;

        //asignación de valores al objeto
        nombre = JTFNombre.getText();
        apellido = JTFApellido.getText();
        cedula = JTFCedula.getText();
        username = JTFUsername.getText();
        password = JTFPassword.getText();
        correo = JTFCorreo.getText();
        direccionFisica = JTFDireccion.getText();
        fechaDeNacimiento = String.valueOf(jDFechaNacimiento.getCalendar().get(Calendar.DATE)) +"/"+ String.valueOf(jDFechaNacimiento.getCalendar().get(Calendar.MONTH)) +"/"+ String.valueOf(jDFechaNacimiento.getCalendar().get(Calendar.YEAR));
        metodoDePago = JTFMetodoDePago.getText();
        fechaDeRegistro = String.valueOf(jDFechaRegistro.getCalendar().get(Calendar.DATE)) +"/"+ String.valueOf(jDFechaRegistro.getCalendar().get(Calendar.MONTH)) +"/"+ String.valueOf(jDFechaRegistro.getCalendar().get(Calendar.YEAR));
        
        rol = "Comprador";
        idUsuario = JLBId.getText();
        estadoUsuario = "Activo";//asigno los valores de los campos de texto a las variables

        //Creo un objeto de tipo usuario
        Usuario user = new Usuario(nombre, apellido, cedula, username, password, correo, direccionFisica, fechaDeNacimiento, metodoDePago, fechaDeRegistro, rol, idUsuario, estadoUsuario);

        //Verifico que los campos no estén vacíos
        if(JTFNombre.getText().isEmpty() || JTFApellido.getText().isEmpty() || JTFCedula.getText().isEmpty() || JTFUsername.getText().isEmpty() || JTFPassword.getText().isEmpty() || JTFCorreo.getText().isEmpty() || JTFDireccion.getText().isEmpty()   || jDFechaNacimiento.getDateFormatString().isEmpty() ||  JTFMetodoDePago.getText().isEmpty() || jDFechaRegistro.getDateFormatString().isEmpty()){
            JOptionPane.showMessageDialog(null, "Por favor llene todos los campos", "Error al Agregar Categoria", JOptionPane.ERROR_MESSAGE);

            //log4j
            Logger log = Logger.getLogger("Logger de Ejemplo");
            
        }
        else{

            resultado = datosUsuario.agregarUsuario(user);//Llamo a la funcion agregar dentro del daousuario
            if (resultado == true) {
                JOptionPane.showMessageDialog(null, "Usuario agregado con exito!", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
                //limpia();
                java.awt.EventQueue.invokeLater(new Runnable() {
                   
                   public void run() {
                   new PantallaInicialComprador(usuario).setVisible(true);
                   }
                   });
                   this.dispose();
                //log4j
                Logger log = Logger.getLogger("Logger de Ejemplo");
                log.info("usuario añadido satisfactoriamente");

                //GESTIÓN DEL ID
                intIdUsuario = Integer.parseInt(idaux);//parseo a int el id
                intIdUsuario++;//le sumo uno al id
                idaux = Integer.toString(intIdUsuario);//Parseo a string el id
                escribe.Escribir("idUsuario.txt", idaux);//escribo el id en el archivo

            } else {
                JOptionPane.showMessageDialog(null, "Operacion Fallida", "Error", JOptionPane.ERROR_MESSAGE);

            }

        }
    }//GEN-LAST:event_JBAgregarUsuarioActionPerformed

    private void LogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoMouseClicked
        // TODO add your handling code here:
        
        java.awt.EventQueue.invokeLater(new Runnable() {
                   
                   public void run() {
                   new PantallaInicialComprador(usuario).setVisible(true);
                   }
                   });
                   this.dispose(); 
    }//GEN-LAST:event_LogoMouseClicked

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
            java.util.logging.Logger.getLogger(PantallaCompradorRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaCompradorRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaCompradorRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaCompradorRegistrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaCompradorRegistrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAgregarUsuario;
    private javax.swing.JLabel JLBID;
    private javax.swing.JLabel JLBId;
    private javax.swing.JTextField JTFApellido;
    private javax.swing.JTextField JTFCedula;
    private javax.swing.JTextField JTFCorreo;
    private javax.swing.JTextField JTFDireccion;
    private javax.swing.JTextField JTFMetodoDePago;
    private javax.swing.JTextField JTFNombre;
    private javax.swing.JTextField JTFPassword;
    private javax.swing.JTextField JTFUsername;
    private javax.swing.JLabel Logo;
    private com.toedter.calendar.JDateChooser jDFechaNacimiento;
    private com.toedter.calendar.JDateChooser jDFechaRegistro;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
