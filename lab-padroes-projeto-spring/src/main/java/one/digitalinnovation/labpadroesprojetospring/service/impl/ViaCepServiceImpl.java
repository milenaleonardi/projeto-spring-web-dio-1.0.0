package one.digitalinnovation.labpadroesprojetospring.service.impl;

import one.digitalinnovation.labpadroesprojetospring.model.Endereco;
import one.digitalinnovation.labpadroesprojetospring.model.EnderecoRepository;
import one.digitalinnovation.labpadroesprojetospring.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViaCepServiceImpl implements ViaCepService {

    @Autowired
    private ViaCepService viaCepService;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Override
    public Endereco consultarCep(String cep) {
        return null;
    }
}
