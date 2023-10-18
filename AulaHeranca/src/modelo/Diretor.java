package modelo;


public class Diretor extends Funcionario{
    protected String escola;
    
    public Diretor() {
    }

    public Diretor(String escola) {
        this.escola = escola;
    }

    public Diretor(String escola, float salario) {
        super(salario);
        this.escola = escola;
    }

    public Diretor(String escola, float salario, String nome, String email, String telefone, String genero, int idade) {
        super(salario, nome, email, telefone, genero, idade);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    public String toString() {
        return "Diretor{" + "escola=" + escola + '}';
    }
    
    
    
}
