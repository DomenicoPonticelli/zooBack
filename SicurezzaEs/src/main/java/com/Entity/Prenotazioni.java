package com.Entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "prenotazioni")
public class Prenotazioni {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "data", nullable = false)
    private LocalDate data;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "id_area_animali_acquatici", nullable = false)
    private Areaanimaliacquatici idAreaAnimaliAcquatici;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_area_animali_di_terra", nullable = false)
    private Areaanimaliditerra idAreaAnimaliDiTerra;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_dipendente", nullable = false)
    private Dipendenti idDipendente;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_user", nullable = false)
    private UserEntity idUser;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_visita", nullable = false)
    private Visita idVisita;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Areaanimaliacquatici getIdAreaAnimaliAcquatici() {
        return idAreaAnimaliAcquatici;
    }

    public void setIdAreaAnimaliAcquatici(Areaanimaliacquatici idAreaAnimaliAcquatici) {
        this.idAreaAnimaliAcquatici = idAreaAnimaliAcquatici;
    }

    public Areaanimaliditerra getIdAreaAnimaliDiTerra() {
        return idAreaAnimaliDiTerra;
    }

    public void setIdAreaAnimaliDiTerra(Areaanimaliditerra idAreaAnimaliDiTerra) {
        this.idAreaAnimaliDiTerra = idAreaAnimaliDiTerra;
    }

    public Dipendenti getIdDipendente() {
        return idDipendente;
    }

    public void setIdDipendente(Dipendenti idDipendente) {
        this.idDipendente = idDipendente;
    }

    public UserEntity getIdUser() {
        return idUser;
    }

    public void setIdUser(UserEntity idUser) {
        this.idUser = idUser;
    }

    public Visita getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(Visita idVisita) {
        this.idVisita = idVisita;
    }

}