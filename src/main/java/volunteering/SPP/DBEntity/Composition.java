package volunteering.SPP.DBEntity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Composition")
@Getter
@Setter
public class Composition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "record_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private DBUser user;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private EventRole eventRole;

    // Getters and setters

}

