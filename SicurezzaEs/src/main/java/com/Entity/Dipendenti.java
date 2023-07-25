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

    @Size(max = 256)
    @Column(name = "img", length = 256)
    private String img;

    @Column(name = "cv")
    private byte[] cv;

    @NotNull
    @Column(name = "data_assunzione", nullable = false)
    private LocalDate dataAssunzione;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_supervisore")
    private Dipendenti idSupervisore;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_user", nullable = false)
    private UserEntity idUser;

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public byte[] getCv() {
        return cv;
    }

    public void setCv(byte[] cv) {
        this.cv = cv;
    }

    public LocalDate getDataAssunzione() {
        return dataAssunzione;
    }

    public void setDataAssunzione(LocalDate dataAssunzione) {
        this.dataAssunzione = dataAssunzione;
    }

    public Dipendenti getIdSupervisore() {
        return idSupervisore;
    }

    public void setIdSupervisore(Dipendenti idSupervisore) {
        this.idSupervisore = idSupervisore;
    }

    public UserEntity getIdUser() {
        return idUser;
    }

    public void setIdUser(UserEntity idUser) {
        this.idUser = idUser;
    }

}