package co.com.edu.uco.ing.software.project.transports.application.service;

import co.com.edu.uco.ing.software.project.transports.domain.model.Owner;
import co.com.edu.uco.ing.software.project.transports.domain.port.OwnerRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApplicationListOwnerService {

  private final OwnerRepository ownerRepository;

  public ApplicationListOwnerService(OwnerRepository ownerRepository) {
    this.ownerRepository = ownerRepository;
  }

  public List<Owner> execute() {
    return this.ownerRepository.getList();
  }
}
