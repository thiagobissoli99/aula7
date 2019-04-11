package br.com.digitalhouse;

public class principal {
    public static void main(String[] args) {

        Contrato umContrato = new Contrato();
        umContrato.setTipo("pdf");
        umContrato.setNome("contratoUm");


        foto umaFoto = new foto();
        umaFoto.setNome("fotoUm");
        umaFoto.setTipo("img");

        Documento umDoc = new Documento();
        umContrato.setNome("contratoUm");
        umContrato.setTipo("texto");

        impressora impressao = new impressora();

        impressao.adicionarImprimivel(umContrato);
        impressao.adicionarImprimivel(umDoc);
        impressao.adicionarImprimivel(umaFoto);
        impressao.imprimirTudo();


    }

}
