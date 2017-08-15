package br.com.tsi.notepadsaas.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.tsi.model.Nota;

public interface NotaRepository extends MongoRepository<Nota,String> {

	List<Nota> findByTitulo(String titulo);
}
