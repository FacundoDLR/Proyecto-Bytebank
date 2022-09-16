
public class TestCliente {

	public static void main(String[] args) {
		Cuenta cuentaPrueba = new Cuenta(-10, 89);
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Francisco");
		cliente.setDocumento("39567433");
		cliente.setProfesion("Doctor");
		System.out.println(cliente.getNombre());
		System.out.println(cliente.getDocumento());
		System.out.println(cliente.getProfesion());
		System.out.println(cuentaPrueba.getNumero());
		System.out.println(cuentaPrueba.getAgencia());
	}
}
