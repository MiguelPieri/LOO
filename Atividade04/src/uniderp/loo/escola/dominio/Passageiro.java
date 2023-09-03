package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Passageiro extends BasePessoa {
    private String email;
    private String numCartao;
    private String documento;
    private LocalDate dataNascimento;

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNumCartao() {
        return numCartao;
    }
    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Passageiro(int codigo, String nome, String registro, String usuario, String email, String numCartao,
            String documento, LocalDate dataNascimento) {
        super(codigo, nome, registro, usuario);
        this.email = email;
        this.numCartao = numCartao;
        this.documento = documento;
        this.dataNascimento = dataNascimento;
    }

    

    
    
}
