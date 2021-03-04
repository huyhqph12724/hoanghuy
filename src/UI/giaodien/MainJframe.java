/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.GiaoDien;

import Tienich.Helper.Auth;
import Tienich.Helper.DialogHelper;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author Admin
 */
public class MainJframe extends javax.swing.JFrame {

    /**
     * Creates new form MainJframe
     */
    public MainJframe() {
        initComponents();
        initClock();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }

    public void initClock() {
        new Timer(100, new ActionListener() {
            SimpleDateFormat format = new SimpleDateFormat("hh:mm:ss a");

            public void actionPerformed(ActionEvent e) {
                lblClock.setText(format.format(new Date()));
            }
        }).start();
    }

    void openLogin() {
        new DangNhapJframe().setVisible(true);
    }

    void openWelcome() {
        new ChaoJdialog().setVisible(true);
    }

    void logoff() {

        if (Auth.authenticated()) {
            Auth.logoff();
            this.setVisible(false);
            DialogHelper.alert(this, "Đã đăng xuất!");
            new DangNhapJframe().setVisible(true);

        } else {
            DialogHelper.alert(this, "Bạn chưa đăng nhập!");
        }

    }

    void exit() {

        if (DialogHelper.confirm(this, "Bạn thực sự muốn kết thúc?")) {
            System.exit(0);
        }
    }
    Integer ind0 = 0;
    Integer ind1 = 0;
    Integer ind2 = 0;
    Integer ind3 = 0;
    ThongKeJframe thtk0 = new ThongKeJframe(0);
    ThongKeJframe thtk1 = new ThongKeJframe(1);
    ThongKeJframe thtk2 = new ThongKeJframe(2);
    ThongKeJframe thtk3 = new ThongKeJframe(3);

