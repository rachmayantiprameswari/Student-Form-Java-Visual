package com.db.program;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RACHMAYANTI
 */

public class student extends javax.swing.JFrame {
     private void blank_form(){
        txtstdID.setText(null);
        txtname.setText(null);
        txtemail.setText(null);
        buttonGroup1.clearSelection();
        txtcity.setText(null);
        cmbreligion.setSelectedIndex(0);
        txtgpa.setText(null);
        cmbbatch.setSelectedIndex(0);
        buttonGroup2.clearSelection();
        buttonGroup3.clearSelection();
        cmbmajor.setSelectedIndex(0);
        txtaddress.setText(null);
    }
     JCheckBox[] arrDegree;
    private void ShowData() {
        DefaultTableModel model= new DefaultTableModel();
        model.addColumn ("No.");
        model.addColumn ("Student ID");
        model.addColumn ("Name");
        model.addColumn ("Email");
        model.addColumn ("Gender");
        model.addColumn ("City");
        model.addColumn ("Religion");
        model.addColumn ("GPA");
        model.addColumn ("Batch");
        model.addColumn ("Degree");
        model.addColumn ("Faculty");
        model.addColumn ("Major");
        model.addColumn ("Address");

        try{
            int no= 1;
            String sql= "SELECT * FROM student";
            java.sql.Connection conn= (Connection)config.configDB();
            java.sql.Statement stm= conn.createStatement();
            java.sql.ResultSet res= stm.executeQuery(sql);

            while (res.next()){
                model.addRow (new Object[]{
                    no++, res.getString(1), 
                    res.getString(2),
                    res.getString(3), 
                    res.getString(4), 
                    res.getString(5), 
                    res.getString(6), 
                    res.getString(7),  
                    res.getString(8),
                    res.getString(9),
                    res.getString(10),
                    res.getString(11),
                    res.getString(12)
                });
                table_student.setModel(model);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public student() {
        initComponents();
        ShowData();
        blank_form();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cmbreligion = new javax.swing.JComboBox<>();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        txtcity = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbbatch = new javax.swing.JComboBox<>();
        degree1 = new javax.swing.JCheckBox();
        degree2 = new javax.swing.JCheckBox();
        faculty1 = new javax.swing.JRadioButton();
        faculty2 = new javax.swing.JRadioButton();
        faculty3 = new javax.swing.JRadioButton();
        faculty4 = new javax.swing.JRadioButton();
        cmbmajor = new javax.swing.JComboBox<>();
        txtstdID = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_student = new javax.swing.JTable();
        add = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtgpa = new javax.swing.JTextField();

        jTextField3.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Data Application");
        setBackground(new java.awt.Color(204, 102, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("REGISTRATION STUDENTS DATA");

        jLabel12.setText("Name");

        jLabel13.setText("Email");

        jLabel14.setText("Gender");

        jLabel15.setText("City");

        jLabel16.setText("Religion");

        jLabel18.setText("Address");

        cmbreligion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option:", "Islam", "Kristen", "Katolik", "Hindu", "Buddha", "Konghucu" }));

        buttonGroup1.add(male);
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });

        buttonGroup1.add(female);
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });

        txtemail.setText(" ");

        txtname.setText(" ");

        jLabel3.setText("Student ID");

        jLabel4.setText("Batch");

        jLabel5.setText("Degree");

        jLabel6.setText("Faculty");

        jLabel7.setText("Major");

        cmbbatch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option:", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));

        buttonGroup2.add(degree1);
        degree1.setText("S1");
        degree1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degree1ActionPerformed(evt);
            }
        });

        buttonGroup2.add(degree2);
        degree2.setText("S2");
        degree2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degree2ActionPerformed(evt);
            }
        });

        buttonGroup3.add(faculty1);
        faculty1.setText("Business");
        faculty1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faculty1ActionPerformed(evt);
            }
        });

        buttonGroup3.add(faculty2);
        faculty2.setText("Engineering");
        faculty2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faculty2ActionPerformed(evt);
            }
        });

        buttonGroup3.add(faculty3);
        faculty3.setText("Computer Science");
        faculty3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faculty3ActionPerformed(evt);
            }
        });

        buttonGroup3.add(faculty4);
        faculty4.setText("Humanities");
        faculty4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faculty4ActionPerformed(evt);
            }
        });

        cmbmajor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Option:", "Accounting", "Business Administration", "Management", "Actuarial Science", "Civil Engineering", "Industrial Engineering", "Mechanical Engineering", "Electrical Engineering", "Environmental Engineering", "Information Technology", "Information System", "Visual Communication Design", "International Relations", "Communication", "Law", "Primary School Teacher Education (PSTE)" }));

        jScrollPane2.setToolTipText("Student data table");

        table_student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Student ID", "Name", "Email", "Gender", "City", "Religion", "GPA", "Batch", "Degree", "Faculty", "Major", "Address"
            }
        ));
        table_student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table_studentMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table_student);

        add.setBackground(new java.awt.Color(51, 51, 255));
        add.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        add.setText("Add");
        add.setToolTipText("Add the selected data");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(153, 153, 255));
        edit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        edit.setText("Edit");
        edit.setToolTipText("Edit the selected data");
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 51, 51));
        delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete.setText("Delete");
        delete.setToolTipText("Delete the selected data");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        cancel.setBackground(new java.awt.Color(255, 255, 102));
        cancel.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancel.setText("Cancel");
        cancel.setToolTipText("Cancel the selected data");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        exit.setBackground(new java.awt.Color(204, 0, 51));
        exit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        exit.setText("Exit");
        exit.setToolTipText("Exit the selected data");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel2.setText("GPA");

        txtgpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtgpaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(265, 265, 265))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel16)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtstdID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(male)
                                .addGap(10, 10, 10)
                                .addComponent(female))
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtcity, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtgpa, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cmbreligion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel18))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(faculty1)
                                    .addComponent(faculty2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(faculty3)
                                    .addComponent(faculty4)))
                            .addComponent(cmbmajor, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbbatch, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(degree1)
                                .addGap(18, 18, 18)
                                .addComponent(degree2))
                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 370, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 204, Short.MAX_VALUE)
                .addComponent(add)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exit)
                .addGap(247, 247, 247))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtstdID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel12))
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(male)
                            .addComponent(female))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(txtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbreligion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtgpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbbatch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(degree1)
                    .addComponent(degree2)
                    .addComponent(jLabel5))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(faculty1)
                            .addComponent(jLabel6))
                        .addGap(14, 14, 14)
                        .addComponent(faculty2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(faculty3)
                        .addGap(14, 14, 14)
                        .addComponent(faculty4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbmajor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add)
                    .addComponent(edit)
                    .addComponent(delete)
                    .addComponent(cancel)
                    .addComponent(exit))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        setSize(new java.awt.Dimension(806, 689));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    private void table_studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table_studentMouseClicked
        // TODO add your handling code here:
        int row= table_student.rowAtPoint(evt.getPoint());
        String Student_id= table_student.getValueAt (row, 1).toString();
        txtstdID.setText(Student_id);
        
        String Student_name= table_student.getValueAt (row, 2).toString();
        txtname.setText(Student_name);
        
        String Mail= table_student.getValueAt (row, 3).toString();
        txtemail.setText(Mail);
        
        String gender = table_student.getValueAt (row, 4).toString();
        if(gender.equals("Male")){
            male.setSelected(true);
        } if (gender.equals("Female")){
            female.setSelected(true);
        }
        
        String City= table_student.getValueAt (row, 5).toString();
        txtcity.setText(City);
        
        String Religion= table_student.getValueAt (row, 6).toString();
        cmbreligion.setSelectedItem(Religion);
        
        String Student_GPA= table_student.getValueAt (row, 7).toString();
        txtgpa.setText(Student_GPA);
        
        String Student_batch= table_student.getValueAt (row, 8).toString();
        cmbbatch.setSelectedItem(Student_batch);
        
        String degree = table_student.getValueAt (row, 9).toString();
        if(degree.equals("Degree1")){
            degree1.setSelected(true);
        } if (degree.equals("Degree2")){
            degree2.setSelected(true);
        }
        
        String faculty = table_student.getValueAt (row, 10).toString();
        if(faculty.equals("Faculty1")){
            faculty1.setSelected(true);
        } if (faculty.equals("Faculty2")){
            faculty2.setSelected(true);
        } if (faculty.equals("Faculty3")){
            faculty3.setSelected(true);
        }if (faculty.equals("Faculty4")){
            faculty4.setSelected(true);
        }
        
        String Student_major= table_student.getValueAt (row, 11).toString();
        cmbmajor.setSelectedItem(Student_major);
        
        String Student_address= table_student.getValueAt (row, 12).toString();
        txtaddress.setText(Student_address);
    }//GEN-LAST:event_table_studentMouseClicked

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        try{
        String d = null, a = "", b = ""; 
        String j = null;
        if (male.isSelected()) {
                d = "Male";
            }
        if (female.isSelected()) {
                d = "Female";
            }
        String Degree = a + b;
        if (degree1.isSelected()){
                a = "S1";
        }
        if (degree2.isSelected()){
                b = "S2";
        }
        if (faculty1.isSelected()) {
                j = "Business";
            }
        if (faculty2.isSelected()) {
                j = "Engineering";
            }
        if (faculty3.isSelected()){
                j = "Computer Science";
        }
        if (faculty4.isSelected()){
                j = "Humanities";
        } 
        
       
            String sql= "INSERT INTO student VALUES('"+txtstdID.getText()+"','"+txtname.getText()+"','"+txtemail.getText()+"','"+d+"','"
                 +txtcity.getText()+"','"+cmbreligion.getSelectedItem()+"','"+txtgpa.getText()+"','"+cmbbatch.getSelectedItem()+"','"
                 +Degree+"','"+j+"','"+cmbmajor.getSelectedItem()+"','"+txtaddress.getText()+"')";
                                 java.sql.Connection conn= (Connection)config.configDB();
                                 java.sql.PreparedStatement pstm= conn.prepareStatement(sql);
                                 pstm.execute();
                                 JOptionPane.showMessageDialog(null,"Saving data successful");
                                 ShowData();
                                 blank_form();
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }                                   

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {                                                            
    }//GEN-LAST:event_addActionPerformed

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editMouseClicked

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
         try{
        String d = null, a = "", b = ""; 
        String j = null;
        if (male.isSelected()) {
                d = "Male";
            }
        if (female.isSelected()) {
                d = "Female";
            }
        String Degree = a + b;
        if (degree1.isSelected()){
                a = "S1";
        }
        if (degree2.isSelected()){
                b = "S2";
        }
        if (faculty1.isSelected()) {
                j = "Business";
            }
        if (faculty2.isSelected()) {
                j = "Engineering";
            }
        if (faculty3.isSelected()){
                j = "Computer Science";
        }
        if (faculty4.isSelected()){
                j = "Humanities";
        } 

            String sql= "UPDATE student SET stdID='"+txtstdID.getText()+"',name='"+txtname.getText()+"',"
                    + "email='"+txtemail.getText()+"',gender='"+d+"',"
                    + "city='"+txtcity.getText()+"',religion='"+cmbreligion.getSelectedItem()+"',"
                    + "gpa='"+txtgpa.getText()+"',batch='"+cmbbatch.getSelectedItem()+"',degree='"+Degree+"',faculty='"+j+"',"
                    + "major='"+cmbmajor.getSelectedItem()+"',address='"+txtaddress.getText()+"',"
                    + "WHERE stdID='"+txtstdID.getText()+"'";
                  
            java.sql.Connection conn= (Connection)config.configDB();
            java.sql.PreparedStatement pstm= conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null,"Edit data successful");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(this,e.getMessage());
        }
        ShowData();
        blank_form();                                   
    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try{
            String sql="DELETE FROM java WHERE stdID="+txtstdID.getText()+"";
            java.sql.Connection conn= (Connection) config.configDB();
            java.sql.PreparedStatement pstm= conn.prepareStatement(sql);
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Delete data successful");
        }catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog (null, e.getMessage());
        }
        ShowData();
        blank_form();
    }//GEN-LAST:event_deleteActionPerformed

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
        // TODO add your handling code here:
        blank_form();
    }//GEN-LAST:event_cancelActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void txtgpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtgpaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtgpaActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleActionPerformed

    private void faculty1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faculty1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faculty1ActionPerformed

    private void faculty2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faculty2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faculty2ActionPerformed

    private void faculty3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faculty3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faculty3ActionPerformed

    private void faculty4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faculty4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_faculty4ActionPerformed

    private void degree1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degree1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degree1ActionPerformed

    private void degree2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degree2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_degree2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JButton cancel;
    private javax.swing.JComboBox<String> cmbbatch;
    private javax.swing.JComboBox<String> cmbmajor;
    private javax.swing.JComboBox<String> cmbreligion;
    private javax.swing.JCheckBox degree1;
    private javax.swing.JCheckBox degree2;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JButton exit;
    private javax.swing.JRadioButton faculty1;
    private javax.swing.JRadioButton faculty2;
    private javax.swing.JRadioButton faculty3;
    private javax.swing.JRadioButton faculty4;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JRadioButton male;
    private javax.swing.JTable table_student;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcity;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtgpa;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtstdID;
    // End of variables declaration//GEN-END:variables
}