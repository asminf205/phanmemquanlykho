/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import NhanVien.Login;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import sql.ConfigDialog;
import sql.ServerConfig;

/**
 *
 * @author HP
 */
public class FrLogin extends javax.swing.JFrame {

    public static int id;
    static String pass;
    static int role = 99;

    /**
     * Creates new form Login
     */
    public FrLogin() {
        configserver();
        initComponents();
        Time();
        setLocationRelativeTo(this);
        this.setResizable(false);
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
        txtUser = new javax.swing.JTextField();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtTime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nhân viên đăng nhập");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo-poly.png"))); // NOI18N

        txtUser.setText("admin");

        btnOK.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnOK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/green-ok-icon-2.png"))); // NOI18N
        btnOK.setText("Đăng nhập");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        btnCancel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Cancel.png"))); // NOI18N
        btnCancel.setText("Thoát");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Tên đăng nhập :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Mật khẩu :");

        txtPassword.setText("admin");
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 34, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 160, Short.MAX_VALUE)
        );

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/security_firewall_on.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Boy.png"))); // NOI18N
        jLabel5.setText("Chào mừng bạn đến FPT Polytechnic");

        txtTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Clock.png"))); // NOI18N
        txtTime.setText("dd/MM/yyyy HH:hh:mm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtUser)
                                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnOK)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(123, 123, 123))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2))
                                        .addGap(36, 36, 36)
                                        .addComponent(jLabel3))
                                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnOK)
                                    .addComponent(btnCancel))
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(37, 37, 37)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTime))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        if (txtUser.getText().isEmpty() && txtUser.getText().trim().length() == 0) {
            JOptionPane.showMessageDialog(null, "Không được bỏ trống tên đăng nhập");
            return;
        }
        if (new String(txtPassword.getPassword()).length() == 0) {
            JOptionPane.showMessageDialog(null, "Không được bỏ trống mật khẩu");
            return;
        }

        if (l.isAuthentication(txtUser.getText().trim(), new String(txtPassword.getPassword())) == 1) {
            id = l.getId();
            role = l.getRole();
            pass = l.getPass();

            // set trạng thái đăng nhập
            l.setTrangthai(1);
            l.updateTrangThai();

            FrLogin.this.setVisible(false);
            FrMain fr = new FrMain();
            fr.setVisible(rootPaneCheckingEnabled);
            fr.setLocationRelativeTo(this);
        } else if (l.isAuthentication(txtUser.getText().trim(), new String(txtPassword.getPassword())) == 2) {
            // set trạng thái đăng nhập
            //      l.setTrangthai(0);
            //  l.updateTrangThai();
            JOptionPane.showMessageDialog(null, "Tài khoản đang đăng nhập ở một nơi khác.   ");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Sai tên đăng nhập hoặc mật khẩu");
            return;
        }
    }//GEN-LAST:event_btnOKActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:

        if (JOptionPane.showConfirmDialog(null, "Thoát chương trình ?", "Thoát", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            Login l = new Login();
            if (txtUser.getText().isEmpty() && txtUser.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Không được bỏ trống tên đăng nhập");
                return;
            }
            if (new String(txtPassword.getPassword()).length() == 0) {
                JOptionPane.showMessageDialog(null, "Không được bỏ trống mật khẩu");
                return;
            }

            if (l.isAuthentication(txtUser.getText().trim(), new String(txtPassword.getPassword())) == 1) {
                id = l.getId();
                role = l.getRole();
                pass = l.getPass();
                // set trạng thái đăng nhập
                l.setTrangthai(1);
                l.updateTrangThai();

                FrLogin.this.setVisible(false);
                FrMain fr = new FrMain();
                fr.setVisible(rootPaneCheckingEnabled);
                fr.setLocationRelativeTo(this);
            } else if (l.isAuthentication(txtUser.getText().trim(), new String(txtPassword.getPassword())) == 2) {

                JOptionPane.showMessageDialog(null, "Tài khoản đang đăng nhập ở một nơi khác.   ");
                return;
            } else {
                JOptionPane.showMessageDialog(null, "Sai tên đăng nhập hoặc mật khẩu");
                return;
            }
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrLogin().setVisible(true);
            }
        });
    }

    public void Time() {
        new Thread() {
            public void run() {
                while (true) {
                    try {
                        Date now = new Date();
                        SimpleDateFormat format = new SimpleDateFormat();
                        format.applyPattern("dd-MM-yyyy HH:hh:mm:ss");
                        String time = format.format(now);
                        txtTime.setText(time);
                        Thread.sleep(1000);
                    } catch (Exception ex) {
                        break;
                    }
                }
            }
        }.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JLabel txtTime;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

    private void configserver() {
        ServerConfig server = new ServerConfig();
        Connection cn = null;
        int stateFromFile = server.openConnectionFromFile();
        if (stateFromFile == 0) {
            cn = server.getConnection();
        } else if (stateFromFile == -1) {
            //Show configuration dialog
            ConfigDialog configDialog = new ConfigDialog(this);
            configDialog.setLocation(300, 150);
            configDialog.setVisible(true);

            String dbServerName = "", dbName = "", dbUsername = "", dbPassword = "", dbPort = "";
            if (configDialog.validated == true) {
                dbServerName = configDialog.getServerName();
                dbName = configDialog.getDatabaseName();
                dbUsername = configDialog.getUsername();
                dbPassword = configDialog.getPassword();
                dbPort = configDialog.getPort();

                server = new ServerConfig(dbServerName, dbName, dbUsername, dbPassword, dbPort);
                int state = server.openConnection();
                if (state == -1) {
                    JOptionPane.showMessageDialog(this, "Có lỗi trong lúc kết nối"
                            + " Xin vui lòng thử lại.");
                    System.exit(0);
                } else if (state == 0) {
                    //Save configuration to file
                    server.saveConnectionParametersToFile(dbServerName, dbName,
                            dbUsername, dbPassword, dbPort);
                    cn = server.getConnection();
                }
            } else {
                System.exit(0);
            }
        }
    }
}
