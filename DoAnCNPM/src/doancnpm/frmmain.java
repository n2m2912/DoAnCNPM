/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doancnpm;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author manng
 */
public class frmmain extends javax.swing.JFrame {

    /**
     * Creates new form frmmain
     */
    public frmmain() {
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

        ImageIcon icon = new ImageIcon(getClass().getResource("/doancnpm/pc ok.png"));
        Image image = icon.getImage();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu12 = new javax.swing.JMenu();
        mnths = new javax.swing.JMenuItem();
        mntc = new javax.swing.JMenuItem();
        mnbdm = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnlds = new javax.swing.JMenuItem();
        mndsl = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        mntkm = new javax.swing.JMenuItem();
        mntkhk = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mnqd = new javax.swing.JMenuItem();
        JMenu6 = new javax.swing.JMenu();
        mntt = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("QUAN LY HOC SINH");

        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setDoubleBuffered(true);

        jMenu12.setText("QLY HS");

        mnths.setText("Thêm học sinh");
        mnths.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mnths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnthsActionPerformed(evt);
            }
        });
        jMenu12.add(mnths);

        mntc.setText("Tra cứu học sinh");
        mntc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntcActionPerformed(evt);
            }
        });
        jMenu12.add(mntc);

        mnbdm.setText("Nhập bảng điểm môn");
        mnbdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnbdmActionPerformed(evt);
            }
        });
        jMenu12.add(mnbdm);

        jMenuBar1.add(jMenu12);

        jMenu3.setText("QLY Lớp");

        mnlds.setText("Lập danh sách lớp");
        mnlds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnldsActionPerformed(evt);
            }
        });
        jMenu3.add(mnlds);

        mndsl.setText("Danh sách lớp");
        mndsl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mndslActionPerformed(evt);
            }
        });
        jMenu3.add(mndsl);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Lập báo cáo");

        mntkm.setText("Tổng kết môn");
        mntkm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntkmActionPerformed(evt);
            }
        });
        jMenu1.add(mntkm);

        mntkhk.setText("Tổng kết học kỳ");
        mntkhk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mntkhkActionPerformed(evt);
            }
        });
        jMenu1.add(mntkhk);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Quy Định");

        mnqd.setText("Thay đổi qui định");
        mnqd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnqdActionPerformed(evt);
            }
        });
        jMenu5.add(mnqd);

        jMenuBar1.add(jMenu5);

        JMenu6.setText("About");

        mntt.setText("Thông tin nhóm phát triển");
        mntt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnttActionPerformed(evt);
            }
        });
        JMenu6.add(mntt);

        jMenuBar1.add(JMenu6);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnthsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnthsActionPerformed
        // TODO add your handling code here:
        frmThemHS ths = new frmThemHS();
        jDesktopPane1.add(ths);
        ths.setVisible(true);
    }//GEN-LAST:event_mnthsActionPerformed

    private void mntcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntcActionPerformed
        // TODO add your handling code here:
        frmDanhSachHS dshs = new frmDanhSachHS();
        jDesktopPane1.add(dshs);
        dshs.setVisible(true);
    }//GEN-LAST:event_mntcActionPerformed

    private void mnbdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnbdmActionPerformed
        // TODO add your handling code here:
        frmBangDiem bd = new frmBangDiem();
        jDesktopPane1.add(bd);
        bd.setVisible(true);
    }//GEN-LAST:event_mnbdmActionPerformed

    private void mndslActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mndslActionPerformed
        // TODO add your handling code here:
        frmDSLop dsl = new frmDSLop();
        jDesktopPane1.add(dsl);
        dsl.setVisible(true);
    }//GEN-LAST:event_mndslActionPerformed

    private void mnldsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnldsActionPerformed
        // TODO add your handling code here:
        frmLapDSLop lds = new frmLapDSLop();
        jDesktopPane1.add(lds);
        lds.setVisible(true);
    }//GEN-LAST:event_mnldsActionPerformed

    private void mntkmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntkmActionPerformed
        // TODO add your handling code here:
        frmBaoCaoMon bcm = new frmBaoCaoMon();
        jDesktopPane1.add(bcm);
        bcm.setVisible(true);
    }//GEN-LAST:event_mntkmActionPerformed

    private void mntkhkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mntkhkActionPerformed
        // TODO add your handling code here:
        frmBaoCaoHK bchk = new frmBaoCaoHK();
        jDesktopPane1.add(bchk);
        bchk.setVisible(true);
    }//GEN-LAST:event_mntkhkActionPerformed

    private void mnqdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnqdActionPerformed
        // TODO add your handling code here:
        frmQuyDinh qd = new frmQuyDinh();
        jDesktopPane1.add(qd);
        qd.setVisible(true);
    }//GEN-LAST:event_mnqdActionPerformed

    private void mnttActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnttActionPerformed
        // TODO add your handling code here:
        frmAbout ab = new frmAbout();
        jDesktopPane1.add(ab);
        ab.setVisible(true);
    }//GEN-LAST:event_mnttActionPerformed

    /**
     * @param args the command line arguments
     */
    // public  static strConnection = "";
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
            java.util.logging.Logger.getLogger(frmmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmmain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmmain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu JMenu6;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem mnbdm;
    private javax.swing.JMenuItem mndsl;
    private javax.swing.JMenuItem mnlds;
    private javax.swing.JMenuItem mnqd;
    private javax.swing.JMenuItem mntc;
    private javax.swing.JMenuItem mnths;
    private javax.swing.JMenuItem mntkhk;
    private javax.swing.JMenuItem mntkm;
    private javax.swing.JMenuItem mntt;
    // End of variables declaration//GEN-END:variables
}
