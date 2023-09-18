package estagiario.automoveis.dominioveiculo;

public abstract class BaseVeiculoTerrestreFechado extends BaseVeiculoFechado{

    protected int eixos;
    protected String cambio;

    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public String getCambio() {
        return cambio;
    }
    public void setCambio(String cambio) {
        this.cambio = cambio;
    }
    public BaseVeiculoTerrestreFechado(int codigo, String nome, String fabricante, int anoModelo, int anoFabricacao,
            String nomeProprietario, String estadoUF, String cidadeUF, double potencia, String tipoCombustivel,
            int qtdeMotores, int qtdeOcupantes, double pesoLiquido, double pesoTotal, int assentos, String tipoVeiculo,
            String modelo, String cor, String chassi, int rodas, String placa, String codigoRenavam, int porta,
            int janela, int eixos, String cambio) {
        super(codigo, nome, fabricante, anoModelo, anoFabricacao, nomeProprietario, estadoUF, cidadeUF, potencia,
                tipoCombustivel, qtdeMotores, qtdeOcupantes, pesoLiquido, pesoTotal, assentos, tipoVeiculo, modelo, cor,
                chassi, rodas, placa, codigoRenavam, porta, janela);
        this.eixos = eixos;
        this.cambio = cambio;
    }

    

}
