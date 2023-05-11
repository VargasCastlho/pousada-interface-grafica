/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pousada.gerenciador_tarefas;

import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import pousada.interface_grafica.JanelaPrincipal;
import pousada.interface_grafica.cliente.CadastrarCliente;
import pousada.interface_grafica.cliente.ConsultarCliente;
import pousada.interface_grafica.consultas.Faturamento;
import pousada.interface_grafica.consultas.QuarDis;
import pousada.interface_grafica.quarto.CadastrarQuartos;
import pousada.interface_grafica.quarto.ConsultarQuarto;
import pousada.interface_grafica.reserva.AddCp;
import pousada.interface_grafica.reserva.AddMt;
import pousada.interface_grafica.reserva.AddMv;
import pousada.interface_grafica.reserva.AltCp;
import pousada.interface_grafica.reserva.AltMt;
import pousada.interface_grafica.reserva.AltMv;
import pousada.interface_grafica.reserva.CadastrarReserva;
import pousada.interface_grafica.reserva.ConsultarReserva;


public class GerenciadorInterfaceGrafica {
    private static GerenciadorInterfaceGrafica instancia = null;
    public static GerenciadorInterfaceGrafica getInstancia() {
        if (instancia == null)
            instancia = new GerenciadorInterfaceGrafica();
        return instancia;
    }
   
    private GerenciadorDominio gerDominio = null;
    private CadastrarCliente cadastrarCliente = null;
    private ConsultarCliente consultarCliente = null;
    private Faturamento faturamento = null;
    private QuarDis quarDis = null;
    private CadastrarQuartos cadastrarQuartos = null;
    private ConsultarQuarto consultarQuarto = null;
    private AddCp addCp = null;
    private AddMt addMt = null;
    private AddMv addMv = null;
    private AltCp altCp = null;
    private AltMt altMt = null;
    private AltMv altMv = null;
    private CadastrarReserva cadastrarReserva = null;
    private ConsultarReserva consultarReserva = null;
    private JanelaPrincipal janelaPrincipal = null;
        
    private GerenciadorInterfaceGrafica(){
        gerDominio = GerenciadorDominio.getInstancia();
        janelaPrincipal = new JanelaPrincipal();
        cadastrarCliente = new CadastrarCliente();
        consultarReserva = new ConsultarReserva();
        consultarCliente = new ConsultarCliente();
        faturamento = new Faturamento();
        quarDis = new QuarDis();
        cadastrarQuartos = new CadastrarQuartos();
        consultarQuarto = new ConsultarQuarto();
        addCp = new AddCp();
        addMt = new AddMt();
        addMv = new AddMv();
        altCp = new AltCp();
        altMt = new AltMt();
        altMv = new AltMv();
        cadastrarReserva = new CadastrarReserva(this);
    }
    

    public void getCadastrarCliente() {
        cadastrarCliente.setVisible(true);
    }

    public void getConsultarCliente() {
        consultarCliente.setVisible(true);
    }

    public void getFaturamento() {
        faturamento.setVisible(true);
    }

    public void getQuarDis() {
        quarDis.setVisible(true);
    }

    public void getCadastrarQuartos() {
        cadastrarQuartos.setVisible(true);
    }

    public void getConsultarQuarto() {
        consultarQuarto.setVisible(true);
    }

    public void getAddCp() {
        addCp.setVisible(true);
    }

    public void getAddMt() {
        addMt.setVisible(true);
    }

    public void getAddMv() {
        addMv.setVisible(true);
    }

    public void getAltCp() {
        altCp.setVisible(true);
    }

    public void getAltMt() {
        altMt.setVisible(true);
    }

    public void getAltMv() {
        altMv.setVisible(true);
    }

    public void getCadastrarReserva() {
        cadastrarReserva.setVisible(true);
    }

    public void getConsultarReserva() {
        consultarReserva.setVisible(true);
    }


    public void getJanelaPrincipal() {
        janelaPrincipal.setVisible(true);
    }
    
    public void carregarCombo(JComboBox combo, Class classe) {
        
        try {
            List lista = gerDominio.listar(classe);
            combo.setModel( new DefaultComboBoxModel( lista.toArray() )  );
                                   
        } catch (HibernateException  ex) {
            JOptionPane.showMessageDialog(janelaPrincipal, "Erro ao carregar cidades. " + ex.getMessage() );          
        } 
        
    }
    
    
    public static void main(String[] args) throws InterruptedException {
        GerenciadorInterfaceGrafica gerenciadorInterfaceGrafica = GerenciadorInterfaceGrafica.getInstancia();
        gerenciadorInterfaceGrafica.getJanelaPrincipal();    
    }

}
