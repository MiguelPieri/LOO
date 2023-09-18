package estagiario.automoveis.dominioveiculo;

public class Aviao extends BaseVeiculoFechado {

    private int qtdeAsas;

    public int getQtdeAsas() {
        return qtdeAsas;
    }

    public void setQtdeAsas(int qtdeAsas) {
        this.qtdeAsas = qtdeAsas;
    }

    
    public Aviao(int codigo, String nome, String fabricante, int anoModelo, int anoFabricacao, String nomeProprietario,
            String estadoUF, String cidadeUF, double potencia, String tipoCombustivel, int qtdeMotores,
            int qtdeOcupantes, double pesoLiquido, double pesoTotal, int assentos, String tipoVeiculo, String modelo,
            String cor, String chassi, int rodas, String placa, String codigoRenavam, int porta, int janela,
            int qtdeAsas) {
        super(codigo, nome, fabricante, anoModelo, anoFabricacao, nomeProprietario, estadoUF, cidadeUF, potencia,
                tipoCombustivel, qtdeMotores, qtdeOcupantes, pesoLiquido, pesoTotal, assentos, tipoVeiculo, modelo, cor,
                chassi, rodas, placa, codigoRenavam, porta, janela);
        this.qtdeAsas = qtdeAsas;
    }

    @Override
    public void Imprimir() {
        
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }

    
    
}
