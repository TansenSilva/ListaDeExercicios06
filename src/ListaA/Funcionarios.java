package ListaA;

public abstract class Funcionarios {

    //Atributos
    private String nome;
    private String cpf;
    private String numeroDeRegistro;
    private String orgaoDeLotacao;
    private double salario;

    //Construtor
    public Funcionarios(String nome, String cpf, String numeroDeRegistro, String orgaoDeLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroDeRegistro = numeroDeRegistro;
        this.orgaoDeLotacao = orgaoDeLotacao;
        this.salario = salario;
    }
    //Getter e Setter
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(String numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getOrgaoDeLotacao() {
        return orgaoDeLotacao;
    }

    public void setOrgaoDeLotacao(String orgaoDeLotacao) {
        this.orgaoDeLotacao = orgaoDeLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario() {
        this.salario = salario;
    }

    //Método

    public abstract double aumentoSalario();

    public abstract void aumento(double salario);


}
