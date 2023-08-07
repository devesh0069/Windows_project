import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.HeadlessException;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import java.text.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DEVESH_G
 */
public class DonorReport extends javax.swing.JFrame {
 ResultSet rs;
 PreparedStatement pt;
 
    /**
     * Creates new form DonorReport
     */
    public DonorReport() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Labdate = new javax.swing.JLabel();
        Labname = new javax.swing.JLabel();
        Labacetone = new javax.swing.JLabel();
        Labbloodgroup = new javax.swing.JLabel();
        Labsugar = new javax.swing.JLabel();
        Labage = new javax.swing.JLabel();
        Labgender = new javax.swing.JLabel();
        Labfasting = new javax.swing.JLabel();
        LabDR = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        Labsample = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        btnprint1 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        btnsearch = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        txtaadhar = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Donor Report");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DEVESH_G\\Documents\\NetBeansProjects\\Blood_&_Oxygen_Bank\\img\\back1.png")); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        Labdate.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel1.add(Labdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 200, 30));

        Labname.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel1.add(Labname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 190, 30));

        Labacetone.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel1.add(Labacetone, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 370, 130, 30));

        Labbloodgroup.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel1.add(Labbloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 130, 30));

        Labsugar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel1.add(Labsugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 320, 130, 30));

        Labage.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel1.add(Labage, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, 40, 30));

        Labgender.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel1.add(Labgender, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 70, 230, 30));

        Labfasting.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel1.add(Labfasting, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 480, 130, 30));

        LabDR.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel1.add(LabDR, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 190, 30));

        jLabel23.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel23.setText("BLOOD GROUP:");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel24.setText("URINE ACETONE:");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jLabel25.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel25.setText("GENDER:");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        jLabel26.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel26.setText("AGE:");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        jLabel27.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel27.setText("years");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 120, -1, 20));

        jLabel28.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel28.setText("FASTING BLOOD SUGAR:");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 480, -1, -1));

        jLabel29.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel29.setText("RESULT");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 280, -1, -1));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator3.setPreferredSize(new java.awt.Dimension(0, 5));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 204, 1080, -1));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 254, 1090, 10));

        jLabel30.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel30.setText("3.9 and 5.6 mmol/L");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 480, 140, 20));

        Labsample.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jPanel1.add(Labsample, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 190, 30));
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 41, -1, -1));

        btnprint1.setBackground(new java.awt.Color(0, 153, 153));
        btnprint1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnprint1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DEVESH_G\\Documents\\NetBeansProjects\\Blood_&_Oxygen_Bank\\img\\print.png")); // NOI18N
        btnprint1.setText("Print");
        btnprint1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        btnprint1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnprint1MouseClicked(evt);
            }
        });
        btnprint1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprint1ActionPerformed(evt);
            }
        });
        jPanel1.add(btnprint1, new org.netbeans.lib.awtextra.AbsoluteConstraints(952, 22, 90, 30));

        jLabel36.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel36.setText("SAMPLE COLLECTION AT:");
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 168, -1, 20));

        jLabel37.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel37.setText("REFFERED BY DOCTOR:");
        jPanel1.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, 20));

        jLabel39.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel39.setText("TEST");
        jPanel1.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jLabel40.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel40.setText("NORMAL VALUES");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 280, -1, -1));

        jLabel41.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel41.setText("URINE SUGAR:");
        jPanel1.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel31.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel31.setText(" 0 to 0.8 mmol/L");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, -1, -1));

        jLabel34.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel34.setText("DATE:");
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 160, -1, -1));

        btnsearch.setBackground(new java.awt.Color(0, 153, 153));
        btnsearch.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon("C:\\Users\\DEVESH_G\\Documents\\NetBeansProjects\\Blood_&_Oxygen_Bank\\img\\search.png")); // NOI18N
        btnsearch.setText("Search");
        btnsearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.lightGray, java.awt.Color.darkGray, java.awt.Color.gray));
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 22, 80, 30));

        jLabel32.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel32.setText("1.665 to 2.22 mmol/L");
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 380, -1, -1));

        jLabel35.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel35.setText("REPORT ON BLOOD SUGAR ESTIMATION");
        jPanel1.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, -1, -1));

        txtaadhar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        txtaadhar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaadharActionPerformed(evt);
            }
        });
        jPanel1.add(txtaadhar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 22, 230, 30));

        jLabel38.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel38.setText("PATIENT NAME: ");
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel22.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel22.setText("Enter Aadhar number");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\DEVESH_G\\Documents\\NetBeansProjects\\Blood_&_Oxygen_Bank\\img\\2381638.png")); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 540));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
 
    }//GEN-LAST:event_formWindowActivated

    private void btnprint1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnprint1MouseClicked
 //       print();
    }//GEN-LAST:event_btnprint1MouseClicked

    private void btnprint1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprint1ActionPerformed
         PrinterJob job = PrinterJob.getPrinterJob();
            job.setJobName("Print Data");
            
            job.setPrintable((Graphics pg, PageFormat pf, int pageNum) -> {
                pf.setOrientation(PageFormat.LANDSCAPE);
                if(pageNum>0){
                    return Printable.NO_SUCH_PAGE;
                }
                
                Graphics2D g2 = (Graphics2D)pg;
                g2.translate(pf.getImageableX(), pf.getImageableY());
                g2.scale(0.24,0.24);
                jPanel1.paint(g2);
return Printable.PAGE_EXISTS;
        });
         
        boolean ok = job.printDialog();
        if(ok){
        try{
            
        job.print();
        }
        catch (PrinterException ex){}
        }
    }//GEN-LAST:event_btnprint1ActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        try
        {
           DBconnect connect=new DBconnect();
           pt=connect.con.prepareStatement("select NAME, GENDER,BLOOD_GROUP,DATE_OF_BIRTH from registration_table where aadhar_number=?");
           pt.setLong(1, Long.parseLong(txtaadhar.getText()));
           rs=connect.view(pt);
           if(rs.next()==true)
           {
                Labname.setText(rs.getString(1));
                Labgender.setText(rs.getString(2));
                Labbloodgroup.setText(rs.getString(3));
                LabDR.setText("Devesh Gupta");
                Labsample.setText("Dev Lab's");
                Labsugar.setText("0.7 mmol/L");
                Labacetone.setText("2.05 mmol/L");
                Labfasting.setText("5.5 mmol/L");
                
               /*Code for current date */
                DateTimeFormatter dft=DateTimeFormatter.ofPattern("yyyy-MM-dd");
                LocalDateTime lfd= LocalDateTime.now();
                String dax=dft.format(lfd);
                Labdate.setText(dax); 
               /*Code for current date */
                
               try
               {
                //holding dob year value    
                //holding date in date type variable
                Date da = new SimpleDateFormat("yyyy-MM-dd").parse(rs.getString(4));
                String fd=new SimpleDateFormat("yyyy-MM-dd").format(da);//checking format and convert into string
                LocalDate LdL= LocalDate.parse(fd);
                int g = LdL.getYear();
                //JOptionPane.showMessageDialog(this, g);
                //holding dob year value
                //holding current year value
               DateTimeFormatter dt=DateTimeFormatter.ofPattern("yyyy-MM-dd");
               LocalDateTime ld= LocalDateTime.now();
               String de=dt.format(ld);
               LocalDate LdLg= LocalDate.parse(de);
               int y=LdLg.getYear();
               //JOptionPane.showMessageDialog(this, y);
                //holding current year value
                Labage.setText( String.valueOf(y-g));    
               }
               catch(HeadlessException | SQLException | ParseException ex)
               {
                   JOptionPane.showMessageDialog(this, ex.getMessage());
               }
           }
        }
        catch(NumberFormatException | SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnsearchActionPerformed

    private void txtaadharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaadharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaadharActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        MenuBar mb=new MenuBar();
        this.hide();
        mb.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(DonorReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DonorReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DonorReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DonorReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new DonorReport().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabDR;
    private javax.swing.JLabel Labacetone;
    private javax.swing.JLabel Labage;
    private javax.swing.JLabel Labbloodgroup;
    private javax.swing.JLabel Labdate;
    private javax.swing.JLabel Labfasting;
    private javax.swing.JLabel Labgender;
    private javax.swing.JLabel Labname;
    private javax.swing.JLabel Labsample;
    private javax.swing.JLabel Labsugar;
    private javax.swing.JButton btnprint1;
    private javax.swing.JButton btnsearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public javax.swing.JTextField txtaadhar;
    // End of variables declaration//GEN-END:variables

    private void print() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
