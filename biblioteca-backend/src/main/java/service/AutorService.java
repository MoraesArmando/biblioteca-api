package service;

import dto.AutorDTO;
import lombok.RequiredArgsConstructor;
import model.Autor;
import org.springframework.stereotype.Service;
import repository.AutorRepository;

@Service
@RequiredArgsConstructor
public class AutorService {
    private final AutorRepository autorRepository;

    public AutorDTO saveAutor(AutorDTO dto){
        Autor autor = Autor.convert(dto);
        return AutorDTO.convert(autorRepository.save(autor));
    }
}
