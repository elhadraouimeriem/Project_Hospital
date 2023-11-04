package ma.meriem.hospitalProject.repositories;

import ma.meriem.hospitalProject.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
    Patient findByNom(String name);

}
