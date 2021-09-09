package entities;

public class Student {
	
	public String nome;
	public Double nota1;
	public Double nota2;
	public Double nota3;
	
	public Double total() {
		return nota1 + nota2 + nota3;
	}
	
	public Double pontosFaltam() {
		if (total() < 60.00) {
			return 60.00 - total();
		} else {
			return 0.00;
		}
	}
	
}
