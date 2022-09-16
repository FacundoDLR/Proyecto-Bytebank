
public class CrearCuenta {

	public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta();
        primeraCuenta.depositar(200);
        System.out.println(primeraCuenta.getSaldo());
        primeraCuenta.setNumero(23);
        System.out.println(primeraCuenta.getNumero());

        primeraCuenta.depositar(100);
        System.out.println(primeraCuenta.getSaldo());

        Cuenta segundaCuenta = new Cuenta();
        segundaCuenta.depositar(50);

        System.out.println("primera cuenta tiene " + primeraCuenta.getSaldo());
        System.out.println("segunda cuenta tiene " + segundaCuenta.getSaldo());

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);
	}
}
