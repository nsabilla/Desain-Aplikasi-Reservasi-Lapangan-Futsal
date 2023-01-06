package futsal;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
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

        jPanel2 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        btn_reservasi = new javax.swing.JButton();
        btn_order = new javax.swing.JButton();
        btn_keluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(660, 390));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setBackground(new java.awt.Color(255, 159, 67));
        jToolBar1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jToolBar1.setRollover(true);

        btn_reservasi.setBackground(new java.awt.Color(255, 159, 67));
        btn_reservasi.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_reservasi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-businessman-50.png"))); // NOI18N
        btn_reservasi.setText("Reservasi");
        btn_reservasi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        btn_reservasi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_reservasi.setPreferredSize(new java.awt.Dimension(70, 76));
        btn_reservasi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_reservasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reservasiActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_reservasi);

        btn_order.setBackground(new java.awt.Color(255, 159, 67));
        btn_order.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_order.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-purchase-order-50.png"))); // NOI18N
        btn_order.setText("Order Masuk");
        btn_order.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        btn_order.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_order.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_order.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_orderActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_order);

        btn_keluar.setBackground(new java.awt.Color(255, 159, 67));
        btn_keluar.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btn_keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-shutdown-filled-50(1).png"))); // NOI18N
        btn_keluar.setText("Keluar");
        btn_keluar.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        btn_keluar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_keluar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btn_keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_keluarActionPerformed(evt);
            }
        });
        jToolBar1.add(btn_keluar);

        jPanel2.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 190, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lpgfutsal (3).png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, 1350, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_keluarActionPerformed
        // TODO add your handling code here:
           int a=JOptionPane.showConfirmDialog(null,"Apakah Yakin Keluar","Keluar",JOptionPane.YES_NO_OPTION);
           if(a==0)
           {
               System.exit(0);
           }
          
    }//GEN-LAST:event_btn_keluarActionPerformed

    private void btn_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_orderActionPerformed
        // TODO add your handling code here:
        new Orderan().setVisible(true);
    }//GEN-LAST:event_btn_orderActionPerformed

    private void btn_reservasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reservasiActionPerformed
        // TODO add your handling code here:
        new Reservasi().setVisible(true);
        
        
      
    }//GEN-LAST:event_btn_reservasiActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        setExtendedState(Home.MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_keluar;
    private javax.swing.JButton btn_order;
    private javax.swing.JButton btn_reservasi;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}
