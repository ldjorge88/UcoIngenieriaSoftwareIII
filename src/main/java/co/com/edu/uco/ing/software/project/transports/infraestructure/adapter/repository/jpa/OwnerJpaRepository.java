package co.com.edu.uco.ing.software.project.transports.infraestructure.adapter.repository.jpa;

import co.com.edu.uco.ing.software.project.transports.infraestructure.adapter.entity.OwnerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OwnerJpaRepository extends JpaRepository<OwnerEntity, Long> {

  OwnerEntity findByDocumentAndDocumentType(int document, String documentType);
}
