package gm.zona_fit.servicio;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteServicio implements IClienteServicio{

    /*auto inyectar una instancia del @repository
    mi interfaz da acceso a los metodos CRUD
    Spring inyecta automáticamente una instancia de ClienteRepositorio aquí.
     */
    @Autowired
    private ClienteRepositorio clienteRepositorio;

    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = clienteRepositorio.findAll();
        return clientes;
    }

    @Override
    public Cliente buscarClientePorId(Integer idCliente) {
        //findByID regresa un tipo Optional, que puede ser null o no,
        // para mejor manejo dar el default de null si no se encuentra el id
        Cliente cliente = clienteRepositorio.findById(idCliente).orElse(null);
        return cliente;
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        //si el id == null insert
        //si el id == # update
        //Esto lo hace de manera interna JPA
        clienteRepositorio.save(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        clienteRepositorio.delete(cliente);
    }
}
