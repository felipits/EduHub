package com.EduHubAcademy.asignaturaService.model;


import jakarta.persistence.*;
import lombok.*;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter


@Entity
@Table(name = "servicio_asignatura")
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private String nota_1;
    private String nota_2;
    private String nota_3;
    private String notaFinal;
    private String url_contenido;




}
