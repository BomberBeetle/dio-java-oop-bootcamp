package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    LocalDate data;
    @Override
    public double calcularXp(){
        return XP_PADRAO*10;
    }
}
