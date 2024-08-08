package gm.zona_fit.servicio;

import gm.zona_fit.modelo.Cliente;
import java.util.List;

/*definir el comportamiento de la clase ClienteServicio que implementara esta interfaz*/
public interface IClienteServicio {
    public List<Cliente> listarClientes();

    public Cliente buscarClientePorId(Integer idCliente);

    //este metodo actualiza y hace insert si id == null
    public void guardarCliente(Cliente cliente);

    public void eliminarCliente(Cliente cliente);

}
