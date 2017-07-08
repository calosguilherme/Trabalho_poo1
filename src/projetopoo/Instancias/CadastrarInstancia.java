/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo.Instancias;

import bancoDeDados.Crud;
import bancoDeDados.Icrud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import projetopoo.Recurso;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import projetopoo.*;

/**
 *
 * @author lucas
 */
public class CadastrarInstancia extends javax.swing.JInternalFrame {
    ArrayList <Modelo> modelos;
    ArrayList <Regra> regras;
    Modelo m;
    Atividade a;
    Dominio d;
    Crud c;
    Icrud ic;
    ArrayList <Recurso> re;
    ArrayList <Atividade> atividades,an;
    Modelo mn;
    Dominio dn;
    Recurso rec;
    DefaultTableModel model;
    /**
     * Creates new form CadastrarInstancia
     */
    
    public CadastrarInstancia(){
        initComponents();
        m = new Modelo();
        d = new Dominio();
        carregaModelos();
        carregaComboBox();
        model =(DefaultTableModel)tabelaInstancia.getModel();
    }
    
    public void carregaComboBox() {
        comboModelo.removeAllItems();
        for (Modelo m : this.modelos) {
                comboModelo.addItem(m.getNome()+"");
    }}
    
    public void carregaModelos(){
        c = new Crud();
        modelos = (ArrayList<Modelo>) c.listaModelo(); 

    }
    
    public void carregaComboBoxAti() {
        comboAtividade.removeAllItems();
        for (Atividade a : d.getAtividades()) {
            a.setRecursos(c.carregaRecursoAtividade(a.getId()));
            comboAtividade.addItem(a.getNome()+"");
            
        }
    }
    
    public void carregaComboBoxRec() {
        comboRecurso.removeAllItems();
        for(Recurso r2: re){
            if(r2.getTipo().equals(a.getTiporecurso())){
                comboRecurso.addItem(r2.getNome()+"");
            }
        }
    }
    
     public void carregaTabela1() {
        DefaultTableModel modelo = (DefaultTableModel) tabelaInstancia.getModel();
        modelo.setNumRows(0);
        a.setRecursoAlocado(comboRecurso.getSelectedItem().toString()); //selecionando o item do combo box
            modelo.addRow(new Object[]{
                a.getNome(),
                a.getTipo(),
                a.getRecursoAlocado(),
                a.getInicio(),
                a.getFim(),
                false
            });
    }
     
     

    
    public ArrayList<Recurso> buscaRnome(String n){
        for (int i=0; i< re.size(); i++) {
            if(n.equals(re.get(i).getNome())){
                ArrayList<Recurso> recu = new ArrayList();
                recu.add(re.get(i));
                return(recu);
            }
        }
        return null;
    }
  
    public Atividade buscaAnome(String n){
        for (int i=0; i<atividades.size(); i++) {
            if(n.equals(atividades.get(i).getNome())){
                System.out.println("entrei aqui"+ atividades.get(i).getNome());
            }
        }
        return null;
    }
    
        public Modelo buscaMnome(String n){
        for (int i=0; i<modelos.size(); i++) {
            if(n.equals(modelos.get(i).getNome())){
                return(modelos.get(i));
            }
        }
        return null;
    }
        
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaInstancia = new javax.swing.JTable();
        cadastrarInstancia = new javax.swing.JButton();
        comboModelo = new javax.swing.JComboBox<>();
        comboAtividade = new javax.swing.JComboBox<>();
        botaoModelo = new javax.swing.JButton();
        botaoAtividade = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        comboRecurso = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Instancia");

        jLabel1.setText("Modelo");

        jLabel6.setText("Atividade");

