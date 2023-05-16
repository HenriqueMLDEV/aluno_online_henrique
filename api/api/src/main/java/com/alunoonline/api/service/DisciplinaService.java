package com.alunoonline.api.service;

import com.alunoonline.api.model.Aluno;
import com.alunoonline.api.model.Disciplina;
import com.alunoonline.api.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisciplinaService {
    @Autowired
    DisciplinaRepository repository;

//Create
    public Disciplina create (Disciplina disciplina){
        return repository.save(disciplina);
    }
// Read
    public List<Disciplina> findAll(){
        return repository.findAll();
    }
    public Optional<Disciplina> findById(Long id){
        return repository.findById(id);

    }
// Delete
    public void delete(Long id){
        repository.deleteById(id);
    }
}
