package com.example.demo.model.entity.exercice;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import lombok.Data;

@Entity
@Data
public class Utilisateur {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Email
private String email;

private String mdp;
private String nom;

private String telephone;
private String adresse;
private String grade;
@OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
private List<Commande> commandList;
}
