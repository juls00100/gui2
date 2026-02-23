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
import config.config;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class evaluate extends javax.swing.JFrame {

    private java.util.List<String> questions = new java.util.ArrayList<>();
    private int[] ratings; // Stores ratings for each question
    private int currentQuestionIndex = 0;
    private String selectedTeacherID = "";

    public evaluate() {
         if (config.stopIllegalAccess(this)) return;
        initComponents();
        loadTeachers();
        fetchAllQuestions();
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
        jPanel5 = new javax.swing.JPanel();
        r2 = new javax.swing.JRadioButton();
        r1 = new javax.swing.JRadioButton();
        r3 = new javax.swing.JRadioButton();
        r4 = new javax.swing.JRadioButton();
        r5 = new javax.swing.JRadioButton();
        teacherDropdown = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        NEXT = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lblQuestion = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

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
            .addComponent(user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
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
                .addContainerGap(18, Short.MAX_VALUE))
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

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 230, 30));

        teacherDropdown.setToolTipText("SELECT A TEACHER");
        teacherDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherDropdownActionPerformed(evt);
            }
        });
        jPanel1.add(teacherDropdown, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 240, -1));

        NEXT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        NEXT.setText("Next");
        NEXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NEXTMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(NEXT, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(NEXT, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 80, 40));

        lblQuestion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblQuestion.setText("questions");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(lblQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 400, 80));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Previous");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 80, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void loadTeachers() {
    config conf = new config();
    ResultSet rs = null; // 1. Declare OUTSIDE the try block
    try {
        rs = conf.getData("SELECT t_u_id, t_name FROM tbl_teacher");
        
        // Use the correct name of your JComboBox (teacherDropdown or teacherCombo)
        teacherDropdown.removeAllItems(); 
        
        while (rs.next()) {
            teacherDropdown.addItem(rs.getString("t_u_id") + " - " + rs.getString("t_name"));
        }
    } catch (SQLException e) {
        System.out.println("Error loading teachers: " + e.getMessage());
    } finally {
        // 2. The finally block can now see 'rs'
        // 3. Your config.closeResult already handles null checks, so this is safe
        conf.closeResult(rs); 
    }
}
    
    int questionOffset = 0; 

    private void fetchAllQuestions() {
        config conf = new config();
        try {
            ResultSet rs = conf.getData("SELECT q_text FROM tbl_question");
            questions.clear();
            while (rs.next()) {
                questions.add(rs.getString("q_text"));
            }
            conf.closeResult(rs);
            if (!questions.isEmpty()) {
                ratings = new int[questions.size()];
                displayQuestion();
            }
        } catch (SQLException e) {
            System.out.println("Error loading questions: " + e.getMessage());
        }
    }
    private void displayQuestion() {
        if (currentQuestionIndex < questions.size()) {
            lblQuestion.setText((currentQuestionIndex + 1) + ". " + questions.get(currentQuestionIndex));
            bgroup.clearSelection();
        }
    }
    
    private void submitEvaluation() {
        // 1. Validate all questions are answered
        for (int i = 0; i < ratings.length; i++) {
            if (ratings[i] == 0) {
                JOptionPane.showMessageDialog(this, "Please answer question #" + (i + 1));
                currentQuestionIndex = i;
                displayQuestion();
                return;
            }
        }

        // 2. Calculate average
        double total = 0;
        for (int r : ratings) total += r;
        double average = total / questions.size();
        
        // 3. Get Teacher ID (t_u_id) from ComboBox
        String selected = teacherDropdown.getSelectedItem().toString();
        String t_u_id = selected.split(" - ")[0];
        
        // 4. Determine Remarks
        String remarks = (average >= 3.0) ? "Satisfactory" : "Needs Improvement";
        String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());

        // 5. Insert Data
        config conf = new config();
        // Standardized to use t_u_id and s_u_id
        String sql = "INSERT INTO tbl_evaluation (t_u_id, s_u_id, e_average_rating, e_remarks, e_date, e_year, e_sem) "
                   + "VALUES ('" + t_u_id + "', '" + config.getID() + "', '" + average + "', '" + remarks + "', '" + date + "', '2024', '1st Semester')";
        
        if (conf.insertData(sql)) {
            JOptionPane.showMessageDialog(this, "Evaluation Submitted Successfully!");
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Submission Failed. Database might be busy.");
        }
    }
    private void displayCurrentQuestion() {
    if (currentQuestionIndex >= 0 && currentQuestionIndex < questions.size()) {
        lblQuestion.setText(questions.get(currentQuestionIndex)); // Your question label
        
        // Restore previous selection if it exists
        bgroup.clearSelection();
        int savedRating = ratings[currentQuestionIndex];
        if (savedRating == 1) r1.setSelected(true);
        else if (savedRating == 2) r2.setSelected(true);
        else if (savedRating == 3) r3.setSelected(true);
        else if (savedRating == 4) r4.setSelected(true);
        else if (savedRating == 5) r5.setSelected(true);
    }
}
    private int getSelectedGrade() {
        if (r1.isSelected()) return 1;
        if (r2.isSelected()) return 2;
        if (r3.isSelected()) return 3;
        if (r4.isSelected()) return 4;
        if (r5.isSelected()) return 5;
        return 0; // Returns 0 if nothing is selected
    }
    
   private double calculateAverage() {
        double total = 0;
        for (int rating : ratings) {
            total += rating;
        }
        return (questions.isEmpty()) ? 0 : total / questions.size();
    }
   
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
        studDashboard s = new studDashboard();
        s.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        studDashboard s = new studDashboard();
        s.setVisible(true);
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

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed

    private void r1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r1ActionPerformed

    private void r3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r3ActionPerformed

    private void r4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r4ActionPerformed

    private void r5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r5ActionPerformed

    private void teacherDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherDropdownActionPerformed

    private void NEXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NEXTMouseClicked
       if (r1.isSelected()) ratings[currentQuestionIndex] = 1;
        else if (r2.isSelected()) ratings[currentQuestionIndex] = 2;
        else if (r3.isSelected()) ratings[currentQuestionIndex] = 3;
        else if (r4.isSelected()) ratings[currentQuestionIndex] = 4;
        else if (r5.isSelected()) ratings[currentQuestionIndex] = 5;

        if (currentQuestionIndex < questions.size() - 1) {
            currentQuestionIndex++;
            displayQuestion();
        } else {
            submitEvaluation();
        }
    

    }//GEN-LAST:event_NEXTMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        if (currentQuestionIndex > 0) {
            // Optionally save the current rating before going back
            ratings[currentQuestionIndex] = getSelectedGrade();

            currentQuestionIndex--;
            displayCurrentQuestion();
        }
        

    }//GEN-LAST:event_jLabel4MouseClicked

        private void saveAllToDatabase() {
            String teacherName = teacherDropdown.getSelectedItem().toString();
            if (teacherName.equals("— Select Teacher —")) {
                JOptionPane.showMessageDialog(this, "Please select a teacher!");
                return;
            }

            config conf = new config();
            String date = new java.text.SimpleDateFormat("yyyy-MM-dd").format(new java.util.Date());
            boolean success = true;

            for (int i = 0; i < questions.size(); i++) {
                // Matches tbl_evaluation: t_id, s_u_id, e_average_rating, e_date, e_remarks
                String sql = "INSERT INTO tbl_evaluation (t_u_id, s_u_id, e_average_rating, e_date, e_remarks) "
                + "VALUES ("
                + "(SELECT u_id FROM tbl_user WHERE u_name = '" + teacherName + "'), "
                + "'" + config.getOnlineID() + "', "
                + "'" + ratings[i] + "', "
                + "'" + date + "', "
                + "'Question " + (i + 1) + "')";

                if (!conf.insertData(sql)) {
                    success = false;
                    break;
                }
            }

            if (success) {
                JOptionPane.showMessageDialog(this, "Evaluation Submitted Successfully!");
                this.dispose();
            }
}
       
        
    private void saveEvaluation() {
        String teacherName = teacherDropdown.getSelectedItem().toString();
        if (teacherName.equals("— Select Teacher —")) {
            JOptionPane.showMessageDialog(this, "Please select a teacher!");
            return;
        }

        config conf = new config();
        String studentId = config.getOnlineID(); // Use the correct session getter from your config.java
        String teacherId = "";

        // 1. Fetch Teacher ID
        try {
            // Using tbl_user because your database snippet shows teachers are in tbl_user
            String query = "SELECT u_id FROM tbl_user WHERE u_name = '" + teacherName + "'";
            java.sql.ResultSet rs = conf.getData(query);
            if (rs.next()) {
                teacherId = rs.getString("u_id");
            }
            conf.closeResult(rs); 
        } catch (java.sql.SQLException e) {
            System.out.println("Error fetching teacher: " + e.getMessage());
        }

        // 2. Save Average to tbl_evaluation
        double average = calculateAverage();
        String sql = "INSERT INTO tbl_evaluation (t_u_id, s_u_id, e_average_rating, e_date) VALUES (?, ?, ?, DATE('now'))";
        
        // Use addRecord from your config.java (it handles closing the connection for you)
        int result = conf.addRecord(sql, teacherId, studentId, average);

        if (result > 0) {
            JOptionPane.showMessageDialog(null, "Evaluation Saved Successfully!");
            new studDashboard().setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Error saving evaluation. Database might be busy.");
        }
    }
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
            java.util.logging.Logger.getLogger(evaluate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(evaluate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(evaluate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(evaluate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new evaluate().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JLabel NEXT;
    private javax.swing.JPanel a;
    private javax.swing.JLabel account;
    private javax.swing.JLabel account1;
    private javax.swing.JLabel back;
    private javax.swing.ButtonGroup bgroup;
    private javax.swing.JPanel d;
    private javax.swing.JLabel dashbord;
    private javax.swing.JPanel e;
    private javax.swing.JPanel g;
    private javax.swing.JPanel h;
    private javax.swing.JPanel i;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
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
