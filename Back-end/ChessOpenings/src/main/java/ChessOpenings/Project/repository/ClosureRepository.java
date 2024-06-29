package ChessOpenings.Project.repository;

import ChessOpenings.Project.domain.CompositeKey;
import org.springframework.data.jpa.repository.JpaRepository;
import ChessOpenings.Project.domain.Closure;

import java.util.List;

public interface ClosureRepository extends JpaRepository<Closure, CompositeKey> {
    // 모든 자식 closure 찾기
    List<Closure> findAllByAncestor(Long id);

    // 모든 부모 closure 찾기
    List<Closure> findAllByDescendant(Long id);
}