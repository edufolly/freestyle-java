package io.github.edufolly;

public class Professor extends Pessoa {

    private Float salario;

    public Float getSalario() {
        return salario;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Professor: " + super.toString() + " - " + salario;
    }

}
