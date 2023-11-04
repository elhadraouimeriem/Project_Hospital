package ma.meriem.hospitalProject.repositories;

import ma.meriem.hospitalProject.entities.RendezVous;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RendezVousRepository extends JpaRepository<RendezVous,String> {
}
