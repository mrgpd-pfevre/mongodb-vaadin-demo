package com.example;

import org.springframework.stereotype.Repository;
import org.vaadin.crudui.crud.CrudListener;

import java.util.Collection;

@Repository
public class TraitementService implements CrudListener<ImportTraitement> {

    private final TraitementRepository repository;

    public TraitementService(TraitementRepository repository) {
        this.repository = repository;
    }

    @Override
    public Collection<ImportTraitement> findAll() {
        return repository.findAll();
    }

    @Override
    public ImportTraitement add(ImportTraitement student) {
        return repository.insert(student);
    }

    @Override
    public ImportTraitement update(ImportTraitement student) {
        return repository.save(student);
    }

    @Override
    public void delete(ImportTraitement student) {
        repository.delete(student);
    }

}
