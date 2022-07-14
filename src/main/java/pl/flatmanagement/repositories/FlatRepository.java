package pl.flatmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.flatmanagement.model.Flat;

public interface FlatRepository extends JpaRepository<Flat, Long> {


}
