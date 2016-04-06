package presentacion;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AdminUsuarios extends javax.swing.JFrame {
    
    private logica.Empleado empleado;
    
    public AdminUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        listarUsuariosRegistrados();
    }
    
    public void listarUsuariosRegistrados(){
        
        logica.ConsultasEmpleado empleados = new logica.ConsultasEmpleado();
        //Creamos un modelo de tabla
        TableModel modelo = new DefaultTableModel();
        
        //Extraemos la lista de empleados dentro de un modelo
        modelo=empleados.listarEmpleados();

        //Asociamos el modelo al JTable
        this.tbUsuariosRegistrados.setModel(modelo);
        
        
        
    }
    
    public boolean verificarCamposVacios(){
        boolean bandera = false;
        if (txtNombre.getText().length()==0 || txtApellidoPaterno.getText().length()==0 || txtApellidoMaterno.getText().length()==0 || txtNickName.getText().length()==0 || txtPassword.getText().length()==0) {
            JOptionPane.showMessageDialog(null, "Faltan campos por rellenar");
            bandera = true;
        }
        return bandera;
            
    }
    
    public void guardarDatos() {
        empleado = new logica.Empleado();
        empleado.setNombre(txtNombre.getText());
        empleado.setApellido_paterno(txtApellidoPaterno.getText());
        empleado.setApellido_materno(txtApellidoMaterno.getText());
        empleado.setNickname(txtNickName.getText());
        empleado.setPassword(txtPassword.getText());
        
        logica.ConsultasEmpleado datosEmpleado = new logica.ConsultasEmpleado();
        if (!datosEmpleado.registrarEmpleado(empleado))  {
            JOptionPane.showMessageDialog(rootPane, "Empleado Registrado con éxito");
            limpiarCampos();
        }
        else
            JOptionPane.showMessageDialog(rootPane, "Fallo al registrar un nuevo Empleado");
    }
    
    public void limpiarCampos() {
        this.txtNombre.setText("");
        this.txtApellidoMaterno.setText("");
        this.txtApellidoPaterno.setText("");
        this.txtNickName.setText("");
        this.txtPassword.setText("");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtNickName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbUsuariosRegistrados = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuarios");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(254, 254, 254));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del cajero"));
        jPanel1.setForeground(new java.awt.Color(254, 254, 254));

        jLabel1.setText("Nombre (s):");

        jLabel2.setText("Apellido Paterno:");

        jLabel3.setText("Apellido Materno:");

        jLabel4.setText("Nickname:");

        jLabel5.setText("Contraseña:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtApellidoPaterno)
                    .addComponent(txtApellidoMaterno)
                    .addComponent(txtNickName)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNickName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 600, 280));

        jPanel2.setBackground(new java.awt.Color(222, 104, 0));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(btnRegistrar, new java.awt.GridBagConstraints());

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancelarRegistro.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancelar, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 900, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/oxxo.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, -1, -1));

        jPanel3.setBackground(new java.awt.Color(254, 254, 254));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuarios Registrados"));

        tbUsuariosRegistrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido Paterno", "Apellido Materno", "Nickname"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbUsuariosRegistrados.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbUsuariosRegistrados);
        if (tbUsuariosRegistrados.getColumnModel().getColumnCount() > 0) {
            tbUsuariosRegistrados.getColumnModel().getColumn(0).setResizable(false);
            tbUsuariosRegistrados.getColumnModel().getColumn(1).setResizable(false);
            tbUsuariosRegistrados.getColumnModel().getColumn(2).setResizable(false);
            tbUsuariosRegistrados.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 744, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 830, 160));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/inicio.png"))); // NOI18N
        jMenu1.setText("Inicio");

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/principal.png"))); // NOI18N
        jMenuItem3.setText("Principal");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir_1.png"))); // NOI18N
        jMenuItem1.setText("Cerrar sesión");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/permisos.png"))); // NOI18N
        jMenu2.setText("Usuarios");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/producto.png"))); // NOI18N
        jMenu3.setText("Productos");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ayuda.png"))); // NOI18N
        jMenu4.setText("Ayuda");

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acerca_de.png"))); // NOI18N
        jMenuItem2.setText("Acerca de");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        
        if (!verificarCamposVacios()) {
            guardarDatos();
        }
        
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        AdminAcercaDe acercaDe= new AdminAcercaDe();
        acercaDe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        AdminInicio adminInicio = new AdminInicio();
        adminInicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Sesion sesion = new Sesion();
        sesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        AdminProductos adminProductos = new AdminProductos();
        adminProductos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu3MouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(AdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbUsuariosRegistrados;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtNickName;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
