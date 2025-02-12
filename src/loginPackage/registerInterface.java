/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package loginPackage;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import DB.DBConnection;

import javax.swing.JOptionPane;

/**
 *
 * @author nidul
 */
public class registerInterface extends javax.swing.JFrame {

    /**
     * Creates new form loginInterface
     */
    public registerInterface() {
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

        jPanelLogin = new javax.swing.JPanel();
        jpanelLeft = new javax.swing.JPanel();
        jpanelRight = new javax.swing.JPanel();
        jLabelSignup = new javax.swing.JLabel();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabelFirstName = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jButtonLoginS = new javax.swing.JButton();
        jButtonSignupS = new javax.swing.JButton();
        jLabelConPassword = new javax.swing.JLabel();
        jLabelUsernameS = new javax.swing.JLabel();
        jTextFieldUsernameS = new javax.swing.JTextField();
        jLabelPasswordS = new javax.swing.JLabel();
        jLabelLoginS = new javax.swing.JLabel();
        jPasswordFieldConSignup = new javax.swing.JPasswordField();
        jPasswordFieldSignup = new javax.swing.JPasswordField();
        jTextFieldLastName = new javax.swing.JTextField();
        jLabelLastName = new javax.swing.JLabel();
        jButtonVerify = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(26, 67, 143));

        jPanelLogin.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLogin.setPreferredSize(new java.awt.Dimension(900, 550));

        jpanelLeft.setBackground(new java.awt.Color(26, 67, 143));
        jpanelLeft.setPreferredSize(new java.awt.Dimension(450, 550));

