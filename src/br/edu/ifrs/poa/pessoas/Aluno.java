package br.edu.ifrs.poa.pessoas;
import br.edu.ifrs.poa.cpf.Cpf;

public class Aluno extends Pessoa {
	
	private long matricula;
	private String curso;
	private int situacao;
	private Cpf cpf;
	
	public Aluno(){}
	
	public Aluno(String nome, Cpf cpf){			
		super(nome);
		this.cpf = cpf;
	
	}
	
	public Aluno(String nome, String telefone, String endereco, long matricula, 
					String curso, int situacao, Cpf cpf){
		super(nome, telefone, endereco);
		this.matricula = matricula;
		this.curso = curso;
		this.situacao = situacao;
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Matricula=" + matricula +
				" Curso=" + curso + " Situacao=" + situacao +
				(cpf!=null?cpf.toString():"Cpf inválido!");
	}
	
	public Cpf getCpf() {
		return cpf;
	}

	public void setCpf(Cpf cpf) {
		this.cpf = cpf;
	}

	public void imprime(){
		System.out.println(toString());
	}
	
	
}
