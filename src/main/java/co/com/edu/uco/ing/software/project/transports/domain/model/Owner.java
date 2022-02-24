package co.com.edu.uco.ing.software.project.transports.domain.model;

import static co.com.edu.uco.ing.software.project.transports.domain.util.RulesValidator.validateObjectRequired;

public class Owner {

  private int document;
  private String documentType;
  private String firstName;
  // private final String lastName;
  // private final String email;
  // private final String city;
  // private final String rut;
  // private final String phone;
  // private final String licensePlate;

  private Owner(int document, String documentType, String firstName) {
    this.document = document;
    this.documentType = documentType;
    this.firstName = firstName;
  }

  public static Owner ownerBuilder(int document, String documentType, String firstName) {

    validateObjectRequired(document, "Required identification document");
    validateObjectRequired(document, "Required document type");
    validateObjectRequired(document, "Required first name");

    return new Owner(document, documentType, firstName);
  }

  public int getDocument() {
    return document;
  }

  public void setDocument(int document) {
    this.document = document;
  }

  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
}
