package model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Getter
@Setter
public class AutorObraKey implements Serializable {

    @Column(name = "id_obra")
    private Integer idObra;

    @Column(name = "id_Autor")
    private Integer idAutor;
}
