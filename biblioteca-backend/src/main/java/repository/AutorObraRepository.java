package repository;

import model.AutorObra;
import model.AutorObraKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorObraRepository extends JpaRepository<AutorObra , AutorObraKey> {
}
