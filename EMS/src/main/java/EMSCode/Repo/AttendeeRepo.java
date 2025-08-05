package EMSCode.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import EMSCode.Entities.Attendee;

public interface AttendeeRepo extends JpaRepository<Attendee, Long> {

}