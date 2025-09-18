package netflix.Entities;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable=false, unique=true, length=50)
    private String username;

    @Column(nullable=false)
    private String password;

    @Column(nullable=false, unique=true, length=100)
    private String email;
    @Column(length = 20)
    private String role; // ADMIN, USER
}