/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

        

/**
 *
 * @author junio
 */
public class Administration_Secretery extends javax.swing.JFrame {

    /**
     * Creates new form Administration_secretary
     */
    public Administration_Secretery() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_Grammateiaemail = new javax.swing.JLabel();
        jLabel_Secretery_efimeridas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabelMin = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField_Email_Of_Emloyee = new javax.swing.JTextField();
        jButton_Show_Profit_Of_Employee = new javax.swing.JButton();
        jButton_Sector_editor = new javax.swing.JButton();
        jButton_Sector_journalist = new javax.swing.JButton();
        jButton_show_secretery = new javax.swing.JButton();
        jButton_show_logistics = new javax.swing.JButton();
        jButton_data_for_a_paper = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_printing_data = new javax.swing.JTable();
        jButton_data_for_a_paper1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Harlow Solid Italic", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Administation - Secretery Sector ");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Welcome, ");

        jLabel_Grammateiaemail.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel_Grammateiaemail.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Grammateiaemail.setText("<email>");

        jLabel_Secretery_efimeridas.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel_Secretery_efimeridas.setForeground(new java.awt.Color(0, 0, 0));
        jLabel_Secretery_efimeridas.setText("<workson>");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel_Grammateiaemail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 831, Short.MAX_VALUE)
                .addComponent(jLabel_Secretery_efimeridas))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Secretery_efimeridas, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel_Grammateiaemail)
                        .addComponent(jLabel2))))
        );

        jPanel2.setBackground(new java.awt.Color(241, 231, 254));

        jLabelMin.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(0, 0, 0));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        jLabelClose.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(0, 0, 0));
        jLabelClose.setText("x");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(1099, Short.MAX_VALUE)
                .addComponent(jLabelMin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelClose)
                .addGap(11, 11, 11))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 153, 153));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Payment Data.");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Data for particular employee. ");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Data for particular sector. ");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("1. Editor In Chief. ");

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("3. Secretery. ");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("4. Logistics.");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Data for the whole paper. ");

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("2. Journalists.");

        jTextField_Email_Of_Emloyee.setText("Email of empoyee..");

        jButton_Show_Profit_Of_Employee.setText("Show!");
        jButton_Show_Profit_Of_Employee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Show_Profit_Of_EmployeeActionPerformed(evt);
            }
        });

        jButton_Sector_editor.setText("Show.");
        jButton_Sector_editor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Sector_editorActionPerformed(evt);
            }
        });

        jButton_Sector_journalist.setText("Show.");
        jButton_Sector_journalist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Sector_journalistActionPerformed(evt);
            }
        });

        jButton_show_secretery.setText("Show.");
        jButton_show_secretery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_show_secreteryActionPerformed(evt);
            }
        });

        jButton_show_logistics.setText("Show.");
        jButton_show_logistics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_show_logisticsActionPerformed(evt);
            }
        });

        jButton_data_for_a_paper.setText("Everything");
        jButton_data_for_a_paper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_data_for_a_paperActionPerformed(evt);
            }
        });

        jTable_printing_data.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable_printing_data);

        jButton_data_for_a_paper1.setText("Sum of costs");
        jButton_data_for_a_paper1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_data_for_a_paper1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(35, 35, 35)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_data_for_a_paper1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton_data_for_a_paper, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField_Email_Of_Emloyee)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(98, 98, 98)
                                .addComponent(jLabel5))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addComponent(jLabel12))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Show_Profit_Of_Employee)
                            .addComponent(jButton_Sector_editor)
                            .addComponent(jButton_show_logistics)
                            .addComponent(jButton_show_secretery)
                            .addComponent(jButton_Sector_journalist))))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_Email_Of_Emloyee, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Show_Profit_Of_Employee))
                        .addGap(70, 70, 70)
                        .addComponent(jLabel6)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jButton_Sector_editor))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel12)
                            .addComponent(jButton_Sector_journalist))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jButton_show_secretery))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jButton_show_logistics))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel11))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addComponent(jButton_data_for_a_paper)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_data_for_a_paper1)))
                        .addGap(67, 67, 67))
                    .addComponent(jScrollPane1))
                .addGap(217, 217, 217))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jButton_Show_Profit_Of_EmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Show_Profit_Of_EmployeeActionPerformed
        // TODO add your handling code here:
        
        PreparedStatement Show_data;
        ResultSet RShow_data;
        
        //diegrapse ta auta valta opou ta xreiazesai den tah xriazesai edw 
        
        
        String cur_employee_email =  jTextField_Email_Of_Emloyee.getText();
        String cur_employee_workplace =  jLabel_Secretery_efimeridas.getText();

        System.out.println(cur_employee_email);
        
        
         
        
        /*String q_select_art = "SELECT `article`.`Path` AS Arthra,`article`.`title` AS Titloi,`article`.`Summary` AS Perilipseis,"
                + "`article`.`artCategory` AS Kathgories,`article`.`editorCheck` AS Elegxthike_apo,"
                + "`article`.`editorComment` AS Comment ,`article`.`publishedin` AS dimosieuthike ,`article`.`dateCheck` AS Elegxike ,"
                + "`article`.`pages_capacity` AS Selides "
                + "FROM `submit_article`"
                + " INNER JOIN  `article` ON `sub_article` = `Path` WHERE `sub_journalist` = ? ";
        */
        
        String Show_employee = "SELECT name AS ONOMA,surname AS EPITHETO ,profit AS MISTHOS FROM employee WHERE email = ? AND workson = ?";
        
        
        
        
        
        try {
            Show_data = Myconnection.ConnectDb().prepareStatement(Show_employee);
       
            
            Show_data.setString(1,cur_employee_email);
            Show_data.setString(2,cur_employee_workplace);
            
            RShow_data = Show_data.executeQuery();
            
            jTable_printing_data.setModel(DbUtils.resultSetToTableModel(RShow_data));
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Dimosiografos.class.getName()).log(Level.SEVERE, null, ex);
        } 
     
        
        
        
    }//GEN-LAST:event_jButton_Show_Profit_Of_EmployeeActionPerformed

    private void jButton_Sector_editorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Sector_editorActionPerformed
        // TODO add your handling code here:
        
        PreparedStatement Show_data_e;
        ResultSet RShow_data_e;
        
        String a = "editor-in-chief";
        String cur_employee_workplace_E =  jLabel_Secretery_efimeridas.getText();
        
        String Print_Profit_of_employee = "SELECT name AS ONOMA,surname AS EPITHETO ,profit AS MISTHOS "
                + " FROM employee "
                + " INNER JOIN journalist ON j_email = email"
                + " WHERE j_specialty = ? AND workson = ?";

        
        
        try {
            Show_data_e = Myconnection.ConnectDb().prepareStatement(Print_Profit_of_employee);
       
            
            Show_data_e.setString(1,a);
            Show_data_e.setString(2,cur_employee_workplace_E);
            
            RShow_data_e = Show_data_e.executeQuery();
            
            jTable_printing_data.setModel(DbUtils.resultSetToTableModel(RShow_data_e));
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Dimosiografos.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        
        
        
    }//GEN-LAST:event_jButton_Sector_editorActionPerformed

    private void jButton_Sector_journalistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Sector_journalistActionPerformed
        // TODO add your handling code here:
        
        
        PreparedStatement Show_data_j;
        ResultSet RShow_data_j;
        
        String b = "journalist";

        String cur_employee_workplace_j =  jLabel_Secretery_efimeridas.getText();
        
        String Print_Profit_of_employee = "SELECT name AS ONOMA,surname AS EPITHETO ,profit AS MISTHOS "
                + " FROM employee "
                + " INNER JOIN journalist ON j_email = email"
                + " WHERE j_specialty = ? AND workson = ?";

        
        
        try {
            Show_data_j = Myconnection.ConnectDb().prepareStatement(Print_Profit_of_employee);
       
            
            Show_data_j.setString(1,b);
            Show_data_j.setString(2,cur_employee_workplace_j);
            
            RShow_data_j = Show_data_j.executeQuery();
            
            jTable_printing_data.setModel(DbUtils.resultSetToTableModel(RShow_data_j));
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Dimosiografos.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
     
        
    }//GEN-LAST:event_jButton_Sector_journalistActionPerformed

    private void jButton_show_secreteryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_show_secreteryActionPerformed
        // TODO add your handling code here:
        PreparedStatement Show_data_s;
        ResultSet RShow_data_s;
        
        String c = "Secretary";

        String cur_employee_workplace_s =  jLabel_Secretery_efimeridas.getText();
        
        String Print_Profit_of_employee = "SELECT name AS ONOMA,surname AS EPITHETO ,profit AS MISTHOS "
                + " FROM employee "
                + " INNER JOIN administrative ON admin_email = email"
                + " WHERE admin_duties = ? AND workson = ?";

        
        
        try {
            Show_data_s = Myconnection.ConnectDb().prepareStatement(Print_Profit_of_employee);
       
            
            Show_data_s.setString(1,c);
            Show_data_s.setString(2,cur_employee_workplace_s);
            
            RShow_data_s = Show_data_s.executeQuery();
            
            jTable_printing_data.setModel(DbUtils.resultSetToTableModel(RShow_data_s));
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Dimosiografos.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        
    }//GEN-LAST:event_jButton_show_secreteryActionPerformed

    private void jButton_show_logisticsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_show_logisticsActionPerformed
        // TODO add your handling code here:
       
        
        
        PreparedStatement Show_data_l;
        ResultSet RShow_data_l;
        
        String d = "Logistics";
        String cur_employee_workplace_l =  jLabel_Secretery_efimeridas.getText();
        
        String Print_Profit_of_employee = "SELECT name AS ONOMA,surname AS EPITHETO ,profit AS MISTHOS "
                + " FROM employee "
                + " INNER JOIN administrative ON admin_email = email"
                + " WHERE admin_duties = ? AND workson = ?";

        
        
        try {
            Show_data_l = Myconnection.ConnectDb().prepareStatement(Print_Profit_of_employee);
       
            
            Show_data_l.setString(1,d);
            Show_data_l.setString(2,cur_employee_workplace_l);
            
            RShow_data_l = Show_data_l.executeQuery();
            
            jTable_printing_data.setModel(DbUtils.resultSetToTableModel(RShow_data_l));
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Dimosiografos.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton_show_logisticsActionPerformed

    private void jButton_data_for_a_paperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_data_for_a_paperActionPerformed
        // TODO add your handling code here:
        
        
        PreparedStatement Show_ALL_data;
        ResultSet RShow_ALL_data;
        
      
        String OLAOLAOLA =  jLabel_Secretery_efimeridas.getText();
        
        String Print_Profit_of_employee = "SELECT name AS ONOMA,surname AS EPITHETO ,profit AS MISTHOS "
                + " FROM employee WHERE workson = ? ";      
        
        try {
            Show_ALL_data = Myconnection.ConnectDb().prepareStatement(Print_Profit_of_employee);
       
            
            Show_ALL_data.setString(1,OLAOLAOLA);
            
            
            RShow_ALL_data = Show_ALL_data.executeQuery();
            
            jTable_printing_data.setModel(DbUtils.resultSetToTableModel(RShow_ALL_data));
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Dimosiografos.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton_data_for_a_paperActionPerformed

    private void jButton_data_for_a_paper1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_data_for_a_paper1ActionPerformed
        // TODO add your handling code here:
        
        
        
        PreparedStatement SUM;
        ResultSet RSUM;
        
      
        String TAPANTA =  jLabel_Secretery_efimeridas.getText();
        
        String Print_Profit_of_employee = "SELECT sum(profit) AS EKSODA "
                + " FROM employee WHERE workson = ? ";      
        
        try {
            SUM = Myconnection.ConnectDb().prepareStatement(Print_Profit_of_employee);
       
            
            SUM.setString(1,TAPANTA);
            
            
            RSUM = SUM.executeQuery();
            
            jTable_printing_data.setModel(DbUtils.resultSetToTableModel(RSUM));
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Dimosiografos.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton_data_for_a_paper1ActionPerformed

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
            java.util.logging.Logger.getLogger(Administration_Secretery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administration_Secretery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administration_Secretery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administration_Secretery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administration_Secretery().setVisible(true);
            }
        });
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Sector_editor;
    private javax.swing.JButton jButton_Sector_journalist;
    private javax.swing.JButton jButton_Show_Profit_Of_Employee;
    private javax.swing.JButton jButton_data_for_a_paper;
    private javax.swing.JButton jButton_data_for_a_paper1;
    private javax.swing.JButton jButton_show_logistics;
    private javax.swing.JButton jButton_show_secretery;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    public javax.swing.JLabel jLabel_Grammateiaemail;
    public javax.swing.JLabel jLabel_Secretery_efimeridas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_printing_data;
    private javax.swing.JTextField jTextField_Email_Of_Emloyee;
    // End of variables declaration//GEN-END:variables
}
