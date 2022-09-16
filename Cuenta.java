
public class Cuenta {
	double saldo;
	int agencia;
	int numero;
	Cliente cliente = new Cliente();
	
	void depositar(double valor) {
		this.saldo += valor;
	}
	
	boolean retirar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		}return false;
	}
	
	void transferir(double valor, Cuenta cuenta) {
		cuenta.retirar(valor);
	    cuenta.depositar(valor);  
	}
}
