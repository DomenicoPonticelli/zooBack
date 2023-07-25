package com.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "areaanimaliditerra")
public class Areaanimaliditerra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "estensioneTotale", nullable = false)
    private Integer estensioneTotale;

    @Size(max = 256)
    @NotNull
    @Column(name = "tipo", nullable = false, length = 256)
    private String tipo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getEstensioneTotale() {
        return estensioneTotale;
    }

    public void setEstensioneTotale(Integer estensioneTotale) {
        this.estensioneTotale = estensioneTotale;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}