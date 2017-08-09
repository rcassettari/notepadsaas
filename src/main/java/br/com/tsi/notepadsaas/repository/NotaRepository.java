package br.com.tsi.notepadsaas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import br.com.tsi.model.Nota;

public interface NotaRepository extends MongoRepository<Nota,String> {

}
