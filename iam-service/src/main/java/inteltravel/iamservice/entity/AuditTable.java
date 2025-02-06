package inteltravel.iamservice.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.Instant;

/**
 * Author: thinhtd
 * Date: 2/6/2025
 * Time: 6:12 PM
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AuditTable {
    @CreatedBy
    @Column(name = "user_create", updatable = false)
    private String userCreate;

    @LastModifiedBy
    @Column(name = "user_update", updatable = false)
    private String userUpdate;

    @CreatedDate
    @Column(name = "create_date", updatable = false)
    @JsonIgnore
    private Instant createdDate = Instant.now();

    @LastModifiedDate
    @Column(name = "update_date", updatable = false)
    @JsonIgnore
    private Instant updatedDate = Instant.now();
}
