package silvafilipe.com.fullstackcourse_springboot_silvafilipe.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import silvafilipe.com.fullstackcourse_springboot_silvafilipe.domain.Categoria;
import silvafilipe.com.fullstackcourse_springboot_silvafilipe.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo; 
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
}