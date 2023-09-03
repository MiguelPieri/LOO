package uniderp.loo.escola.dominio;

public abstract class BasePessoa extends BaseIndentificador {
    protected String nome;
    protected String registro;
    protected String usuario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRegistro() {
        return registro;
    }
    public void setRegistro(String registro) {
        this.registro = registro;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public BasePessoa(int codigo, String nome, String registro, String usuario) {
        super(codigo);
        this.nome = nome;
        this.registro = registro;
        this.usuario = usuario;
    }

    

    
    
}
