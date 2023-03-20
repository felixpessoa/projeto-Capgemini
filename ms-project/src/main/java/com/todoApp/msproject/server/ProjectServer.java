package com.todoApp.msproject.server;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.todoApp.msproject.domain.Project;
import com.todoApp.msproject.repository.ProjectRepository;
import com.todoApp.msproject.server.exception.ObjectNotFoundException;

@Service
public class ProjectServer {
   
    @Autowired
    private ProjectRepository repository;

    @Transactional
    public Project save(Project project){
        return repository.save(project);
    }

    public List<Project> getAll(){
        return repository.findAll();
    }

    public Project getId(Long id){
        Optional<Project> opt = repository.findById(id);
        return opt.orElseThrow(() -> new ObjectNotFoundException(
            "Projeto não encontrado! id: "+ id +", Tipo: "+ Project.class.getName()
        ));
    }
}
