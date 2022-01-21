package br.com.dio.desafio.dominio;

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

        System.out.println(curso1);
    }
}
