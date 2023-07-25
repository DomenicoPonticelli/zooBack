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

    @NotNull
    @Column(name = "litriContenuti", nullable = false)
    private Integer litriContenuti;

    @NotNull
    @Column(name = "numeroAnimali", nullable = false)
    private Integer numeroAnimali;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "IdAreaAnimaliAcquatici", nullable = false)
    private Areaanimaliacquatici idAreaAnimaliAcquatici;

    @Size(max = 256)
    @NotNull
    @Column(name = "habitat", nullable = false, length = 256)
    private String habitat;

    @NotNull
    @Column(name = "img", nullable = false)
    private byte[] img;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

}