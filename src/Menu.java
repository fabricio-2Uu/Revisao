import javax.swing.JOptionPane;

import br.edu.ifrs.poa.cpf.Cpf;
import br.edu.ifrs.poa.pessoas.Aluno;
import br.edu.ifrs.poa.pessoas.Pessoa;
import java.util.Scanner;

public class Menu {

		private static int montaMenu() {
			String menu = "1 - Cadastrar Aluno\n" +
						  "2 - Pesquisar Aluno pelo nome\n" +
						  "3 - Pesquisar Aluno pelo cpf\n" +
						  "4 - Listar todos os alunos\n" +
						  "5 - Sair\n";
			return Integer.parseInt(JOptionPane.showInputDialog(menu));
		}
		
		public static void main(String[] args) {
			//como declarar o vetor que vai armazenar os objetos?
			Pessoa vetor[] = new Pessoa[2];
			Scanner scanner = new Scanner(System.in);
			
			//como monstrar o menu repetidamente?
			while(true) {
				switch(montaMenu()){
					case 1:
						for (int i = 0; i < vetor.length; i++) {
							String nome = JOptionPane.showInputDialog("Informe o nome: ");
							String endereco = JOptionPane.showInputDialog("Informe o endereço: ");
							String telefone = JOptionPane.showInputDialog("Informe o telefone: ");
							String curso = JOptionPane.showInputDialog("Informe o curso: ");
							int situacao = Integer.parseInt(
									JOptionPane.showInputDialog("Informe a situação:"));
							scanner.nextLine();
							long matricula = Long.parseLong("Informe a matricula:");
							scanner.nextLine();
							long numero = Long.parseLong("Informe o número do CPF:");
							scanner.nextLine();
							int digito = Integer.parseInt(
									JOptionPane.showInputDialog("Informe o digito do CPF:"));
							Cpf cpf = new Cpf(numero, digito);
							vetor[i] = new Aluno(nome, telefone, endereco, 
									matricula, curso, situacao, cpf);
						}
							break;
							
					case 2:
						String nomepesquisa = JOptionPane.showInputDialog("Informe o nome: ");						
						for (int i = 0; i < vetor.length; i++){
							if (vetor[i]!=null && nomepesquisa.equals(vetor[i].getNome())){
								
									System.out.println(vetor[i].toString());
							}
						}
						
							break;
							
					case 3:
						long numero = Long.parseLong(JOptionPane.showInputDialog("Informe o número do CPF:"));
						int digito = Integer.parseInt(
								JOptionPane.showInputDialog("Informe o digito do CPF:"));
						for (int i = 0; i < vetor.length; i++){
							if (vetor[i]!=null && (
									((Aluno)vetor[i]).getCpf().getNumero() == numero &&
									((Aluno)vetor[i]).getCpf().getDigito() == digito)){
								
									System.out.println(vetor[i].toString());
							}
						}
						
							break;
					case 4:
						
							break;
					case 5:
						System.exit(0);
							break;
					default: System.out.println("opção Inválida");
				}
			}
			
		}
		
		
}
