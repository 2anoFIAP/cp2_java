//Aluno: João Vitor Parizotto Rocha | RM: 562719
//Aluno: Guilherme de Araujo Moreira | RM: 561848

package br.com.fiap.main;

import br.com.fiap.bean.Aluno;

import javax.swing.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MainAluno {
    public static void main(String[] args) {
        Aluno  aluno1, aluno2, aluno3, aluno4;
        int rm;
        String nomeCompleto, aux;
        LocalDate dataDeNascimento, dataAtual = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            dataDeNascimento = LocalDate.parse("11/09/2005", dtf);
            aluno1 = new Aluno(562719, "João Vitor Parizotto Rocha", dataDeNascimento);
            dataDeNascimento = LocalDate.parse("29/09/2005", dtf);
            aluno2 = new Aluno(561848,"Guilherme de Araujo Moreira", dataDeNascimento);
            aluno3 = new Aluno();
            aluno4 = new Aluno();

            nomeCompleto = JOptionPane.showInputDialog("Informe o nome completo do aluno: ");
            aluno3.setNomeCompleto(nomeCompleto);

            aux = JOptionPane.showInputDialog("Digite o RM do aluno: ");
            rm = Integer.parseInt(aux);
            aluno3.setRegistroMatricula(rm);

            aux = JOptionPane.showInputDialog("Informe a data de nascimento do aluno(Exemplo: 10/03/2005): ");
            dataDeNascimento = LocalDate.parse(aux, dtf);
            aluno3.setDataDeNascimento(dataDeNascimento);


            nomeCompleto = JOptionPane.showInputDialog("Informe o nome completo do aluno: ");
            aluno4.setNomeCompleto(nomeCompleto);

            aux = JOptionPane.showInputDialog("Digite o RM do aluno: ");
            rm = Integer.parseInt(aux);
            aluno4.setRegistroMatricula(rm);

            aux = JOptionPane.showInputDialog("Informe a data de nascimento do aluno (Exemplo: 02/07/2010): ");
            dataDeNascimento = LocalDate.parse(aux, dtf);
            aluno4.setDataDeNascimento(dataDeNascimento);

            String mensagem = String.format(
                    "RM: %d | Nome: %s | Idade: %s %n" +
                            "RM: %d | Nome: %s | Idade: %s %n" +
                            "RM: %d | Nome: %s | Idade: %s %n" +
                            "RM: %d | Nome: %s | Idade: %s",
                    aluno1.getRegistroMatricula(), aluno1.getNomeCompleto(), aluno1.calcularIdadeCompleta(dataAtual),
                    aluno2.getRegistroMatricula(), aluno2.getNomeCompleto(), aluno2.calcularIdadeCompleta(dataAtual),
                    aluno3.getRegistroMatricula(), aluno3.getNomeCompleto(), aluno3.calcularIdadeCompleta(dataAtual),
                    aluno4.getRegistroMatricula(), aluno4.getNomeCompleto(), aluno4.calcularIdadeCompleta(dataAtual)
            );

            JOptionPane.showMessageDialog(null, mensagem);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
