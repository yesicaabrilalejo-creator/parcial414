package com.example.vehiculo;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class VehiculoService {

    private final VehiculoRepository repo;

    public VehiculoService(VehiculoRepository repo) {
        this.repo = repo;
    }

    public List<Vehiculo> listar() {
        return repo.findAll();
    }

    public Vehiculo guardar(Vehiculo vehiculo) {
        return repo.save(vehiculo);
    }

    public Vehiculo buscar(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}