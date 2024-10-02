package com.example.intecap.service.serviceimpl;

import org.springframework.stereotype.Service;

import com.example.intecap.models.productosModel;
import com.example.intecap.repository.productoRepository;
import com.example.intecap.service.productoService;
import com.example.intecap.common.CommonSvcImpl;

@Service
public class productosServiceImpl extends CommonSvcImpl<productosModel, productoRepository> implements productoService {

    @Override
    public Iterable<productosModel> findAll() {
        return repository.findAll();
    }

    @Override
    public productosModel save(productosModel producto) {
        System.out.println("Guardando producto");
        return repository.save(producto);
    }
}