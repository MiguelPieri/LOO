package uniderp.loo.escola.dominio;

import java.time.LocalDate;

public class Aluno extends BasePessoa{

    private String matricula;
    private LocalDate dataMatricula;

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public LocalDate getDataMatricula() {
        return dataMatricula;
    }
    public void setDataMatricula(LocalDate dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    
    public Aluno(int codigo, String nome, String endereco, String telefone, LocalDate dataNascimanto, String rg,
            String cpf, LocalDate dataInsercao, String matricula, LocalDate dataMatricula) {
        super(codigo, nome, endereco, telefone, dataNascimanto, rg, cpf, dataInsercao);
        this.matricula = matricula;
        this.dataMatricula = dataMatricula;
    }
    
    
    
}
