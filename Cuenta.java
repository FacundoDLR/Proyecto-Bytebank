
public class Cuenta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente cliente;
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
	
	void depositar(double valor) {
		this.saldo += valor;
	}
	
	boolean retirar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}return false;
	}
	
	public boolean transferir(double valor, Cuenta cuenta) {
		if(retirar(valor)) {
			cuenta.depositar(valor);
			return true;
		}return false;

	}
}
