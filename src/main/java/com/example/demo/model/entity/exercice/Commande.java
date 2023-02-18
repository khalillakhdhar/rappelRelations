package com.example.demo.model.entity.exercice;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity

public class Commande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
	private int quantite;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	@Column(columnDefinition = "varchar(40) default 'en attente'")
	private String etat;
	@JoinColumn(name = "id_user",referencedColumnName = "id")
	@ManyToOne(optional = false)
	private Utilisateur user;
}
