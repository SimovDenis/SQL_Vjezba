/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package edunova.view;

import edunova.controller.ObradaSmjer;
import edunova.model.Smjer;
import edunova.util.Alati;
import edunova.util.EdunovaException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Katedra
 */
public class ProzorSmjer extends javax.swing.JFrame implements EdunovaViewSucelje{

    private ObradaSmjer obrada;
    private DecimalFormat df;

    /**
     * Creates new form ProzorSmjer
     */
    public ProzorSmjer() {
        initComponents();
        obrada = new ObradaSmjer();
        //https://docs.oracle.com/javase%2F7%2Fdocs%2Fapi%2F%2F/java/text/DecimalFormat.html
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(Locale.of("hr", "HR"));
        df = new DecimalFormat("###,##0.00", dfs);

        setTitle(Alati.NAZIV_APP + " | SMJEROVI");
        ucitaj();
    }

    @Override
     public void ucitaj() {
        DefaultListModel<Smjer> m = new DefaultListModel<>();
        m.addAll(obrada.read());
        lstPodaci.setModel(m);
        lstPodaci.repaint();
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
        lstPodaci = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtNaziv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTrajanje = new javax.swing.JTextField();
        chkVerificiran = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        txtCijena = new javax.swing.JTextField();
        txtUpisnina = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnDodaj = new javax.swing.JButton();
        btnObrisi = new javax.swing.JButton();
        btnPromjena = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lstPodaci.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstPodaci.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstPodaciValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstPodaci);

        jLabel1.setText("Naziv");

        jLabel2.setText("Trajanje");

        txtTrajanje.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtTrajanje.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTrajanjeKeyPressed(evt);
            }
        });

        chkVerificiran.setText("Verificiran");

        jLabel3.setText("Cijena");

        txtCijena.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtCijena.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCijenaKeyPressed(evt);
            }
        });

        txtUpisnina.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtUpisnina.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUpisninaKeyPressed(evt);
            }
        });

        jLabel4.setText("Upisnina");

        btnDodaj.setText("Dodaj");
        btnDodaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajActionPerformed(evt);
            }
        });

        btnObrisi.setText("Obriši");
        btnObrisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiActionPerformed(evt);
            }
        });

        btnPromjena.setText("Promjeni");
        btnPromjena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPromjenaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCijena, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(105, 105, 105)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtUpisnina, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtTrajanje, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(chkVerificiran, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDodaj)
                                .addGap(50, 50, 50)
                                .addComponent(btnPromjena)))
                        .addContainerGap(37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnObrisi)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNaziv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtTrajanje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(chkVerificiran))
                                .addGap(26, 26, 26)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCijena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUpisnina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDodaj)
                            .addComponent(btnPromjena))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(btnObrisi)
                        .addGap(14, 14, 14))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTrajanjeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrajanjeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrajanjeKeyPressed

    private void txtCijenaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCijenaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCijenaKeyPressed

    private void txtUpisninaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUpisninaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUpisninaKeyPressed

    private void lstPodaciValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstPodaciValueChanged
        if (evt.getValueIsAdjusting()) {
            return;
        }

        if (lstPodaci.getSelectedValue() == null) {
            return;
        }

        obrada.setEntitet(lstPodaci.getSelectedValue());

        popuniView();


    }//GEN-LAST:event_lstPodaciValueChanged

    private void btnDodajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajActionPerformed

        obrada.setEntitet(new Smjer());
        popuniModel();
        try {
            obrada.create();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }


    }//GEN-LAST:event_btnDodajActionPerformed

    private void btnObrisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiActionPerformed
        if(lstPodaci.getSelectedValue()==null){
            return;
        }
        
        var e = lstPodaci.getSelectedValue();
        
        
        if (JOptionPane.showConfirmDialog(getRootPane(), e.getNaziv() , "Sigurno obrisati?",
                JOptionPane.YES_NO_OPTION)!=JOptionPane.YES_OPTION){
            return;
        }
        
        obrada.setEntitet(e);
        
        try {
            obrada.delete();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getPoruka());
        }
        
        
        
    }//GEN-LAST:event_btnObrisiActionPerformed

    private void btnPromjenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPromjenaActionPerformed
         if(lstPodaci.getSelectedValue()==null){
            return;
        }
        
        var e = lstPodaci.getSelectedValue();
        
        obrada.setEntitet(e);
        popuniModel();
        
        try {
            obrada.update();
            ucitaj();
        } catch (EdunovaException ex) {
            JOptionPane.showMessageDialog(getRootPane(), ex.getMessage());
            obrada.refresh();
        }
        
        
    }//GEN-LAST:event_btnPromjenaActionPerformed
    @Override
     public void popuniModel() {
        var e = obrada.getEntitet();
        e.setNaziv(txtNaziv.getText());
        
        try {
            e.setTrajanje(Integer.parseInt(txtTrajanje.getText()));
        } catch (Exception ex) {
            e.setTrajanje(0);
        }
        
        try {
            e.setCijena(BigDecimal.valueOf(df.parse(txtCijena.getText()).doubleValue()));
        } catch (Exception ex) {
            e.setCijena(null);
        }
        
        try {
            e.setUpisnina(BigDecimal.valueOf(df.parse(txtUpisnina.getText()).doubleValue()));
        } catch (Exception ex) {
            e.setUpisnina(BigDecimal.ZERO);
        }
        
        e.setVerificiran(chkVerificiran.isSelected());
        
    }

    @Override
     public void popuniView() {
        var e = obrada.getEntitet();

        txtNaziv.setText(e.getNaziv());

        try {
            txtTrajanje.setText(String.valueOf(e.getTrajanje()));
        } catch (Exception ex) {
            txtTrajanje.setText("");
        }

        try {
            txtCijena.setText(df.format(e.getCijena()));
        } catch (Exception ex) {
            txtCijena.setText(df.format(0));
        }

        try {
            txtUpisnina.setText(df.format(e.getUpisnina()));
        } catch (Exception ex) {
            txtUpisnina.setText(df.format(0));
        }

        chkVerificiran.setSelected(e.isVerificiran());

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodaj;
    private javax.swing.JButton btnObrisi;
    private javax.swing.JButton btnPromjena;
    private javax.swing.JCheckBox chkVerificiran;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Smjer> lstPodaci;
    private javax.swing.JTextField txtCijena;
    private javax.swing.JTextField txtNaziv;
    private javax.swing.JTextField txtTrajanje;
    private javax.swing.JTextField txtUpisnina;
    // End of variables declaration//GEN-END:variables
}
