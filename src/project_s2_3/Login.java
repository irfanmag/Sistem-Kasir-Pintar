/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_s2_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import static project_s2_3.Dashboard.beli;
import static project_s2_3.Dashboard.jual;
import static project_s2_3.Dashboard.pengeluaran;
import static project_s2_3.Dashboard.dtbarang;
import static project_s2_3.Dashboard.promo;
import static project_s2_3.Dashboard.retur;
import static project_s2_3.Dashboard.lpbeli;
import static project_s2_3.Dashboard.lpjual;
import static project_s2_3.Dashboard.lpkluar;
import static project_s2_3.Dashboard.homee;
import static project_s2_3.Dashboard.petugas;
import static project_s2_3.Dashboard.suplier;
import static project_s2_3.Dashboard.logout;
import javax.swing.ImageIcon;

/**
 *
 * @author ACER
 */
public class Login extends javax.swing.JFrame {
    Connection con = null;
PreparedStatement pst =null;
ResultSet rs = null;
Dashboard b;

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        
        b = new Dashboard();
        b.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ID = new javax.swing.JTextField();
        Ptgs = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        login = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 200, 290, 40));

        Ptgs.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        Ptgs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kasir", "Admin" }));
        getContentPane().add(Ptgs, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 100, 30));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ID");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Petugas");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, -1, -1));

        jPanel1.setBackground(new java.awt.Color(38, 38, 83));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login.setBackground(new java.awt.Color(153, 153, 153));
        login.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        jPanel1.add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, 110, -1));

        jLabel3.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SKP");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Sistem Kasir Pintar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 290, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 450, 520));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Baruuu2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gambar/Baruuu2.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
try{
            String query = "SELECT * FROM `petugas` WHERE Id_Petugas=? and Password=? and Jabatan=?";
    con = DriverManager.getConnection("jdbc:mysql://localhost/new_skp_project", "root","");
    pst = con.prepareStatement(query);
            pst.setString(1, ID.getText());
            pst.setString(2, password.getText());
            pst.setString(3, String.valueOf(Ptgs.getSelectedItem()));
            rs=pst.executeQuery();
            if(rs.next()){
            JOptionPane.showMessageDialog(this, "username dan password anda benar anda login sebagai "+rs.getString("Jabatan"));
            if(Ptgs.getSelectedIndex()==0){
                b.setVisible(true);
                Kasir a = new Kasir();
                homee.setEnabled(true);
                suplier.setEnabled(false);
                petugas.setEnabled(false);
                logout.setEnabled(true);
                beli.setEnabled(false);
                jual.setEnabled(true);
                pengeluaran.setEnabled(false);
                lpbeli.setEnabled(false);
                lpjual.setEnabled(false);
                dtbarang.setEnabled(false);
                promo.setEnabled(false);
                retur.setEnabled(false);
                lpkluar.setEnabled(false);
                
//                    //nama.setText(rs.getString(2));
//                    Blob gambar =(com.mysql.jdbc.Blob)rs.getBlob("Foto");
//                    int ukuran = (int)(gambar.length());
//                    ImageIcon tampil = new ImageIcon(gambar.getBytes(1, ukuran));
//                    foto.setIcon(tampil);
                
            }else{
                b.setVisible(true);
                homee.setEnabled(true);
                suplier.setEnabled(true);
                petugas.setEnabled(true);
                logout.setEnabled(true);
                beli.setEnabled(true);
                jual.setEnabled(true);
                pengeluaran.setEnabled(true);
                lpbeli.setEnabled(true);
                lpjual.setEnabled(true);
                dtbarang.setEnabled(true);
                promo.setEnabled(true);
                retur.setEnabled(true);
                lpkluar.setEnabled(true);
                //nama.setText(rs.getString(2));
//                    Blob gambar =(com.mysql.jdbc.Blob)rs.getBlob("Foto");
//                    int ukuran = (int)(gambar.length());
//                    ImageIcon tampil = new ImageIcon(gambar.getBytes(1, ukuran));
//                    foto.setIcon(tampil);
            }
            }else{
                JOptionPane.showMessageDialog(this, "username dan password salah");
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }   
    // TODO add your handling code here:
           // TODO add your handling code here:
    }//GEN-LAST:event_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JComboBox<String> Ptgs;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables

    private static class Kasir {

        public Kasir() {
        }
    }
}
