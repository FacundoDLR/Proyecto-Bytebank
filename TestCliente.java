
public class TestCliente {

	public static void main(String[] args) {
		Cuenta cuentaPrueba = new Cuenta();
		cuentaPrueba.cliente = new Cliente();
		
		cuentaPrueba.cliente.nombre = "Francisco";
		cuentaPrueba.cliente.documento = "39567433";
		cuentaPrueba.cliente.Profesion = "Doctor";
		System.out.println(cuentaPrueba.cliente.nombre);
		System.out.println(cuentaPrueba.cliente.documento);
		System.out.println(cuentaPrueba.cliente.Profesion);
	}
}
