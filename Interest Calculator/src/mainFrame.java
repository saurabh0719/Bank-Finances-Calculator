

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import javax.swing.JOptionPane;

public class mainFrame extends javax.swing.JFrame {

    /**
     * Creates new form mainFrame
     */
    public mainFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        amount = new javax.swing.JTextField();
        sibtn = new javax.swing.JButton();
        cibtn = new javax.swing.JButton();
        mabtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        year_slider = new javax.swing.JSlider();
        interest_slide = new javax.swing.JSlider();
        si_val = new javax.swing.JTextField();
        ci_val = new javax.swing.JTextField();
        ma_val = new javax.swing.JTextField();
        interestval = new javax.swing.JTextField();
        yearval = new javax.swing.JTextField();
        timesperyear = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("   Interest Calculator");

        jLabel2.setText("Principal amount");
        jLabel2.setOpaque(true);

        jLabel3.setText("interest rate (p.a.)");

        amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountActionPerformed(evt);
            }
        });

        sibtn.setBackground(new java.awt.Color(51, 153, 255));
        sibtn.setText("Simple interest");
        sibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sibtnActionPerformed(evt);
            }
        });

        cibtn.setBackground(new java.awt.Color(51, 153, 255));
        cibtn.setText("Compound Interest");
        cibtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cibtnActionPerformed(evt);
            }
        });

        mabtn.setBackground(new java.awt.Color(51, 153, 255));
        mabtn.setText("Maturity amount");
        mabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mabtnActionPerformed(evt);
            }
        });

        jLabel6.setText("No of years");

        year_slider.setMajorTickSpacing(10);
        year_slider.setMinorTickSpacing(5);
        year_slider.setPaintLabels(true);
        year_slider.setPaintTicks(true);
        year_slider.setValue(0);
        year_slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                year_sliderStateChanged(evt);
            }
        });

        interest_slide.setMajorTickSpacing(10);
        interest_slide.setMinorTickSpacing(5);
        interest_slide.setPaintLabels(true);
        interest_slide.setPaintTicks(true);
        interest_slide.setValue(0);
        interest_slide.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                interest_slideStateChanged(evt);
            }
        });

        si_val.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                si_valActionPerformed(evt);
            }
        });

        interestval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                interestvalActionPerformed(evt);
            }
        });

        jLabel4.setText("No. of times compounded per year");

        reset.setBackground(new java.awt.Color(255, 153, 51));
        reset.setText("Reset");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        jButton1.setText("Main menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(sibtn, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(104, 104, 104)
                            .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel3)
                                .addComponent(jLabel6)
                                .addComponent(cibtn, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                .addComponent(mabtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(yearval, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(year_slider, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(interestval, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(interest_slide, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(si_val, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(timesperyear, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ci_val, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ma_val, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(14, 14, 14)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(156, 156, 156))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(interestval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(interest_slide, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(year_slider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(yearval, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(timesperyear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sibtn)
                    .addComponent(si_val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cibtn)
                    .addComponent(ci_val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mabtn)
                    .addComponent(ma_val, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset)
                    .addComponent(jButton1))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, "InfoBox: " + titleBar, JOptionPane.INFORMATION_MESSAGE);
    }

    private void si_valActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_si_valActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_si_valActionPerformed

    private void amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountActionPerformed

    private void interestvalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_interestvalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_interestvalActionPerformed

    private void interest_slideStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_interest_slideStateChanged
interestval.setText(Integer.toString(interest_slide.getValue()));        // TODO add your handling code here:
    }//GEN-LAST:event_interest_slideStateChanged

    private void year_sliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_year_sliderStateChanged
yearval.setText(Integer.toString(year_slider.getValue()));       // TODO add your handling code here:
    }//GEN-LAST:event_year_sliderStateChanged

    public void checkFunction(String str){
        if("".equals(str)){
            infoBox("Enter the values. ", "Error");
        }
    }
    private void sibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sibtnActionPerformed
String str = amount.getText();
checkFunction(str);
float aval = Float.parseFloat(str);
str = interestval.getText();
checkFunction(str);
float ival = Float.parseFloat(str);
ival = ival/100;
str = yearval.getText();
checkFunction(str);
float yval = Float.parseFloat(str);
aval = aval*ival*yval;
si_val.setText(""+aval);// TODO add your handling code here:
    }//GEN-LAST:event_sibtnActionPerformed

    private void cibtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cibtnActionPerformed
String str = timesperyear.getText();
checkFunction(str);
float n = Float.parseFloat(str);
str = amount.getText();
checkFunction(str);
float p = Float.parseFloat(str);
str = interestval.getText();
checkFunction(str);
float r = Float.parseFloat(str);
r = r/100;
str = yearval.getText();
checkFunction(str);
float t = Float.parseFloat(str);
float temp;
temp = (float) Math.pow((1+(r/n)), (t*n));
p = (p*temp);
ci_val.setText(""+p);
    }//GEN-LAST:event_cibtnActionPerformed

    private void mabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mabtnActionPerformed
String str = timesperyear.getText();
checkFunction(str);
float n = Float.parseFloat(str);
str = amount.getText();
checkFunction(str);
float p = Float.parseFloat(str);
str = interestval.getText();
checkFunction(str);
float r = Float.parseFloat(str);
r = r/100;
str = yearval.getText();
checkFunction(str);
float t = Float.parseFloat(str);
float temp;
temp = (float) Math.pow((1+(r/n)), (t*n));
temp = temp*p;
p=p+temp;
ma_val.setText(""+p);// TODO add your handling code here:
    }//GEN-LAST:event_mabtnActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
amount.setText("");
interestval.setText("");
yearval.setText("");
timesperyear.setText("");
si_val.setText("");
ci_val.setText("");
ma_val.setText("");
interest_slide.setValue(0);
year_slider.setValue(0);// TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
SelectFrame select = new SelectFrame();
this.setVisible(false);
select.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new mainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amount;
    private javax.swing.JTextField ci_val;
    private javax.swing.JButton cibtn;
    private javax.swing.JSlider interest_slide;
    private javax.swing.JTextField interestval;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField ma_val;
    private javax.swing.JButton mabtn;
    private javax.swing.JButton reset;
    private javax.swing.JTextField si_val;
    private javax.swing.JButton sibtn;
    private javax.swing.JTextField timesperyear;
    private javax.swing.JSlider year_slider;
    private javax.swing.JTextField yearval;
    // End of variables declaration//GEN-END:variables

}