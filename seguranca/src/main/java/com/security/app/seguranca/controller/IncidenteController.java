package com.security.app.seguranca.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import com.security.app.seguranca.model.Incidente;
import com.security.app.seguranca.service.IncidenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class IncidenteController {

    @Autowired
    private IncidenteService incidenteService;

    @PostMapping("/incidente")
    @ResponseStatus(HttpStatus.CREATED)
    public Incidente salvar(@RequestBody Incidente incidente){
        return incidenteService.salvarincidente(incidente);
    }

    @GetMapping("/incidente")
    @ResponseStatus(HttpStatus.OK)
    public List<Incidente> litarTodos(){
        return incidenteService.listarTodos();
    }

    @GetMapping("/incidente/{incidenteId}")
    public Incidente buscarPorId(@PathVariable Long incidenteId){
        return incidenteService.buscarPorId(incidenteId);
    }

    @DeleteMapping("/incidente/{incidenteId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void excluir(@PathVariable Long incidenteId){
        incidenteService.excluir(incidenteId);
    }

//    @PutMapping("/incidente")
//    @ResponseStatus(HttpStatus.OK)
//    public Incidente atualizar(@RequestBody Incidente incidente){
//        return incidenteService.atualizar(incidente);
//    }

}

