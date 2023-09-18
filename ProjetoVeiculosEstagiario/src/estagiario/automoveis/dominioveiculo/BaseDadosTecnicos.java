package estagiario.automoveis.dominioveiculo;

public abstract class BaseDadosTecnicos extends BaseIndentificacao {
   
   protected double potencia;
   protected String tipoCombustivel;
   protected int qtdeMotores;
   protected int qtdeOcupantes;
   protected double pesoLiquido;
   protected double pesoTotal;
   protected int assentos;

public double getPotencia() {
    return potencia;
}
public void setPotencia(double potencia) {
    this.potencia = potencia;
}
public String getTipoCombustivel() {
    return tipoCombustivel;
}
public void setTipoCombustivel(String tipoCombustivel) {
    this.tipoCombustivel = tipoCombustivel;
}
public int getQtdeMotores() {
    return qtdeMotores;
}
public void setQtdeMotores(int qtdeMotores) {
    this.qtdeMotores = qtdeMotores;
}
public int getQtdeOcupantes() {
    return qtdeOcupantes;
}
public void setQtdeOcupantes(int qtdeOcupantes) {
    this.qtdeOcupantes = qtdeOcupantes;
}
public double getPesoLiquido() {
    return pesoLiquido;
}
public void setPesoLiquido(double pesoLiquido) {
    this.pesoLiquido = pesoLiquido;
}
public double getPesoTotal() {
    return pesoTotal;
}
public void setPesoTotal(double pesoTotal) {
    this.pesoTotal = pesoTotal;
}
public int getAssentos() {
    return assentos;
}
public void setAssentos(int assentos) {
    this.assentos = assentos;
}
public BaseDadosTecnicos(int codigo, String nome, String fabricante, int anoModelo, int anoFabricacao,
        String nomeProprietario, String estadoUF, String cidadeUF, double potencia, String tipoCombustivel,
        int qtdeMotores, int qtdeOcupantes, double pesoLiquido, double pesoTotal, int assentos) {
    super(codigo, nome, fabricante, anoModelo, anoFabricacao, nomeProprietario, estadoUF, cidadeUF);
    this.potencia = potencia;
    this.tipoCombustivel = tipoCombustivel;
    this.qtdeMotores = qtdeMotores;
    this.qtdeOcupantes = qtdeOcupantes;
    this.pesoLiquido = pesoLiquido;
    this.pesoTotal = pesoTotal;
    this.assentos = assentos;
}



}



   


    

