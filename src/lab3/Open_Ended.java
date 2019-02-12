/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author apple
 */
public class Open_Ended extends javax.swing.JFrame {

    int openInterval; // 1 for first, 2 for second, 3 for both
    Double lowerLimit, upperLimit;
    int size, frequencies, counter = 0;
    ArrayList<Double> lowerLimits = new ArrayList<>();
    ArrayList<Double> upperLimits = new ArrayList<>();    
    ArrayList<Integer> frequencyList = new ArrayList<>();
    String title;
    
    /**
     * Creates new form Open_Ended
     */
    public Open_Ended() {
        initComponents();
    }
    
    public Open_Ended(int size, String title){
        this.size = size;
        this.title = title;
        initComponents();
        this.setTitle(title);
    }
    
    public Open_Ended(Open_Ended oe){
        lowerLimits = oe.lowerLimits;
        upperLimits = oe.upperLimits;
        frequencyList = oe.frequencyList;
        title = oe.title;
        initComponents();
        this.setTitle(title);
        setEnabledFalse();
        fillTable();
    }
    
    private void setEnabledFalse(){
        lowerClassLimit.setEnabled(false);
        upperClassLimit.setEnabled(false);
        frequency.setEnabled(false);
        editLowerClassLimit.setEnabled(false);
        editUpperClassLimit.setEnabled(false);
        editFrequency.setEnabled(false);
        continueButton.setEnabled(false);
        firstOpenEndedButton.setEnabled(false);
        bothOpenEndedButton.setEnabled(false);
        lastOpenEndedButton.setEnabled(false);
    }
    
    private void fillTable(){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object rowData[] = new Object[6];
        for(int i = 0; i < lowerLimits.size(); i++){
            rowData[0] = lowerLimits.get(i);
            rowData[1] = upperLimits.get(i);
            rowData[2] = frequencyList.get(i);
            model.addRow(rowData); 
        }
        rowData[0] = "";
        rowData[1] = "";
        rowData[2] = "n: " + addFrequencies();
        model.addRow(rowData);
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
        firstOpenEndedButton = new javax.swing.JRadioButton();
        lastOpenEndedButton = new javax.swing.JRadioButton();
        bothOpenEndedButton = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        lowerClassLimit = new javax.swing.JTextField();
        editLowerClassLimit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        upperClassLimit = new javax.swing.JTextField();
        editUpperClassLimit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        frequency = new javax.swing.JTextField();
        editFrequency = new javax.swing.JButton();
        continueButton = new javax.swing.JButton();
        computeMeanButton = new javax.swing.JButton();
        computeMedianButton = new javax.swing.JButton();
        computeModeButton = new javax.swing.JButton();
        computeAllButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(400, 70));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Choose which interval is open-ended:");

