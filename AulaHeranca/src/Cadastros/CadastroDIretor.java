package Cadastros;

import java.util.ArrayList;
import modelo.Diretor;
import util.Input;
import Cadastros.CadastroPessoa;

public class CadastroDIretor extends Diretor{
    protected static void setarDadosDiretor(Diretor d){
        CadastroFuncionario.setarDadosFuncionario(d);
        System.out.println("Digite sua escola: ");
        d.setEscola(Input.nextLine());
    }
    
    public static Diretor cadastrarDiretor(){
        Diretor d = new Diretor();
        setarDadosDiretor(d);
        return d;
    }
    
}
