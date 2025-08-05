package EMSCode.Controller;

import EMSCode.Entities.Attendee;
import EMSCode.Entities.AttendeeDTO;
import EMSCode.Service.AttendeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attendees")
public class AttendeeController {

    @Autowired
    private AttendeeService attendeeService;

    @GetMapping
    public List<Attendee> getAllAttendees() {
        return attendeeService.getAllAttendees();
    }

    @GetMapping("/{id}")
    public Attendee getAttendeeById(@PathVariable Long id) {
        return attendeeService.getAttendeeById(id);
    }

    @PostMapping("/event/{eventId}")
    public ResponseEntity<AttendeeDTO> createAttendee(@PathVariable Long eventId, @RequestBody Attendee attendee) {
        AttendeeDTO createdAttendee = attendeeService.createAttendee(eventId, attendee);
        return ResponseEntity.ok(createdAttendee);
    }

    @DeleteMapping("/{id}")
    public void deleteAttendee(@PathVariable Long id) {
        attendeeService.deleteAttendee(id);
    }

}
