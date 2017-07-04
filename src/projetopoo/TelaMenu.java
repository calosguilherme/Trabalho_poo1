/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo;

import projetopoo.Instancias.AlterarInstancia;
import projetopoo.Instancias.CadastrarInstancia;
import projetopoo.Instancias.ExcluirInstancia;
import projetopoo.Instancias.ListarInstancia;
import projetopoo.Instancias.RelatorioInstancia;
import projetopoo.Modelos.PesquisarModelo;
import projetopoo.Modelos.AlterarModelo;
import projetopoo.Modelos.ExcluirModelo;
import projetopoo.Modelos.CadastrarModelo;
import java.awt.Image;
import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author lucas
 */
public class TelaMenu extends javax.swing.JFrame {
    ListaInstanciados listaM = new ListaInstanciados();
    /**
     * Creates new form dominio
     */
    public TelaMenu() {
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

        jMenuItem5 = new javax.swing.JMenuItem();
        ImageIcon icon = new ImageIcon(getClass().getResource("/imagens/modelagem.jpeg"));
        Image image = icon.getImage();
        AreaDeTrabalho = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }

        };
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        cadastroMod = new javax.swing.JMenuItem();
        AlterarMod = new javax.swing.JMenuItem();
        ExcluirMod = new javax.swing.JMenuItem();
        pesquisarMod = new javax.swing.JMenuItem();
        cadInstancia = new javax.swing.JMenu();
        CadInstancia = new javax.swing.JMenuItem();
        AltInstancia = new javax.swing.JMenuItem();
        excInstancia = new javax.swing.JMenuItem();
        relatInstancia = new javax.swing.JMenuItem();
        listInstancia = new javax.swing.JMenuItem();

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AreaDeTrabalho.setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout AreaDeTrabalhoLayout = new javax.swing.GroupLayout(AreaDeTrabalho);
        AreaDeTrabalho.setLayout(AreaDeTrabalhoLayout);
        AreaDeTrabalhoLayout.setHorizontalGroup(
            AreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        AreaDeTrabalhoLayout.setVerticalGroup(
            AreaDeTrabalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Apps-Calibre-B-icon.png"))); // NOI18N
        jMenu1.setText("Modelo");

        cadastroMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/new.png"))); // NOI18N
        cadastroMod.setText("Cadastrar");
        cadastroMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroModActionPerformed(evt);
            }
        });
        jMenu1.add(cadastroMod);

        AlterarMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/write.png"))); // NOI18N
        AlterarMod.setText("Alterar");
        AlterarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarModActionPerformed(evt);
            }
        });
        jMenu1.add(AlterarMod);

        ExcluirMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        ExcluirMod.setText("Excluir");
        ExcluirMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirModActionPerformed(evt);
            }
        });
        jMenu1.add(ExcluirMod);

        pesquisarMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/search-icon.png"))); // NOI18N
        pesquisarMod.setText("Pesquisar");
        pesquisarMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pesquisarModActionPerformed(evt);
            }
        });
        jMenu1.add(pesquisarMod);

        jMenuBar1.add(jMenu1);

        cadInstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Folder-Data-icon.png"))); // NOI18N
        cadInstancia.setText("Instancia de Modelo");

        CadInstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/new.png"))); // NOI18N
        CadInstancia.setText("Cadastrar");
        CadInstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadInstanciaActionPerformed(evt);
            }
        });
        cadInstancia.add(CadInstancia);

        AltInstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/write.png"))); // NOI18N
        AltInstancia.setText("Alterar");
        AltInstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AltInstanciaActionPerformed(evt);
            }
        });
        cadInstancia.add(AltInstancia);

        excInstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        excInstancia.setText("Excluir");
        excInstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excInstanciaActionPerformed(evt);
            }
        });
        cadInstancia.add(excInstancia);

        relatInstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/report.png"))); // NOI18N
        relatInstancia.setText("Relatório");
        relatInstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relatInstanciaActionPerformed(evt);
            }
        });
        cadInstancia.add(relatInstancia);

        listInstancia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/list.png"))); // NOI18N
        listInstancia.setText("Listar");
        listInstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listInstanciaActionPerformed(evt);
            }
        });
        cadInstancia.add(listInstancia);

        jMenuBar1.add(cadInstancia);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AreaDeTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AreaDeTrabalho, javax.swing.GroupLayout.DEFAULT_SIZE, 598, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroModActionPerformed
        // TODO add your handling code here:
        CadastrarModelo cadM = new CadastrarModelo();
        AreaDeTrabalho.add(cadM);
        cadM.setVisible(true);
        
    }//GEN-LAST:event_cadastroModActionPerformed

    private void CadInstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadInstanciaActionPerformed
        CadastrarInstancia cadi = new CadastrarInstancia();
        AreaDeTrabalho.add(cadi);
        cadi.setVisible(true);
        cadi.setListaM(listaM);
    }//GEN-LAST:event_CadInstanciaActionPerformed

    private void AlterarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarModActionPerformed
        
        AlterarModelo altM = new AlterarModelo();
        AreaDeTrabalho.add(altM);
        altM.setVisible(true);
        
    }//GEN-LAST:event_AlterarModActionPerformed

    private void ExcluirModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirModActionPerformed
       ExcluirModelo exMod = new ExcluirModelo();
        AreaDeTrabalho.add(exMod);
        exMod.setVisible(true);
    }//GEN-LAST:event_ExcluirModActionPerformed

    private void pesquisarModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pesquisarModActionPerformed
        PesquisarModelo pesMod = new PesquisarModelo();
        AreaDeTrabalho.add(pesMod);
        pesMod.setVisible(true);


    }//GEN-LAST:event_pesquisarModActionPerformed

    private void AltInstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AltInstanciaActionPerformed
        AlterarInstancia alti = new AlterarInstancia();
        AreaDeTrabalho.add(alti);
        alti.setVisible(true);
        alti.setListaM(listaM);

    }//GEN-LAST:event_AltInstanciaActionPerformed

    private void excInstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excInstanciaActionPerformed
        ExcluirInstancia exci = new ExcluirInstancia();
        AreaDeTrabalho.add(exci);
        exci.setVisible(true);
        exci.setListaM(listaM);
    }//GEN-LAST:event_excInstanciaActionPerformed

    private void relatInstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relatInstanciaActionPerformed
        RelatorioInstancia relati = new RelatorioInstancia();
        AreaDeTrabalho.add(relati);
        relati.setVisible(true);

    }//GEN-LAST:event_relatInstanciaActionPerformed

    private void listInstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listInstanciaActionPerformed
        ListarInstancia listi = new ListarInstancia();
        AreaDeTrabalho.add(listi);
        listi.setVisible(true);
    }//GEN-LAST:event_listInstanciaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AltInstancia;
    private javax.swing.JMenuItem AlterarMod;
    private javax.swing.JDesktopPane AreaDeTrabalho;
    private javax.swing.JMenuItem CadInstancia;
    private javax.swing.JMenuItem ExcluirMod;
    private javax.swing.JMenu cadInstancia;
    private javax.swing.JMenuItem cadastroMod;
    private javax.swing.JMenuItem excInstancia;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem listInstancia;
    private javax.swing.JMenuItem pesquisarMod;
    private javax.swing.JMenuItem relatInstancia;
    // End of variables declaration//GEN-END:variables
}
