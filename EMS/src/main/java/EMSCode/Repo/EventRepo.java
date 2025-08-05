package EMSCode.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import EMSCode.Entities.Event;

public interface EventRepo extends JpaRepository<Event, Long> {

}