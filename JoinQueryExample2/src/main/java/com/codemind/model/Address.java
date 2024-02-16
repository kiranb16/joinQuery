package com.codemind.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Address {
	@Id
  int a_id;
  String road;
  String city;
}
