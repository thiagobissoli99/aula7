package br.com.digitalhouse;

public class foto implements imprimivel {
    private String nome;
    private String tipo;


    public String getNome() {
        return nome;
    }

    public void setNome(String nomeFoto) {
        nome = nomeFoto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipoFoto) {
        tipo = tipoFoto;
    }

    @Override
    public void imprimir() {

        System.out.println("Sou uma selfie " + nome + tipo);

    }
}
