/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package y_student;

import authenticate.logIn;
import config.config;
import javax.swing.JOptionPane;
import x_admin.sysLogs;
import x_admin.userAccount;

/**
 *
 * @author juls
 */
public class submitEval extends javax.swing.JFrame {
    
    public submitEval() {
         if (config.stopIllegalAccess(this)) return;
    initComponents();
    this.setSize(900, 520); // Forces the window to be wide enough for your background
    this.setLocationRelativeTo(null); // Centers the window on your screen
    displayQuestion(); // Makes sure the first question isn't blank
}

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        a = new javax.swing.JPanel();
        account = new javax.swing.JLabel();
        d = new javax.swing.JPanel();
        dashbord = new javax.swing.JLabel();
        e = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        g = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        i = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        h = new javax.swing.JPanel();
        account1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        user1 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        profile = new config.CircularLabel();
        namee = new javax.swing.JLabel();
        teacherDropdown = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnNext = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        r2 = new javax.swing.JRadioButton();
        r1 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        jPanel6 = new javax.swing.JPanel();
        lblQuestion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 33, 71));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(45, 52, 54));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        a.setBackground(new java.awt.Color(197, 179, 88));
        a.setForeground(new java.awt.Color(197, 179, 88));
        a.setPreferredSize(new java.awt.Dimension(142, 30));

        account.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        account.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        account.setText("MY PROFILE");
        account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accountMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout aLayout = new javax.swing.GroupLayout(a);
        a.setLayout(aLayout);
        aLayout.setHorizontalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(account, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        aLayout.setVerticalGroup(
            aLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(account, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 160, -1));

        d.setBackground(new java.awt.Color(197, 179, 88));
        d.setForeground(new java.awt.Color(197, 179, 88));
        d.setPreferredSize(new java.awt.Dimension(142, 30));
        d.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dMouseEntered(evt);
            }
        });
        d.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashbord.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        dashbord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashbord.setText("DASHBOARD");
        dashbord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashbordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashbordMouseEntered(evt);
            }
        });
        d.add(dashbord, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 30));

        jPanel2.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, -1));

        e.setBackground(new java.awt.Color(197, 179, 88));
        e.setForeground(new java.awt.Color(197, 179, 88));
        e.setPreferredSize(new java.awt.Dimension(142, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("VIEW EVALUATIONS");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout eLayout = new javax.swing.GroupLayout(e);
        e.setLayout(eLayout);
        eLayout.setHorizontalGroup(
            eLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        eLayout.setVerticalGroup(
            eLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 160, -1));

        g.setBackground(new java.awt.Color(197, 179, 88));
        g.setForeground(new java.awt.Color(197, 179, 88));

        user.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setText("EVALUATE");
        user.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        user.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                userMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout gLayout = new javax.swing.GroupLayout(g);
        g.setLayout(gLayout);
        gLayout.setHorizontalGroup(
            gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        gLayout.setVerticalGroup(
            gLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, 30));

        i.setBackground(new java.awt.Color(44, 62, 80));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/arrow20.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        Back.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        Back.setForeground(new java.awt.Color(240, 240, 240));
        Back.setText("Back");
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout iLayout = new javax.swing.GroupLayout(i);
        i.setLayout(iLayout);
        iLayout.setHorizontalGroup(
            iLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(iLayout.createSequentialGroup()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        iLayout.setVerticalGroup(
            iLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(i, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 90, 30));

        h.setBackground(new java.awt.Color(197, 179, 88));
        h.setForeground(new java.awt.Color(197, 179, 88));
        h.setPreferredSize(new java.awt.Dimension(142, 30));

        account1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        account1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        account1.setText("SYSTEM LOGS");
        account1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                account1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout hLayout = new javax.swing.GroupLayout(h);
        h.setLayout(hLayout);
        hLayout.setHorizontalGroup(
            hLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(account1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        hLayout.setVerticalGroup(
            hLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(account1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(h, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 160, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 220, 430));

        jPanel3.setBackground(new java.awt.Color(44, 62, 80));
        jPanel3.setForeground(new java.awt.Color(240, 240, 240));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        user1.setFont(new java.awt.Font("Segoe UI Black", 1, 20)); // NOI18N
        user1.setForeground(new java.awt.Color(197, 179, 88));
        user1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user1.setText("STUDENT DASHBOARD");
        user1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user1MouseClicked(evt);
            }
        });
        jPanel3.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 480, 70));

        logout.setBackground(new java.awt.Color(0, 33, 71));
        logout.setFont(new java.awt.Font("Segoe UI Black", 0, 11)); // NOI18N
        logout.setForeground(new java.awt.Color(197, 179, 88));
        logout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logout.setText("Logout");
        logout.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(197, 179, 88)));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel3.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 70, 20));

        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profileMouseClicked(evt);
            }
        });
        jPanel3.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 60));

        namee.setBackground(new java.awt.Color(44, 62, 80));
        namee.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        namee.setForeground(new java.awt.Color(240, 240, 240));
        jPanel3.add(namee, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, 140, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 70));

        teacherDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherDropdownActionPerformed(evt);
            }
        });
        jPanel1.add(teacherDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 240, -1));

        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("YOU SHOULD TAKE REVENGE TO YOUR INSTRUCTORS!");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, 500, -1));

        btnNext.setText("NEXT");
        btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNextMouseClicked(evt);
            }
        });
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 430, -1, -1));

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, -1, -1));

        bgroup.add(r2);
        r2.setText("2");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        bgroup.add(r1);
        r1.setText("1");
        r1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r1ActionPerformed(evt);
            }
        });

        bgroup.add(r3);
        r3.setText("3");
        r3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r3ActionPerformed(evt);
            }
        });

        bgroup.add(r4);
        r4.setText("4");
        r4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r4ActionPerformed(evt);
            }
        });

        bgroup.add(r5);
        r5.setText("5");
        r5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(r2))
                            .addComponent(r1))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(r4)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(r5))))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(r3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(r2)
                    .addComponent(r1)
                    .addComponent(r4)
                    .addComponent(r5)
                    .addComponent(r3)))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 230, 30));

        lblQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuestion.setText("QUESTIONS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lblQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 240, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseClicked
        userAccount accFrame = new userAccount();
        accFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_accountMouseClicked

    private void dashbordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashbordMouseClicked
        studDashboard dashFrame = new studDashboard();
        dashFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashbordMouseClicked

    private void dashbordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashbordMouseEntered

    }//GEN-LAST:event_dashbordMouseEntered

    private void dMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dMouseEntered

    }//GEN-LAST:event_dMouseEntered

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        viewEvals viewFrame = new viewEvals();
        viewFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        submitEval userstableFrame = new submitEval();
        userstableFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userMouseClicked

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_userMouseEntered

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        studDashboard ad = new studDashboard();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        studDashboard ad = new studDashboard();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void account1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_account1MouseClicked
        sysLogs tt = new sysLogs();
        tt.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_account1MouseClicked

    private void user1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_user1MouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked

        int confirm = javax.swing.JOptionPane.showConfirmDialog(null,
            "Do you really want to log out?", "Logout", javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            config.setSession(null, null, null, null, null);
            new logIn().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void profileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMouseClicked
        userAccount accFrame = new userAccount();
        accFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_profileMouseClicked

    private void teacherDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherDropdownActionPerformed

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r5ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r4ActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNextActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed
    
    // 1. Array of questions
    String[] questions = {
        "1. How clear were the teacher's explanations?",
        "2. Did the teacher encourage participation?",
        "3. Was the teacher punctual to class?",
        "4. Would you recommend this teacher to others?"
    };

    // 2. Array to store the student's answers (default to 0)
    int[] answers = new int[questions.length];

    // 3. Current question index tracker
    int currentIndex = 0;
    
    private void btnNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNextMouseClicked
       
    // A. Save the current selection
    if (r1.isSelected()) answers[currentIndex] = 1;
    else if (r2.isSelected()) answers[currentIndex] = 2;
    else if (r3.isSelected()) answers[currentIndex] = 3;
    else if (r4.isSelected()) answers[currentIndex] = 4;
    else if (r5.isSelected()) answers[currentIndex] = 5;

    // B. Move to the next question if available
    if (currentIndex < questions.length - 1) {
        currentIndex++;
        displayQuestion();
    } else {
        // If it's the last question, change button text to "Submit"
        submitToDatabase(); 
    }

    }//GEN-LAST:event_btnNextMouseClicked
    
    
    
    private void submitToDatabase() {
    // 1. Get Teacher ID (Note: Your DB uses t_id, so ensure your dropdown has IDs)
    // For now, we will use a placeholder or the selected index
    int teacherId = teacherDropdown.getSelectedIndex() + 1; 

    // 2. Calculate Average Rating
    double total = 0;
    for (int score : answers) {
        total += score;
    }
    double average = total / questions.length;

    // 3. Get Current Date and Session Info
    String currentDate = new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
    String studentUid = config.getID(); // Getting the u_id from your config session

    // 4. Construct the SQL based on your tbl_evaluation columns
    String sql = "INSERT INTO tbl_evaluation (t_id, s_u_id, e_average_rating, e_date, e_year, e_sem) "
               + "VALUES (" + teacherId + ", '" + studentUid + "', " + average + ", '" + currentDate + "', '2023-2024', '1st Sem')";

    // 5. Execute using your config class
    config conf = new config();
    if (conf.insertData(sql)) {
        JOptionPane.showMessageDialog(this, "Evaluation Submitted Successfully!");
        new studDashboard().setVisible(true);
        this.dispose();
    } else {
        JOptionPane.showMessageDialog(this, "Database Error! Check if you have already evaluated this teacher.");
    }
}
   
    private void displayQuestion() {
        config conf = new config();
        // Assuming your table is named tbl_question as per standard naming
        String query = "SELECT q_description FROM tbl_question LIMIT 1 OFFSET 0"; 

        try (java.sql.Connection conn = conf.getConnection();
             java.sql.Statement stmt = conn.createStatement();
             java.sql.ResultSet rs = stmt.executeQuery(query)) {

            if (rs.next()) {
                lblQuestion.setText(rs.getString("q_description"));
            } else {
                lblQuestion.setText("No questions found in the database.");
            }
        } catch (java.sql.SQLException e) {
            System.out.println("Error loading questions: " + e.getMessage());
            javax.swing.JOptionPane.showMessageDialog(this, "Failed to load questions: " + e.getMessage());
        }
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
            java.util.logging.Logger.getLogger(submitEval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(submitEval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(submitEval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(submitEval.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new submitEval().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JPanel a;
    private javax.swing.JLabel account;
    private javax.swing.JLabel account1;
    private javax.swing.JLabel back;
    private javax.swing.ButtonGroup bgroup;
    private javax.swing.JButton btnNext;
    private javax.swing.JPanel d;
    private javax.swing.JLabel dashbord;
    private javax.swing.JPanel e;
    private javax.swing.JPanel g;
    private javax.swing.JPanel h;
    private javax.swing.JPanel i;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblQuestion;
    private javax.swing.JLabel logout;
    public javax.swing.JLabel namee;
    private javax.swing.JLabel profile;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    private javax.swing.JRadioButton r3;
    private javax.swing.JRadioButton r4;
    private javax.swing.JRadioButton r5;
    private javax.swing.JComboBox<String> teacherDropdown;
    private javax.swing.JLabel user;
    private javax.swing.JLabel user1;
    // End of variables declaration//GEN-END:variables
}
