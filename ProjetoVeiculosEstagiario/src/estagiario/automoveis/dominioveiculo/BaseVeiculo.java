package estagiario.automoveis.dominioveiculo;

public abstract class BaseVeiculo extends BaseDadosTecnicos {
    protected String tipoVeiculo;
    protected String modelo;
    protected String cor;
    protected String chassi;
    protected int rodas;

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public BaseVeiculo(int codigo, String nome, String fabricante, int anoModelo, int anoFabricacao,
            String nomeProprietario, String estadoUF, String cidadeUF, double potencia, String tipoCombustivel,
            int qtdeMotores, int qtdeOcupantes, double pesoLiquido, double pesoTotal, int assentos, String tipoVeiculo,
            String modelo, String cor, String chassi, int rodas) {
        super(codigo, nome, fabricante, anoModelo, anoFabricacao, nomeProprietario, estadoUF, cidadeUF, potencia,
                tipoCombustivel, qtdeMotores, qtdeOcupantes, pesoLiquido, pesoTotal, assentos);
        this.tipoVeiculo = tipoVeiculo;
        this.modelo = modelo;
        this.cor = cor;
        this.chassi = chassi;
        this.rodas = rodas;
    }

    
    
    
    
}
