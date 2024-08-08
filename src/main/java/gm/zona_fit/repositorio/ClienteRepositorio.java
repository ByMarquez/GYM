package gm.zona_fit.repositorio;

import gm.zona_fit.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/*la clase JpaRepository tiene los metodos de un DAO generico,
por eso le pasamos el Cliente y su id para que haga los updates por id
 */
public interface ClienteRepositorio extends JpaRepository<Cliente,Integer> {
}
