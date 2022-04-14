package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "autor_obra")
public class AutorObra {

    @EmbeddedId
    private AutorObraKey autorObraKey;

    @ManyToOne
    @MapsId("idObra")
    @JoinColumn(name = "id_obra")
    private Obra obra;

    @ManyToOne
    @MapsId("idAutor")
    @JoinColumn(name = "id_autor")
    private Autor autor;

    public static AutorObra create(Obra obra, Autor autor){
        AutorObra autorObra = new AutorObra();
        autorObra.setObra(obra);
        autorObra.setAutor(autor);

        AutorObraKey key =  new AutorObraKey();
        key.setIdAutor(obra.getId());
        key.setIdAutor(autor.getId());

        autorObra.setAutorObraKey(key);

        return autorObra;
    }

}
