package estagiario.automoveis.dominioveiculo;

public class Caminhao extends BaseVeiculoTerrestreFechado {

    private String cacamba;
    private int qtdeCacamba;

    public String getCacamba() {
        return cacamba;
    }
    public void setCacamba(String cacamba) {
        this.cacamba = cacamba;
    }
    public int getQtdeCacamba() {
        return qtdeCacamba;
    }
    public void setQtdeCacamba(int qtdeCacamba) {
        this.qtdeCacamba = qtdeCacamba;
    }
    
    public Caminhao(int codigo, String nome, String fabricante, int anoModelo, int anoFabricacao,
            String nomeProprietario, String estadoUF, String cidadeUF, double potencia, String tipoCombustivel,
            int qtdeMotores, int qtdeOcupantes, double pesoLiquido, double pesoTotal, int assentos, String tipoVeiculo,
            String modelo, String cor, String chassi, int rodas, String placa, String codigoRenavam, int porta,
            int janela, int eixos, String cambio, String cacamba, int qtdeCacamba) {
        super(codigo, nome, fabricante, anoModelo, anoFabricacao, nomeProprietario, estadoUF, cidadeUF, potencia,
                tipoCombustivel, qtdeMotores, qtdeOcupantes, pesoLiquido, pesoTotal, assentos, tipoVeiculo, modelo, cor,
                chassi, rodas, placa, codigoRenavam, porta, janela, eixos, cambio);
        this.cacamba = cacamba;
        this.qtdeCacamba = qtdeCacamba;
    }
    
    @Override
    public void Imprimir() {
        
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }


    

    
    
}