        tabelaInstancia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Atividade", "Tipo", "Recurso Alocado", "Data Inicio", "Data Fim", "Terminado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaInstancia);
        if (tabelaInstancia.getColumnModel().getColumnCount() > 0) {
            tabelaInstancia.getColumnModel().getColumn(0).setResizable(false);
            tabelaInstancia.getColumnModel().getColumn(1).setResizable(false);
            tabelaInstancia.getColumnModel().getColumn(2).setResizable(false);
            tabelaInstancia.getColumnModel().getColumn(3).setResizable(false);
            tabelaInstancia.getColumnModel().getColumn(4).setResizable(false);
            tabelaInstancia.getColumnModel().getColumn(5).setResizable(false);
        }

        cadastrarInstancia.setText("Salvar");
        cadastrarInstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarInstanciaActionPerformed(evt);
            }
        });

        comboModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboAtividade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboAtividade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboAtividadeItemStateChanged(evt);
            }
        });
        comboAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAtividadeActionPerformed(evt);
            }
        });

        botaoModelo.setText("OK");
        botaoModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoModeloActionPerformed(evt);
            }
        });

        botaoAtividade.setText("OK");
        botaoAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtividadeActionPerformed(evt);
            }
        });

        jButton2.setText("Iniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Finalizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        comboRecurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboRecurso.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboRecursoItemStateChanged(evt);
            }
        });
        comboRecurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboRecursoActionPerformed(evt);
            }
        });

        jButton4.setText("OK");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setText("Recursos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(cadastrarInstancia)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(comboRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoModelo)
                            .addComponent(botaoAtividade))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoModelo))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botaoAtividade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(cadastrarInstancia)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarInstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarInstanciaActionPerformed
        ic = new Icrud();
        ic.create(a);
        DefaultTableModel modelo = (DefaultTableModel) tabelaInstancia.getModel();
        modelo.setNumRows(0);
        JOptionPane.showMessageDialog(null,"criado com sucesso!");
        
        //dispose();
        
    }//GEN-LAST:event_cadastrarInstanciaActionPerformed

    private void comboAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAtividadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAtividadeActionPerformed

    private void comboAtividadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboAtividadeItemStateChanged
          
    }//GEN-LAST:event_comboAtividadeItemStateChanged

    private void botaoModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoModeloActionPerformed
        // TODO add your handling code here:
    
        c = new Crud();
        m = modelos.get(comboModelo.getSelectedIndex());
        atividades = c.listaAtividade(m);
        d.setAtividades(atividades);
        m.setDominio(d);
        carregaComboBoxAti();
    }//GEN-LAST:event_botaoModeloActionPerformed

    private void botaoAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtividadeActionPerformed
//    
      c = new Crud();
      atividades = c.listaAtividadeRecurso(m);
      a = atividades.get(comboAtividade.getSelectedIndex());
      re = c.listaRecurso();
      carregaComboBoxRec();
      
//      
    }//GEN-LAST:event_botaoAtividadeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tabelaInstancia.getModel();
        Date data = new Date(System.currentTimeMillis());
        a.setInicio(data); //salvando a data no objeto atividade
        String d;
        d = data.toString();
        modelo.removeRow(0);
        modelo.addRow(new Object[]{
                a.getNome(),
                a.getTipo(),
                a.getRecursoAlocado(),
                d,
                a.getFim(),
                false
            });
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modelo = (DefaultTableModel) tabelaInstancia.getModel();
        Date data = new Date(System.currentTimeMillis());
        //fielddataInicio.setText(data.toLocaleString());
        a.setFim(data);       // salvando a data no objeto atividade
        String d;
        d = data.toString();  
        modelo.removeRow(0);
        modelo.addRow(new Object[]{
                a.getNome(),
                a.getTipo(),
                a.getRecursoAlocado(),
                d,
                a.getFim(),
                true
            });
        //System.out.println(a.getNome()+a.getTipo()+a.getTiporecurso()+a.getRecursoAlocado()+a.getInicio()+a.getFim());
        System.out.println(a.getRecursoAlocado());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void comboRecursoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboRecursoItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRecursoItemStateChanged

    private void comboRecursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboRecursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboRecursoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        a.setId_modelo(buscaMnome(comboModelo.getSelectedItem().toString()).getId());
        carregaTabela1();
    }//GEN-LAST:event_jButton4ActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAtividade;
    private javax.swing.JButton botaoModelo;
    private javax.swing.JButton cadastrarInstancia;
    private javax.swing.JComboBox<String> comboAtividade;
    private javax.swing.JComboBox<String> comboModelo;
    private javax.swing.JComboBox<String> comboRecurso;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaInstancia;
    // End of variables declaration//GEN-END:variables

}