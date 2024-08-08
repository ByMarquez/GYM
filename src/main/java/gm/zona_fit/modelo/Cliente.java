package gm.zona_fit.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity//jpa, mapeo de una tabla

/*LOMBOOK*/
@Data//GETTERS & SETTERS
@NoArgsConstructor// CONSTRUCTOR VACIO
@AllArgsConstructor// CONSTRUCTOR CON TODOS LOS ARGUMENTOS
@ToString// METODO TO STRING
@EqualsAndHashCode // METODO EQUIALS Y HASHCODE
public class Cliente {
    //Para ausencia de valor = null, usamos objetos en vez de tipos primitivos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;//id auto incrementable
    private String nombre;
    private String apellido;
    private Integer membresia;
}
