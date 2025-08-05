package EMSCode.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import EMSCode.Entities.Venue;

public interface VenueRepo extends JpaRepository<Venue, Long> {

}
