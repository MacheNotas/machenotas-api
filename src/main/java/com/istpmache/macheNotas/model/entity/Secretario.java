package com.istpmache.macheNotas.model.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="secretarios")
public class Secretario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Email
    @Column(name = "emailSec", nullable = false)
    private String emailSec;
    @Column(name = "password", nullable = false)
    private String password;
}
