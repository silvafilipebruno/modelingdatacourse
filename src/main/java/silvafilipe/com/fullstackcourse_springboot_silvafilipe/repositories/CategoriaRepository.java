package silvafilipe.com.fullstackcourse_springboot_silvafilipe.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import silvafilipe.com.fullstackcourse_springboot_silvafilipe.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}