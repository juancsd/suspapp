package com.security.app.seguranca.service;

import com.security.app.seguranca.model.Incidente;
import com.security.app.seguranca.repository.IncidenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IncidenteService {

    @Autowired
    private IncidenteRepository incidenteRepository;

    public Incidente salvarincidente(Incidente incidente){
        return incidenteRepository.save(incidente);
    }


    public Incidente buscarPorId(Long id){
        Optional<Incidente> incidenteOptional =
                incidenteRepository.findById(id);

        if (incidenteOptional.isPresent()){
            return incidenteOptional.get();
        } else {
            throw new RuntimeException("Incidente não existe!");
        }
    }

    public List<Incidente> listarTodos(){
        return incidenteRepository.findAll();
    }

    public void excluir(Long id){
        Optional<Incidente> incidenteOptional =
                incidenteRepository.findById(id);

        if (incidenteOptional.isPresent()){
            incidenteRepository.delete(incidenteOptional.get());
        } else {
            throw new RuntimeException("Incidente não encontrado!");
        }
    }

    public Incidente atualizar(Incidente incidente) {
        // Use getIncidenteId() para obter o ID do incidente
        Optional<Incidente> incidenteOptional = incidenteRepository.findById(incidente.getIncidenteId());

        if (incidenteOptional.isPresent()) {
            // Se o incidente existe, atualize e salve
            Incidente incidenteExistente = incidenteOptional.get();

            // Atualize os campos do incidente existente com os novos dados
            incidenteExistente.setCep(incidente.getCep());
            incidenteExistente.setRua(incidente.getRua());
            incidenteExistente.setBairro(incidente.getBairro());
            incidenteExistente.setCidade(incidente.getCidade());
            incidenteExistente.setEstado(incidente.getEstado());
            incidenteExistente.setObservacao(incidente.getObservacao());
            incidenteExistente.setTpIncidente(incidente.getTpIncidente());

            // Salve o incidente atualizado
            return incidenteRepository.save(incidenteExistente);
        } else {
            // Se o incidente não for encontrado, lance uma exceção ou retorne um erro
            throw new RuntimeException("Incidente não encontrado com ID: " + incidente.getIncidenteId());
        }
    }



}
