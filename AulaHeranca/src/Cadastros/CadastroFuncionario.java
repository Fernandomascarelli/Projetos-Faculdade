package Cadastros;

import java.util.ArrayList;
import modelo.Funcionario;
import util.Input;
import Cadastros.CadastroPessoa;

public class CadastroFuncionario extends Funcionario{
       
    protected static void setarDadosFuncionario(Funcionario func){
        CadastroPessoa.setarDadosPessoa(func);
        System.out.println("Digite seu salario: ");
        func.setSalario(Input.nextFloat());
    }
    
    public static Funcionario cadastrarFuncionario(){
        Funcionario func = new Funcionario();
        setarDadosFuncionario(func);
        return func;
    }
}
