package pl.flatmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.flatmanagement.model.Details;

public interface DetailsRepository extends JpaRepository<Details, Long> {
}
