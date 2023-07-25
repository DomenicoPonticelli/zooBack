package com.Entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "areacompetenza")
public class Areacompetenza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "idUser", nullable = false)
    private Integer idUser;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

}