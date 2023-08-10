package volunteering.SPP.DBEntity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Users")
@Getter
@Setter
public class DBUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "gender")
    private String gender;

    @Column(name = "contact_details")
    private String contactDetails;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "about")
    private String about;

    @ManyToOne
    @JoinColumn(name = "account_type_id")
    private AccountType accountType;

    // Getters and setters

}

