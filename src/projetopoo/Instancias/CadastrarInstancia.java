/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopoo.Instancias;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

import projetopoo.Recurso;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class CadastrarInstancia extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastrarInstancia
     */
    ListaInstanciados listaM;

    public ListaInstanciados getListaM() {
        return listaM;
    }

    public void setListaM(ListaInstanciados listaM) {
        this.listaM = listaM;
    }
    DefaultTableModel model;
    ModeloInstanciado mod = new ModeloInstanciado();
    ObjFluxo obj = new ObjFluxo();
    Recurso rec = new Recurso();
    public CadastrarInstancia() {
        initComponents();
        model =(DefaultTableModel)tabelaInstancia.getModel();
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
        addAtividade = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaInstancia = new javax.swing.JTable();
        cadastrarInstancia = new javax.swing.JButton();
        comboModelo = new javax.swing.JComboBox<>();
        comboAtividade = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        comboRecurso = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        fielddataInicio = new javax.swing.JTextField();
        fieldDataFim = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Instancia");

        jLabel1.setText("Modelo");

        jLabel6.setText("Atividade");

        addAtividade.setText("Adicionar");
        addAtividade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAtividadeActionPerformed(evt);
            }
        });

        tabelaInstancia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Atividade", "TID", "Tipo", "Recurso", "Data Inicio", "Data Fim", "Terminado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaInstancia);

        cadastrarInstancia.setText("Cadastrar");
        cadastrarInstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarInstanciaActionPerformed(evt);
            }
        });

        comboModelo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboAtividade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setText("Recurso Alocado");

        comboRecurso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setText("Data inicio");

        jLabel4.setText("Data Fim");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cadastrarInstancia))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(comboRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(fielddataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fieldDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(addAtividade)))))
                        .addGap(0, 151, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboAtividade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAtividade)
                    .addComponent(comboRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fielddataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cadastrarInstancia)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAtividadeActionPerformed
        // TODO add your handling code here:
        /*String atividade = fieldNome.getText();
        String tid = fieldTid.getText();
        String tipo = fieldTipo.getText();
        String recurso = fieldRecurso.getText();
        String ini = fieldDataInicio.getText();
        String fim = fieldDataFim.getText();
        String terminado = fieldTer.getText();
        mod.setTid(Integer.parseInt(tid));
        mod.setDataHoraF(fim);
        mod.setDataHoraI(ini);
        mod.setTerminado(terminado);
        obj.setTipo(tipo);
        obj.setNome(atividade);
        rec.setRecurso(recurso);
        mod.setAtividade(obj);
        mod.setRecursoAlocado(rec);
        model.insertRow(model.getRowCount(),new Object[]{fieldNome.getText(),fieldTid.getText(),fieldTipo.getText(),fieldRecurso.getText(),fieldDataInicio.getText(),fieldDataFim.getText(),fieldTer.getText()});
        */
        
    }//GEN-LAST:event_addAtividadeActionPerformed

    private void cadastrarInstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarInstanciaActionPerformed
        // TODO add your handling code here:
        /*String id = IDinstancia.getText();
        String nome = NomeInstancia.getText();
        mod.setId(Integer.parseInt(id));
        mod.setNome(nome);
        listaM.add(mod);*/
//        Connection c = null;
//      Statement stmt = null;
//      try {
//         Class.forName("org.postgresql.Driver");
//         c = DriverManager
//            .getConnection("jdbc:postgresql://localhost:5432/POO1",
//            "postgres", "135246");
//         c.setAutoCommit(false);
//         System.out.println("Opened database successfully");
//
//         stmt = c.createStatement();
//         String sql = "INSERT INTO modeloinstanciado (nomeinstancia, atividade, tid, tipo, recurso, dataini, datafim, terminado, idinstancia) "
//            + "VALUES ('"+nome+"',"
//                 + " '"+listaM.get(0).getAtividade().get(0).getNome()+"',"
//                 + ""+mod.getId()+","
//                 + " '"+obj.getTipo()+"',"
//                 + " '"+rec.getRecurso()+"',"
//                 + " '"+mod.getDataHoraI()+"',"
//                 + " '"+mod.getDataHoraF()+"' ,"
//                 + "'"+mod.getTerminado()+"',"
//                 + ""+id+");";
//         stmt.executeUpdate(sql);
//
//         stmt.close();
//         c.commit();
//         c.close();
//      } catch (Exception e) {
//         System.err.println( e.getClass().getName()+": "+ e.getMessage() );
//         System.exit(0);
//      }
//      System.out.println("Records created successfully");
      dispose();
    }//GEN-LAST:event_cadastrarInstanciaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAtividade;
    private javax.swing.JButton cadastrarInstancia;
    private javax.swing.JComboBox<String> comboAtividade;
    private javax.swing.JComboBox<String> comboModelo;
    private javax.swing.JComboBox<String> comboRecurso;
    private javax.swing.JTextField fieldDataFim;
    private javax.swing.JTextField fielddataInicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaInstancia;
    // End of variables declaration//GEN-END:variables
}
