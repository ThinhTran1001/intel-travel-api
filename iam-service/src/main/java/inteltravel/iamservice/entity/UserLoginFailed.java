package inteltravel.iamservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_login_failed")
public class UserLoginFailed extends AuditTable {

    @Id
    @Column(name = "user_id")
    private String userId;

    @Column(name = "login_failed_attempts")
    private Integer loginFailedAttempts;

    @Column(name = "unlock_time")
    private LocalDateTime unlockTime;

    private static final long serialVersionUID = 12312312412312321L;

    public UserLoginFailed(String userId) {
        super();
        this.userId = userId;
    }
}
