package uniderp.loo.escola.dominio;

public class Funcionario extends BasePessoa{
    private String telefone;
    private String contaCorrente;
    private String cracha;
    private String senha;

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(String contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
    public String getCracha() {
        return cracha;
    }
    public void setCracha(String cracha) {
        this.cracha = cracha;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public Funcionario(int codigo, String nome, String registro, String usuario, String telefone, String contaCorrente,
            String cracha, String senha) {
        super(codigo, nome, registro, usuario);
        this.telefone = telefone;
        this.contaCorrente = contaCorrente;
        this.cracha = cracha;
        this.senha = senha;
    }
    

    
    
}
