/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import SanPham.MaloaiSP;
import SanPham.Sanpham;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class DialogLoaiSanPham extends javax.swing.JDialog {

    /**
     * Creates new form DialogAbout
     */
    public DialogLoaiSanPham(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initModel();
        setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        grLoaiSanPham = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtTenLSP = new javax.swing.JTextField();
        btnThemSP = new javax.swing.JButton();
        btnCapNhatSP = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Loại sản phẩm");

        grLoaiSanPham.setAutoCreateRowSorter(true);
        grLoaiSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Loại SP", "Tên Loại SP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        grLoaiSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                grLoaiSanPhamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(grLoaiSanPham);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Tên loại sản phẩm:");

        txtTenLSP.setEnabled(false);

        btnThemSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnThemSP.setText("Thêm");
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        btnCapNhatSP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCapNhatSP.setText("Cập nhật");
        btnCapNhatSP.setEnabled(false);
        btnCapNhatSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatSPActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setEnabled(false);
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnReset.setText("Huỷ bỏ");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTenLSP))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCapNhatSP, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTenLSP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnCapNhatSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThemSP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void grLoaiSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_grLoaiSanPhamMouseClicked
        // TODO add your handling code here:
         fillDataFromTable();
         btnXoa.setEnabled(true);
         btnCapNhatSP.setEnabled(true);
         btnThemSP.setEnabled(false);
    }//GEN-LAST:event_grLoaiSanPhamMouseClicked

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        // TODO add your handling code here:
        if (btnThemSP.getText().equalsIgnoreCase("Thêm")) {
            txtTenLSP.setEnabled(true);
            btnThemSP.setText("Lưu");
            btnCapNhatSP.setEnabled(false);
            btnXoa.setEnabled(false);
        } else {
            if (txtTenLSP.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Không được bỏ trống tên sản phẩm");
                return;
            }
            MaloaiSP maloaiSP = new MaloaiSP();
            if (maloaiSP.findname(txtTenLSP.getText().toString())) {
                JOptionPane.showMessageDialog(null, "Tên loại sản phẩm đã tồn tại");
                return;
            }
            
            MaloaiSP m = new MaloaiSP(txtTenLSP.getText());
            if (m.insertMaLoaiSP(m)>0) {
                initModel();
                JOptionPane.showMessageDialog(null, "Thêm thành công");
            }else{
                JOptionPane.showMessageDialog(null, "Thêm thất bại");
            }
           setNull();
        }
    }//GEN-LAST:event_btnThemSPActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        setNull();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int i = grLoaiSanPham.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Chưa chọn sản phẩm cần xóa");
            return;
        }

        MaloaiSP b = new MaloaiSP(txtTenLSP.getText().toString(),Integer.parseInt(ma));
        Sanpham sp = new Sanpham();
        if (sp.findMaloaisp(Integer.parseInt(ma))) {
            JOptionPane.showMessageDialog(null, "Sản phẩm đã có trong kho");
            return;
        }
        
        int r = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa " + txtTenLSP.getText().toString() + "?", "   ", JOptionPane.YES_NO_OPTION);
        if (r == JOptionPane.YES_OPTION) {
            if (b.delete(b) > 0) {
                JOptionPane.showMessageDialog(null, "Xóa thành công");
                model.removeRow(i);
                setNull();
            }

        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCapNhatSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatSPActionPerformed
        // TODO add your handling code here:
        int i = grLoaiSanPham.getSelectedRow();
        if (i < 0) {
            JOptionPane.showMessageDialog(null, "Chưa chọn dòng để cập nhật thông tin");
            return;
        }
        if (btnCapNhatSP.getText().equalsIgnoreCase("Cập nhật")) {
            txtTenLSP.setEnabled(true);
            //txtTonKho.setEnabled(true);
            btnCapNhatSP.setText("Lưu");
            btnThemSP.setEnabled(false);
            btnXoa.setEnabled(false);
        }else {
            if (txtTenLSP.getText().trim().length() == 0) {
                JOptionPane.showMessageDialog(null, "Không được bỏ trống Tên Sản Phẩm");
                return;
            }
            MaloaiSP b = new MaloaiSP();
            List<MaloaiSP> list = b.getList();
            for (int j = 0; j < list.size(); j++) {
                String tenlsp = txtTenLSP.getText().toString();
                MaloaiSP na = list.get(j);
                String maloai = String.valueOf(na.getMaLoaiSP());
                if ((!maloai.equalsIgnoreCase(ma) && na.getTenLoaiSP().equalsIgnoreCase(tenlsp))) {
                    JOptionPane.showMessageDialog(null, "Trùng tên sản phẩm ");
                    return;
                }
                
                
            }
            MaloaiSP b2 = new MaloaiSP(txtTenLSP.getText().toString(),Integer.parseInt(ma));
            if (b2.update(b2) > 0) {
                JOptionPane.showMessageDialog(null, "Cập nhật thành công");
                initModel();
                setNull();
            } else {
                JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
            }
        }
    }//GEN-LAST:event_btnCapNhatSPActionPerformed

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
            java.util.logging.Logger.getLogger(DialogLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogLoaiSanPham dialog = new DialogLoaiSanPham(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhatSP;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnThemSP;
    private javax.swing.JButton btnXoa;
    private javax.swing.JTable grLoaiSanPham;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtTenLSP;
    // End of variables declaration//GEN-END:variables
    
    DefaultTableModel model;
    private void initModel() {
        MaloaiSP mal = new MaloaiSP();
        model = (DefaultTableModel) grLoaiSanPham.getModel();
        model.setRowCount(0);
        for (MaloaiSP lsp : mal.getList()) {
            model.addRow(lsp.toVector());
        }
    }
    private static String ma;
    private void fillDataFromTable() {
        //lay chi so dong duoc chon tren Table
        int i = grLoaiSanPham.getSelectedRow();

        if (i < 0) {
            return;
        }
        MaloaiSP maloai = new MaloaiSP();
        List<MaloaiSP> loaisp = maloai.getList();
        ma = grLoaiSanPham.getValueAt(i, 0).toString();
        String tenloaisp = grLoaiSanPham.getValueAt(i, 1).toString();
        
        txtTenLSP.setText(tenloaisp);
    }
    
    private void setNull(){
        txtTenLSP.setText(null);
        ma = null;
        txtTenLSP.setEnabled(false);
        btnThemSP.setEnabled(true);
        btnXoa.setEnabled(false);
        btnCapNhatSP.setEnabled(false);
        btnThemSP.setText("Thêm");
        btnCapNhatSP.setText("Cập nhật");
    }
}
