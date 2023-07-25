package com.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "areaanimaliacquatici")
public class Areaanimaliacquatici {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "estensione_totale", nullable = false)
    private Integer estensioneTotale;

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

}