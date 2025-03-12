package burundi.ilucky.model;

import burundi.ilucky.model.dto.BaseEntity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "token")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Token extends BaseEntity {

    @ManyToOne
    private User user;
    private String accessToken;
    private String refreshToken;
    private boolean isRevoked;
}
