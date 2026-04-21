package com.example.vehiculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoRepository repo;

    @GetMapping
    public List<Vehiculo> listar() {
        return repo.findAll();
    }

    @PostMapping
    public Vehiculo guardar(@RequestBody Vehiculo v) {
        return repo.save(v);
    }

    @PutMapping("/{id}")
    public Vehiculo actualizar(@PathVariable Long id, @RequestBody Vehiculo v) {
        v.setId(id);
        return repo.save(v);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        repo.deleteById(id);
    }
}