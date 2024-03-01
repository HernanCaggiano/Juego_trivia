package academy.atl.trivia.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity //indicar que es una entidad
@Table(name = "category") //a que tabla esta indicando
@Data //para los geter y seter
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //el autoincremen el id
    @Column(name = "id")
    private Long id;

    @Column(name = "name") //pertenece a una columna de la base
    private String name;

    @Column(name = "description")
    private String description;

}
