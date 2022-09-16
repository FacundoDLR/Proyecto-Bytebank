
public class TestMetodos {

	public static void main(String[] args) {
		Cuenta cuentaFacu = new Cuenta();
		cuentaFacu.saldo = 300;
		System.out.println(cuentaFacu.saldo);
		
		cuentaFacu.depositar(500);
		System.out.println(cuentaFacu.saldo);
		
		cuentaFacu.retirar(300);
		System.out.println(cuentaFacu.saldo);
		
		Cuenta cuentaMaria = new Cuenta();
		cuentaMaria.saldo = 1000;
		System.out.println(cuentaMaria.saldo);
		cuentaMaria.transferir(600, cuentaFacu);
		System.out.println(cuentaMaria.saldo);
		
		System.out.println("El nuevo saldo de cuanta Facu es " + cuentaFacu.saldo);
	}
}
