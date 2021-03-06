package com.karimandco.pdf;

import com.itextpdf.text.BadElementException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Tom, Léo, Lorenzo
 */
public class VoirPdf extends javax.swing.JPanel {

    private String nom;
    private String prenom;
    private String numero;
    private String lienPDF;
    private Pdf pdf = null;

    /**
     * Creates new form VoirPdf
     */
    public VoirPdf() {
        initComponents();
        nom = "FREGOLENT";
        prenom = "Damien";
        numero = "06 37 80 45 65";
        lienPDF = "cv";
        this.pdf = new Pdf(nom, prenom, numero, lienPDF);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        appercu = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 102, 153));

        appercu.setBackground(new java.awt.Color(204, 153, 0));
        appercu.setForeground(new java.awt.Color(255, 255, 255));
        appercu.setText("VOIR VOTRE CV EN PDF");
        appercu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                appercuActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pour récupérer votre CV sous format PDF, veuillez cliquer sur le bouton ci-dessous.");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Puis, rendez-vous dans le dossier du projet et parcourez cette arborescence :");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("PPE_KarimAndCo\\src\\main\\java\\com\\karimandco\\pdf\\cv");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appercu, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(36, 36, 36)
                .addComponent(appercu)
                .addContainerGap(156, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    public String adjouterAuFichierASupprimer() {
        String fichierADelete = this.pdf.getUrlCv();
        return fichierADelete;
    }
    public String ajouterUnCv(){
        String tableau = adjouterAuFichierASupprimer() + "|" + this.pdf.getUrlCv();
        return tableau;
    }

    
    private void appercuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_appercuActionPerformed
        this.pdf = new Pdf(nom, prenom, numero, lienPDF);
//        String urlFichier = pdf.getUrlCv();
//        String fichierADelete = urlFichier + "|" + urlFichier;
        System.out.println(ajouterUnCv());

        if (pdf.verifPDF()) {
            try {
                pdf.genererPDF();
                LecteurPDF lecteur = new LecteurPDF(pdf.getUrlCv());
                //créer le JFrame
                JFrame f = new JFrame("Lecteur PDF");
                f.setSize(1024, 768);
                f.setLocationRelativeTo(this);
                f.getContentPane().add(lecteur);
                f.setVisible(true);
                f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                if (JFrame.DISPOSE_ON_CLOSE >= 0) {
                    System.out.println(pdf.getUrlCv());
                    File monfichier = new File(pdf.getUrlCv());
                    monfichier.deleteOnExit();
                } else {
                    System.out.println("Pas coucou1");
                }

            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Erreur", "PDF", JOptionPane.ERROR_MESSAGE);
            } catch (BadElementException ex) {
                Logger.getLogger(PanelPDF.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(PanelPDF.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(VoirPdf.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showConfirmDialog(this, "Pas ok, c'est pas bon");
        }
        System.out.println(pdf.getNomCv());
    }//GEN-LAST:event_appercuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton appercu;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
