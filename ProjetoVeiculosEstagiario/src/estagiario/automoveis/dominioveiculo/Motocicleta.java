package estagiario.automoveis.dominioveiculo;

public class Motocicleta extends BaseDocumentoVeiculo {

    private int guidao;
    private int peApoio;

    public int getGuidao() {
        return guidao;
    }
    public void setGuidao(int guidao) {
        this.guidao = guidao;
    }
    public int getPeApoio() {
        return peApoio;
    }
    public void setPeApoio(int peApoio) {
        this.peApoio = peApoio;
    }
    
    public Motocicleta(int codigo, String nome, String fabricante, int anoModelo, int anoFabricacao,
            String nomeProprietario, String estadoUF, String cidadeUF, double potencia, String tipoCombustivel,
            int qtdeMotores, int qtdeOcupantes, double pesoLiquido, double pesoTotal, int assentos, String tipoVeiculo,
            String modelo, String cor, String chassi, int rodas, String placa, String codigoRenavam, int guidao,
            int peApoio) {
        super(codigo, nome, fabricante, anoModelo, anoFabricacao, nomeProprietario, estadoUF, cidadeUF, potencia,
                tipoCombustivel, qtdeMotores, qtdeOcupantes, pesoLiquido, pesoTotal, assentos, tipoVeiculo, modelo, cor,
                chassi, rodas, placa, codigoRenavam);
        this.guidao = guidao;
        this.peApoio = peApoio;
    }
    
    @Override
    public void Imprimir() {
        
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }
    
    
}
