/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package New_Desain;

import java.awt.Color;
import java.awt.Menu;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.event.MenuListener;
import javax.swing.table.DefaultTableModel;/**
 *
 * @author USER
 */
public class Promo extends javax.swing.JFrame {

    /**
     * Creates new form Promo
     */
    public Promo() {
        initComponents();
        datatable();
        kosongkanfield();
    }

            public void kosongkanfield(){
kdbarang.setText(null);
tglpromo.setText(null) ;
tglakhir.setText(null);
hrgawal.setText(null);
hrgpromo.setText(null) ;

    }
    public void datatable(){
    DefaultTableModel tbl=new DefaultTableModel();
    tbl.addColumn("Kode Barang");
    tbl.addColumn("Tanggal Mulai");
    tbl.addColumn("Tanggal Berakhir");
    tbl.addColumn("Harga Awal");
    tbl.addColumn("Harga Promo");
    tabel.setModel(tbl);
    try{
        int no=1;
        String sql = "SELECT * FROM promo ORDER BY Kode_Barang DESC; ";
        java.sql.Connection conn=(Connection)New_Desain.SKP.configDB();
        java.sql.Statement stm=conn.createStatement();
        java.sql.ResultSet res=stm.executeQuery(sql);
        while(res.next())
        {
            tbl.addRow(new Object[]{
                res.getString("Kode_Barang"),
                res.getString("Tgl_Promo"),
                res.getString("Tgl_Promo_Berakhir"),
                res.getString("Harga_Awal"),
                res.getString("Harga_Jual_Satuan"),
                
                
                
            });
                    tabel.setModel(tbl);
    }
}catch (Exception e){
    JOptionPane.showMessageDialog(rootPane, "salah");
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

        kdbarang = new javax.swing.JTextField();
        tglpromo = new javax.swing.JTextField();
        tglakhir = new javax.swing.JTextField();
        hrgawal = new javax.swing.JTextField();
        hrgpromo = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(kdbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 290, 30));
        getContentPane().add(tglpromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 290, 30));
        getContentPane().add(tglakhir, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 320, 290, 30));
        getContentPane().add(hrgawal, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, 290, 30));
        getContentPane().add(hrgpromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, 290, 30));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jButton3.setText("Tambah");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 170, 120, 40));

        jButton2.setBackground(new java.awt.Color(204, 204, 0));
        jButton2.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jButton2.setText("Ubah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 230, 120, 40));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 24)); // NOI18N
        jButton1.setText("Hapus");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 290, 120, 40));

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
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
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 820, 160));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Baru/logo_baru-removebg-preview.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Baru/home-removebg-preview.png"))); // NOI18N
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Baru/Frame_159__1_-removebg-preview.png"))); // NOI18N
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Baru/Frame_159__2_-removebg-preview.png"))); // NOI18N
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 490, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Baru/LOGOUT-removebg-preview.png"))); // NOI18N
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel15MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Baru/promo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        DefaultTableModel tbl=new DefaultTableModel();

        String Harga_Jual_Satuan = hrgpromo.getText();
        String Tgl_Promo = tglpromo.getText() ;
        String Tgl_Promo_Berakhir = tglakhir.getText();
        String Kode_Barang = kdbarang.getText();
        String Harga_Awal = hrgawal.getText();
        try{
            java.sql.Connection conn=(Connection)New_Desain.SKP.configDB();
            String sql = "INSERT INTO promo VALUES ('" + Harga_Jual_Satuan + "','" + Tgl_Promo + "','" + Tgl_Promo_Berakhir + "','"
            + Kode_Barang + "','"  + Harga_Awal + "')";

            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute(sql);

            JOptionPane.showMessageDialog(null, "data berhasil disimpan");
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "data gagal disimpan");
        }
        datatable();    
        kosongkanfield();// TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {

            String sql = "UPDATE promo SET Harga_Jual_Satuan='" + hrgpromo.getText() + "' ,Tgl_Promo='" + tglpromo.getText()+ "' ,Tgl_Promo_Berakhir='" + tglakhir.getText() 
                    + "' ,Harga_Awal='" + hrgawal.getText() + "'WHERE Kode_Barang = '"+kdbarang.getText()+"'";;
            java.sql.Connection conn = (Connection)New_Desain.SKP.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute(sql);

            JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Perubahan Data Gagal "
                + e.getMessage());
        }

        datatable();  
        kosongkanfield();// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        String Kode_Barang = kdbarang.getText();
        try {
            java.sql.Connection conn=(Connection)New_Desain.SKP.configDB();
            String sql = ("DELETE FROM promo where Kode_Barang=('" + Kode_Barang + "');");

            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            pst.execute(sql);

            String Harga_Jual_Satuan = hrgpromo.getText();
            String Tgl_Promo = tglpromo.getText() ;
            String Tgl_Promo_Berakhir = tglakhir.getText();
            String Harga_Awal = hrgawal.getText();

            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        datatable();      
        kosongkanfield();// TODO add your handling code here:
    }//GEN-LAST:event_jButton1MouseClicked

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        int baris = tabel.rowAtPoint(evt.getPoint());

        String KdBarang = tabel.getValueAt(baris, 0).toString();
        kdbarang.setText(KdBarang);

        String Tglpromo = tabel.getValueAt(baris, 1).toString();
        tglpromo.setText(Tglpromo);

        String Tglakhir = tabel.getValueAt(baris, 2).toString();
        tglakhir.setText(Tglakhir);

        String Hrgawal = tabel.getValueAt(baris, 4).toString();
        hrgawal.setText(Hrgawal);

        String Hrgpromo = tabel.getValueAt(baris, 3).toString();
        hrgpromo.setText(Hrgpromo);

        // TODO add your handling code here:
    }//GEN-LAST:event_tabelMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        this.setVisible(false);
        new Home().setVisible(true);     // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        this.setVisible(false);
        new Suplier().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        this.setVisible(false);
        new Petugas().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MouseClicked
        this.setVisible(false);
        new Login().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel15MouseClicked

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
            java.util.logging.Logger.getLogger(Promo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Promo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Promo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Promo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Promo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField hrgawal;
    private javax.swing.JTextField hrgpromo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField kdbarang;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField tglakhir;
    private javax.swing.JTextField tglpromo;
    // End of variables declaration//GEN-END:variables
}
