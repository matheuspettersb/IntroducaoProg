
public class ContaBanco {
	public int numConta;
	protected char tipo;
	private String dono;
	private double saldo;
	private boolean status;
	
	public Conta (int numConta, char tipo, String dono, double saldo, boolean status) {
		this.setNumConta(numConta);
		this.setTipo(tipo);
		this.setDono(dono);
		this.saldo=0;
		this.status=false;
	}

	public boolean abrirConta() {
		this.status=true;
		return true;
	}
	
	public boolean fecharConta() {
		this.status=false;
		return false;
	}
	
	public double depositar() {
		this.saldo = saldo + this.getValor;
		return saldo;
	}
	
	

	
	
	//getters e setters
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public char getTipo() {
		return tipo;
	}
	public void setTipo(char tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}
	public void setDono(String dono) {
		this.dono = dono;
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
}
