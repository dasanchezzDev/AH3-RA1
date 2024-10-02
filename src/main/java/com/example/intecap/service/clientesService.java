package com.example.intecap.service;

import com.example.intecap.models.clientesModel;

import java.util.Optional;

import com.example.intecap.common.CommonSvc;

public interface clientesService extends CommonSvc<clientesModel> {

    public Iterable<clientesModel> findAll();

    public Optional<clientesModel> findById(int id);

    public clientesModel save(clientesModel entity);

    public void deleteById(int id);

    Iterable<clientesModel> saveAll(Iterable<clientesModel>entities);
}