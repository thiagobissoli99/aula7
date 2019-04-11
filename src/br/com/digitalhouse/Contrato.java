package br.com.digitalhouse;

public class Contrato implements imprimivel{
    private String nome;
    private String tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nomeContrato) {
        nome = nomeContrato;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipoContrato) {
        tipo = tipoContrato;
    }


    @Override
    public void imprimir() {


        System.out.println("Sou um contrato muito legal " + nome + tipo);
    }
}