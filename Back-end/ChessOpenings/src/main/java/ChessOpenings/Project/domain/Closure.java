package ChessOpenings.Project.domain;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Entity
@IdClass(CompositeKey.class)
@Getter
@Builder
@DynamicUpdate
@DynamicInsert
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Closure {
    @Id
    private Long ancestor;

    @Id
    private Long descendant;

    @Column(name = "depth")
    private int depth;
}
