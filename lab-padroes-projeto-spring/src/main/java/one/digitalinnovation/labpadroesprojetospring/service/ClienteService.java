package one.digitalinnovation.labpadroesprojetospring.service;

import one.digitalinnovation.labpadroesprojetospring.model.Cliente;
import one.digitalinnovation.labpadroesprojetospring.model.Endereco;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public interface ClienteService {

    Iterable<Cliente> findAll();
    Cliente findById(Long id);
    void create(Cliente cliente);
    void update(Long id, Cliente cliente);
    void delete(Long id);

}
