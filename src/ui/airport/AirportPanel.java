/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.airport;

import ui.Customer.*;
import business.DB40Util.DB4OUtil;
import business.EcoSystem;
import business.airport.Airport;
import business.customer.Customer;
import business.util.Utils;
import javax.swing.JFrame;
import ui.HomePage;

/**
 *
 * @author ashis
 */
public class AirportPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerPanel
     */
    private EcoSystem ecoSystem;
    private Airport airport;
    private JFrame mainJFrame;
    public AirportPanel(EcoSystem ecoSystem, Airport airport, JFrame mainJFrame) {
        initComponents();
        this.ecoSystem = ecoSystem;
        this.airport = airport;
        this.mainJFrame = mainJFrame;
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
        btn_bookingHistory = new javax.swing.JButton();
        btn_bookTickets = new javax.swing.JButton();
        btn_orderFood = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 0));

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        btn_bookingHistory.setBackground(new java.awt.Color(255, 153, 153));
        btn_bookingHistory.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_bookingHistory.setText("Edit Terminal");
        btn_bookingHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookingHistoryActionPerformed(evt);
            }
        });

        btn_bookTickets.setBackground(new java.awt.Color(255, 153, 153));
        btn_bookTickets.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_bookTickets.setText("Add Terminal");
        btn_bookTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bookTicketsActionPerformed(evt);
            }
        });

        btn_orderFood.setBackground(new java.awt.Color(255, 153, 153));
        btn_orderFood.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_orderFood.setText("Process Request");
        btn_orderFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_orderFoodActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 153, 153));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton4.setText("View flight detail");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_bookTickets, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(btn_orderFood, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bookingHistory, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(151, 151, 151))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btn_bookTickets, btn_bookingHistory, btn_orderFood, jButton4});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_bookingHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_bookTickets, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_orderFood, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(182, Short.MAX_VALUE))
        );

        jLabel1.setBackground(new java.awt.Color(204, 102, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Customer Dashboard");
        jLabel1.setMaximumSize(new java.awt.Dimension(102, 100));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 587, Short.MAX_VALUE)
                        .addGap(286, 286, 286))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_bookTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookTicketsActionPerformed
        AddTerminal addTerminal = new AddTerminal(ecoSystem, airport, mainJFrame);
        Utils.newPage(addTerminal);
    }//GEN-LAST:event_btn_bookTicketsActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        AirportFlightDetail airportFlightDetail = new AirportFlightDetail(ecoSystem, airport, mainJFrame);
        Utils.newPage(airportFlightDetail);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        DB4OUtil dB4OUtil = DB4OUtil.getInstance();
        dB4OUtil.storeSystem(ecoSystem);
        HomePage newMainJFrame = new HomePage();
        newMainJFrame.setVisible(true);
        mainJFrame.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btn_bookingHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bookingHistoryActionPerformed
        EditTerminal editTerminal = new EditTerminal(ecoSystem, airport, mainJFrame);
        Utils.newPage(editTerminal);
    }//GEN-LAST:event_btn_bookingHistoryActionPerformed

    private void btn_orderFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_orderFoodActionPerformed
        ProcessRequest processRequest = new ProcessRequest(ecoSystem, airport, mainJFrame);
        Utils.newPage(processRequest);
    }//GEN-LAST:event_btn_orderFoodActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_bookTickets;
    private javax.swing.JButton btn_bookingHistory;
    private javax.swing.JButton btn_orderFood;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
