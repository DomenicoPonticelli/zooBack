package com.Entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "recinto")
public class Recinto {
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
    @Column(name = "estensione_recinto", nullable = false)
    private Integer estensioneRecinto1;

    @NotNull
    @Column(name = "numero_animali", nullable = false)
    private Integer numeroAnimali1;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_area_animali_di_terra", nullable = false)
    private Areaanimaliditerra idAreaAnimaliDiTerra1;

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

    public Integer getEstensioneRecinto1() {
        return estensioneRecinto1;
    }

    public void setEstensioneRecinto1(Integer estensioneRecinto1) {
        this.estensioneRecinto1 = estensioneRecinto1;
    }

    public Integer getNumeroAnimali1() {
        return numeroAnimali1;
    }

    public void setNumeroAnimali1(Integer numeroAnimali1) {
        this.numeroAnimali1 = numeroAnimali1;
    }

    public Areaanimaliditerra getIdAreaAnimaliDiTerra1() {
        return idAreaAnimaliDiTerra1;
    }

    public void setIdAreaAnimaliDiTerra1(Areaanimaliditerra idAreaAnimaliDiTerra1) {
        this.idAreaAnimaliDiTerra1 = idAreaAnimaliDiTerra1;
    }

}