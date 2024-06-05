package com.example.demo.model;
import jakarta.persistence.*;
import java.util.Objects;

@Entity
@Table(name="dog")
public class Dog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="name", length = 255)
    private String name;

    @Column(name="breed", length = 255)
    private String breed;

    @Column(name="turnInDate")
    private String turnInDate;

    @Column(name="gender")
    private Boolean gender;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
    public String getTurnInDate() {
        return this.turnInDate;
    }

    public void setTurnInDate(String turnInDate) {
        this.turnInDate = turnInDate;
    }
    public Boolean getGender() {
        return this.gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Dog(){}

    public Dog(String name, String breed, String turnInDate, Boolean gender){
        this.name = name;
        this.breed = breed;
        this.turnInDate = turnInDate;
        this.gender = gender;
    }

    public Dog(Long id, String name, String breed, String turnInDate, Boolean gender){
        this.id = id;
        this.name = name;
        this.breed = breed;
        this.turnInDate = turnInDate;
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.breed);
        hash = 79 * hash + Objects.hashCode(this.turnInDate);
        hash = 79 * hash + Objects.hashCode(this.gender);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Dog other = (Dog) obj;

        if (!Objects.equals(this.breed, other.breed)) {
            return false;
        }
        if (!Objects.equals(this.turnInDate, other.turnInDate)) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.gender, other.gender)) {
            return false;
        }

        return Objects.equals(this.id, other.id);
    }
    
}
