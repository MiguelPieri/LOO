package estagiario.automoveis.dominioveiculo;

public abstract class BaseIndentificacao {

   protected int codigo;
   protected String nome;
   protected String fabricante;
   protected int anoModelo;
   protected int anoFabricacao;
   protected String nomeProprietario;
   protected String estadoUF; 
   protected String cidadeUF;

   public int getCodigo() {
      return codigo;
   }
   public String getNome() {
      return nome;
   }
   public String getFabricante() {
      return fabricante;
   }
   public int getAnoModelo() {
      return anoModelo;
   }
   public int getAnoFabricacao() {
      return anoFabricacao;
   }
   public String getNomeProprietario() {
      return nomeProprietario;
   }
   public String getEstadoUF() {
      return estadoUF;
   }
   public String getCidadeUF() {
      return cidadeUF;
   }
   public void setCodigo(int codigo) {
      this.codigo = codigo;
   }
   public void setNome(String nome) {
      this.nome = nome;
   }
   public void setFabricante(String fabricante) {
      this.fabricante = fabricante;
   }
   public void setAnoModelo(int anoModelo) {
      this.anoModelo = anoModelo;
   }
   public void setAnoFabricacao(int anoFabricacao) {
      this.anoFabricacao = anoFabricacao;
   }
   public void setNomeProprietario(String nomeProprietario) {
      this.nomeProprietario = nomeProprietario;
   }
   public void setEstadoUF(String estadoUF) {
      this.estadoUF = estadoUF;
   }
   public void setCidadeUF(String cidadeUF) {
      this.cidadeUF = cidadeUF;
   }
   public BaseIndentificacao(int codigo, String nome, String fabricante, int anoModelo, int anoFabricacao,
         String nomeProprietario, String estadoUF, String cidadeUF) {
      this.codigo = codigo;
      this.nome = nome;
      this.fabricante = fabricante;
      this.anoModelo = anoModelo;
      this.anoFabricacao = anoFabricacao;
      this.nomeProprietario = nomeProprietario;
      this.estadoUF = estadoUF;
      this.cidadeUF = cidadeUF;
   }

   

   

   
   
   



    
}
