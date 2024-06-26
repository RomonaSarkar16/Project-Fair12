
public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        initComponents2();
    }
    
    
    private void initComponents2(){
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("User Interface");
    }
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_jPanel = new javax.swing.JPanel();
        create_Message_jButton = new javax.swing.JButton();
        read_Message_jButton = new javax.swing.JButton();
        about_US_jButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        main_jPanel.setBackground(new java.awt.Color(0, 0, 0));

        create_Message_jButton.setBackground(new java.awt.Color(51, 255, 0));
        create_Message_jButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        create_Message_jButton.setForeground(new java.awt.Color(0, 0, 0));
        create_Message_jButton.setText("Create Message");
        create_Message_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_Message_jButtonActionPerformed(evt);
            }
        });

        read_Message_jButton.setBackground(new java.awt.Color(51, 255, 0));
        read_Message_jButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        read_Message_jButton.setForeground(new java.awt.Color(0, 0, 0));
        read_Message_jButton.setText("Read Message");
        read_Message_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                read_Message_jButtonActionPerformed(evt);
            }
        });

        about_US_jButton.setBackground(new java.awt.Color(51, 255, 0));
        about_US_jButton.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        about_US_jButton.setForeground(new java.awt.Color(0, 0, 0));
        about_US_jButton.setText("About US");
        about_US_jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                about_US_jButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("      Welcome to the Secret Box");

        javax.swing.GroupLayout main_jPanelLayout = new javax.swing.GroupLayout(main_jPanel);
        main_jPanel.setLayout(main_jPanelLayout);
        main_jPanelLayout.setHorizontalGroup(
            main_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_jPanelLayout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(main_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(create_Message_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(read_Message_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(about_US_jButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );
        main_jPanelLayout.setVerticalGroup(
            main_jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_jPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(create_Message_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(read_Message_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(about_US_jButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(main_jPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void create_Message_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_Message_jButtonActionPerformed
        // TODO add your handling code here:
        
        Create_Message cm = new Create_Message();        
        
    }//GEN-LAST:event_create_Message_jButtonActionPerformed

    private void about_US_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_US_jButtonActionPerformed
        // TODO add your handling code here:
        
        About_US au = new About_US();
        
        
    }//GEN-LAST:event_about_US_jButtonActionPerformed

    private void read_Message_jButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_read_Message_jButtonActionPerformed
        // TODO add your handling code here:

        Read_Message rm = new Read_Message();
        
    }//GEN-LAST:event_read_Message_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about_US_jButton;
    private javax.swing.JButton create_Message_jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel main_jPanel;
    private javax.swing.JButton read_Message_jButton;
    // End of variables declaration//GEN-END:variables
}
