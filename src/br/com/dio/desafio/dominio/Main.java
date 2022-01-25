package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Curso curso1 = new Curso();
        curso1.setTitulo("burso bava");
        curso1.setDescricao("bogos binted");
        curso1.setCargaHoraria(2);

        Curso curso2 = new Curso();
        curso2.setTitulo("burso bababit");
        curso2.setDescricao("la creatura");
        curso2.setCargaHoraria(2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Como fazer ovo");
        mentoria.setDescricao("So botar na panela");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Javinha");
        bootcamp.setDescricao("Fazer javas.");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev elliana = new Dev();
        elliana.setNome("el yana");
        elliana.inscreverBootcamp(bootcamp);
        elliana.progredir();
        elliana.progredir();


        Dev ranno = new Dev();
        ranno.setNome("sapo");
        ranno.inscreverBootcamp(bootcamp);
        elliana.progredir();
    }
}
