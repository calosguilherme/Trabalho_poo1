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
import projetopoo.ListaInstanciados;
import projetopoo.ModeloInstanciado;
import projetopoo.ObjFluxo;
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
        NomeInstancia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        fieldTid = new javax.swing.JTextField();
        fieldTipo = new javax.swing.JTextField();
        fieldRecurso = new javax.swing.JTextField();
        fieldDataInicio = new javax.swing.JTextField();
        fieldDataFim = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        addAtividade = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaInstancia = new javax.swing.JTable();
        cadastrarInstancia = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        IDinstancia = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldTer = new javax.swing.JTextField();

        jButton1.setText("jButton1");

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastrar Instancia");

        jLabel1.setText("Nome:");

        NomeInstancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomeInstanciaActionPerformed(evt);
            }
        });

        jLabel6.setText("Atividade");

        jLabel7.setText("TID");

        jLabel8.setText("Tipo");

        jLabel9.setText("Recursos");

        jLabel11.setText("Data Inicio");

        jLabel10.setText("Data Fim");

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

        jLabel2.setText("ID");

        jLabel3.setText("terminado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(NomeInstancia))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(jLabel7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(fieldTid, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(fieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fieldRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel11)
                                    .addComponent(fieldDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(fieldDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fieldTer, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addAtividade)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(IDinstancia, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cadastrarInstancia)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(NomeInstancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11))
                            .addComponent(jLabel8))))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldRecurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldDataFim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addAtividade)
                    .addComponent(jLabel3)
                    .addComponent(fieldTer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastrarInstancia)
                    .addComponent(jLabel2)
                    .addComponent(IDinstancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NomeInstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NomeInstanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NomeInstanciaActionPerformed

    private void addAtividadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAtividadeActionPerformed
        // TODO add your handling code here:
        String atividade = fieldNome.getText();
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
        
        
    }//GEN-LAST:event_addAtividadeActionPerformed

    private void cadastrarInstanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarInstanciaActionPerformed
        // TODO add your handling code here:
        String id = IDinstancia.getText();
        String nome = NomeInstancia.getText();
        mod.setId(Integer.parseInt(id));
        mod.setNome(nome);
        listaM.add(mod);
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
    private javax.swing.JTextField IDinstancia;
    private javax.swing.JTextField NomeInstancia;
    private javax.swing.JButton addAtividade;
    private javax.swing.JButton cadastrarInstancia;
    private javax.swing.JTextField fieldDataFim;
    private javax.swing.JTextField fieldDataInicio;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldRecurso;
    private javax.swing.JTextField fieldTer;
    private javax.swing.JTextField fieldTid;
    private javax.swing.JTextField fieldTipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaInstancia;
    // End of variables declaration//GEN-END:variables
}
