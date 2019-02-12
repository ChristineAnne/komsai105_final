/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.ArrayList;
//import static javafx.scene.text.TextAlignment.CENTER;

/**
 *
 * @author RizelleAnn
 */
public class InputDataDisplay extends javax.swing.JFrame {
    private static ArrayList<Integer> arr;
    private static String title;
    private Numerical numeric;
    private String dataType;
    private int[] idata;
    private float[] fdata;

    /**
     * Creates new form InputDataDisplay
     */
    public InputDataDisplay(String title, Numerical numeric, String dataType, int[] idata) {
        this.title = title;
        this.idata = idata;
        this.numeric = numeric;
        this.dataType = dataType;
        setTitle(title);
        initComponents();
        setText();
        
    }
    
    public InputDataDisplay(String title, Numerical numeric, String dataType, float[] fdata) {
        this.title = title;
        this.fdata = fdata;
        this.numeric = numeric;
        this.dataType = dataType;
        setTitle(title);
        initComponents();
        setText();
        
    }
    
    public void setText(){
        int columns = 5;
        dataDisplay.setColumns(columns);
        dataDisplay.setText("\t\t"+ title + "\n\n");
        int ctr = 0;
        if(dataType == "float"){
            for(Float f: fdata){
                if(ctr == 5){
                    dataDisplay.append("\n\n");

                    ctr = 0;
                }
                dataDisplay.append(Float.toString(f) + "\t");
                ctr++;
            }
        } else {
            for(Integer i: idata){
                if(ctr == 5){
                    dataDisplay.append("\n\n");

                    ctr = 0;
                }
                dataDisplay.append(Integer.toString(i) + "\t");
                ctr++;
            }
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dataDisplay = new javax.swing.JTextArea();

        setTitle("Numerical Data");
        setLocation(new java.awt.Point(500, 150));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        dataDisplay.setEditable(false);
        dataDisplay.setColumns(20);
        dataDisplay.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        dataDisplay.setRows(5);
        dataDisplay.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setViewportView(dataDisplay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(InputDataDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputDataDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputDataDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputDataDisplay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InputDataDisplay().setVisible(true);
            }
        });*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea dataDisplay;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
