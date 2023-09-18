package estagiario.automoveis.dominioveiculo;

public class Carro extends BaseVeiculoTerrestreFechado {

    private int qtdeCameras;
    private String tamanhoPortaMalas;

    public int getQtdeCameras() {
        return qtdeCameras;
    }
    public void setQtdeCameras(int qtdeCameras) {
        this.qtdeCameras = qtdeCameras;
    }
    public String getTamanhoPortaMalas() {
        return tamanhoPortaMalas;
    }
    public void setTamanhoPortaMalas(String tamanhoPortaMalas) {
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }

    

    public Carro(int codigo, String nome, String fabricante, int anoModelo, int anoFabricacao, String nomeProprietario,
            String estadoUF, String cidadeUF, double potencia, String tipoCombustivel, int qtdeMotores,
            int qtdeOcupantes, double pesoLiquido, double pesoTotal, int assentos, String tipoVeiculo, String modelo,
            String cor, String chassi, int rodas, String placa, String codigoRenavam, int porta, int janela, int eixos,
            String cambio, int qtdeCameras, String tamanhoPortaMalas) {
        super(codigo, nome, fabricante, anoModelo, anoFabricacao, nomeProprietario, estadoUF, cidadeUF, potencia,
                tipoCombustivel, qtdeMotores, qtdeOcupantes, pesoLiquido, pesoTotal, assentos, tipoVeiculo, modelo, cor,
                chassi, rodas, placa, codigoRenavam, porta, janela, eixos, cambio);
        this.qtdeCameras = qtdeCameras;
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }
    @Override
    public void Imprimir() {
        System.out.println("___________________________________________________");
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Código: " + this.codigo);
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano do modelo: " + this.anoModelo);
        System.out.println("Ano de fabricação: " + this.anoFabricacao);
        System.out.println("Nome do proprietário: " + this.nomeProprietario);
        System.out.println("Estado: " + this.estadoUF);
        System.out.println("Cidade: " + this.cidadeUF);
        System.out.println("Potencia: " + this.potencia + "cv");
        System.out.println("Tipo do combustivel: " + this.tipoCombustivel);
        System.out.println("Quantidade de motores: " + this.qtdeMotores);
        System.out.println("Quantidade de ocupantes: " + this.qtdeOcupantes);
        System.out.println("Peso líquido: " + this.pesoLiquido + "kg");
        System.out.println("Peso total: " + this.pesoTotal + "kg");
        System.out.println("Quantidade de assentos: " + this.assentos);
        System.out.println("Tipo de veiculo: " + this.tipoVeiculo);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Numero do chassi: " + this.chassi);
        System.out.println("Quantidade de rodas: " + this.rodas);
        System.out.println("Placa: " + this.placa);
        System.out.println("Código renavam: " + this.codigoRenavam);
        System.out.println("Quantidade de portas: " + this.porta);
        System.out.println("Quantidade de janelas: " + this.janela);
        System.out.println("Numero de eixos: " + this.eixos);
        System.out.println("Tipo de câmbio: " + this.cambio);
        System.out.println("Quantidade de câmeras: " + this.qtdeCameras);
        System.out.println("Tamanho do porta malas: " + this.tamanhoPortaMalas);
        System.out.println("___________________________________________________");


        
        
    }


    
}
