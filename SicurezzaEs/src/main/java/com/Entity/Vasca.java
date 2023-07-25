package com.Entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "vasca")
public class Vasca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 256)
    @NotNull
    @Column(name = "habitat", nullable = false, length = 256)
    private String habitat;

    @Size(max = 256)
    @Column(name = "img", length = 256)
    private String img;

    @NotNull
    @Column(name = "litri_contenuti", nullable = false)
    private Integer litriContenuti;

    @NotNull
    @Column(name = "numero_animali", nullable = false)
    private Integer numeroAnimali;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_area_animali_acquatici", nullable = false)
    private Areaanimaliacquatici idAreaAnimaliAcquatici;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Integer getLitriContenuti() {
        return litriContenuti;
    }

    public void setLitriContenuti(Integer litriContenuti) {
        this.litriContenuti = litriContenuti;
    }

    public Integer getNumeroAnimali() {
        return numeroAnimali;
    }

    public void setNumeroAnimali(Integer numeroAnimali) {
        this.numeroAnimali = numeroAnimali;
    }

    public Areaanimaliacquatici getIdAreaAnimaliAcquatici() {
        return idAreaAnimaliAcquatici;
    }

    public void setIdAreaAnimaliAcquatici(Areaanimaliacquatici idAreaAnimaliAcquatici) {
        this.idAreaAnimaliAcquatici = idAreaAnimaliAcquatici;
    }

}