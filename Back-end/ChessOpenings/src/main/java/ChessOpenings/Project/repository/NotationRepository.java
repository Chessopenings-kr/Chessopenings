package ChessOpenings.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ChessOpenings.Project.domain.Notation;

import java.util.List;

public interface NotationRepository extends JpaRepository<Notation, Long> {

    // PositionName으로 Notation 찾기
    Notation findFirstByPositionName(String positionName);
}