        javax.swing.GroupLayout jpanelLeftLayout = new javax.swing.GroupLayout(jpanelLeft);
        jpanelLeft.setLayout(jpanelLeftLayout);
        jpanelLeftLayout.setHorizontalGroup(
            jpanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );
        jpanelLeftLayout.setVerticalGroup(
            jpanelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        jpanelRight.setBackground(new java.awt.Color(255, 255, 255));
        jpanelRight.setPreferredSize(new java.awt.Dimension(450, 550));

        jLabelSignup.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabelSignup.setForeground(new java.awt.Color(26, 67, 143));
        jLabelSignup.setText("SIGNUP");

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelEmail.setText("Email");

        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jLabelFirstName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelFirstName.setText("First name");

        jTextFieldFirstName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFirstNameActionPerformed(evt);
            }
        });

        jButtonLoginS.setBackground(new java.awt.Color(26, 67, 143));
        jButtonLoginS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonLoginS.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLoginS.setText("Login");
        jButtonLoginS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginSActionPerformed(evt);
            }
        });

        jButtonSignupS.setBackground(new java.awt.Color(26, 67, 143));
        jButtonSignupS.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonSignupS.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSignupS.setText("SignUp");
        jButtonSignupS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignupSActionPerformed(evt);
            }
        });

        jLabelConPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelConPassword.setText("Confirm Password");

        jLabelUsernameS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelUsernameS.setText("Username");

        jTextFieldUsernameS.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldUsernameS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsernameSActionPerformed(evt);
            }
        });

        jLabelPasswordS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelPasswordS.setText("Password");

        jLabelLoginS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelLoginS.setText("Already have a account");

        jPasswordFieldConSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldConSignupActionPerformed(evt);
            }
        });

        jPasswordFieldSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordFieldSignupActionPerformed(evt);
            }
        });

        jLabelLastName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelLastName.setText("Last name");

        jButtonVerify.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonVerify.setForeground(new java.awt.Color(26, 67, 143));
        jButtonVerify.setText("Verify");
        jButtonVerify.setBorder(null);
        jButtonVerify.setFocusPainted(false);
        jButtonVerify.setFocusable(false);

        javax.swing.GroupLayout jpanelRightLayout = new javax.swing.GroupLayout(jpanelRight);
        jpanelRight.setLayout(jpanelRightLayout);
        jpanelRightLayout.setHorizontalGroup(
            jpanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpanelRightLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelSignup)
                .addGap(157, 157, 157))
            .addGroup(jpanelRightLayout.createSequentialGroup()
                .addGroup(jpanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpanelRightLayout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jButtonSignupS))
                    .addGroup(jpanelRightLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jpanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPasswordFieldConSignup)
                            .addComponent(jPasswordFieldSignup, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelRightLayout.createSequentialGroup()
                                .addComponent(jLabelLoginS)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonLoginS))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpanelRightLayout.createSequentialGroup()
                                .addComponent(jLabelFirstName)
                                .addGap(105, 105, 105)
                                .addGroup(jpanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelLastName)
                                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabelPasswordS, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUsernameS, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelConPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpanelRightLayout.createSequentialGroup()
                                .addComponent(jTextFieldEmail)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextFieldUsernameS, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jpanelRightLayout.setVerticalGroup(
            jpanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelRightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSignup)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelFirstName)
                    .addComponent(jLabelLastName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVerify, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUsernameS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldUsernameS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelPasswordS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordFieldSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelConPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPasswordFieldConSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonSignupS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jpanelRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLoginS)
                    .addComponent(jButtonLoginS))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanelLoginLayout = new javax.swing.GroupLayout(jPanelLogin);
        jPanelLogin.setLayout(jPanelLoginLayout);
        jPanelLoginLayout.setHorizontalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addComponent(jpanelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpanelRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanelLoginLayout.setVerticalGroup(
            jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLoginLayout.createSequentialGroup()
                .addGroup(jPanelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpanelRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    private void jTextFieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFirstNameActionPerformed

    private void jButtonLoginSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginSActionPerformed
    	loginInterface loginFrame = new loginInterface();
    	loginFrame.setResizable(false);
		loginFrame.setVisible(true);
		loginFrame.setLocationRelativeTo(null);
		this.dispose();
    }//GEN-LAST:event_jButtonLoginSActionPerformed

    private void jButtonSignupSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignupSActionPerformed
        if("".equals(jTextFieldFirstName.getText()) || "".equals(jTextFieldLastName.getText()) || "".equals(jTextFieldEmail.getText()) || "".equals(jTextFieldUsernameS.getText()) || "".equals(new String(jPasswordFieldSignup.getPassword())) || "".equals(new String(jPasswordFieldConSignup.getPassword()))) {
        	JOptionPane.showMessageDialog(null, "Fill the all Fields", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        else if(!new String(jPasswordFieldSignup.getPassword()).equals(new String(jPasswordFieldConSignup.getPassword()))) {
        	JOptionPane.showMessageDialog(null, "Passwords are not match", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        else {
        	String firstName = jTextFieldFirstName.getText();
        	String lastName = jTextFieldLastName.getText();
        	String email = jTextFieldEmail.getText();
        	String username = jTextFieldUsernameS.getText();
        	String password = new String(jPasswordFieldSignup.getPassword());
        	
        	boolean isTrue;
        	isTrue = user.insertData(firstName, lastName, email, username, password);
        	
        	if(isTrue) {
        		JOptionPane.showMessageDialog(null, "Account created successfully", "Information Message", JOptionPane.INFORMATION_MESSAGE);
        		loginInterface loginFrame = new loginInterface();
            	loginFrame.setResizable(false);
        		loginFrame.setVisible(true);
        		loginFrame.setLocationRelativeTo(null);
        		this.dispose();
        	}
        	else {
        		JOptionPane.showMessageDialog(null, "Username is already in use.", "Error Message", JOptionPane.ERROR_MESSAGE);
        	}
        }
        
        
    }//GEN-LAST:event_jButtonSignupSActionPerformed

    private void jTextFieldUsernameSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsernameSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldUsernameSActionPerformed

    private void jPasswordFieldConSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldConSignupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldConSignupActionPerformed

    private void jPasswordFieldSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldSignupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordFieldSignupActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                registerInterface registerFrame = new registerInterface();
                registerFrame.pack();
                registerFrame.setLocationRelativeTo(null); // Center the frame on the screen
                registerFrame.setResizable(false);
                registerFrame.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLoginS;
    private javax.swing.JButton jButtonSignupS;
    private javax.swing.JButton jButtonVerify;
    private javax.swing.JLabel jLabelConPassword;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelFirstName;
    private javax.swing.JLabel jLabelLastName;
    private javax.swing.JLabel jLabelLoginS;
    private javax.swing.JLabel jLabelPasswordS;
    private javax.swing.JLabel jLabelSignup;
    private javax.swing.JLabel jLabelUsernameS;
    private javax.swing.JPanel jPanelLogin;
    private javax.swing.JPasswordField jPasswordFieldConSignup;
    private javax.swing.JPasswordField jPasswordFieldSignup;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldUsernameS;
    private javax.swing.JPanel jpanelLeft;
    private javax.swing.JPanel jpanelRight;
    // End of variables declaration//GEN-END:variables

}
