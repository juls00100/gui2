/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x_admin;
import authenticate.logIn;
import config.config;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import javax.swing.JLabel;

/**
 *
 * @author juls
 */
public class adminDashboard extends javax.swing.JFrame {
private String currentImagePath;
    private String currentUserName;
    public static class CircularLabel extends JLabel {
        
        // 2. REMOVE 'static' FROM THE METHOD
        @Override
        protected void paintComponent(Graphics g) {
            Graphics2D g2 = (Graphics2D) g.create();
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            
            // Create a circular clip
            Ellipse2D.Double circle = new Ellipse2D.Double(0, 0, getWidth(), getHeight());
            g2.setClip(circle);
            
            super.paintComponent(g2);
            g2.dispose();
        }
    }
    private CircularLabel profile;


    public adminDashboard(String name, String imagePath) {
        this.currentUserName = name;
        this.currentImagePath = imagePath;
        initComponents(); // Call this to update the UI
        namee.setText(currentUserName);
        
        if (currentImagePath != null && !currentImagePath.isEmpty()) {
        profile.setIcon(new javax.swing.ImageIcon(new javax.swing.ImageIcon(currentImagePath).getImage().getScaledInstance(profile.getWidth(), profile.getHeight(), java.awt.Image.SCALE_SMOOTH)));
        }
        refreshStats();
        }
    
