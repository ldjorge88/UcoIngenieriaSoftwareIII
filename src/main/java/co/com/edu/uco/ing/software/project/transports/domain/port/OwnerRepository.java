package co.com.edu.uco.ing.software.project.transports.domain.port;

import co.com.edu.uco.ing.software.project.transports.domain.model.Owner;

import java.util.List;

public interface OwnerRepository {

  List<Owner> getList();
  Owner findById(Long id);
  Long save(Owner owner);
  boolean exists(Owner owner);
}
