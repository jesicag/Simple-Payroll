package SistemGaji.view;

import SistemGaji.controller.Controller;
import SistemGaji.controller.Pay;
import SistemGaji.model.PayTableModel;
import java.util.List;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SistemGaji extends javax.swing.JFrame {

    /**
     * Creates new form SistemGaji
     */
    PayTableModel tableModel;
    Controller controller;
    List<Pay> listpay;
    int id = -1;
    
    public List<Pay> getListpay() {
        return listpay;
    }

    public void setListpay(List<Pay> listpay) {
        this.listpay = listpay;
    }
    
    public SistemGaji() {
        initComponents();
        controller =new Controller(this);
        controller.findAll();
        
        tabel1.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                    try {
                id = Integer.parseInt(tabel1.getValueAt(tabel1.getSelectedRow(), 0).toString());
                controller.findById(id);                
            } catch (Exception ex) {}    
            }
        });    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        heading = new javax.swing.JLabel();
        LID = new javax.swing.JLabel();
        LFname = new javax.swing.JLabel();
        LLname = new javax.swing.JLabel();
        Lphone = new javax.swing.JLabel();
        TFid = new javax.swing.JTextField();
        TFfname = new javax.swing.JTextField();
        TFlname = new javax.swing.JTextField();
        TFphone = new javax.swing.JTextField();
        Lhourwork = new javax.swing.JLabel();
        LBasicpay = new javax.swing.JLabel();
        LpayrollNo = new javax.swing.JLabel();
        Lovertime = new javax.swing.JLabel();
        TFhour = new javax.swing.JTextField();
        TFbasic = new javax.swing.JTextField();
        TFpayrollno = new javax.swing.JTextField();
        TFovertime = new javax.swing.JTextField();
        buttonInsert = new javax.swing.JButton();
        ButtonUpdate = new javax.swing.JButton();
        ButtonDelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel1 = new javax.swing.JTable();
        Ltax = new javax.swing.JLabel();
        TFtax = new javax.swing.JTextField();
        Lgross = new javax.swing.JLabel();
        TFgross = new javax.swing.JTextField();
        Lnet = new javax.swing.JLabel();
        TFnet = new javax.swing.JTextField();
        buttonreset = new javax.swing.JButton();
        buttonreload = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        heading.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        heading.setText("PayRoll Recording System");

        LID.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LID.setText("ID Employee");

        LFname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LFname.setText("First Name");

        LLname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LLname.setText("Last Name");

        Lphone.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Lphone.setText("Phone Number");

        TFid.setEditable(false);
        TFid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TFid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFidActionPerformed(evt);
            }
        });

        TFfname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TFlname.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        TFphone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Lhourwork.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Lhourwork.setText("Hour Work");

        LBasicpay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LBasicpay.setText("Basic Pay");

        LpayrollNo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LpayrollNo.setText("PayRoll No");

        Lovertime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Lovertime.setText("Overtime");

        TFhour.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        TFbasic.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        TFpayrollno.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        TFovertime.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        buttonInsert.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonInsert.setText("Insert");
        buttonInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInsertActionPerformed(evt);
            }
        });

        ButtonUpdate.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ButtonUpdate.setText("Update");
        ButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUpdateActionPerformed(evt);
            }
        });

        ButtonDelete.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ButtonDelete.setText("Delete");
        ButtonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteActionPerformed(evt);
            }
        });

        tabel1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Phone Number", "Hour Work", "Basic Pay", "PayRoll No", "Overtime", "Tax", "Gross Pay", "Net Pay"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabel1);

        Ltax.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Ltax.setText("Tax");

        TFtax.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Lgross.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Lgross.setText("Gross Pay");

        TFgross.setEditable(false);
        TFgross.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        Lnet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Lnet.setText("Net Pay");

        TFnet.setEditable(false);
        TFnet.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        buttonreset.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonreset.setText("Reset");
        buttonreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonresetActionPerformed(evt);
            }
        });

        buttonreload.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        buttonreload.setText("Reload");
        buttonreload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonreloadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(heading)
                .addContainerGap(826, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lphone)
                            .addComponent(LFname)
                            .addComponent(LID)
                            .addComponent(LLname)
                            .addComponent(Lhourwork)
                            .addComponent(LBasicpay)
                            .addComponent(LpayrollNo)
                            .addComponent(Lovertime)
                            .addComponent(Ltax)
                            .addComponent(Lgross)
                            .addComponent(Lnet))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TFphone, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFfname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TFid)
                            .addComponent(TFlname)
                            .addComponent(TFhour)
                            .addComponent(TFbasic)
                            .addComponent(TFpayrollno)
                            .addComponent(TFovertime)
                            .addComponent(TFtax)
                            .addComponent(TFgross)
                            .addComponent(TFnet, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonInsert)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonUpdate)
                        .addGap(18, 18, 18)
                        .addComponent(ButtonDelete)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(buttonreset)
                        .addGap(18, 18, 18)
                        .addComponent(buttonreload)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(heading)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LID)
                            .addComponent(TFid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LFname)
                            .addComponent(TFfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LLname)
                            .addComponent(TFlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lphone)
                            .addComponent(TFphone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lhourwork)
                            .addComponent(TFhour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LBasicpay)
                            .addComponent(TFbasic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LpayrollNo)
                            .addComponent(TFpayrollno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lovertime)
                            .addComponent(TFovertime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ltax)
                            .addComponent(TFtax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lgross)
                            .addComponent(TFgross, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lnet)
                            .addComponent(TFnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInsert)
                    .addComponent(ButtonUpdate)
                    .addComponent(ButtonDelete)
                    .addComponent(buttonreset)
                    .addComponent(buttonreload))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TFidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFidActionPerformed

    private void buttonInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInsertActionPerformed
        // TODO add your handling code here:
        controller.insert();
    }//GEN-LAST:event_buttonInsertActionPerformed

    private void ButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUpdateActionPerformed

        // TODO add your handling code here:
        controller.update();
    }//GEN-LAST:event_ButtonUpdateActionPerformed

    private void ButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteActionPerformed
        // TODO add your handling code here:
        if(id>-1){
            controller.delete(id);
        }
    }//GEN-LAST:event_ButtonDeleteActionPerformed

    private void buttonresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonresetActionPerformed
        // TODO add your handling code here:
        controller.reset();
    }//GEN-LAST:event_buttonresetActionPerformed

    private void buttonreloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonreloadActionPerformed
        // TODO add your handling code here:
        controller.findAll();
    }//GEN-LAST:event_buttonreloadActionPerformed

    public JButton getButtonDelete() {
        return ButtonDelete;
    }

    public void setButtonDelete(JButton ButtonDelete) {
        this.ButtonDelete = ButtonDelete;
    }

    public PayTableModel getTableModel() {
        return tableModel;
    }

    public void setTableModel(PayTableModel tableModel) {
        this.tableModel = tableModel;
    }

    public JButton getButtonUpdate() {
        return ButtonUpdate;
    }

    public void setButtonUpdate(JButton ButtonUpdate) {
        this.ButtonUpdate = ButtonUpdate;
    }

    public JLabel getLBasicpay() {
        return LBasicpay;
    }

    public void setLBasicpay(JLabel LBasicpay) {
        this.LBasicpay = LBasicpay;
    }

    public JLabel getLFname() {
        return LFname;
    }

    public void setLFname(JLabel LFname) {
        this.LFname = LFname;
    }

    public JLabel getLID() {
        return LID;
    }

    public void setLID(JLabel LID) {
        this.LID = LID;
    }

    public JLabel getLLname() {
        return LLname;
    }

    public void setLLname(JLabel LLname) {
        this.LLname = LLname;
    }

    public JLabel getLgross() {
        return Lgross;
    }

    public void setLgross(JLabel Lgross) {
        this.Lgross = Lgross;
    }

    public JLabel getLhourwork() {
        return Lhourwork;
    }

    public void setLhourwork(JLabel Lhourwork) {
        this.Lhourwork = Lhourwork;
    }

    public JLabel getLnet() {
        return Lnet;
    }

    public void setLnet(JLabel Lnet) {
        this.Lnet = Lnet;
    }

    public JLabel getLovertime() {
        return Lovertime;
    }

    public void setLovertime(JLabel Lovertime) {
        this.Lovertime = Lovertime;
    }

    public JLabel getLpayrollNo() {
        return LpayrollNo;
    }

    public void setLpayrollNo(JLabel LpayrollNo) {
        this.LpayrollNo = LpayrollNo;
    }

    public JLabel getLphone() {
        return Lphone;
    }

    public void setLphone(JLabel Lphone) {
        this.Lphone = Lphone;
    }

    public JLabel getLtax() {
        return Ltax;
    }

    public void setLtax(JLabel Ltax) {
        this.Ltax = Ltax;
    }

    public JTextField getTFbasic() {
        return TFbasic;
    }

    public void setTFbasic(JTextField TFbasic) {
        this.TFbasic = TFbasic;
    }

    public JTextField getTFfname() {
        return TFfname;
    }

    public void setTFfname(JTextField TFfname) {
        this.TFfname = TFfname;
    }

    public JTextField getTFgross() {
        return TFgross;
    }

    public void setTFgross(JTextField TFgross) {
        this.TFgross = TFgross;
    }

    public JTextField getTFhour() {
        return TFhour;
    }

    public void setTFhour(JTextField TFhour) {
        this.TFhour = TFhour;
    }

    public JTextField getTFid() {
        return TFid;
    }

    public void setTFid(JTextField TFid) {
        this.TFid = TFid;
    }

    public JTextField getTFlname() {
        return TFlname;
    }

    public void setTFlname(JTextField TFlname) {
        this.TFlname = TFlname;
    }

    public JTextField getTFnet() {
        return TFnet;
    }

    public void setTFnet(JTextField TFnet) {
        this.TFnet = TFnet;
    }

    public JTextField getTFovertime() {
        return TFovertime;
    }

    public void setTFovertime(JTextField TFovertime) {
        this.TFovertime = TFovertime;
    }

    public JTextField getTFpayrollno() {
        return TFpayrollno;
    }

    public void setTFpayrollno(JTextField TFpayrollno) {
        this.TFpayrollno = TFpayrollno;
    }

    public JTextField getTFphone() {
        return TFphone;
    }

    public void setTFphone(JTextField TFphone) {
        this.TFphone = TFphone;
    }

    public JTextField getTFtax() {
        return TFtax;
    }

    public void setTFtax(JTextField TFtax) {
        this.TFtax = TFtax;
    }

    public JButton getButtonInsert() {
        return buttonInsert;
    }

    public void setButtonInsert(JButton buttonInsert) {
        this.buttonInsert = buttonInsert;
    }

    public JLabel getHeading() {
        return heading;
    }

    public void setHeading(JLabel heading) {
        this.heading = heading;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JTable getTabel1() {
        return tabel1;
    }

    public void setTabel1(JTable tabel1) {
        this.tabel1 = tabel1;
    }

   
  

    
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SistemGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemGaji.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemGaji().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonDelete;
    private javax.swing.JButton ButtonUpdate;
    private javax.swing.JLabel LBasicpay;
    private javax.swing.JLabel LFname;
    private javax.swing.JLabel LID;
    private javax.swing.JLabel LLname;
    private javax.swing.JLabel Lgross;
    private javax.swing.JLabel Lhourwork;
    private javax.swing.JLabel Lnet;
    private javax.swing.JLabel Lovertime;
    private javax.swing.JLabel LpayrollNo;
    private javax.swing.JLabel Lphone;
    private javax.swing.JLabel Ltax;
    private javax.swing.JTextField TFbasic;
    private javax.swing.JTextField TFfname;
    private javax.swing.JTextField TFgross;
    private javax.swing.JTextField TFhour;
    private javax.swing.JTextField TFid;
    private javax.swing.JTextField TFlname;
    private javax.swing.JTextField TFnet;
    private javax.swing.JTextField TFovertime;
    private javax.swing.JTextField TFpayrollno;
    private javax.swing.JTextField TFphone;
    private javax.swing.JTextField TFtax;
    private javax.swing.JButton buttonInsert;
    private javax.swing.JButton buttonreload;
    private javax.swing.JButton buttonreset;
    private javax.swing.JLabel heading;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabel1;
    // End of variables declaration//GEN-END:variables
}
