/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.karimandco.cv;

import com.karimandco.bdd.DaoSIO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Sarah
 */
public class ExperiencePro extends javax.swing.JPanel {
    

    private Integer idExperiencePro = null, idCV = null, idTab = null;
    
    /**
     * Creates new form experiencePro
     */
    public ExperiencePro() {
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
        jTextFieldNomEntpExpPro = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAdresseExpPro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaDescriptionExpPro = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        classDate1 = new com.karimandco.cv.ClassDate();
        classDate2 = new com.karimandco.cv.ClassDate();
        jButtonSupprimeExperiencePro = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 102, 153));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("EXPERIENCE PROFESSIONNELLE");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("NOM DE L'ENTREPRISE");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ADRESSE DE L'ENTREPRISE");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("DATE");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("à");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DESCRIPTION DE L'EXPERIENCE");

        jTextAreaDescriptionExpPro.setColumns(20);
        jTextAreaDescriptionExpPro.setLineWrap(true);
        jTextAreaDescriptionExpPro.setRows(5);
        jScrollPane1.setViewportView(jTextAreaDescriptionExpPro);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("DEBUT");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("FIN");

        jButtonSupprimeExperiencePro.setBackground(new java.awt.Color(204, 51, 0));
        jButtonSupprimeExperiencePro.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSupprimeExperiencePro.setText("x");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldNomEntpExpPro)
                    .addComponent(jTextFieldAdresseExpPro, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(classDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(classDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSupprimeExperiencePro)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNomEntpExpPro, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldAdresseExpPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(classDate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSupprimeExperiencePro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * 
     * Cette methode crée les donnes de l'expérience professionnel dans la table `experience_pro` 
     * et ensuite retourne l'id de la dernière occurence inserer dans la table.
     * 
     * @param args
     * @return Integer
     */
    public Integer setEnvoieExperiencePro(Object...args){
        Integer res, lastKey = null;
        
        Integer idCV = (Integer) args[0];
        
        String entreprise = jTextFieldNomEntpExpPro.getText();
        
        if(!entreprise.equals("")){
            String adresse = jTextFieldAdresseExpPro.getText();
            
            if(!adresse.equals("")){
                
                String date_debut = classDate1.getText();
                String date_fin = classDate2.getText();
                if(classDate1.verifDate() && classDate2.verifDate()){
                    
                    date_debut = date_debut.replaceAll("/", "-");
                    date_fin = date_fin.replaceAll("/", "-");
                    
                    String description = jTextAreaDescriptionExpPro.getText();
                    
                    if(DaoSIO.getInstance().connexionActive()){
                        try {
                            if(this.idExperiencePro != null){
                                res = DaoSIO.getInstance().requeteAction("UPDATE `experience_pro` "
                                        + "SET `entreprise` = '" + entreprise + "', `adresse` = '" + adresse + "', `description` = '" + description + "', `annee_debut` = '" + date_debut + "', `annee_fin` = '" + date_fin + "' "
                                        + "WHERE id = " + this.idExperiencePro);
                                lastKey = this.idExperiencePro;
                            }else{
                                res = DaoSIO.getInstance().requeteAction("INSERT INTO `experience_pro` (`id`, `entreprise`, `adresse`, `description`, `annee_debut`, `annee_fin`, `id_cv`) "
                                        + "VALUES (NULL, '" + entreprise + "', '" + adresse + "', '" + description + "', '" + date_debut + "', '" + date_fin + "', '" + idCV + "');");
                                // Pour récupérer le dernière id de l'element 
                                lastKey = DaoSIO.getInstance().getLastID("experience_pro", "id"); 
                                this.idExperiencePro = lastKey;
                            }
                            
                            System.out.println("Dernière id pour Expérience Pro : " + lastKey);
                        } catch (SQLException ex) {
                            Logger.getLogger(ExperiencePro.class.getName()).log(Level.SEVERE, null, ex);
                            lastKey = null;
                        }
                    }
                }else{
                    JOptionPane.showMessageDialog(this, "L'un de vos dates de période d'expérience pro n'est pas valide.", "Erreur Expérience Pro " + idTab, JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "Veuillez saisir une adresse valide.", "Erreur Expérience Pro " + idTab, JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Veuillez saisir un nom de l'entreprise.", "Erreur Expérience Pro " + idTab, JOptionPane.ERROR_MESSAGE);
        }
        
        return lastKey;
    }

    public ClassDate getClassDate1() {
        return classDate1;
    }

    public ClassDate getClassDate2() {
        return classDate2;
    }

    public JTextArea getjTextAreaDescriptionExpPro() {
        return jTextAreaDescriptionExpPro;
    }

    public JTextField getjTextFieldAdresseExpPro() {
        return jTextFieldAdresseExpPro;
    }

    public JTextField getjTextFieldNomEntpExpPro() {
        return jTextFieldNomEntpExpPro;
    }
    
    public Integer getIdExperiencePro() {
        return idExperiencePro;
    }

    public void setIdExperiencePro(Integer idExperiencePro) {
        this.idExperiencePro = idExperiencePro;
    }

    public Integer getIdCV() {
        return idCV;
    }

    public void setIdCV(Integer idCV) {
        this.idCV = idCV;
    }

    public Integer getIdTab() {
        return idTab;
    }

    public void setIdTab(Integer idTab) {
        this.idTab = idTab;
    }

    public JButton getjButtonSupprimeExperiencePro() {
        return jButtonSupprimeExperiencePro;
    }

    public void setjButtonSupprimeExperiencePro(JButton jButtonSupprimeExperiencePro) {
        this.jButtonSupprimeExperiencePro = jButtonSupprimeExperiencePro;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.karimandco.cv.ClassDate classDate1;
    private com.karimandco.cv.ClassDate classDate2;
    private javax.swing.JButton jButtonSupprimeExperiencePro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaDescriptionExpPro;
    private javax.swing.JTextField jTextFieldAdresseExpPro;
    private javax.swing.JTextField jTextFieldNomEntpExpPro;
    // End of variables declaration//GEN-END:variables
}
