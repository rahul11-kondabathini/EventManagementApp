package EMSCode.Entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Event {



        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotNull(message = "Title can't be null")
        @Size(min = 1, max = 255, message = "Title must be between 1 and 255 characters")
        private String title;

        @NotNull(message = "Event date time can't be null")
        private LocalDateTime dateTime;

        @OneToMany(mappedBy = "event")
        private List<Attendee> attendees;

        @ManyToOne
        @JoinColumn(name = "venue_id")
        @NotNull(message = "Venue is required")
        private Venue venue;

        @ManyToOne
        @JoinColumn(name = "category_id")
        @NotNull(message = "Category is required")
        private Category category;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public LocalDateTime getDateTime() {
            return dateTime;
        }

        public void setDateTime(LocalDateTime dateTime) {
            this.dateTime = dateTime;
        }

        public List<Attendee> getAttendees() {
            return attendees;
        }

        public void setAttendees(List<Attendee> attendees) {
            this.attendees = attendees;
        }

        public Venue getVenue() {
            return venue;
        }

        public void setVenue(Venue venue) {
            this.venue = venue;
        }

        public Category getCategory() {
            return category;
        }

        public void setCategory(Category category) {
            this.category = category;
        }

    }
