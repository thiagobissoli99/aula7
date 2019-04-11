package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class impressora {
    private ArrayList <imprimivel> imprimiveis = new ArrayList<>();

    public void imprimirTudo() {
        for (int i = 0 ; i < imprimiveis.size(); i ++){
            imprimiveis.get(i).imprimir();
        }


    }

    public void adicionarImprimivel (imprimivel umImprimivel){
        imprimiveis.add (umImprimivel);
    }
}
