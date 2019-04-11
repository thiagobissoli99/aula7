package br.com.digitalhouse;

public class Documento implements imprimivel {
    private String nome;
    private String tipo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nomeDoc) {
        nome = nomeDoc;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipoDoc) {
        tipo = tipoDoc;
    }

    @Override
    public void imprimir() {

        System.out.println("Sou um documento do Word " + nome + tipo);
    }
}
