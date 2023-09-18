package estagiario.automoveis.dominioveiculo;

public class Onibus extends BaseVeiculoTerrestreFechado {

    private int qtdeBarrasApoio;

    public int getQtdeBarrasApoio() {
        return qtdeBarrasApoio;
    }

    public void setQtdeBarrasApoio(int qtdeBarrasApoio) {
        this.qtdeBarrasApoio = qtdeBarrasApoio;
    }

    public Onibus(int codigo, String nome, String fabricante, int anoModelo, int anoFabricacao, String nomeProprietario,
            String estadoUF, String cidadeUF, double potencia, String tipoCombustivel, int qtdeMotores,
            int qtdeOcupantes, double pesoLiquido, double pesoTotal, int assentos, String tipoVeiculo, String modelo,
            String cor, String chassi, int rodas, String placa, String codigoRenavam, int porta, int janela, int eixos,
            String cambio, int qtdeBarrasApoio) {
        super(codigo, nome, fabricante, anoModelo, anoFabricacao, nomeProprietario, estadoUF, cidadeUF, potencia,
                tipoCombustivel, qtdeMotores, qtdeOcupantes, pesoLiquido, pesoTotal, assentos, tipoVeiculo, modelo, cor,
                chassi, rodas, placa, codigoRenavam, porta, janela, eixos, cambio);
        this.qtdeBarrasApoio = qtdeBarrasApoio;
    }

    @Override
    public void Imprimir() {
        
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }

    
    
}
