package estagiario.automoveis.alista;

import java.util.ArrayList;
import java.util.List;


import estagiario.automoveis.dominioveiculo.Carro;

public class Lista01 {
    
    private List<Carro> tabela;

    public List<Carro> getTabela() {
        return tabela;
    }
    
    public Lista01(){
        this.tabela = new ArrayList<Carro>();
        this.CarregarDados();
    }
    
    private void CarregarDados(){
        this.tabela.add(new Carro(666, "ford jeep", "ford", 1980, 1980, "Joao", "MS", "Campo Grande", 91 , "Gasolina", 1, 5, 1096, 1701, 1, "OffRoad",  "jipe porte medio classico", "Branco", "9BWHE21JX24060831", 4, "POT14C14", "008913533364", 2, 2, 1, "Manual", 0, " 312 L"));
    }
    

    

}
