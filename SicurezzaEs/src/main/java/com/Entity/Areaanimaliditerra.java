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

    @NotNull
    @Column(name = "estensione_totale", nullable = false)
    private Integer estensioneTotale1;

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

    public Integer getEstensioneTotale1() {
        return estensioneTotale1;
    }

    public void setEstensioneTotale1(Integer estensioneTotale1) {
        this.estensioneTotale1 = estensioneTotale1;
    }

}