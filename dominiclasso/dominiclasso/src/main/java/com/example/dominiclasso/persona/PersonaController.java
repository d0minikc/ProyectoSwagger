package com.example.dominiclasso.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/prueba")
public class PersonaController {
    
    @Autowired
    private PersonaService personaService;
    @PostMapping("/")
    public Persona save(@RequestBody Persona entity){
        return personaService.save(entity);
    }

    @GetMapping("/{id}")
    public Persona findById(@PathVariable Long id)
    {
        return personaService.findById(id);
    }

    @PutMapping("/")
    public Persona update(@RequestBody Persona entity)
    {
        return personaService.save(entity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id)
    {
        personaService.deleteById(id);
    }

    @GetMapping("/")
    public List<Persona> findAll()
    {
        return personaService.findAll();
    }




}
