//Aluno: João Vitor Parizotto Rocha | RM: 562719
//Aluno: Guilherme de Araujo Moreira | RM: 561848
package br.com.fiap.bean;

import java.time.LocalDate;
import java.time.Period;

public class Aluno {
    private int registroMatricula;
    private String nomeCompleto;
    private LocalDate dataDeNascimento;

    public Aluno(){
    }

    public Aluno(int registroMatricula, String nomeCompleto, LocalDate dataDeNascimento){
        setDataDeNascimento(dataDeNascimento);
        setNomeCompleto(nomeCompleto);
        setRegistroMatricula(registroMatricula);
    }

    public int getRegistroMatricula(){
        return registroMatricula;
    }

    public void setRegistroMatricula(int registroMatricula){
        if (registroMatricula >= 80000 && registroMatricula <= 599999){
            this.registroMatricula = registroMatricula;
        } else {
            System.out.println("Registro Invalido!");
        }
    }

    public String getNomeCompleto(){
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }

    public LocalDate getDataDeNascimento(){
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento){
        LocalDate dataAtual = LocalDate.now();
        if (dataDeNascimento.getYear() >= 1960 && !dataDeNascimento.isAfter(dataAtual)) {
            this.dataDeNascimento = dataDeNascimento;
        } else {
            System.out.println("Data Invalida! Deve ser de 1960 em diante e nao pode ser futura.");
        }
    }

    public String calcularIdadeCompleta(LocalDate dataAtual) {
        Period periodo = Period.between(this.dataDeNascimento, dataAtual);
        return String.format("%d anos, %d meses e %d dias.", periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }
}
