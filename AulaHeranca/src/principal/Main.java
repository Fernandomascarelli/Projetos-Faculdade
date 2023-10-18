package principal;

import java.util.ArrayList;
import modelo.Aluno;
import modelo.Diretor;
import modelo.Funcionario;
import modelo.Pessoa;
import modelo.Professor;
import Cadastros.CadastroPessoa;
import Cadastros.CadastroFuncionario;
import Cadastros.CadastroDIretor;
import Cadastros.CadastroProfessor;
import Cadastros.CadastroAluno;
import util.Input;

public class Main {

    public static void main(String[] args) {
        //cadastro pessoa -------------------------------- -------------------------------- --------------------------------
        System.out.println("Cadastro pessoa\n");
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Pessoa p = CadastroPessoa.cadastrarPessoa();
        pessoas.add(p);
        System.out.println("Nome da pessoa cadastrada: " + p.getNome() + ", email " + p.getEmail()
                + " ,telefone " + p.getTelefone() + ", genero " + p.getGenero() + ", idade " + p.getIdade() + ".");
        //cadastro pessoa -------------------------------- -------------------------------- --------------------------------
        

        
        
        //cadastro aluno -------------------------------- -------------------------------- --------------------------------
        System.out.println("\nAgora o aluno\n");
        Aluno a = CadastroAluno.CadastrarAluno();
        pessoas.add(a);
        System.out.println("Nome da pessoa cadastrada: " + a.getNome() + ", email " + a.getEmail()
                + " ,telefone " + a.getTelefone() + ", genero " + a.getGenero() + ", idade " + a.getIdade() + ", matricula "
                + a.getMatricula() + ", notas:");
        for (float nota : a.getNotas()) {
            System.out.print(nota + "; ");
        }
        //cadastro aluno -------------------------------- -------------------------------- --------------------------------

        
        
        //cadastro diretor
        System.out.println("\nAgora o diretor\n");
        Diretor d = CadastroDIretor.cadastrarDiretor();
        pessoas.add(d);
        System.out.println("Nome da pessoa cadastrada: " + d.getNome() + ", email " + d.getEmail()
        + " ,telefone " + d.getTelefone() + ", genero " + d.getGenero() + ", idade " + d.getIdade() + ", salario " + d.getSalario() + ", escola "+d.getEscola()+".");
        
        
        
        //cadastro func -------------------------------- -------------------------------- --------------------------------
        System.out.println("\nAgora o funcionario\n");
        Funcionario func = CadastroFuncionario.cadastrarFuncionario();
        pessoas.add(func);
        System.out.println("Nome da pessoa cadastrada: " + func.getNome() + ", email " + func.getEmail()
                + " ,telefone " + func.getTelefone() + ", genero " + func.getGenero() + ", idade " + func.getIdade() + ", salario " + func.getSalario() + ".");
        //cadastro func -------------------------------- -------------------------------- --------------------------------

        
        
        
        //cadastro professor
        System.out.println("\nAgora o professor\n");
        Professor prof = CadastroProfessor.cadastrarProfessor();
        pessoas.add(prof);
        System.out.println("Nome da pessoa cadastrada: " + prof.getNome() + ", email " + prof.getEmail()
        + " ,telefone " + prof.getTelefone() + ", genero " + prof.getGenero() + ", idade " + prof.getIdade() + ", salario " + prof.getSalario() + ", disciplina "+prof.getDisciplina()+".");
        
    }
}

