import br.edu.ifrs.poa.cpf.Cpf;
import br.edu.ifrs.poa.pessoas.Aluno;
import br.edu.ifrs.poa.pessoas.Pessoa;

public class Teste {

	public static void main(String[] args){
		Pessoa p1 = new Pessoa();
		Cpf c1 = new Cpf(890002, 36);
		Aluno a1 = new Aluno("Raul", c1);
		
		p1.setEndereco("Rua zero");
		p1.imprime();
		a1.imprime();
		
	}
}
