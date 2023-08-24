package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public abstract class BasePessoa {

    protected int codigo;
    protected String nome;
    protected String endereco;
    protected String telefone;
    protected LocalDate dataNascimanto;
    protected String rg;
    protected String cpf;
    protected LocalDate dataInsercao;

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public LocalDate getDataNascimanto() {
        return dataNascimanto;
    }
    public void setDataNascimanto(LocalDate dataNascimanto) {
        this.dataNascimanto = dataNascimanto;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public LocalDate getDataInsercao() {
        return dataInsercao;
    }
    public void setDataInsercao(LocalDate dataInsercao) {
        this.dataInsercao = dataInsercao;
    }
    public BasePessoa(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimanto, String rg,
            String cpf, LocalDate dataInsercao) {
        this.codigo = codigo;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.dataNascimanto = dataNascimanto;
        this.rg = rg;
        this.cpf = cpf;
        this.dataInsercao = dataInsercao;
    }

    

    




}


