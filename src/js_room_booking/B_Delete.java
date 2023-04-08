/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package js_room_booking;

import java.io.*;
import javax.swing.*;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Conan
 */
public class B_Delete extends javax.swing.JFrame {

    /**
     * Creates new form B_Delete
     */
    public B_Delete() {
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

        DeleteBookingLab = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        ImportBut = new javax.swing.JButton();
        SearchTxt = new javax.swing.JTextField();
        DeleteBut = new javax.swing.JButton();
        SearchLab = new javax.swing.JLabel();
        BackBut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        DeleteBookingLab.setFont(new java.awt.Font("Neue Haas Grotesk Text Pro", 1, 36)); // NOI18N
        DeleteBookingLab.setText("Delete Booking");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Name", "IC", "PH Number", "Email", "Room ID", "From Date", "To Date", "Day"
            }
        ));
        Table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        ImportBut.setBackground(new java.awt.Color(255, 204, 255));
        ImportBut.setFont(new java.awt.Font("Neue Haas Grotesk Text Pro", 3, 18)); // NOI18N
        ImportBut.setForeground(new java.awt.Color(90, 13, 90));
        ImportBut.setText("Import Data");
        ImportBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImportButActionPerformed(evt);
            }
        });

        SearchTxt.setFont(new java.awt.Font("Neue Haas Grotesk Text Pro", 0, 18)); // NOI18N
        SearchTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                SearchTxtKeyReleased(evt);
            }
        });

        DeleteBut.setBackground(new java.awt.Color(0, 102, 102));
        DeleteBut.setFont(new java.awt.Font("Neue Haas Grotesk Text Pro", 1, 18)); // NOI18N
        DeleteBut.setForeground(new java.awt.Color(204, 255, 204));
        DeleteBut.setText("Delete");
        DeleteBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButActionPerformed(evt);
            }
        });

        SearchLab.setFont(new java.awt.Font("Neue Haas Grotesk Text Pro", 1, 24)); // NOI18N
        SearchLab.setText("Search :");

        BackBut.setBackground(new java.awt.Color(0, 0, 0));
        BackBut.setFont(new java.awt.Font("Neue Haas Grotesk Text Pro", 1, 14)); // NOI18N
        BackBut.setForeground(new java.awt.Color(255, 255, 255));
        BackBut.setText("BACK");
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(SearchLab)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(ImportBut)
                .addGap(57, 57, 57)
                .addComponent(DeleteBut)
                .addGap(31, 31, 31))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DeleteBookingLab)
                .addGap(186, 186, 186))
            .addGroup(layout.createSequentialGroup()
                .addComponent(BackBut)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DeleteBookingLab)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SearchTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchLab)
                    .addComponent(ImportBut)
                    .addComponent(DeleteBut))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BackBut))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ImportButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImportButActionPerformed
        File file = new File("booking_2.txt");
        
        try
        {
            //read file
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            //get jtable model 
            DefaultTableModel model = (DefaultTableModel)Table.getModel();
            //get line from text file
            Object[] lines = br.lines().toArray();
            
            //extract data from line
            //set data to jtable model
            for(int i = 0; i < lines.length; i++)
            {
                String[] row = lines[i].toString().split(",");
                model.addRow(row);
            }
            
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }//GEN-LAST:event_ImportButActionPerformed
              
    private void TableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TableKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_TableKeyReleased

    private void DeleteButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButActionPerformed
        //get jtable model 
        DefaultTableModel tblModel = (DefaultTableModel) Table.getModel();
        
        //delete row
        if(Table.getSelectedRowCount() == 1)
        {
            //if single row selected than delete
            tblModel.removeRow(Table.getSelectedRow());
        }
        
        else
        {
            //if table is empty than show message
            if (Table.getRowCount() == 0)
            {
                JOptionPane.showMessageDialog(null, "Table is empty!!!", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
            else 
            {
                //if not empty but select more than 1 row or not row select
                JOptionPane.showMessageDialog(null, "Please select 1 row only for delete!!!", "Error Message", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_DeleteButActionPerformed

    private void SearchTxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchTxtKeyReleased
        
        DefaultTableModel table = (DefaultTableModel)Table.getModel();
        String search = SearchTxt.getText().toUpperCase();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel> (table);
        Table.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(search));
    }//GEN-LAST:event_SearchTxtKeyReleased

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        this.setVisible(false);
        ManageRoomBooking mrb = new ManageRoomBooking();
        mrb.setVisible(true);
    }//GEN-LAST:event_BackButActionPerformed

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
            java.util.logging.Logger.getLogger(B_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(B_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(B_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(B_Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new B_Delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBut;
    private javax.swing.JLabel DeleteBookingLab;
    private javax.swing.JButton DeleteBut;
    private javax.swing.JButton ImportBut;
    private javax.swing.JLabel SearchLab;
    private javax.swing.JTextField SearchTxt;
    private javax.swing.JTable Table;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
