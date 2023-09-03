package uniderp.loo.escola.dominio;

public abstract  class BaseIndentificador {
    protected int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public BaseIndentificador(int codigo) {
        this.codigo = codigo;
    }

   
}