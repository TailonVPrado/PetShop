package br.unipar.petshop;

import br.unipar.model.Animal;
import br.unipar.model.Atendimento;
import br.unipar.model.Banho;
import br.unipar.model.Cantinho;
import br.unipar.model.Cidade;
import br.unipar.model.Consulta;
import br.unipar.model.Endereco;
import br.unipar.model.Especie;
import br.unipar.model.Estado;
import br.unipar.model.Exame;
import br.unipar.model.ExameEnum;
import br.unipar.model.Internacao;
import br.unipar.model.Medicamento;
import br.unipar.model.MedicoVet;
import br.unipar.model.Pagamento;
import br.unipar.model.PagamentoEnum;
import br.unipar.model.Pais;
import br.unipar.model.ProprietarioAnimal;
import br.unipar.model.Raca;
import br.unipar.model.SexoEnum;
import br.unipar.model.Telefone;
import br.unipar.model.Tosa;
import br.unipar.model.Vacina;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws ParseException {
        /*Utils*/
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        /*para tranformar data no formato Date -> formatoData.parse("String")
          para formatar data que vem Date      -> formatoData.format(Date)      */
        
        Imprime impressora = new Imprime();
        
        /*Criação de um Pais, Estado e Cidade*/
        Pais pais = new Pais(1, "Brasil", "BR");
        Estado estado = new Estado(1, "Paraná", "PR", pais);
        Cidade cidade = new Cidade(1, "Toledo", estado);
        
        /*Criação endereco do prorpietario do Animal*/
        Endereco enderecoCliente = new Endereco(1, cidade, "1234567", "Santa Maria", "Raimundo Leonardi", "52A", "n/d");
        
        /*criacao da lista de telefones do priprietario do animal*/
        Telefone telefoneUm = new Telefone(1, "055", "45999004574");
        Telefone telefoneDois = new Telefone(2, "055", "45999998877");
        ArrayList<Telefone> listaTelProprietarioAnimal = new ArrayList();
        listaTelProprietarioAnimal.add(telefoneUm);
        listaTelProprietarioAnimal.add(telefoneDois);
        
        /*criacao do proprietario do animal*/
        ProprietarioAnimal proprietarioAnimal = new ProprietarioAnimal(1, "Beatriz Carraro", "0124567891", formatoData.parse("24/06/1986"), listaTelProprietarioAnimal, enderecoCliente);
               
        /*Criando especie,raca e animal*/
        Especie especie = new Especie(1, "Cachorro");
        Raca raca = new Raca(1, "Pastor alemão", especie);
        Animal animal = new Animal(1, "Bob", formatoData.parse("02/04/2018"), proprietarioAnimal, raca, SexoEnum.MACHO);
        
        /*criação das informações do medico veterinario*/
        Telefone telefoneUmMed = new Telefone(3, "055", "123456789");
        Telefone telefoneDoisMed = new Telefone(4, "055", "987654321");
        ArrayList<Telefone> listaTelefoneMed = new ArrayList<Telefone>();
        listaTelefoneMed.add(telefoneUmMed);
        listaTelefoneMed.add(telefoneDoisMed);
        ////
        Endereco enderecoMed = new Endereco(2, cidade, "85612745", "Centro", "Rua Borges de Medeiro", "521", "Próximo ao mercado Primato");
        ////
        MedicoVet medicoVeterinario = new MedicoVet();
        medicoVeterinario.setId(Integer.SIZE);
        medicoVeterinario.setCpf("05541654789");
        medicoVeterinario.setDtNasc(formatoData.parse("06/08/1975"));
        medicoVeterinario.setEndereco(enderecoMed);
        medicoVeterinario.setListaTelefones(listaTelefoneMed);
        medicoVeterinario.setNome("Raul Medeiros");
        medicoVeterinario.setNrCRm(47812);
        medicoVeterinario.setEspecializacao("Geral");
        
        /*Criando um cantinho(quarto)*/
        Cantinho cantinho = new Cantinho(1, 45.00);
        
        /*INstanciando alguns objetos*/
        Consulta consulta = new Consulta();
        Banho banho = new Banho();
        Vacina vacina = new Vacina();
        Exame exame = new Exame();
        Medicamento medicamento = new Medicamento();
        Internacao internacao = new Internacao();
        Tosa tosa = new Tosa();
        Atendimento atendimento = new Atendimento(1, animal, formatoData.parse("15/09/2022"), consulta, banho);
        
        /*Criando um banho e uma tosa*/
        banho.setId(1);
        banho.setVlBanho(30.00);
        banho.setDtBanho(formatoData.parse("14/09/2022"));
        banho.setTosa(tosa);
        tosa.setId(1);
        tosa.setVlTosa(50.00);
        tosa.setDsObservacao("Não tosar muito baixo");
        
        /*Criando as informações da consulta*/
        consulta.setId(1);
        consulta.setMedico(medicoVeterinario);
        consulta.setInternacao(internacao);
        consulta.setDtConsulta(formatoData.parse("12/09/2022"));
        consulta.setVlConsulta(100.0);
        
        /*adicionando os objetos que devem ser inseridos por uma lista*/
        ArrayList<Exame> listaExame = new ArrayList<Exame>();
        listaExame.add(exame);
        ArrayList<Vacina> listaVacina = new ArrayList<Vacina>();
        listaVacina.add(vacina);
        ArrayList<Medicamento> listaMedicamento = new ArrayList<Medicamento>();
        listaMedicamento.add(medicamento);
        
        consulta.setListaExame(listaExame);
        consulta.setListaVacina(listaVacina);
        consulta.setListaMedicamento(listaMedicamento);
        
        /*criando as informações de um exame*/
        exame.setId(1);
        exame.setDsExame("A pedido do Médico");
        exame.setDtExame(formatoData.parse("12/09/2022"));
        exame.setTpExame(ExameEnum.PERIODICO);
        exame.setVlExame(30.00);
        
        /*Criando as informações de uma vacina*/
        vacina.setId(1);
        vacina.setNomeVacina("Cinomose");
        vacina.setObservacao("n/d");
        vacina.setVlVacina(21.75);
        
        /*Criando as informações de um medicamento*/
        medicamento.setId(1);
        medicamento.setNomeMedicamento("Dipirona");
        medicamento.setVlMedicamento(12.40);
        
        /*Criando as informações de uma internação*/
        internacao.setId(1);
        internacao.setCantinho(cantinho);
        internacao.setDtInternacao(formatoData.parse("13/09/2022"));
        internacao.setVlInternacao(80.00);
        internacao.setQtdeDiasInternado(6);
        
        /*Efetuando um pagamento*/
        //Atendimento atendimento = new Atendimento(Integer.SIZE, animal, dtAtendimento, consulta, banho)
        Pagamento pagamento = new Pagamento(1, atendimento, PagamentoEnum.CREDITO);
        pagamento.finalizaPagamento();
        atendimento.finalizaAtendimento();
        System.out.println(impressora.imprimePagamento(pagamento));
        //JOptionPane.showMessageDialog(null, impressora.imprimeAtendimento(atendimento));
    }
}
