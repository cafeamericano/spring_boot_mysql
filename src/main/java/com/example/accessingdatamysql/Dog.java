package com.example.accessingdatamysql;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Dog {

  // MODEL DEFINITION ////////////////////////

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Integer id;
  private String name;
  private String breed;
  private Integer weight;

  // GETTERS /////////////////////////////////

  public Integer getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public String getBreed() {
    return breed;
  }

  public Integer getWeight() {
    return weight;
  }

  // SETTERS /////////////////////////////////

  public void setId(Integer id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setBreed(String breed){
    this.breed = breed;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  // OTHER ///////////////////////////////////

  // Allows a readable printing of Dog to the console
  public String toString(){
      return "{id: "    + id      + ", " + 
             "name: "  + name    + ", " + 
             "breed: " + breed   + ", " + 
             "weight: " + weight  + "} ";  
   }
  
}