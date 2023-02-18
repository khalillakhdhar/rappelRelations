package com.example.demo.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Activite {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@Column(columnDefinition = "varchar(30) default 'loisir'")
private String type;
private String description;
}