        firstOpenEndedButton.setBackground(new java.awt.Color(51, 51, 51));
        firstOpenEndedButton.setForeground(new java.awt.Color(240, 240, 240));
        firstOpenEndedButton.setText("First Interval");
        firstOpenEndedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstOpenEndedButtonActionPerformed(evt);
            }
        });

        lastOpenEndedButton.setBackground(new java.awt.Color(51, 51, 51));
        lastOpenEndedButton.setForeground(new java.awt.Color(240, 240, 240));
        lastOpenEndedButton.setText("Last Interval");
        lastOpenEndedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastOpenEndedButtonActionPerformed(evt);
            }
        });

        bothOpenEndedButton.setBackground(new java.awt.Color(51, 51, 51));
        bothOpenEndedButton.setForeground(new java.awt.Color(240, 240, 240));
        bothOpenEndedButton.setText("Both");
        bothOpenEndedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bothOpenEndedButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Lower Class Limit");

        lowerClassLimit.setEnabled(false);
        lowerClassLimit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lowerClassLimitKeyReleased(evt);
            }
        });

        editLowerClassLimit.setText("Edit");
        editLowerClassLimit.setEnabled(false);
        editLowerClassLimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editLowerClassLimitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Upper Class Limit");

        upperClassLimit.setEnabled(false);
        upperClassLimit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                upperClassLimitKeyReleased(evt);
            }
        });

        editUpperClassLimit.setText("Edit");
        editUpperClassLimit.setEnabled(false);
        editUpperClassLimit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUpperClassLimitActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(240, 240, 240));
        jLabel5.setText("Frequency");

        frequency.setEnabled(false);
        frequency.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                frequencyKeyReleased(evt);
            }
        });

        editFrequency.setText("Edit");
        editFrequency.setEnabled(false);
        editFrequency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editFrequencyActionPerformed(evt);
            }
        });

        continueButton.setText("Continue");
        continueButton.setEnabled(false);
        continueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueButtonActionPerformed(evt);
            }
        });

        computeMeanButton.setText("Compute For Mean");
        computeMeanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeMeanButtonActionPerformed(evt);
            }
        });

        computeMedianButton.setText("Compute For Median");
        computeMedianButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeMedianButtonActionPerformed(evt);
            }
        });

        computeModeButton.setText("Compute For Mode");
        computeModeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeModeButtonActionPerformed(evt);
            }
        });

        computeAllButton.setText("Compute For All Measures");
        computeAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeAllButtonActionPerformed(evt);
            }
        });

        table.setBorder(new javax.swing.border.MatteBorder(null));
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "                   Lower Class Limit", "                  Upper Class Limit", "                         Frequencies"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        table.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel3)
                        .addGap(119, 119, 119)
                        .addComponent(jLabel4)
                        .addGap(128, 128, 128)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(computeMeanButton)
                        .addGap(18, 18, 18)
                        .addComponent(computeMedianButton)
                        .addGap(18, 18, 18)
                        .addComponent(computeModeButton)
                        .addGap(18, 18, 18)
                        .addComponent(computeAllButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lowerClassLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(editLowerClassLimit)
                                        .addGap(39, 39, 39)
                                        .addComponent(upperClassLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(230, 230, 230)
                                        .addComponent(continueButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editUpperClassLimit))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(firstOpenEndedButton)
                                .addGap(18, 18, 18)
                                .addComponent(lastOpenEndedButton)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(frequency, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editFrequency))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(bothOpenEndedButton)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 24, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(firstOpenEndedButton)
                    .addComponent(lastOpenEndedButton)
                    .addComponent(bothOpenEndedButton))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lowerClassLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editLowerClassLimit)
                    .addComponent(upperClassLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editUpperClassLimit)
                    .addComponent(frequency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editFrequency))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(continueButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(computeMeanButton)
                    .addComponent(computeMedianButton)
                    .addComponent(computeModeButton)
                    .addComponent(computeAllButton))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        MainMenu main = new MainMenu();
        this.setVisible(false);
        main.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void lowerClassLimitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lowerClassLimitKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try{
                Double data = Double.parseDouble(lowerClassLimit.getText());
                Boolean set = false;
                if(counter == 0){
                    set = true;
                }else if(counter == 1){
                    if(openInterval == 1 || openInterval == 3){
                        if(data <= upperLimits.get(counter-1)){
                            JOptionPane.showMessageDialog(this, "Input must be greater than previous interval.", "Error", JOptionPane.ERROR_MESSAGE);
                            lowerClassLimit.setText("");
                        }else{
                            set = true;
                        }
                    }else{
                        if(data <= lowerLimits.get(counter-1)){
                            JOptionPane.showMessageDialog(this, "Input must be greater than previous interval.", "Error", JOptionPane.ERROR_MESSAGE);
                            lowerClassLimit.setText("");
                        }else{
                            set = true;
                        }
                    }
                }else if(counter > 1){
                    if(data <= lowerLimits.get(counter-1) || data <= upperLimits.get(counter-1)){
                        JOptionPane.showMessageDialog(this, "Input must be greater than previous interval.", "Error", JOptionPane.ERROR_MESSAGE);
                        lowerClassLimit.setText("");
                    }else{
                        set = true;
                    }
                }
                
                if(set){
                    lowerLimit = data;
                    lowerClassLimit.setEnabled(false);
                    if((openInterval == 2 || openInterval == 3) && (counter == size-1)){
                        upperClassLimit.setEnabled(false);
                        upperClassLimit.setFocusable(false);
                        frequency.setEnabled(true);
                        frequency.setFocusable(true);
                    }else{
                        upperClassLimit.setEnabled(true);
                        upperClassLimit.setFocusable(true);
                    }
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Input must be numeric.", "Error", JOptionPane.ERROR_MESSAGE);
                lowerClassLimit.setText("");
            }
        }
    }//GEN-LAST:event_lowerClassLimitKeyReleased

    private void editLowerClassLimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editLowerClassLimitActionPerformed
        if((openInterval != 1 && openInterval != 3) && (counter > 0)){
            lowerClassLimit.setEnabled(true);
            continueButton.setEnabled(false);
            frequency.setEnabled(false);
            upperClassLimit.setEnabled(false);
        }
    }//GEN-LAST:event_editLowerClassLimitActionPerformed

    private void upperClassLimitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upperClassLimitKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try{
                Double data = Double.parseDouble(upperClassLimit.getText());
                Boolean set = false;
                
                if(counter == 1){
                    if(openInterval == 1 || openInterval == 3){
                        if(data <= upperLimits.get(counter-1)){
                            JOptionPane.showMessageDialog(this, "Input must be greater than previous interval.", "Error", JOptionPane.ERROR_MESSAGE);
                            upperClassLimit.setText("");
                        }else{
                            if(data <= lowerLimit){
                                JOptionPane.showMessageDialog(this, "Input must be greater than the lower class limit.", "Error", JOptionPane.ERROR_MESSAGE);
                                upperClassLimit.setText("");
                            }else{
                                set = true;
                            }
                        }
                    }else{
                        if(data <= lowerLimits.get(counter-1) || data <= upperLimits.get(counter-1)){
                            JOptionPane.showMessageDialog(this, "Input must be greater than previous interval.", "Error", JOptionPane.ERROR_MESSAGE);
                            upperClassLimit.setText("");
                        }else{
                            if(data <= lowerLimit){
                                JOptionPane.showMessageDialog(this, "Input must be greater than the lower class limit.", "Error", JOptionPane.ERROR_MESSAGE);
                                upperClassLimit.setText("");
                            }else{
                                set = true;
                            }
                        }
                    }
                }else if(counter == 0){
                    if(openInterval == 1 || openInterval == 3){
                        set = true;
                    }else{
                        if(data <= lowerLimit){
                            JOptionPane.showMessageDialog(this, "Input must be greater than the lower class limit.", "Error", JOptionPane.ERROR_MESSAGE);
                            upperClassLimit.setText("");
                        }else{
                            set = true;
                        }
                    }
                }else if(counter > 1){
                    if(data <= lowerLimit){
                        JOptionPane.showMessageDialog(this, "Input must be greater than the lower class limit.", "Error", JOptionPane.ERROR_MESSAGE);
                        upperClassLimit.setText("");
                    }else{
                        if(data <= upperLimits.get(counter-1)){
                            JOptionPane.showMessageDialog(this, "Input must be greater than previous interval.", "Error", JOptionPane.ERROR_MESSAGE);
                            upperClassLimit.setText("");
                        }else{
                            set = true;
                        }
                    }
                }
                
                if(set){
                    upperLimit = data;
                    upperClassLimit.setEnabled(false);
                    frequency.setEnabled(true);
                    frequency.setFocusable(true);
                    editUpperClassLimit.setEnabled(true);
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Input must be numeric.", "Error", JOptionPane.ERROR_MESSAGE);
                upperClassLimit.setText("");
            }
        }
    }//GEN-LAST:event_upperClassLimitKeyReleased

    private void editUpperClassLimitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUpperClassLimitActionPerformed
        if(!(openInterval == 2 || openInterval == 2) && (counter != size-1)){
            upperClassLimit.setEnabled(true);
            continueButton.setEnabled(false);
            lowerClassLimit.setEnabled(false);
            frequency.setEnabled(false);
        }
    }//GEN-LAST:event_editUpperClassLimitActionPerformed

    private void frequencyKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_frequencyKeyReleased
        if(evt.getKeyCode() == KeyEvent.VK_ENTER){
            try{
                int data = Integer.parseInt(frequency.getText());
                if(data <= 0){
                    JOptionPane.showMessageDialog(this, "Input must be greater than 0.", "Error", JOptionPane.ERROR_MESSAGE);
                    frequency.setText("");
                }else{
                    frequencies = data;
                    frequency.setEnabled(false);
                    editLowerClassLimit.setEnabled(true);
                    continueButton.setEnabled(true);
                    editFrequency.setEnabled(true);
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Input must be numeric", "Error", JOptionPane.ERROR_MESSAGE);
                frequency.setText("");
            }
        }
    }//GEN-LAST:event_frequencyKeyReleased

    private void editFrequencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editFrequencyActionPerformed
        frequencyList.remove(frequencyList.size());
        frequency.setEnabled(true);
        continueButton.setEnabled(false);
        lowerClassLimit.setEnabled(false);
        upperClassLimit.setEnabled(false);
    }//GEN-LAST:event_editFrequencyActionPerformed

    private void continueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        Object rowData[] = new Object[6];
        
        if(counter < size){
            lowerLimits.add(lowerLimit);
            upperLimits.add(upperLimit);
            frequencyList.add(frequencies);
            if(counter == 0 && (openInterval == 1 || openInterval == 3)){
                rowData[0] = "<=";
                rowData[1] = upperLimit;
            }else if(counter == size-1 && (openInterval == 2 || openInterval == 3)){
                rowData[0] = lowerLimit;
                rowData[1] = ">=";
            }else{
                rowData[0] = lowerLimit;
                rowData[1] = upperLimit;
            }            
            rowData[2] = frequencies;

            model.addRow(rowData);
            counter++;
            lowerClassLimit.setEnabled(true);
            lowerClassLimit.setFocusable(true);
            lowerClassLimit.setText("");
            upperClassLimit.setText("");
            frequency.setText("");
            
        }
        
        if(counter == size){
            lowerClassLimit.setEnabled(false);
            upperClassLimit.setEnabled(false);
            frequency.setEnabled(false);
            editLowerClassLimit.setEnabled(false);
            editUpperClassLimit.setEnabled(false);
            editFrequency.setEnabled(false);
            continueButton.setEnabled(false);

            rowData[0] = "";
            rowData[1] = "";
            rowData[2] = "n = " + addFrequencies();
            model.addRow(rowData);
        }
    }//GEN-LAST:event_continueButtonActionPerformed

    private void computeMeanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeMeanButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Mean cannot be computed.");
    }//GEN-LAST:event_computeMeanButtonActionPerformed

    private void computeMedianButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeMedianButtonActionPerformed
        JOptionPane.showMessageDialog(this, "Median cannot be computed.");
    }//GEN-LAST:event_computeMedianButtonActionPerformed

    private void computeModeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeModeButtonActionPerformed
        ModeOpen_Ended mode = new ModeOpen_Ended(this, addFrequencies());
        this.setVisible(false);
        mode.setVisible(true);
    }//GEN-LAST:event_computeModeButtonActionPerformed

    private void computeAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeAllButtonActionPerformed
        ComputeAllOpen all = new ComputeAllOpen(this);
        this.setVisible(false);
        all.setVisible(true);
    }//GEN-LAST:event_computeAllButtonActionPerformed

    private void firstOpenEndedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstOpenEndedButtonActionPerformed
        openInterval = 1;
        upperClassLimit.setEnabled(true);
    }//GEN-LAST:event_firstOpenEndedButtonActionPerformed

    private void bothOpenEndedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bothOpenEndedButtonActionPerformed
        openInterval = 3;
        upperClassLimit.setEnabled(true);
    }//GEN-LAST:event_bothOpenEndedButtonActionPerformed

    private void lastOpenEndedButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastOpenEndedButtonActionPerformed
        openInterval = 2;
        lowerClassLimit.setEnabled(true);
    }//GEN-LAST:event_lastOpenEndedButtonActionPerformed
    
    private int addFrequencies(){
        int total = 0;
        for(Integer x : frequencyList){
            total += x;
        }
        return total;
    }
    
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
            java.util.logging.Logger.getLogger(Open_Ended.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Open_Ended.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Open_Ended.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Open_Ended.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Open_Ended().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bothOpenEndedButton;
    private javax.swing.JButton computeAllButton;
    private javax.swing.JButton computeMeanButton;
    private javax.swing.JButton computeMedianButton;
    private javax.swing.JButton computeModeButton;
    private javax.swing.JButton continueButton;
    private javax.swing.JButton editFrequency;
    private javax.swing.JButton editLowerClassLimit;
    private javax.swing.JButton editUpperClassLimit;
    private javax.swing.JRadioButton firstOpenEndedButton;
    private javax.swing.JTextField frequency;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton lastOpenEndedButton;
    private javax.swing.JTextField lowerClassLimit;
    private javax.swing.JTable table;
    private javax.swing.JTextField upperClassLimit;
    // End of variables declaration//GEN-END:variables
}