    public adminDashboard() {
        initComponents();
        refreshStats();
        namee.setText(config.getName());
        
        String path = config.getImage();
        if (path != null && !path.isEmpty()) {
        // This scales the image to fit your profile JLabel perfectly
        profile.setIcon(new javax.swing.ImageIcon(new javax.swing.ImageIcon(path).getImage().getScaledInstance(60, 60, java.awt.Image.SCALE_SMOOTH)));
        }
    
    }
    public void refreshStats() {
        config conf = new config();
        
        
        int totalUsers = conf.getCount("SELECT COUNT(*) FROM tbl_user WHERE u_type != 'Admin'");
        users4.setText(String.valueOf(totalUsers));

        // 2. Pending Approvals
        int pending = conf.getCount("SELECT COUNT(*) FROM tbl_user WHERE u_status = 'Pending'");
        pending1.setText(String.valueOf(pending));

        // 3. Active Evaluations (Assuming you have a tbl_evaluation)
        int activeEvals = conf.getCount("SELECT COUNT(DISTINCT t_id) FROM tbl_evaluation");
        eprog3.setText(String.valueOf(activeEvals));

        // 4. Progress Percentage (Logic: (Total Evals / Total Students) * 100)
        int totalStudents = conf.getCount("SELECT COUNT(*) FROM tbl_user WHERE u_type = 'Student'");
        int finishedEvals = conf.getCount("SELECT COUNT(DISTINCT s_u_id) FROM tbl_evaluation");

        if (totalStudents > 0) {
            int percentage = (finishedEvals * 100) / totalStudents;
            activeE1.setText(percentage + "%");
        } else {
            activeE1.setText("0%");
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        a = new javax.swing.JPanel();
        account = new javax.swing.JLabel();
        b = new javax.swing.JPanel();
        evaluations = new javax.swing.JLabel();
        d = new javax.swing.JPanel();
        dashbord = new javax.swing.JLabel();
        e = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        g = new javax.swing.JPanel();
        user = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();
        h = new javax.swing.JPanel();
        account1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        user1 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        profile = new config.config.CircularLabel();
        namee = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        activeE = new javax.swing.JLabel();
        activeE1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        activeE2 = new javax.swing.JLabel();
        activeE3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        pending = new javax.swing.JLabel();
        pending1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        users4 = new javax.swing.JLabel();
        users5 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        eprog2 = new javax.swing.JLabel();
        eprog3 = new javax.swing.JLabel();

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

        b.setBackground(new java.awt.Color(197, 179, 88));
        b.setForeground(new java.awt.Color(197, 179, 88));
        b.setPreferredSize(new java.awt.Dimension(142, 30));

        evaluations.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        evaluations.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        evaluations.setText("ACADEMIC CONTENT");

        javax.swing.GroupLayout bLayout = new javax.swing.GroupLayout(b);
        b.setLayout(bLayout);
        bLayout.setHorizontalGroup(
            bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(evaluations, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        bLayout.setVerticalGroup(
            bLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(evaluations, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 160, -1));

        d.setBackground(new java.awt.Color(197, 179, 88));
        d.setForeground(new java.awt.Color(197, 179, 88));
        d.setPreferredSize(new java.awt.Dimension(142, 30));

        dashbord.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        dashbord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashbord.setText("DASHBOARD");
        dashbord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashbordMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout dLayout = new javax.swing.GroupLayout(d);
        d.setLayout(dLayout);
        dLayout.setHorizontalGroup(
            dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashbord, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        dLayout.setVerticalGroup(
            dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dashbord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(d, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, -1));

        e.setBackground(new java.awt.Color(197, 179, 88));
        e.setForeground(new java.awt.Color(197, 179, 88));
        e.setPreferredSize(new java.awt.Dimension(142, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("MANAGE QUESTIONS");
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

        jPanel2.add(e, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 160, -1));

        g.setBackground(new java.awt.Color(197, 179, 88));
        g.setForeground(new java.awt.Color(197, 179, 88));

        user.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user.setText("USER MANAGEMENT");
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

        jPanel2.add(g, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 160, 30));

        jPanel4.setBackground(new java.awt.Color(44, 62, 80));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(back)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Back, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 90, 30));

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

        user1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        user1.setForeground(new java.awt.Color(197, 179, 88));
        user1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user1.setText("Admin Portal");
        user1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user1MouseClicked(evt);
            }
        });
        jPanel3.add(user1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 500, 70));

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
        jPanel3.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 70, 20));

        profile.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 179, 88)));
        jPanel3.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 50));

        namee.setBackground(new java.awt.Color(44, 62, 80));
        namee.setFont(new java.awt.Font("Segoe UI Black", 0, 16)); // NOI18N
        namee.setForeground(new java.awt.Color(240, 240, 240));
        jPanel3.add(namee, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 140, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        jPanel5.setBackground(new java.awt.Color(79, 20, 54));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("System Overview");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 230, 30));

        jPanel6.setBackground(new java.awt.Color(45, 52, 54));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        activeE.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        activeE.setForeground(new java.awt.Color(240, 240, 240));
        activeE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        activeE.setText("Evaluations");
        jPanel6.add(activeE, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, -1));

        activeE1.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 24)); // NOI18N
        activeE1.setForeground(new java.awt.Color(240, 240, 240));
        activeE1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel6.add(activeE1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, 40));

        jPanel7.setBackground(new java.awt.Color(45, 52, 54));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        activeE2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        activeE2.setForeground(new java.awt.Color(240, 240, 240));
        activeE2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        activeE2.setText("Evaluations");
        jPanel7.add(activeE2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, -1));

        activeE3.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 24)); // NOI18N
        activeE3.setForeground(new java.awt.Color(240, 240, 240));
        activeE3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel7.add(activeE3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, 40));

        jPanel6.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 240, 110));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, 240, 110));

        jPanel8.setBackground(new java.awt.Color(45, 52, 54));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pending.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pending.setForeground(new java.awt.Color(240, 240, 240));
        pending.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pending.setText("Pending Approvals");
        jPanel8.add(pending, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 10, 240, -1));

        pending1.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 24)); // NOI18N
        pending1.setForeground(new java.awt.Color(240, 240, 240));
        pending1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel8.add(pending1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, 40));

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 240, 110));

        jPanel9.setBackground(new java.awt.Color(45, 52, 54));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        users4.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 24)); // NOI18N
        users4.setForeground(new java.awt.Color(240, 240, 240));
        users4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel9.add(users4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, 40));

        users5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        users5.setForeground(new java.awt.Color(240, 240, 240));
        users5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        users5.setText("Users");
        jPanel9.add(users5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, -1));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 240, 110));

        jPanel10.setBackground(new java.awt.Color(45, 52, 54));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eprog2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        eprog2.setForeground(new java.awt.Color(240, 240, 240));
        eprog2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eprog2.setText("Evaluation Progress");
        jPanel10.add(eprog2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, -1));

        eprog3.setFont(new java.awt.Font("Matura MT Script Capitals", 0, 24)); // NOI18N
        eprog3.setForeground(new java.awt.Color(240, 240, 240));
        eprog3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel10.add(eprog3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 120, 40));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 240, 110));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseClicked
        manageUsers userstableFrame = new manageUsers();
        userstableFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_userMouseClicked

    private void user1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_user1MouseClicked

    private void userMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_userMouseEntered

    private void accountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accountMouseClicked
       userAccount accFrame = new userAccount();
        accFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_accountMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
                                       
        int confirm = javax.swing.JOptionPane.showConfirmDialog(null, 
            "Do you really want to log out?", "Logout", javax.swing.JOptionPane.YES_NO_OPTION);

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            config.setSession(null, null, null, null, null); 
            new logIn().setVisible(true);
            this.dispose(); 
        }

    }//GEN-LAST:event_logoutMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        adminDashboard ad = new adminDashboard();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        adminDashboard ad = new adminDashboard();
        ad.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackMouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        manageQ manageqFrame = new manageQ();
        manageqFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void account1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_account1MouseClicked
        
    }//GEN-LAST:event_account1MouseClicked

    private void dashbordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashbordMouseClicked
        adminDashboard dashFrame = new adminDashboard();
        dashFrame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dashbordMouseClicked

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
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JPanel a;
    private javax.swing.JLabel account;
    private javax.swing.JLabel account1;
    private javax.swing.JLabel activeE;
    private javax.swing.JLabel activeE1;
    private javax.swing.JLabel activeE2;
    private javax.swing.JLabel activeE3;
    private javax.swing.JPanel b;
    private javax.swing.JLabel back;
    private javax.swing.JPanel d;
    private javax.swing.JLabel dashbord;
    private javax.swing.JPanel e;
    private javax.swing.JLabel eprog2;
    private javax.swing.JLabel eprog3;
    private javax.swing.JLabel evaluations;
    private javax.swing.JPanel g;
    private javax.swing.JPanel h;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel logout;
    public javax.swing.JLabel namee;
    private javax.swing.JLabel pending;
    private javax.swing.JLabel pending1;
    private javax.swing.JLabel profile;
    private javax.swing.JLabel user;
    private javax.swing.JLabel user1;
    private javax.swing.JLabel users4;
    private javax.swing.JLabel users5;
    // End of variables declaration//GEN-END:variables
}
