package com.example.intecap.service;


import com.example.intecap.models.productosModel;
import com.example.intecap.common.CommonSvc;

public interface productoService extends CommonSvc<productosModel> {

    public Iterable<productosModel> findAll();

    public productosModel save(productosModel producto);
}