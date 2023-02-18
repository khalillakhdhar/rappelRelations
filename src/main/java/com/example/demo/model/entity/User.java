package com.example.demo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Entity
@Data
public class User {
@Id
private int id;
@NotBlank
private String nomComplet;
@Min(value = 18)
private int age;
@Column(nullable = true)
private String adresse;
@Column(length = 20)
private String telephone;



}
