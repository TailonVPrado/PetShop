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
import br.unipar.model.Internacao;
import br.unipar.model.Medicamento;
import br.unipar.model.MedicoVet;
import br.unipar.model.Pagamento;
import br.unipar.model.Pais;
import br.unipar.model.ProprietarioAnimal;
import br.unipar.model.Raca;
import br.unipar.model.Telefone;
import br.unipar.model.Tosa;
import br.unipar.model.Vacina;
import java.text.SimpleDateFormat;

public class Imprime{
    SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
    /*para tranformar data no formato Date -> formatoData.parse("String")
      para formatar data que vem Date      -> formatoData.format(Date)      */
    
    public String imprimeAnimal(Animal animal, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"ANIMAL"+
            "\n"+space+"Id: "+animal.getId()+
            "\n"+space+"Nome: "+animal.getNome()+
            "\n"+space+"Data de Nascimento: "+formatoData.format(animal.getDtNasc())+
            "\n"+space+"Sexo: "+ animal.getSexo()+
            imprimeRaca(animal.getRaca(), space)+
            imprimeProprietarioAnimal(animal.getPorprietarioAnimal(), space);
        return retorno;
        
    }
    
    public String imprimeAtendimento(Atendimento atendimento, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"ATENDIMENTO"+
            "\n"+space+"Id: "+atendimento.getId()+ 
            "\n"+space+"Data atendimento: "+formatoData.format(atendimento.getDtAtendimento())+
            "\n"+space+"Status: "+atendimento.getStAtendimento()+
            imprimeBanho(atendimento.getBanho(), space)+
            imprimeConsulta(atendimento.getConsulta(), space)+
            imprimeAnimal(atendimento.getAnimal(), space);
        return retorno;
    }
    
    public String imprimeBanho(Banho banho, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"BANHO"+
            "\n"+space+"Id: "+banho.getId()+
            "\n"+space+"Data banho: "+formatoData.format(banho.getDtBanho())+
            "\n"+space+"Valor: "+banho.getVlBanho()+
            imprimeTosa(banho.getTosa(), space);
        return retorno;
    }
    
    public String imprimeCantinho(Cantinho cantinho, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"CANTINHO"+
            "\n"+space+"Id: "+cantinho.getId()+
            "\n"+space+"Valor diária: "+cantinho.getVlDiaria()+
            "\n"+space+"Disponivel: "+cantinho.isStDisponivel();
        return retorno;
    }
    
    public String imprimeCidade(Cidade cidade, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"CIDADE"+
            "\n"+space+"Id: "+cidade.getId()+
            "\n"+space+"Descrição: "+cidade.getDescricao()+
            imprimeEstado(cidade.getEstado(), space);
        return retorno;
    }
    
    public String imprimeConsulta(Consulta consulta, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"CONSULTA"+
            "\n"+space+"Id: "+consulta.getId()+
            "\n"+space+"Data Consulta: "+formatoData.format(consulta.getDtConsulta())+
            "\n"+space+"Valor: "+consulta.getVlConsulta()+
            imprimeMedicoVet(consulta.getMedico(), space);
            for(Exame exame: consulta.getListaExame()){
                retorno = retorno + imprimeExame(exame, space);
            }
            for(Vacina vacina: consulta.getListaVacina()){
                retorno = retorno + imprimeVacina(vacina, space);
            }
            for(Medicamento medicamento: consulta.getListaMedicamento()){
                retorno = retorno + imprimeMedicamento(medicamento, space);
            }
        return retorno;
    }
    
    public String imprimeEndereco(Endereco endereco, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"ENDERECO"+
            "\n"+space+"Id: "+endereco.getId()+
            "\n"+space+"CEP: "+endereco.getCdCEP()+
            "\n"+space+"Bairro: "+endereco.getDsBairro()+
            "\n"+space+"Rua: "+endereco.getDsRua()+
            "\n"+space+"Número: "+endereco.getNrEndereco()+
            "\n"+space+"Complemento: "+endereco.getComplemento()+
            "\n"+space+"Ativo: "+endereco.isStAtivo()+
            imprimeCidade(endereco.getCidade(), space);
        return retorno;
    }
    
    public String imprimeEspecie(Especie especie, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"ESPECIE"+
            "\n"+space+"Id: "+especie.getId()+
            "\n"+space+"Descrição: "+especie.getDsEspecie();
        return retorno;
    }
    
    public String imprimeEstado(Estado estado, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"ESTADO"+
            "\n"+space+"Id: "+estado.getId()+
            "\n"+space+"Descrição: "+estado.getDescricao()+
            "\n"+space+"Sigla: "+estado.getSigla()+
            imprimePais(estado.getPais(), space);
        return retorno;
    }
    
