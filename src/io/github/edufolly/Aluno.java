package io.github.edufolly;

public class Aluno extends Pessoa {

    private String turma;

    public Aluno() {
        super();
        System.out.println("Construtor Aluno 0.");
    }

    public Aluno(Long matricula, String nome) {
        super(matricula, nome);
        System.out.println("Construtor Aluno 2.");
    }

//    public Aluno(Long matricula, String nome, String cpf) {
//        super(matricula, nome, cpf);
//        System.out.println("Construtor Aluno 3.");
//    }

    public Aluno(Long matricula, String nome, String cpf, String turma) {
        super(matricula, nome, cpf);
        this.turma = turma;
        System.out.println("Construtor Aluno 4.");
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno: " + super.toString() + " - " + turma;
    }

}
