package entities;

public class Fuc {
	public String name;
	public double Salary;
	public double tax;
	
	public double netSalary() {
		return Salary - tax;
	}
	public void condicaoSalary() {
		if (tax > Salary) {
			System.out.println("Erro, taxa não pode ser maior do que o sálario");
		}
	}
	
	public void PorcentagemSalary(double porcentagem) {
		double 	aumento = Salary * (porcentagem * 100);
		Salary += aumento;
		System.out.printf("Salário atualizado com sucesso" , Salary);
	}
	
	public String toString() {
		return name + ", $ " + String.format("%.2f", netSalary());
	}
}

