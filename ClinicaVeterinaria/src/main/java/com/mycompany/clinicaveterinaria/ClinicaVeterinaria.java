package com.mycompany.clinicaveterinaria;

import com.mycompany.clinicaveterinaria.domain.TipoServicoEnum;
import com.mycompany.clinicaveterinaria.model.*;
import java.util.Date;
import java.util.Calendar;
import javax.swing.JOptionPane;

public class ClinicaVeterinaria {

    public static void main(String[] args) {
 
        Medicamento medicamento = new Medicamento();
        medicamento.setPreco(20.00);
        
        BanhoTosa banhoTosa = new BanhoTosa();
        banhoTosa.setPreco(35.00);
        
        Consulta consulta = new Consulta();
        consulta.setPreco(25.00);
        
        Exame exame = new Exame();
        exame.setPreco(30.00);
        
        Vacina vacina = new Vacina();
        vacina.setPreco(40.00);
        
        TipoServicoEnum servico = TipoServicoEnum.BANHO_E_TOSA;
        TipoServicoEnum servico2 = TipoServicoEnum.EXAME;
        TipoServicoEnum servico3 = TipoServicoEnum.CONSULTA;
        TipoServicoEnum servico4 = TipoServicoEnum.VACINACAO;
        TipoServicoEnum servico5 = TipoServicoEnum.MEDICAMENTO;
        
        Calendar calNascimento = Calendar.getInstance();
        calNascimento.set(1990, Calendar.DECEMBER, 19);
        Date dtNascimento = calNascimento.getTime();
        
        Calendar calNascimentoMedico = Calendar.getInstance();
        calNascimentoMedico.set(1982, Calendar.FEBRUARY, 11);
        Date dtNascimentoMedico = calNascimentoMedico.getTime();
        
        Calendar calCadastro = Calendar.getInstance();
        calCadastro.set(2023, Calendar.APRIL, 22);
        Date dtCadastro = calCadastro.getTime();
        
        Endereco endereco = new Endereco();
        endereco.setCidade("Toledo, ");
        endereco.setRua("Rua Anápolis");
        endereco.setNrRua(45);
        
        Endereco enderecoMedico = new Endereco();
        enderecoMedico.setCidade("Cascavel, ");
        enderecoMedico.setRua("Rua Lebron");
        enderecoMedico.setNrRua(78);
        
        Telefone telefone = new Telefone();
        telefone.setNumero("45 99985-3211");
        telefone.setMarca("Xiaomi");
        
        Telefone telefoneMedico = new Telefone();
        telefoneMedico.setNumero("45 99971-1929");
        telefoneMedico.setMarca("Galaxy");
        
        Proprietario proprietario = new Proprietario();
        proprietario.setNome("Alan Ferreira");
        proprietario.setCpf("104.000.189.54");
        proprietario.setTelefone(telefone);
        proprietario.setDtNascimento(dtNascimento);
        proprietario.setDtcadastro(dtCadastro);
        proprietario.setEndereco(endereco);
        
        Animal animal = new Animal();
        animal.setNome("Tom");
        animal.setEspecie("Gato");
        animal.setRaca("Azul Russo");
        animal.setPeso(4.0);
        animal.setIdade(7);
        animal.setProprietario(proprietario);
        
        MedicosVeterinarios medico = new MedicosVeterinarios();
        medico.setNome("João Donatello");
        medico.setCpf("649.014.549-03");
        medico.setEspecialidade("Vacinação");
        medico.setCrm("1234455");
        medico.setTelefone(telefoneMedico);
        medico.setDtNascimento(dtNascimentoMedico);
        medico.setEndereco(enderecoMedico);
        
        JOptionPane.showMessageDialog(null, "Informações do Proprietário do animal" + "\n" +
                                     "Nome: " + proprietario.getNome() + "\n" +
                                     "CPF: " + proprietario.getCpf() + "\n" +
                                     "Telefone: " + proprietario.getTelefone().toString() + "\n" +
                                     "Data de Nascimento: " + proprietario.getDtNascimento() + "\n" +
                                     "Data de Cadastro: " + proprietario.getDtcadastro() + "\n" +
                                     "Endereço: " + proprietario.getEndereco().toString());
        
        JOptionPane.showMessageDialog(null, "Informações do animal" + "\n" +
                                     "Nome: " + animal.getNome() + "\n" +
                                     "Espécie: " + animal.getEspecie() + "\n" +
                                     "Raça: " + animal.getRaca() + "\n" +
                                     "Peso: " + animal.getPeso() + "\n" +
                                     "Idade: " + animal.getIdade() + "\n" +
                                     "Nome do Proprietário: " + animal.getProprietario().getNome());
        
        JOptionPane.showMessageDialog(null, servico4.getDescricao() + "\n" + "Valor do serviço: " + vacina.getPreco());
        
        JOptionPane.showMessageDialog(null, "Informações do Médico" + "\n" +
                                     "Nome do médico: " + medico.getNome() + "\n" +
                                     "Especialidade: " + medico.getEspecialidade() + "\n" +
                                     "CRM: " + medico.getCrm() + "\n" +
                                     "CPF: " + medico.getCpf() + "\n" +
                                     "Telefone: " + medico.getTelefone().toString() + "\n" +
                                     "Data de Nascimento: " + medico.getDtNascimento() + "\n" +
                                     "Endereço: " + medico.getEndereco().toString());
    }
}
