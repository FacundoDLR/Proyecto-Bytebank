
public class TestCliente {

	public static void main(String[] args) {
		Cuenta cuentaPrueba = new Cuenta();
		Cliente cliente = new Cliente();
		
		cliente.setNombre("Francisco");
		cliente.setDocumento("39567433");
		cliente.setProfesion("Doctor");
		System.out.println(cliente.getNombre());
		System.out.println(cliente.getDocumento());
		System.out.println(cliente.getProfesion());
	}
}
