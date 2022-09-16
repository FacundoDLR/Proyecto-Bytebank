
public class TestMetodos {

	public static void main(String[] args) {
		Cuenta cuentaFacu = new Cuenta();
		cuentaFacu.depositar(300);
		System.out.println("cuenta Facu" + cuentaFacu.getSaldo());
		
		cuentaFacu.depositar(500);
		System.out.println("cuenta Facu" + cuentaFacu.getSaldo());
		
		cuentaFacu.retirar(300);
		System.out.println("cuenta Facu" + cuentaFacu.getSaldo());
		
		Cuenta cuentaMaria = new Cuenta();
		cuentaMaria.depositar(1000);
		System.out.println(cuentaMaria.getSaldo());
		cuentaMaria.transferir(600, cuentaFacu);
		System.out.println(cuentaMaria.getSaldo());
		
		System.out.println("El nuevo saldo de cuenta Facu es " + cuentaFacu.getSaldo());
		
		cuentaFacu.transferir(1000, cuentaMaria);
		System.out.println("El nuevo saldo de cuenta Facu es " + cuentaFacu.getSaldo());
		System.out.println("El nuevo saldo de cuenta Maria es " + cuentaMaria.getSaldo());
		
	}
}
