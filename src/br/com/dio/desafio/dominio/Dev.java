package br.com.dio.desafio.dominio;


import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;

public class Dev {
    private String nome;
    private final Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    private final Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp){
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.getConteudosInscritos().add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        }
    }

    public void progedirConteudo(Conteudo conteudo){
        if(this.conteudosInscritos.contains(conteudo)){
            this.conteudosConcluidos.add(conteudo);
            this.conteudosInscritos.remove(conteudo);
        }
    }

    public double calcularTotalXp(){
        return this.conteudosConcluidos.stream().mapToDouble(Conteudo::calcularXp).sum();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }
}
