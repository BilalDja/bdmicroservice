package dz.bdjago.fraud;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FraudCheckHistory {
    @Id
    @SequenceGenerator(name = "fraud_id_seq", sequenceName = "fraud_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fraud_id_seq")
    private Integer id;
    private Integer customerId;
    private Boolean isFraudster;
    private LocalDateTime createdAt;
}
