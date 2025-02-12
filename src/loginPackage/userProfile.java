/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginPackage;

import javax.swing.JOptionPane;

import image.img;
import loginPackage.userModel;

/**
 *
 * @author nidul
 */
public class userProfile extends javax.swing.JFrame {

    /**
     * Creates new form userProfile
     */
    public userProfile() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButtonDashBoard = new javax.swing.JButton();
        jButtonChangePassword = new javax.swing.JButton();
        jButtonLogOut = new javax.swing.JButton();
        jButtonEditProfile = new javax.swing.JButton();
        jLabelWelcome = new javax.swing.JLabel();
        jButtonDeleteAccount = new javax.swing.JButton();
        jProgressBar1 = new javax.swing.JProgressBar();
        jProgressBar2 = new javax.swing.JProgressBar();
        jLabelTilte = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jLabelComTask = new javax.swing.JLabel();
        jLabelUsername = new javax.swing.JLabel();
        jLabelPhoto = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelPendingTasks = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(26, 67, 143));

        jButtonDashBoard.setBackground(new java.awt.Color(51, 51, 51));
        jButtonDashBoard.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonDashBoard.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDashBoard.setText("Dashboard");
        jButtonDashBoard.setBorder(null);
        jButtonDashBoard.setBorderPainted(false);
        jButtonDashBoard.setContentAreaFilled(false);
        jButtonDashBoard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDashBoard.setFocusPainted(false);
        jButtonDashBoard.setFocusable(false);
        jButtonDashBoard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDashBoardActionPerformed(evt);
            }
        });

        jButtonChangePassword.setBackground(new java.awt.Color(51, 51, 51));
        jButtonChangePassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonChangePassword.setForeground(new java.awt.Color(255, 255, 255));
        jButtonChangePassword.setText("Change Password");
        jButtonChangePassword.setBorder(null);
        jButtonChangePassword.setBorderPainted(false);
        jButtonChangePassword.setContentAreaFilled(false);
        jButtonChangePassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonChangePassword.setFocusPainted(false);
        jButtonChangePassword.setFocusable(false);
        jButtonChangePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jButtonChangePasswordActionPerformed(evt);
            }
        });

        jButtonLogOut.setBackground(new java.awt.Color(51, 51, 51));
        jButtonLogOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonLogOut.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLogOut.setText("Log Out");
        jButtonLogOut.setBorder(null);
        jButtonLogOut.setBorderPainted(false);
        jButtonLogOut.setContentAreaFilled(false);
        jButtonLogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonLogOut.setFocusPainted(false);
        jButtonLogOut.setFocusable(false);
        jButtonLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jButtonLogOutActionPerformed(evt);
            }
        });

        jButtonEditProfile.setBackground(new java.awt.Color(51, 51, 51));
        jButtonEditProfile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonEditProfile.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditProfile.setText("Edit Profile");
        jButtonEditProfile.setBorder(null);
        jButtonEditProfile.setBorderPainted(false);
        jButtonEditProfile.setContentAreaFilled(false);
        jButtonEditProfile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonEditProfile.setFocusPainted(false);
        jButtonEditProfile.setFocusable(false);
        jButtonEditProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jButtonEditProfileActionPerformed(evt);
            }
        });

        String fName = userModel.getFirstName();
        String lName = userModel.getLastName();
        String name = fName +" "+ lName;
        
        jLabelWelcome.setBackground(new java.awt.Color(26, 67, 143));
        jLabelWelcome.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        jLabelWelcome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelWelcome.setText("Hi "+fName);

        jButtonDeleteAccount.setBackground(new java.awt.Color(51, 51, 51));
        jButtonDeleteAccount.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonDeleteAccount.setForeground(new java.awt.Color(255, 255, 255));
        jButtonDeleteAccount.setText("Delete Account");
        jButtonDeleteAccount.setBorder(null);
        jButtonDeleteAccount.setBorderPainted(false);
        jButtonDeleteAccount.setContentAreaFilled(false);
        jButtonDeleteAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeleteAccount.setFocusPainted(false);
        jButtonDeleteAccount.setFocusable(false);
        jButtonDeleteAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jButtonDeleteAccountActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButtonDashBoard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jButtonEditProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelWelcome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonChangePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                    .addComponent(jButtonLogOut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonDeleteAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(jButtonDashBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonEditProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonChangePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonDeleteAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        

        jLabelTilte.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelTilte.setForeground(new java.awt.Color(26, 67, 143));
        jLabelTilte.setText("My Profile");

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelEmail.setText(userModel.getEmail());

        jLabelComTask.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelComTask.setText("Completed tasks");

        jLabelUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelUsername.setText(userModel.getUsername());

        jLabelPhoto.setIcon(img.userImage(200, 200));
        jLabelName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelName.setText(name);

        jLabelPendingTasks.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelPendingTasks.setText("Pending tasks");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelTilte)
                            .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabelComTask, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPendingTasks, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, 611, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelTilte, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(79, Short.MAX_VALUE)
                        .addComponent(jLabelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jLabelComTask)
                        .addGap(18, 18, 18)))
                .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabelPendingTasks)
                .addGap(18, 18, 18)
                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDashBoardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDashBoardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonDashBoardActionPerformed
    
    private void jButtonEditProfileActionPerformed(java.awt.event.ActionEvent evt) {                                                 
    	editProfile editProfileFrame = new editProfile();
        editProfileFrame.pack();
        editProfileFrame.setResizable(false);
        editProfileFrame.setLocationRelativeTo(null);
        editProfileFrame.setVisible(true);
        this.dispose();
    }
    
    private void jButtonChangePasswordActionPerformed(java.awt.event.ActionEvent evt) {                                                 
    	changePassword changePasswordFrame = new changePassword();
        changePasswordFrame.pack();
        changePasswordFrame.setLocationRelativeTo(null);
        changePasswordFrame.setResizable(false);
        changePasswordFrame.setVisible(true);
        this.dispose();
    }
    
    private void jButtonDeleteAccountActionPerformed(java.awt.event.ActionEvent evt) {                                                 
    	int answer = JOptionPane.showConfirmDialog(null, "Do you want to delete the account?", "title",JOptionPane.YES_NO_OPTION);
        System.out.println(answer);
    	if(answer == 0) {
            if(user.deleteData()) {
            	JOptionPane.showMessageDialog(null, "Account Deleted successsfully", "Warning Message", JOptionPane.WARNING_MESSAGE);
            	loginInterface loginFrame = new loginInterface();
            	loginFrame.setResizable(false);
        		loginFrame.setVisible(true);
        		loginFrame.setLocationRelativeTo(null);
        		this.dispose();
            }
        }
    }
    
    private void jButtonLogOutActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        user.logout();
        loginInterface loginFrame = new loginInterface();
    	loginFrame.setResizable(false);
		loginFrame.setVisible(true);
		loginFrame.setLocationRelativeTo(null);
		this.dispose();
        
    }

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
            java.util.logging.Logger.getLogger(userProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userProfile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            	userProfile userProfileFrame = new userProfile();                
            	userProfileFrame.pack();
            	userProfileFrame.setLocationRelativeTo(null); // Center the frame on the screen
            	userProfileFrame.setResizable(false);
            	userProfileFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChangePassword;
    private javax.swing.JButton jButtonDashBoard;
    private javax.swing.JButton jButtonDeleteAccount;
    private javax.swing.JButton jButtonEditProfile;
    private javax.swing.JButton jButtonLogOut;
    private javax.swing.JLabel jLabelComTask;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelPendingTasks;
    private javax.swing.JLabel jLabelPhoto;
    private javax.swing.JLabel jLabelTilte;
    private javax.swing.JLabel jLabelUsername;
    private javax.swing.JLabel jLabelWelcome;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    // End of variables declaration//GEN-END:variables
}
