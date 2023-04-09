package one.digitalinnovation.labpadroesprojetospring.controller;

import one.digitalinnovation.labpadroesprojetospring.model.Cliente;
import one.digitalinnovation.labpadroesprojetospring.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController /* operações CRUD (create, read, update, delete)
responsável por receber as requisições ao ser a interface de consumo do usuário
*/
@RequestMapping("clientes")
public class ClienteController {
    @Autowired //instanciar objeto singleton
    private ClienteService clienteService;

    @GetMapping //buscar todos usuarios
    public ResponseEntity<Iterable<Cliente>> findAll() {
        return ResponseEntity.ok(clienteService.findAll());
    }

    @GetMapping("/{id}") //buscar usuario por id
    public ResponseEntity<Cliente> findById(@PathVariable Long id) {
        return ResponseEntity.ok(clienteService.findById(id));
    }

    @PostMapping //criar novo usuario
    public ResponseEntity<Cliente> create(@RequestBody Cliente cliente) {
        clienteService.create(cliente);
        return ResponseEntity.ok(cliente);
    }

    @PutMapping("/{id}") //alterar usuario
    public ResponseEntity<Cliente> update(@PathVariable Long id, @RequestBody Cliente cliente){
        clienteService.update(id, cliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("/{id}") //deletar usuario
    public ResponseEntity<Cliente> delete(@PathVariable Long id){
        clienteService.delete(id);
        return ResponseEntity.ok().build();
    }
}
