import java.util.List;

import estagiario.automoveis.alista.Lista01;
import estagiario.automoveis.dominioveiculo.Carro;




public class App {
    public static void main(String[] args) throws Exception {

        Lista01 cr = new Lista01();
        List<Carro> carros = cr.getTabela();

        for (Carro car : cr.getTabela()) {
            car.Imprimir();
             
            
        }
     
        }
        
}
