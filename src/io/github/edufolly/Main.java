package io.github.edufolly;

public class Main {

    public static void main(String[] args) {

        Pessoa.setEstatico("Primeiro.");

        Aluno eduardo = new Aluno(1L, "Eduardo");
        eduardo.setCpf("000.000.000-00");
        eduardo.setTurma("1001");

        System.out.println();
        System.out.println(eduardo);


        Aluno lucas = new Aluno(2L, "Lucas",
                                "111.111.111-11", "2001");

        System.out.println();
        System.out.println(lucas);

        Aluno.setEstatico("Segundo.");

        Professor rennan = new Professor();
        rennan.setMatricula(3L);
        rennan.setNome("Rennan");
        rennan.setSalario(5000.0f);
        rennan.setCpf("222.222.222-22");

        System.out.println();
        System.out.println(rennan);

        System.out.println();

        if (eduardo instanceof Aluno) {
            System.out.println("Eduardo É Aluno.");
        } else {
            System.out.println("Eduardo NÃO É Aluno.");
        }

        if (eduardo instanceof Pessoa) {
            System.out.println("Eduardo É Pessoa.");
        } else {
            System.out.println("Eduardo NÃO É Pessoa.");
        }

        if (eduardo instanceof IPessoa) {
            System.out.println("Eduardo É IPessoa.");
        } else {
            System.out.println("Eduardo NÃO É IPessoa.");
        }

        if (eduardo instanceof ICpf) {
            System.out.println("Eduardo É ICpf.");
        } else {
            System.out.println("Eduardo NÃO É ICpf.");
        }
    }

}
