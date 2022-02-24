package co.com.edu.uco.ing.software.project.transports.infraestructure.adapter.entity;

import javax.persistence.*;

@Entity
@Table(name = "owner_test")
public class OwnerEntity {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private int document;
  private String documentType;
  private String firstName;
  // private final String lastName;
  // private final String email;
  // private final String city;
  // private final String rut;
  // private final String phone;
  // private final String licensePlate;

  public OwnerEntity() {
  }

  public OwnerEntity(int document, String documentType, String firstName) {
    this.document = document;
    this.documentType = documentType;
    this.firstName = firstName;
  }

  public Long getId() {
    return id;
  }

  public int getDocument() {
    return document;
  }

  public String getDocumentType() {
    return documentType;
  }

  public String getFirstName() {
    return firstName;
  }
}
