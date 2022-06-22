package questao1;

public class Publicacao {

    private String dataPublicacao, linkMidia, textoPublicacao;


    public static double contadorPublicacao;

    public Publicacao(String dataPublicacao, String linkMidia, String textoPublicacao) {
        this.dataPublicacao = dataPublicacao;
        this.linkMidia = linkMidia;
        this.textoPublicacao = textoPublicacao;
        contadorPublicacao++;
    }

    public String getDataPublicacao() {
        return dataPublicacao;
    }

    public String getLinkMidia() {
        return linkMidia;
    }

    public void setLinkMidia(String linkMidia) {
        this.linkMidia = linkMidia;
    }

    public String getTextoPublicacao() {
        return textoPublicacao;
    }

    public void setTextoPublicacao(String textoPublicacao) {
        this.textoPublicacao = textoPublicacao;
    }

    public static double getContadorPublicacao() {
        return contadorPublicacao;
    }


}

