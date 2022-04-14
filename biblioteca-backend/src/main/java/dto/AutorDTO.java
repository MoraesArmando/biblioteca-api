package dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import model.Autor;

@Getter
@Setter
@Builder
public class AutorDTO {
    private String nome;

    public static AutorDTO convert(Autor autor){
        return AutorDTO.builder()
                .nome(autor.getNome())
                .build();
    }
}
