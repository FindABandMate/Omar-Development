package bandcode.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="band")
public class Band {

  // INITIALIZE TABLE VARIABLES
  @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private int id;

  @Column(name="description") private String description;

  @Column(name="location") private String location;

  @Column(name="experience") private String experience;

  // DEFAULT CONSTRUCTOR
  public Band(){}

  // CONSTRUCTOR
  public Band(int id, String description, String location, String experience) {
    this.id = id;
    this.description = description;
    this.location = location;
    this.experience = experience;
  }

  // GETTERS & SETTERS
  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getExperience() {
    return experience;
  }

  public void setExperience(String experience) {
    this.experience = experience;
  }

  // TO STRING METHOD
  public String toString() {
    return "Band{" +
        "id=" + id +
        ", description='" + description + '\'' +
        ", location='" + location + '\'' +
        ", experience='" + experience + '\'' +
        '}';
  }
}
