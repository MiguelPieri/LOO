package estagiario.automoveis.dominioveiculo;

public abstract class BaseVeiculoFechado extends BaseDocumentoVeiculo{

    protected int porta;
    protected int janela;

    public int getPorta() {
        return porta;
    }
    public void setPorta(int porta) {
        this.porta = porta;
    }
    public int getJanela() {
        return janela;
    }
    public void setJanela(int janela) {
        this.janela = janela;
    }
    
    public BaseVeiculoFechado(int codigo, String nome, String fabricante, int anoModelo, int anoFabricacao,
            String nomeProprietario, String estadoUF, String cidadeUF, double potencia, String tipoCombustivel,
            int qtdeMotores, int qtdeOcupantes, double pesoLiquido, double pesoTotal, int assentos, String tipoVeiculo,
            String modelo, String cor, String chassi, int rodas, String placa, String codigoRenavam, int porta,
            int janela) {
        super(codigo, nome, fabricante, anoModelo, anoFabricacao, nomeProprietario, estadoUF, cidadeUF, potencia,
                tipoCombustivel, qtdeMotores, qtdeOcupantes, pesoLiquido, pesoTotal, assentos, tipoVeiculo, modelo, cor,
                chassi, rodas, placa, codigoRenavam);
        this.porta = porta;
        this.janela = janela;
    }
    

}
