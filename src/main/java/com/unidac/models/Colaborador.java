package com.unidac.models;



import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Colaborador implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(nullable = false, length = 100)
    public String nome;

    @Column(nullable = false, unique = true)
    public String cpf;


    @Column(nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd")
    public LocalDate dataDoCafedaManha;

//    public List<ArrayList> itensDoCafedaManha;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public LocalDate getDataDoCafedaManha() {
        return dataDoCafedaManha;
    }

    public void setDataDoCafedaManha(LocalDate dataDoCafedaManha) {
        this.dataDoCafedaManha = dataDoCafedaManha;
    }

    public Colaborador() { }

//    public List<ArrayList> getItensDoCafedaManha() {
//        return itensDoCafedaManha;
//    }

//    public void setItensDoCafedaManha(List<ArrayList> itensDoCafedaManha) {
//        this.itensDoCafedaManha = itensDoCafedaManha;
//    }

    public Colaborador(String nome, String cpf, LocalDate dataDoCafedaManha) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataDoCafedaManha = dataDoCafedaManha;
    }
}
