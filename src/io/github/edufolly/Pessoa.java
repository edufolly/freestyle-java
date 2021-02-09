package io.github.edufolly;

public abstract class Pessoa implements IPessoa {

    private static String estatico;

    public static String getEstatico() {
        return estatico;
    }

    public static void setEstatico(String estatico) {
        Pessoa.estatico = estatico;
    }

    private Long matricula;
    private String nome;
    private String cpf;

    public Pessoa() {
        System.out.println("Construtor Pessoa 0.");
    }

    public Pessoa(Long matricula, String nome) {
        System.out.println("Construtor Pessoa 2.");
        this.matricula = matricula;
        this.nome = nome;
    }

    public Pessoa(Long matricula, String nome, String cpf) {
        System.out.println("Construtor Pessoa 3.");
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

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

    @Override
    public String toString() {
        return
                estatico + " - " +
                matricula + " - "
                + nome + " - "
                + cpf;
    }

}
