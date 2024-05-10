package com.example.dominiclasso.persona;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    
    @Autowired
    private PersonaRepository personaRepository;

    public Persona save(Persona entity){
        return personaRepository.save(entity);
    }

    public Persona findById(Long id){
        return personaRepository.findById(id).orElse(null);
    }

    public void deleteById(Long id){
       personaRepository.deleteById(id);
    }

    public List<Persona> findAll(){
       return personaRepository.findAll();
     }

}
