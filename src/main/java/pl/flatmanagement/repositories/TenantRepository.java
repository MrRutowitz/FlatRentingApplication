package pl.flatmanagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.flatmanagement.model.Tenant;

public interface TenantRepository extends JpaRepository<Tenant, Long> {


}
