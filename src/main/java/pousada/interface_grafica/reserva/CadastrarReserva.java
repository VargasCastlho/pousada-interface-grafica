/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pousada.interface_grafica.reserva;

import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pousada.dominio.Cliente;
import pousada.dominio.ConheceuPousada;
import pousada.dominio.MeioTransporte;
import pousada.dominio.MotivoViagem;
import pousada.dominio.Quarto;
import pousada.dominio.enums.FormaPagamentoEnum;
import pousada.gerenciador_tarefas.GerenciadorDominio;
import pousada.gerenciador_tarefas.GerenciadorInterfaceGrafica;


/**
 *
 * @author Secundário
 */
public class CadastrarReserva extends javax.swing.JFrame {

    /** Creates new form CadastrarReserva */
    String id;
    GerenciadorInterfaceGrafica gerIG;
    GerenciadorDominio gerD = null;
    List<Cliente> clientes = null;
    public CadastrarReserva(GerenciadorInterfaceGrafica gerIG) {
        initComponents();
        this.setLocationRelativeTo(null);
        URL url = this.getClass().getResource("/pousada/interface_grafica/imagens/logo-mobile.png"); 
        Image iconeTitulo = Toolkit.getDefaultToolkit().getImage(url); 
        this.setIconImage(iconeTitulo);
        this.gerIG = gerIG;
        gerD = gerIG.getGerDominio();
    }

private String getDateTime() {
        return null;
}

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton2 = new javax.swing.JButton();
        txtDataCheckOut = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        cbMv = new javax.swing.JComboBox<>();
        rbTransfBanc = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        lTexto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNome = new javax.swing.JTextPane();
        txtReserva = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        in = new javax.swing.JTextPane();
        txtDeposito = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        cbNq = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        txtDataCheckIn = new javax.swing.JFormattedTextField();
        cbMt = new javax.swing.JComboBox<>();
        cbCp = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        rbDinheiro = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        txtCarro = new javax.swing.JFormattedTextField();
        rbCartaoDebito = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabCli = new javax.swing.JTable();
        txtPesquisa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Reserva");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jButton2.setText("Salvar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        try {
            txtDataCheckOut.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataCheckOut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataCheckOutFocusLost(evt);
            }
        });

        jLabel3.setText("N� Quarto");

        cbMv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMvActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbTransfBanc);
        rbTransfBanc.setText("Transferencia Banc�ria");

        jLabel16.setText("Placa do carro");

        lTexto.setText("Digite o nome do h�spede: ");

        txtNome.setEnabled(false);
        jScrollPane2.setViewportView(txtNome);

        txtReserva.setEditable(false);

        jLabel19.setText("Como conhceu a pousada?");

        jLabel17.setText("Data Check in");

        jLabel21.setText("Dep�sito realizado");

        jLabel22.setText("Pagamento Check in");

        jLabel14.setText("Motivo da Viagem");

        in.setEditable(false);
        jScrollPane15.setViewportView(in);

        txtDeposito.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDepositoFocusLost(evt);
            }
        });

        jLabel15.setText("Meio de transporte");

        cbNq.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbNqItemStateChanged(evt);
            }
        });
        cbNq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbNqActionPerformed(evt);
            }
        });

        jLabel18.setText("Data Check out");

        try {
            txtDataCheckIn.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataCheckIn.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDataCheckInFocusLost(evt);
            }
        });
        txtDataCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataCheckInActionPerformed(evt);
            }
        });

        cbMt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbMtActionPerformed(evt);
            }
        });

        cbCp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCpActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome");

        buttonGroup1.add(rbDinheiro);
        rbDinheiro.setText("Dinheiro");

        jLabel20.setText("Valor da reserva");

        try {
            txtCarro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("AAA-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        buttonGroup1.add(rbCartaoDebito);
        rbCartaoDebito.setText("Cart�o de D�bito");

        tabCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "C�digo", "Nome", "CPF"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabCliMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tabCliMouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(tabCli);

        txtPesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesquisaKeyReleased(evt);
            }
        });

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lTexto)
                .addGap(345, 345, 345)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel15)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel19))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbMv, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbMt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbCp, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(rbDinheiro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(rbCartaoDebito))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(rbTransfBanc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel21))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(txtDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDataCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(txtDataCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(txtCarro, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbNq, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(jButton1))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lTexto)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel2)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel15)
                                .addComponent(jLabel19)))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbMv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbMt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbCp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDataCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDataCheckOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbNq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel21)
                            .addComponent(jLabel16))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDeposito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCarro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addComponent(jLabel22)
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(rbDinheiro)
                        .addGap(0, 0, 0)
                        .addComponent(rbCartaoDebito)
                        .addGap(0, 0, 0)
                        .addComponent(rbTransfBanc)
                        .addGap(11, 11, 11)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try{
        verificaCampos();
        
        FormaPagamentoEnum formaPagamentoEnum = null;
        if(rbCartaoDebito.isSelected())
            formaPagamentoEnum = FormaPagamentoEnum.CARTAO_DE_DEBITO;
        else if(rbDinheiro.isSelected())
            formaPagamentoEnum = FormaPagamentoEnum.DINHEIRO;
        else if(rbTransfBanc.isSelected())
            formaPagamentoEnum = FormaPagamentoEnum.TRANSFERENCIA_BANCARIA;
        LocalDate dataInicial = LocalDate.parse(txtDataCheckIn.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataFinal = LocalDate.parse(txtDataCheckOut.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
        System.out.println((Cliente)tabCli.getValueAt(tabCli.getSelectedRow(), 1));
        int id = gerD.inserirReserva(dataInicial, dataFinal, 
                Double.parseDouble(txtReserva.getText()), Double.parseDouble(txtDeposito.getText()), 
                txtCarro.getText(), Double.parseDouble(in.getText()), formaPagamentoEnum, 
                (MeioTransporte)cbMt.getSelectedItem(), 
                (ConheceuPousada)cbCp.getSelectedItem(), (MotivoViagem)cbMv.getSelectedItem(),
                (Quarto)cbNq.getSelectedItem(), (Cliente)tabCli.getValueAt(tabCli.getSelectedRow(), 1));
    
        JOptionPane.showMessageDialog(this, "Reserva "+id+" inserida com sucesso", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        limpaCampos();
    } catch(Exception e){
        JOptionPane.showMessageDialog(null, e.getMessage());
    }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void limpaCampos(){
        txtNome.setText("");
        cbCp.setSelectedIndex(0);
        cbMt.setSelectedIndex(0);
        cbMv.setSelectedIndex(0);
        cbNq.setSelectedIndex(0);
        txtDataCheckIn.setText("");
        txtDataCheckOut.setText("");
        txtReserva.setText("");
        txtDeposito.setText("");
        txtCarro.setText("");
        in.setText("");
        rbDinheiro.setSelected(false);
        rbCartaoDebito.setSelected(false);
        rbTransfBanc.setSelected(false);
    }
    
    private void verificaCampos() throws Exception{
        if(txtDataCheckIn.getText().equals("  /  /    ") || txtDataCheckOut.getText().equals("  /  /    "))
            throw new Exception("Campo Data vazio");
        LocalDate dataInicial = LocalDate.parse(txtDataCheckIn.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate dataFinal = LocalDate.parse(txtDataCheckOut.getText(), DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
        if(dataFinal.isBefore(dataInicial)){
            txtDataCheckOut.setText("");
            throw new Exception("Data Final é anterior a data Início");   
        }
        if(txtReserva.getText().isBlank())
            throw new Exception("Campo Valor Reserva Vazio");
        if(txtDeposito.getText().isBlank())
            throw new Exception("Campo Dep�sito Vazio");
        else if(!rbDinheiro.isSelected()&&!rbTransfBanc.isSelected()&&!rbCartaoDebito.isSelected())
                throw new Exception("M�todo de Pagamento n�o Selecionado");
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
    
    }//GEN-LAST:event_formWindowOpened

    private void cbMvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMvActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMvActionPerformed

    private void txtDepositoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDepositoFocusLost
        Double pagamentoCheckIn = Double.parseDouble(txtReserva.getText()) - 
                Double.parseDouble(txtDeposito.getText());
        in.setText(String.valueOf(pagamentoCheckIn));
    }//GEN-LAST:event_txtDepositoFocusLost

    private void cbNqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbNqActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbNqActionPerformed

    private void cbMtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbMtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbMtActionPerformed

    private void cbCpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCpActionPerformed

    private void tabCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCliMouseClicked
        txtNome.setText(String.valueOf(tabCli.getValueAt(tabCli.getSelectedRow(), 1)));
    }//GEN-LAST:event_tabCliMouseClicked

    private void tabCliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabCliMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tabCliMouseEntered

    private void txtPesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesquisaKeyReleased

    }//GEN-LAST:event_txtPesquisaKeyReleased

    private void cbNqItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbNqItemStateChanged
        
    }//GEN-LAST:event_cbNqItemStateChanged

    private void txtDataCheckInFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataCheckInFocusLost

        
    }//GEN-LAST:event_txtDataCheckInFocusLost

    private void txtDataCheckOutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDataCheckOutFocusLost

    }//GEN-LAST:event_txtDataCheckOutFocusLost

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LocalDate checkOut = LocalDate.parse(txtDataCheckOut.getText(), 
                DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate checkIn = LocalDate.parse(txtDataCheckIn.getText(), 
                DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        
        long dias = checkIn.until(checkOut, ChronoUnit.DAYS);
        Quarto quartoSelecionado = (Quarto)cbNq.getSelectedItem();
        txtReserva.setText(String.valueOf((dias*quartoSelecionado.getValorDiaria())));
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDataCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataCheckInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataCheckInActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        gerIG.carregarCombo(cbMt, MeioTransporte.class);
        gerIG.carregarCombo(cbMv, MotivoViagem.class);
        gerIG.carregarCombo(cbCp, ConheceuPousada.class);
        gerIG.carregarCombo(cbNq, Quarto.class);
        
        clientes = gerD.listar(Cliente.class);
        adicionarTabela(clientes);
    }//GEN-LAST:event_formComponentShown

    private void adicionarTabela(List<Cliente> clientes){
        
        // ADICIONAR LINHA NA TABELA 
        int rowCount = tabCli.getRowCount();
        for (int i = 0; i <= rowCount; i++) {
            if(tabCli.getRowCount()>0)
                ( (DefaultTableModel) tabCli.getModel() ).removeRow(0);
        }
        
        for(Cliente c : clientes){
            ( (DefaultTableModel) tabCli.getModel() ).addRow( new Object[3] );
            int linha = tabCli.getRowCount() - 1;
            int col = 0;
            tabCli.setValueAt(c.getIdCliente(), linha , col++);
            tabCli.setValueAt(c, linha , col++);
            tabCli.setValueAt(c.getCpf(), linha , col++);
        }
                
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
            java.util.logging.Logger.getLogger(CadastrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarReserva.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarReserva(GerenciadorInterfaceGrafica.getInstancia()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbCp;
    private javax.swing.JComboBox<String> cbMt;
    private javax.swing.JComboBox<String> cbMv;
    private javax.swing.JComboBox<String> cbNq;
    private javax.swing.JTextPane in;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lTexto;
    private javax.swing.JRadioButton rbCartaoDebito;
    private javax.swing.JRadioButton rbDinheiro;
    private javax.swing.JRadioButton rbTransfBanc;
    private javax.swing.JTable tabCli;
    private javax.swing.JFormattedTextField txtCarro;
    private javax.swing.JFormattedTextField txtDataCheckIn;
    private javax.swing.JFormattedTextField txtDataCheckOut;
    private javax.swing.JTextField txtDeposito;
    private javax.swing.JTextPane txtNome;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JTextField txtReserva;
    // End of variables declaration//GEN-END:variables

}
