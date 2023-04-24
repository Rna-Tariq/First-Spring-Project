package com.School.School;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class SchoolEntity {

    @Id
    @Column(name = "std_ id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "std_name")
    private String name;

    @Column(name = "birthdate")
    private String birthdate;

    public SchoolEntity() {
    }

    public SchoolEntity(Long id, String name, String birthdate) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }
}
