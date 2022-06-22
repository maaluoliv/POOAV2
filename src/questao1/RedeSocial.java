package questao1;

import java.util.ArrayList;
import java.util.Arrays;

public class RedeSocial {

    private String dataCriacao, dataNascimento, nomeUsuario, senha;
    ArrayList<String> publicacoes = new ArrayList<String>();

    public RedeSocial() {

        this.dataCriacao = dataCriacao;
        this.dataNascimento = dataNascimento;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }


    public String getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(String dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

   public void inserePublicacao(Publicacao publi){

        publicacoes.add(String.valueOf(publi));
       System.out.print("Adicionar nova publicacao");
       System.out.println( Arrays.toString( publicacoes.toArray() ) );
    }

    public void imprimePublicacoes(){
        System.out.println("Publicar"+ Publicacao.getContadorPublicacao());

            for(int i =0; i<publicacoes.size();i++){
        System.out.println("tweetar" + publicacoes.getTextoPublicacao()+ " "+ "Data:"+ publicacoes.getDataPublicacao();
    }}

}














