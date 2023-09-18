package estagiario.automoveis.dominioveiculo;

public abstract class BaseDocumentoVeiculo extends BaseVeiculo implements IImpressao{

    protected String placa;
    protected String codigoRenavam;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public BaseDocumentoVeiculo(int codigo, String nome, String fabricante, int anoModelo, int anoFabricacao,
            String nomeProprietario, String estadoUF, String cidadeUF, double potencia, String tipoCombustivel,
            int qtdeMotores, int qtdeOcupantes, double pesoLiquido, double pesoTotal, int assentos, String tipoVeiculo,
            String modelo, String cor, String chassi, int rodas, String placa, String codigoRenavam) {
        super(codigo, nome, fabricante, anoModelo, anoFabricacao, nomeProprietario, estadoUF, cidadeUF, potencia,
                tipoCombustivel, qtdeMotores, qtdeOcupantes, pesoLiquido, pesoTotal, assentos, tipoVeiculo, modelo, cor,
                chassi, rodas);
        this.placa = placa;
        this.codigoRenavam = codigoRenavam;
    }
    
    
}
