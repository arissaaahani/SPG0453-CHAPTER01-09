
package CalculatorArissa;

import java.awt.Image;
import java.awt.Toolkit;

public class CalculatorArissa extends javax.swing.JFrame {

    
    double NumEnter1;
    double NumEnter2;
    double Result;
    String op;
    public CalculatorArissa() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\60135\\Pictures\\icon.png");
        this.setIconImage(icon);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void EnterNumbers(String q)
    {
        String Nums = jtxtResult.getText() + q;
        jtxtResult.setText(Nums);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnBS = new javax.swing.JButton();
        jtxtResult = new javax.swing.JTextField();
        jbtnCE = new javax.swing.JButton();
        jbtnC = new javax.swing.JButton();
        jbtnPM = new javax.swing.JButton();
        jbtnDigit7 = new javax.swing.JButton();
        jbtnDigit8 = new javax.swing.JButton();
        jbtnDigit9 = new javax.swing.JButton();
        jbtnPlus = new javax.swing.JButton();
        jbtnDigit4 = new javax.swing.JButton();
        jbtnDigit5 = new javax.swing.JButton();
        jbtnDigit6 = new javax.swing.JButton();
        jbtnMinus = new javax.swing.JButton();
        jbtnMulti = new javax.swing.JButton();
        jbtnDigit0 = new javax.swing.JButton();
        jbtnDot = new javax.swing.JButton();
        jbtnEqual = new javax.swing.JButton();
        jbtnDivide = new javax.swing.JButton();
        jbtnDigit1 = new javax.swing.JButton();
        jbtnDigit2 = new javax.swing.JButton();
        jbtnDigit3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(500, 530));

