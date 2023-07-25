package com.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Entity
@Table(name = "dipendenti")
public class Dipendenti {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Size(max = 256)
    @NotNull
    @Column(name = "nome", nullable = false, length = 256)
    private String nome;

    @NotNull
    @Column(name = "dataN", nullable = false)
    private LocalDate dataN;

    @Size(max = 16)
    @NotNull
    @Column(name = "cf", nullable = false, length = 16)
    private String cf;

    @NotNull
    @Column(name = "stipendio", nullable = false)
    private Float stipendio;

    @NotNull
    @Column(name = "dataAssunzione", nullable = false)
    private LocalDate dataAssunzione;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "idUser", nullable = false)
    private UserEntity idUser;

    @NotNull
    @Column(name = "img", nullable = false)
    private byte[] img;

    @NotNull
    @Column(name = "cv", nullable = false)
    private byte[] cv;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idSupervisore")
    private Dipendenti idSupervisore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataN() {
        return dataN;
    }

    public void setDataN(LocalDate dataN) {
        this.dataN = dataN;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public Float getStipendio() {
        return stipendio;
    }

    public void setStipendio(Float stipendio) {
        this.stipendio = stipendio;
    }

    public LocalDate getDataAssunzione() {
        return dataAssunzione;
    }

    public void setDataAssunzione(LocalDate dataAssunzione) {
        this.dataAssunzione = dataAssunzione;
    }

    public UserEntity getIdUser() {
        return idUser;
    }

    public void setIdUser(UserEntity idUser) {
        this.idUser = idUser;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }

    public byte[] getCv() {
        return cv;
    }

    public void setCv(byte[] cv) {
        this.cv = cv;
    }

    public Dipendenti getIdSupervisore() {
        return idSupervisore;
    }

    public void setIdSupervisore(Dipendenti idSupervisore) {
        this.idSupervisore = idSupervisore;
    }

}