package com.magadiflo.git.github.app.services.impl;

import com.magadiflo.git.github.app.services.IProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Override
    public List<String> getAllProducts() {
        return List.of("Teclado", "Monitor", "WebCam", "UPS");
    }
}