        jbtnBS.setBackground(new java.awt.Color(0, 102, 102));
        jbtnBS.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnBS.setForeground(new java.awt.Color(255, 255, 255));
        jbtnBS.setText("<-");
        jbtnBS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBSActionPerformed(evt);
            }
        });

        jtxtResult.setBackground(new java.awt.Color(0, 204, 204));
        jtxtResult.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jtxtResult.setCaretColor(new java.awt.Color(102, 255, 102));
        jtxtResult.setDisabledTextColor(new java.awt.Color(51, 255, 153));
        jtxtResult.setSelectedTextColor(new java.awt.Color(153, 255, 51));

        jbtnCE.setBackground(new java.awt.Color(0, 102, 102));
        jbtnCE.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnCE.setForeground(new java.awt.Color(255, 255, 255));
        jbtnCE.setText("CE");
        jbtnCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCEActionPerformed(evt);
            }
        });

        jbtnC.setBackground(new java.awt.Color(0, 102, 102));
        jbtnC.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnC.setForeground(new java.awt.Color(255, 255, 255));
        jbtnC.setText("C");
        jbtnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnCActionPerformed(evt);
            }
        });

        jbtnPM.setBackground(new java.awt.Color(0, 102, 102));
        jbtnPM.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnPM.setForeground(new java.awt.Color(255, 255, 255));
        jbtnPM.setText("±");
        jbtnPM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPMActionPerformed(evt);
            }
        });

        jbtnDigit7.setBackground(new java.awt.Color(0, 153, 153));
        jbtnDigit7.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnDigit7.setText("7");
        jbtnDigit7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit7ActionPerformed(evt);
            }
        });

        jbtnDigit8.setBackground(new java.awt.Color(0, 153, 153));
        jbtnDigit8.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnDigit8.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDigit8.setText("8");
        jbtnDigit8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit8ActionPerformed(evt);
            }
        });

        jbtnDigit9.setBackground(new java.awt.Color(0, 153, 153));
        jbtnDigit9.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnDigit9.setText("9");
        jbtnDigit9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit9ActionPerformed(evt);
            }
        });

        jbtnPlus.setBackground(new java.awt.Color(0, 102, 102));
        jbtnPlus.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnPlus.setForeground(new java.awt.Color(255, 255, 255));
        jbtnPlus.setText("+");
        jbtnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnPlusActionPerformed(evt);
            }
        });

        jbtnDigit4.setBackground(new java.awt.Color(0, 153, 153));
        jbtnDigit4.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnDigit4.setText("4");
        jbtnDigit4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit4ActionPerformed(evt);
            }
        });

        jbtnDigit5.setBackground(new java.awt.Color(0, 153, 153));
        jbtnDigit5.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnDigit5.setText("5");
        jbtnDigit5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit5ActionPerformed(evt);
            }
        });

        jbtnDigit6.setBackground(new java.awt.Color(0, 153, 153));
        jbtnDigit6.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnDigit6.setText("6");
        jbtnDigit6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit6ActionPerformed(evt);
            }
        });

        jbtnMinus.setBackground(new java.awt.Color(0, 102, 102));
        jbtnMinus.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnMinus.setForeground(new java.awt.Color(255, 255, 255));
        jbtnMinus.setText("-");
        jbtnMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMinusActionPerformed(evt);
            }
        });

        jbtnMulti.setBackground(new java.awt.Color(0, 102, 102));
        jbtnMulti.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnMulti.setForeground(new java.awt.Color(255, 255, 255));
        jbtnMulti.setText("x");
        jbtnMulti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnMultiActionPerformed(evt);
            }
        });

        jbtnDigit0.setBackground(new java.awt.Color(0, 153, 153));
        jbtnDigit0.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnDigit0.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDigit0.setText("0");
        jbtnDigit0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit0ActionPerformed(evt);
            }
        });

        jbtnDot.setBackground(new java.awt.Color(0, 153, 153));
        jbtnDot.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnDot.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDot.setText(".");
        jbtnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDotActionPerformed(evt);
            }
        });

        jbtnEqual.setBackground(new java.awt.Color(0, 153, 153));
        jbtnEqual.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnEqual.setForeground(new java.awt.Color(255, 255, 255));
        jbtnEqual.setText("=");
        jbtnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnEqualActionPerformed(evt);
            }
        });

        jbtnDivide.setBackground(new java.awt.Color(0, 102, 102));
        jbtnDivide.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnDivide.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDivide.setText("÷");
        jbtnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDivideActionPerformed(evt);
            }
        });

        jbtnDigit1.setBackground(new java.awt.Color(0, 153, 153));
        jbtnDigit1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnDigit1.setText("1");
        jbtnDigit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit1ActionPerformed(evt);
            }
        });

        jbtnDigit2.setBackground(new java.awt.Color(0, 153, 153));
        jbtnDigit2.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnDigit2.setForeground(new java.awt.Color(255, 255, 255));
        jbtnDigit2.setText("2");
        jbtnDigit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit2ActionPerformed(evt);
            }
        });

        jbtnDigit3.setBackground(new java.awt.Color(0, 153, 153));
        jbtnDigit3.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jbtnDigit3.setText("3");
        jbtnDigit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDigit3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbtnDigit0, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtnDigit1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnDigit2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnDigit3, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addComponent(jbtnEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jbtnMulti, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbtnDivide, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jbtnBS, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jbtnPM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jtxtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbtnDigit7, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
                                .addComponent(jbtnDigit4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jbtnDigit5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnDigit8, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jbtnDigit6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnDigit9, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jbtnMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbtnPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jtxtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnBS, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnC, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPM, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDigit7, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit9, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDigit4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDigit1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDigit3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnDigit0, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnDivide, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnDigit7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit7ActionPerformed
        EnterNumbers("7");
    }//GEN-LAST:event_jbtnDigit7ActionPerformed

    private void jbtnDigit8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit8ActionPerformed
        EnterNumbers("8");
    }//GEN-LAST:event_jbtnDigit8ActionPerformed

    private void jbtnDigit9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit9ActionPerformed
        EnterNumbers("9");
    }//GEN-LAST:event_jbtnDigit9ActionPerformed

    private void jbtnDigit4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit4ActionPerformed
        EnterNumbers("4");
    }//GEN-LAST:event_jbtnDigit4ActionPerformed

    private void jbtnDigit5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit5ActionPerformed
        EnterNumbers("5");
    }//GEN-LAST:event_jbtnDigit5ActionPerformed

    private void jbtnDigit6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit6ActionPerformed
        EnterNumbers("6");
    }//GEN-LAST:event_jbtnDigit6ActionPerformed

    private void jbtnDigit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit1ActionPerformed
        EnterNumbers("1");
    }//GEN-LAST:event_jbtnDigit1ActionPerformed

    private void jbtnDigit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit2ActionPerformed
        EnterNumbers("2");
    }//GEN-LAST:event_jbtnDigit2ActionPerformed

    private void jbtnDigit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit3ActionPerformed
        EnterNumbers("3");
    }//GEN-LAST:event_jbtnDigit3ActionPerformed

    private void jbtnDigit0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDigit0ActionPerformed
        EnterNumbers("0");
    }//GEN-LAST:event_jbtnDigit0ActionPerformed

    private void jbtnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDivideActionPerformed
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op = "÷";
    }//GEN-LAST:event_jbtnDivideActionPerformed

    private void jbtnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMultiActionPerformed
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op = "x";
    }//GEN-LAST:event_jbtnMultiActionPerformed

    private void jbtnMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnMinusActionPerformed
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op = "-";
    }//GEN-LAST:event_jbtnMinusActionPerformed

    private void jbtnPlusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPlusActionPerformed
        NumEnter1 = Double.parseDouble(jtxtResult.getText());
        jtxtResult.setText("");
        op = "+";
    }//GEN-LAST:event_jbtnPlusActionPerformed

    private void jbtnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCActionPerformed
        jtxtResult.setText("");
    }//GEN-LAST:event_jbtnCActionPerformed

    private void jbtnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnCEActionPerformed
        jtxtResult.setText("");
        
        String Fn, Sn;
        
        Fn = String.valueOf(NumEnter1);
        Sn = String.valueOf(NumEnter2);
        
        Fn = "";
        Sn ="";
        
    }//GEN-LAST:event_jbtnCEActionPerformed

    private void jbtnPMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnPMActionPerformed
        
        double nums = Double.parseDouble(String.valueOf(jtxtResult.getText()));
        nums = nums * (-1);
        jtxtResult.setText(String.valueOf(nums));
    }//GEN-LAST:event_jbtnPMActionPerformed

    private void jbtnBSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBSActionPerformed
        
        String backSp = null;
        
        if (jtxtResult.getText().length() >0)
        {
            StringBuilder sb = new StringBuilder(jtxtResult.getText());
            sb.deleteCharAt(jtxtResult.getText().length() -1);
            backSp = sb.toString();
            jtxtResult.setText(backSp);
        }
    }//GEN-LAST:event_jbtnBSActionPerformed

    private void jbtnDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDotActionPerformed
        
        if (! jtxtResult.getText().contains("."))
        {
            jtxtResult.setText(jtxtResult.getText() + jbtnDot.getText());
        }
    }//GEN-LAST:event_jbtnDotActionPerformed

    private void jbtnEqualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnEqualActionPerformed
        NumEnter2 = Double.parseDouble(jtxtResult.getText());
        String equation = NumEnter1 + " " + op + " " + NumEnter2 + " = ";

        if (op == "+")
        {
            Result = NumEnter1 + NumEnter2;
            jtxtResult.setText(equation + String.valueOf(Result));
        }
        
        else if (op == "-")
        {
            Result = NumEnter1 - NumEnter2;
            jtxtResult.setText(equation + String.valueOf(Result));
        }
        
        else if (op == "x")
        {
            Result = NumEnter1 * NumEnter2;
            jtxtResult.setText(equation + String.valueOf(Result));
        }
        
        else if (op == "÷")
        {
            Result = NumEnter1 / NumEnter2;
            jtxtResult.setText(equation + String.valueOf(Result));
        }
    }//GEN-LAST:event_jbtnEqualActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorArissa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorArissa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorArissa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorArissa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorArissa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnBS;
    private javax.swing.JButton jbtnC;
    private javax.swing.JButton jbtnCE;
    private javax.swing.JButton jbtnDigit0;
    private javax.swing.JButton jbtnDigit1;
    private javax.swing.JButton jbtnDigit2;
    private javax.swing.JButton jbtnDigit3;
    private javax.swing.JButton jbtnDigit4;
    private javax.swing.JButton jbtnDigit5;
    private javax.swing.JButton jbtnDigit6;
    private javax.swing.JButton jbtnDigit7;
    private javax.swing.JButton jbtnDigit8;
    private javax.swing.JButton jbtnDigit9;
    private javax.swing.JButton jbtnDivide;
    private javax.swing.JButton jbtnDot;
    private javax.swing.JButton jbtnEqual;
    private javax.swing.JButton jbtnMinus;
    private javax.swing.JButton jbtnMulti;
    private javax.swing.JButton jbtnPM;
    private javax.swing.JButton jbtnPlus;
    private javax.swing.JTextField jtxtResult;
    // End of variables declaration//GEN-END:variables
}