    void openThongKe(int index) {

        if (Auth.authenticated()) {
            if (index == 0) {
                if (ind0 == 0) {
                    thtk0.setVisible(true);
                    ind0 = 1;
                }
                if (ind0 == 1) {
                    thtk0.dispose();
                    thtk0.setVisible(true);
                }
            }
            if (index == 1) {
                if (ind1 == 0) {
                    thtk1.setVisible(true);
                    ind1 = 1;
                }
                if (ind1 == 1) {
                    thtk1.dispose();
                    thtk1.setVisible(true);
                }
            }
            if (index == 2) {
                if (ind2 == 0) {
                    thtk2.setVisible(true);
                    ind2 = 1;
                }
                if (ind2 == 1) {
                    thtk2.dispose();
                    thtk2.setVisible(true);
                }
            }
            if (index == 3) {
                if (ind3 == 0) {
                    thtk3.setVisible(true);
                    ind3 = 1;
                }
                if (ind3 == 1) {
                    thtk3.dispose();
                    thtk3.setVisible(true);
                }
            }

        } else {
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    QLNhanVienJFrame qlnv = new QLNhanVienJFrame();

    void openNhanVien() {
        if (Auth.authenticated()) {
            if (qlnv == null) {
                qlnv.setVisible(true);
            } else {
                qlnv.dispose();
                qlnv.setVisible(true);
            }
        } else {
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    QLKhoaHocJframe qlkh = new QLKhoaHocJframe();

    void openKhoaHoc() {
        if (Auth.authenticated()) {
            if (qlkh == null) {
                qlkh.setVisible(true);
            } else {
                qlkh.dispose();
                qlkh.setVisible(true);
            }
        } else {
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    QLChuyenDeJframe qlcd = new QLChuyenDeJframe();

    void openChuyenDe() {
        if (Auth.authenticated()) {
            if (qlcd == null) {
                qlcd.setVisible(true);
            } else {
                qlcd.dispose();
                qlcd.setVisible(true);
            }
        } else {
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }
    QLNguoiHocJframe qlnh = new QLNguoiHocJframe();

    void openNguoiHoc() {
        if (Auth.authenticated()) {

            new QLNguoiHocJframe().setVisible(true);
        } else {
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void openHocVien() {
        if (Auth.authenticated()) {

            new QLHocVienJframe().setVisible(true);
        } else {
            DialogHelper.alert(this, "Vui lòng đăng nhập!");
        }
    }

    void openAbout() {
        new ChaoJdialog().setVisible(true);
    }

    void openWebsite() {
        try {
            Desktop.getDesktop().browse(new File("help/Ap.html").toURI());
        } catch (IOException ex) {
            DialogHelper.alert(this, "Không tìm thấy file hướng dẫn!");
            System.out.println(ex);
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

        jToolBar1 = new javax.swing.JToolBar();
        btnlogout = new javax.swing.JButton();
        btnstop = new javax.swing.JButton();
        btnchuyende = new javax.swing.JButton();
        btnnguoihoc = new javax.swing.JButton();
        btnkhoahoc = new javax.swing.JButton();
        btnhocvien = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnhethong = new javax.swing.JMenu();
        mnidoimk = new javax.swing.JMenuItem();
        mnidangxuat = new javax.swing.JMenuItem();
        mniketthuc = new javax.swing.JMenuItem();
        mnquanly = new javax.swing.JMenu();
        mnichuyende = new javax.swing.JMenuItem();
        mnikhoahoc = new javax.swing.JMenuItem();
        mninguoihoc = new javax.swing.JMenuItem();
        mnihocvien = new javax.swing.JMenuItem();
        mninhanvien = new javax.swing.JMenuItem();
        mnthongke = new javax.swing.JMenu();
        mninguoihoctungnam = new javax.swing.JMenuItem();
        mnibangdiemtungkhoa = new javax.swing.JMenuItem();
        mnidiemtungkhoa = new javax.swing.JMenuItem();
        mnidoanhthu = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jToolBar1.setRollover(true);

        btnlogout.setIcon(new javax.swing.ImageIcon("E:\\DU_AN_MAU\\QLDT\\src\\Image\\Log out.png")); // NOI18N
        btnlogout.setText("Đăng xuất");
        btnlogout.setFocusable(false);
        btnlogout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlogout.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        jToolBar1.add(btnlogout);

        btnstop.setIcon(new javax.swing.ImageIcon("E:\\DU_AN_MAU\\QLDT\\src\\Image\\Stop.png")); // NOI18N
        btnstop.setText("Kết thúc");
        btnstop.setFocusable(false);
        btnstop.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnstop.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstopActionPerformed(evt);
            }
        });
        jToolBar1.add(btnstop);

        btnchuyende.setIcon(new javax.swing.ImageIcon("E:\\DU_AN_MAU\\QLDT\\src\\Image\\Lists.png")); // NOI18N
        btnchuyende.setText("Chuyên đề");
        btnchuyende.setFocusable(false);
        btnchuyende.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnchuyende.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnchuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchuyendeActionPerformed(evt);
            }
        });
        jToolBar1.add(btnchuyende);

        btnnguoihoc.setIcon(new javax.swing.ImageIcon("E:\\DU_AN_MAU\\QLDT\\src\\Image\\Boy.png")); // NOI18N
        btnnguoihoc.setText("Người học");
        btnnguoihoc.setFocusable(false);
        btnnguoihoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnnguoihoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnnguoihoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnguoihocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnnguoihoc);

        btnkhoahoc.setIcon(new javax.swing.ImageIcon("E:\\DU_AN_MAU\\QLDT\\src\\Image\\Certificate.png")); // NOI18N
        btnkhoahoc.setText("Khóa học");
        btnkhoahoc.setFocusable(false);
        btnkhoahoc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnkhoahoc.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnkhoahoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkhoahocActionPerformed(evt);
            }
        });
        jToolBar1.add(btnkhoahoc);

        btnhocvien.setIcon(new javax.swing.ImageIcon("E:\\DU_AN_MAU\\QLDT\\src\\Image\\Clien list.png")); // NOI18N
        btnhocvien.setText("Học viên");
        btnhocvien.setFocusable(false);
        btnhocvien.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnhocvien.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnhocvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhocvienActionPerformed(evt);
            }
        });
        jToolBar1.add(btnhocvien);

        jButton7.setIcon(new javax.swing.ImageIcon("E:\\DU_AN_MAU\\QLDT\\src\\Image\\Globe.png")); // NOI18N
        jButton7.setText("Hướng dẫn");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jToolBar1.add(jButton7);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Hệ quản lý đào tạo");

        jLabel2.setIcon(new javax.swing.ImageIcon("E:\\DU_AN_MAU\\QLDT\\src\\Image\\Clock.png")); // NOI18N

        lblClock.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblClock.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 424, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(lblClock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        mnhethong.setText("Hệ thống");

        mnidoimk.setText("Đổi mật khẩu");
        mnidoimk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnidoimkActionPerformed(evt);
            }
        });
        mnhethong.add(mnidoimk);

        mnidangxuat.setText("Đăng xuất");
        mnidangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnidangxuatActionPerformed(evt);
            }
        });
        mnhethong.add(mnidangxuat);

        mniketthuc.setText("Kết thúc");
        mniketthuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniketthucActionPerformed(evt);
            }
        });
        mnhethong.add(mniketthuc);

        jMenuBar1.add(mnhethong);

        mnquanly.setText("Quản lý");

        mnichuyende.setText("Chuyên Đề");
        mnichuyende.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnichuyendeActionPerformed(evt);
            }
        });
        mnquanly.add(mnichuyende);

        mnikhoahoc.setText("Khóa Học");
        mnikhoahoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnikhoahocActionPerformed(evt);
            }
        });
        mnquanly.add(mnikhoahoc);

        mninguoihoc.setText("Người học");
        mninguoihoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mninguoihocActionPerformed(evt);
            }
        });
        mnquanly.add(mninguoihoc);

        mnihocvien.setText("Học viên");
        mnihocvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnihocvienActionPerformed(evt);
            }
        });
        mnquanly.add(mnihocvien);

        mninhanvien.setText("Nhân viên");
        mninhanvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mninhanvienActionPerformed(evt);
            }
        });
        mnquanly.add(mninhanvien);

        jMenuBar1.add(mnquanly);

        mnthongke.setText("Thống kê");

        mninguoihoctungnam.setText("Người học từng năm");
        mninguoihoctungnam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mninguoihoctungnamActionPerformed(evt);
            }
        });
        mnthongke.add(mninguoihoctungnam);

        mnibangdiemtungkhoa.setText("Bảng điểm từng khóa");
        mnibangdiemtungkhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnibangdiemtungkhoaActionPerformed(evt);
            }
        });
        mnthongke.add(mnibangdiemtungkhoa);

        mnidiemtungkhoa.setText("Điểm từng khóa học");
        mnidiemtungkhoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnidiemtungkhoaActionPerformed(evt);
            }
        });
        mnthongke.add(mnidiemtungkhoa);

        mnidoanhthu.setText("Doanh thu chuyên đề");
        mnidoanhthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnidoanhthuActionPerformed(evt);
            }
        });
        mnthongke.add(mnidoanhthu);

        jMenuBar1.add(mnthongke);

        jMenu4.setText("Trợ Giúp");

        jMenuItem13.setText("Hướng dẫn sử dụng");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem13);

        jMenuItem14.setText("Giới thiệu sản phẩm");
        jMenu4.add(jMenuItem14);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 456, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnidangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnidangxuatActionPerformed
        // TODO add your handling code here:
        logoff();
    }//GEN-LAST:event_mnidangxuatActionPerformed

    private void mnidoimkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnidoimkActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnidoimkActionPerformed

    private void mnikhoahocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnikhoahocActionPerformed
        // TODO add your handling code here:
        openKhoaHoc();
    }//GEN-LAST:event_mnikhoahocActionPerformed

    private void mninguoihocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mninguoihocActionPerformed
        // TODO add your handling code here:
        openNguoiHoc();
    }//GEN-LAST:event_mninguoihocActionPerformed

    private void mnidoanhthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnidoanhthuActionPerformed
        // TODO add your handling code here:
        openThongKe(3);
    }//GEN-LAST:event_mnidoanhthuActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        logoff();
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btnchuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchuyendeActionPerformed
        // TODO add your handling code here:
        openChuyenDe();
    }//GEN-LAST:event_btnchuyendeActionPerformed

    private void btnnguoihocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnguoihocActionPerformed
        // TODO add your handling code here:
        openNguoiHoc();
    }//GEN-LAST:event_btnnguoihocActionPerformed

    private void btnkhoahocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkhoahocActionPerformed
        // TODO add your handling code here:
        openKhoaHoc();
    }//GEN-LAST:event_btnkhoahocActionPerformed

    private void btnhocvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhocvienActionPerformed
        // TODO add your handling code here:
        openHocVien();
    }//GEN-LAST:event_btnhocvienActionPerformed

    private void btnstopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstopActionPerformed
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_btnstopActionPerformed

    private void mniketthucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniketthucActionPerformed
        // TODO add your handling code here:
        exit();
    }//GEN-LAST:event_mniketthucActionPerformed

    private void mnibangdiemtungkhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnibangdiemtungkhoaActionPerformed
        // TODO add your handling code here:
        openThongKe(1);
    }//GEN-LAST:event_mnibangdiemtungkhoaActionPerformed

    private void mninguoihoctungnamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mninguoihoctungnamActionPerformed
        // TODO add your handling code here:
        openThongKe(0);
    }//GEN-LAST:event_mninguoihoctungnamActionPerformed

    private void mnidiemtungkhoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnidiemtungkhoaActionPerformed
        // TODO add your handling code here:
        openThongKe(2);
    }//GEN-LAST:event_mnidiemtungkhoaActionPerformed

    private void mninhanvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mninhanvienActionPerformed
        // TODO add your handling code here:
        openNhanVien();
    }//GEN-LAST:event_mninhanvienActionPerformed

    private void mnihocvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnihocvienActionPerformed
        // TODO add your handling code here:
        openHocVien();
    }//GEN-LAST:event_mnihocvienActionPerformed

    private void mnichuyendeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnichuyendeActionPerformed
        // TODO add your handling code here:
        openChuyenDe();
    }//GEN-LAST:event_mnichuyendeActionPerformed

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
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnchuyende;
    private javax.swing.JButton btnhocvien;
    private javax.swing.JButton btnkhoahoc;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnnguoihoc;
    private javax.swing.JButton btnstop;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblClock;
    private javax.swing.JMenu mnhethong;
    private javax.swing.JMenuItem mnibangdiemtungkhoa;
    private javax.swing.JMenuItem mnichuyende;
    private javax.swing.JMenuItem mnidangxuat;
    private javax.swing.JMenuItem mnidiemtungkhoa;
    private javax.swing.JMenuItem mnidoanhthu;
    private javax.swing.JMenuItem mnidoimk;
    private javax.swing.JMenuItem mnihocvien;
    private javax.swing.JMenuItem mniketthuc;
    private javax.swing.JMenuItem mnikhoahoc;
    private javax.swing.JMenuItem mninguoihoc;
    private javax.swing.JMenuItem mninguoihoctungnam;
    private javax.swing.JMenuItem mninhanvien;
    private javax.swing.JMenu mnquanly;
    private javax.swing.JMenu mnthongke;
    // End of variables declaration//GEN-END:variables
}
