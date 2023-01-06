package futsal;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.sql.*; //ResulttSet //Connection //Statement
import javax.swing.table.DefaultTableModel;

public class Reservasi extends javax.swing.JFrame {
    private DefaultTableModel tableModel;
    private ResultSet resultSet;
    private final String regex = "\\d+";
    private int total;
    private void viewData(){
        try{
            //koneksi ke database
            Connection con = Config.configDB();
            
            //Model tabel
            Object[] columnTitle = {"Kode", "Nama Pemesan", "Nama Team", "No Telp", "Tanggal", "Jam", "Lama Bemain", "Harga"};
            tableModel = new DefaultTableModel(null, columnTitle);
            tbl_tabel.setModel(tableModel);
            tableModel.getDataVector().removeAllElements();
            
            //Buat statement
            Statement st = con.createStatement();
            resultSet = st.executeQuery("SELECT * FROM reservasi");
             while(resultSet.next()){
                Object[] data = {
                    resultSet.getString("kode"),
                    resultSet.getString("namapemesan"),
                    resultSet.getString("namateam"),
                    resultSet.getString("notelp"),
                    resultSet.getString("Tanggal"),
                    resultSet.getString("jam"),
                    resultSet.getInt("lamabermain"),
                    resultSet.getInt("harga")
                };
                tableModel.addRow(data);
                }
            con.close();
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
    private void Bersih(){
        txtkode.setText("");
        txtpemesan.setText("");
        txtteam.setText("");
        txtnotelp.setText("");
        tanggal.setDateFormatString("");
        cbxmulai.setSelectedItem("Pilih");
        cbxselesai.setSelectedItem("Pilih");
        txtdurasi.setText("");
        txtharga.setText("");
        txtbayar.setText("");    
    }
    
    public Reservasi() {
        initComponents();
        viewData();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtkode = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtpemesan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtteam = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtnotelp = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbxmulai = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        transaksi = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_tabel = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        cbxselesai = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        txtbayar = new javax.swing.JTextField();
        txtdurasi = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        tanggal = new com.toedter.calendar.JDateChooser();
        refresh = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();

        jLabel7.setText("jLabel7");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setPreferredSize(new java.awt.Dimension(750, 530));

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 550));
        jPanel1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                jPanel1AncestorMoved(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Gill Sans MT Condensed", 1, 20)); // NOI18N
        jLabel2.setText("RESERVASI LAPANGAN FUTSAL");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(291, 291, 291))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 60));

        txtkode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtkodeActionPerformed(evt);
            }
        });
        jPanel1.add(txtkode, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 190, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Kode Reservasi");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 100, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nama Pemesan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 140, 100, -1));
        jPanel1.add(txtpemesan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 190, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Tim");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 60, -1));
        jPanel1.add(txtteam, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 190, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No Telepon");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));
        jPanel1.add(txtnotelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 190, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Jam Mulai");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Lama Bermain");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 180, -1, -1));

        cbxmulai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "07:00", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "13:00", "14:00", "15:00", "16:00", "17:00" }));
        cbxmulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxmulaiActionPerformed(evt);
            }
        });
        jPanel1.add(cbxmulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 140, 80, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tanggal");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, -1, -1));

        simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-save-30.png"))); // NOI18N
        simpan.setText("Simpan");
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        jPanel1.add(simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 120, 40));

        transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-purchase-order-30.png"))); // NOI18N
        transaksi.setText("Transaksi");
        transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                transaksiActionPerformed(evt);
            }
        });
        jPanel1.add(transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 120, 40));

        tbl_tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nama Pemesan", "Nama Team", "No Telp", "Tanggal", "Jam", "Lama Bermain", "Harga"
            }
        ));
        tbl_tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_tabelMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_tabel);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 640, 140));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("s/d");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 140, -1, -1));

        cbxselesai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00" }));
        jPanel1.add(cbxselesai, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 80, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Harga");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Bayar");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, -1, -1));

        txtharga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txthargaKeyReleased(evt);
            }
        });
        jPanel1.add(txtharga, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 80, -1));
        jPanel1.add(txtbayar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 220, 80, -1));

        txtdurasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdurasiActionPerformed(evt);
            }
        });
        txtdurasi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtdurasiKeyReleased(evt);
            }
        });
        jPanel1.add(txtdurasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 180, 210, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 253, -1, 20));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 223, -1, 50));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 83, -1, 190));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 273, -1, 10));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 580, -1));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 610, 0));

        tanggal.setToolTipText("pilih");
        tanggal.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                tanggalPropertyChange(evt);
            }
        });
        jPanel1.add(tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 100, 210, -1));

        refresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-submit-progress-20.png"))); // NOI18N
        refresh.setText("Refresh");
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
        });
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel1.add(refresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 120, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reservasigaris.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));
        jPanel1.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 153, -1, 100));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/reservasigaris.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtkodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtkodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtkodeActionPerformed

    private void tanggalPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_tanggalPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_tanggalPropertyChange

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        try{
            String noHp=txtnotelp.getText();
            if(noHp.length() < 11 || noHp.length() > 13 || ((String.valueOf(noHp.charAt(0)).equals("0")) && 
                    String.valueOf(noHp.charAt(1)).equals("8")) != true){
                txtnotelp.setText("");
                JOptionPane.showMessageDialog(null, "No Telepon Tidak Valid", "invalid", JOptionPane.ERROR_MESSAGE);
            }
            else if(noHp.matches(regex) != true){
                txtnotelp.setText("");
                JOptionPane.showMessageDialog(null, "No Telepon Harus Angka", "invalid", JOptionPane.ERROR_MESSAGE);
            }else{
            String p = cbxmulai.getSelectedItem().toString()+"-"+cbxselesai.getSelectedItem().toString();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String l = dateFormat.format(tanggal.getDate());
            
            String sql = "INSERT INTO `reservasi`(`kode`, `namapemesan`, `namateam`, `notelp`, `tanggal`, `jam`, "
                    + "`lamabermain`, `harga`) VALUES "
                    + "('"+txtkode.getText()+"','"+txtpemesan.getText()+"','"+txtteam.getText()+"',"
                    + "'"+txtnotelp.getText()+"','"+l+"','"+p+"',"
                    + "'"+txtdurasi.getText()+"','"+txtharga.getText()+"')";
            
            java.sql.Connection conn = (Connection)Config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(null, "penyimpanan berhasil");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
            viewData();  
        }
        
    }//GEN-LAST:event_simpanActionPerformed

    private void txthargaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txthargaKeyReleased
        // TODO add your handling code here:  
    }//GEN-LAST:event_txthargaKeyReleased

    private void txtdurasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdurasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdurasiActionPerformed

    private void txtdurasiKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdurasiKeyReleased
        // TODO add your handling code here:
        int lama = Integer.parseInt(txtdurasi.getText());
        total = lama * 125000;
        txtharga.setText(String.valueOf(total));
    }//GEN-LAST:event_txtdurasiKeyReleased

    private void transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_transaksiActionPerformed
        // TODO add your handling code here:
        int bayar = Integer.parseInt(txtbayar.getText());
        int kembalian = bayar - total;
        JOptionPane.showMessageDialog(null, "Kembalian Anda ;\n" + String.valueOf(kembalian));
        
    }//GEN-LAST:event_transaksiActionPerformed

    private void tbl_tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_tabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_tabelMouseClicked

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        Bersih();
    }//GEN-LAST:event_refreshActionPerformed

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_refreshMouseClicked

    private void jPanel1AncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jPanel1AncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel1AncestorMoved

    private void cbxmulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxmulaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxmulaiActionPerformed

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
            java.util.logging.Logger.getLogger(Reservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxmulai;
    private javax.swing.JComboBox<String> cbxselesai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refresh;
    private javax.swing.JButton simpan;
    private com.toedter.calendar.JDateChooser tanggal;
    private javax.swing.JTable tbl_tabel;
    private javax.swing.JButton transaksi;
    private javax.swing.JTextField txtbayar;
    private javax.swing.JTextField txtdurasi;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnotelp;
    private javax.swing.JTextField txtpemesan;
    private javax.swing.JTextField txtteam;
    // End of variables declaration//GEN-END:variables
}