    public String imprimeExame(Exame exame, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"EXAME"+
            "\n"+space+"Id: "+exame.getId()+
            "\n"+space+"Descrição: "+exame.getDsExame()+
            "\n"+space+"Tipo: "+exame.getTpExame()+
            "\n"+space+"Data: "+formatoData.format(exame.getDtExame())+
            "\n"+space+"Valor: "+exame.getVlExame();
        return retorno;
    }
    
    public String imprimeInternacao(Internacao internacao, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"INTERNACAO"+
            "\n"+space+"Id: "+internacao.getId()+
            "\n"+space+"Data Internacao: "+formatoData.format(internacao.getDtInternacao())+
            "\n"+space+"Data Alta: "+formatoData.format(internacao.getDtAlta())+
            "\n"+space+"Valor: "+internacao.getVlInternacao()+
            "\n"+space+"Quantidade dias internação: "+internacao.getQtdeDiasInternado();
            imprimeCantinho(internacao.getCantinho(), space);
        return retorno;
    }
    
    public String imprimeMedicamento(Medicamento medicamento, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"MEDICAMENTO"+
            "\n"+space+"Id: "+medicamento.getId()+
            "\n"+space+"Nome: "+medicamento.getNomeMedicamento()+
            "\n"+space+"Valor: "+medicamento.getVlMedicamento();
        return retorno;
    }
    
    public String imprimeMedicoVet(MedicoVet medicoVet, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"MEDICO VETERINARIO"+
            "\n"+space+"Id: "+medicoVet.getId()+
            "\n"+space+"Nome: "+medicoVet.getNome()+
            "\n"+space+"Data nascimento: "+formatoData.format(medicoVet.getDtNasc())+
            "\n"+space+"Ativo: "+medicoVet.isStAtivo()+
            "\n"+space+"CPF: "+medicoVet.getNrCRm()+
            "\n"+space+"Especializacao: "+medicoVet.getEspecializacao()+
            imprimeEndereco(medicoVet.getEndereco(), space);
            for(Telefone telefone: medicoVet.getListaTelefones()){
                retorno = retorno + imprimeTelefone(telefone, space);
            }
        return retorno;
        
    }
    
    public String imprimePagamento(Pagamento pagamento){
        String retorno;
        retorno = "************************\nPAGAMENTO"+
            "\nId: "+pagamento.getId()+
            "\nForma pgto: "+pagamento.getFormaPgto()+
            "\nValor pgto: "+ pagamento.getVlPgto()+
            "\nValor desconto: "+pagamento.getVlDesconto()+
            imprimeAtendimento(pagamento.getAtendimento(), "");
        return retorno;
    }
    
    public String imprimePais(Pais pais, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"PAIS"+
            "\n"+space+"Id: "+pais.getId()+
            "\n"+space+"Descrição: "+pais.getDescricao()+
            "\n"+space+"Sigla: "+pais.getSigla();
        return retorno;
    }
    
    public String imprimeProprietarioAnimal(ProprietarioAnimal proprietarioAnimal, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"PROPRIETARIO ANIMAL"+
            "\n"+space+"Id: "+proprietarioAnimal.getId()+
            "\n"+space+"Nome: "+proprietarioAnimal.getNome()+
            "\n"+space+"Data de Nascimento: "+ formatoData.format(proprietarioAnimal.getDtNasc())+
            "\n"+space+"CPF: "+proprietarioAnimal.getCpf()+
            "\n"+space+"Ativo: "+proprietarioAnimal.isStAtivo()+
            imprimeEndereco(proprietarioAnimal.getEndereco(), space);
        
        for (Telefone telefone: proprietarioAnimal.getListaTelefones()) {
            retorno = retorno + imprimeTelefone(telefone, space);
        }
        return retorno;
    }
    
    public String imprimeRaca(Raca raca, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"RAÇA"+
            "\n"+space+"Id: "+raca.getId()+
            "\n"+space+"Descrição: "+raca.getDsRaca()+
            imprimeEspecie(raca.getEspecie(), space);
        return retorno;
    }
    
    public String imprimeTelefone(Telefone telefone, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"TELEFONE"+
            "\n"+space+"Id: "+telefone.getId()+
            "\n"+space+"DDD: "+telefone.getDDD()+
            "\n"+space+"Númerola: "+telefone.getNumero();
        return retorno;
    }
    
    public String imprimeTosa(Tosa tosa, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"Tosa"+
            "\n"+space+"Id: "+tosa.getId()+
            "\n"+space+"Observação: "+tosa.getDsObservacao()+
            "\n"+space+"Valor: "+tosa.getVlTosa();
        return retorno;
    }
    
    public String imprimeVacina(Vacina vacina, String space){
        space += "    ";
        String retorno;
        retorno = "\n"+space+"************************\n"+space+"VACINA"+
            "\n"+space+"Id: "+vacina.getId()+
            "\n"+space+"Nome: "+vacina.getNomeVacina()+
            "\n"+space+"Valor: "+vacina.getVlVacina()+
            "\n"+space+"Observação: "+vacina.getObservacao();
        return retorno;
    }
}
