package com.unidac.controller;

import com.unidac.models.Colaborador;
import com.unidac.repository.ColaboradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/unidac")
public class UnidacController {

    @Autowired
    ColaboradorRepository colaboradorRepository;

    @GetMapping("/{id}")
    public Colaborador buscarColaboradorPorId(@PathVariable Long id) {
        var colaboradorOptional = colaboradorRepository.findById(id);
        if (colaboradorOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return colaboradorOptional.get();
        
    }

    @GetMapping("/listar")
    public List<Colaborador> listar() {
        return colaboradorRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Colaborador cadastrarColaborador(@RequestBody Colaborador colaborador) {

//        System.out.println(colaborador.getDataDoCafedaManha());

        return colaboradorRepository.save(colaborador);

    }

    @PutMapping("/{id}")
    public Colaborador atualizarColaboradorPeloId(@PathVariable Long id, @RequestBody Colaborador colaborador) {

        var colaboradorOptional = colaboradorRepository.findById(id);
        if (colaboradorOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        colaborador.setId(id);
        return colaboradorRepository.save(colaborador);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void excluirPeloId(@PathVariable Long id){
        var colaboradorOptional = colaboradorRepository.findById(id);
        if (colaboradorOptional.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        colaboradorRepository.delete(colaboradorOptional.get());
    }

}
