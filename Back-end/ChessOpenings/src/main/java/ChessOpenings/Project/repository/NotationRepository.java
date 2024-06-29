package ChessOpenings.Project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ChessOpenings.Project.domain.Notation;

import java.util.List;

public interface NotationRepository extends JpaRepository<Notation, Long> {
    // ID로 Notation 찾기
    Notation findById(long id);

    // PositionName으로 Notation 찾기
    Notation findByPositionName(String positionName);
}