package com.EduHubAcademy.asignaturaService.service;

import com.EduHubAcademy.asignaturaService.model.Asignatura;
import com.EduHubAcademy.asignaturaService.repository.AsignaturaRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsignaturaService {


    @Autowired
    private AsignaturaRepository asignaturaRepository;

    public List<Asignatura> getAllAsignaturas() {
        return asignaturaRepository.findAll();
    }

    public Asignatura getAsignaturaById(Long id) {
        return asignaturaRepository.findById(id).orElse(null);
    }

    public Asignatura saveAsignatura(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    public void deleteAsignatura(Long id) {
        asignaturaRepository.deleteById(id);
    }

    public void editAsignatura(Asignatura asignatura) {
        this.saveAsignatura(asignatura);
    }

    public Asignatura findAsignatura(Long id) {
        return asignaturaRepository.findById(id).orElse(null);

    }

    private void validarAsignatura(@NotNull Asignatura asignatura, boolean esEdicion) {

        //valido que el campo nombre de la materia no esté vacío.
        if (asignatura.getNombre() == null || asignatura.getNombre().trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la materia es obligatorio");
        }

        //valido que el campo de descripcion no este vacio
        if (asignatura.getDescripcion() == null || asignatura.getDescripcion().trim().isEmpty()) {
            throw new IllegalArgumentException(" La descripcion de la materia es obligatorio");
        }
        //valido que el campo notas no esten vacíos.
        if (asignatura.getNota_1() == null || asignatura.getNota_1().trim().isEmpty()) {
            throw new IllegalArgumentException("El campo de la nota_1 es obligatorio");
        }
        if (asignatura.getNota_2() == null || asignatura.getNota_2().trim().isEmpty()) {
            throw new IllegalArgumentException("El campo de la nota_2 es obligatorio");
        }
        if (asignatura.getNota_3() == null || asignatura.getNota_3().trim().isEmpty()) {
            throw new IllegalArgumentException("El campo de la nota_1 es obligatorio");
        }
    }


}
