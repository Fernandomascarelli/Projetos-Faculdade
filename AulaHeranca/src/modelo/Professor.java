package modelo;

public class Professor extends Funcionario{
    protected String disciplina;

    public Professor() {
    }

    public Professor(String disciplina, float salario, String nome, String email, String telefone, String genero, int idade) {
        super(salario, nome, email, telefone, genero, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "Professor{" + "disciplina=" + disciplina + '}' + super.toString();
    }
    
    
}
