package modelo;

public class Funcionario extends Pessoa{
    protected float salario;

    public Funcionario() {
    }

    public Funcionario(float salario) {
        this.salario = salario;
    }

    public Funcionario(float salario, String nome, String email, String telefone, String genero, int idade) {
        super(nome, email, telefone, genero, idade);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "salario=" + salario + '}'+ super.toString();
    }
    
}
