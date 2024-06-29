package ChessOpenings.Project.service.NotationService;

import ChessOpenings.Project.domain.Notation;
import ChessOpenings.Project.domain.Closure;
import ChessOpenings.Project.repository.NotationRepository;
import ChessOpenings.Project.repository.ClosureRepository;
import jakarta.transaction.Transactional;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
@Getter
public class NotationServicelmpl implements NotationService{

    NotationRepository notationRepository;
    ClosureRepository closureRepository;

    @Override
    public List<Notation> getChildsById(Long id) {
        List<Closure> closures = closureRepository.findAllByAncestor(id);
        List<Notation> notations = new ArrayList<>();

        for (int i = 0; i < closures.size(); i++) {
            Notation notation = notationRepository.findById(closures.get(i).getDescendant()).get();
            notations.add(notation);
        }

        return notations;
    }

    @Override
    public Notation getParentById(Long id) {
        Closure closure = closureRepository.findByDescendant(id);

        return notationRepository.findById(closure.getAncestor()).get();
    }

    @Override
    public Notation getNotationById(Long id) {
        return notationRepository.findById(id).get();
    }

    @Override
    public List<Notation> getChildsByPositionName(String positionName) {
        Long id = notationRepository.findFirstByPositionName(positionName).getId();

        return getChildsById(id);
    }

    @Override
    public Notation getParentByPositionName(String positionName) {
        Long id = notationRepository.findFirstByPositionName(positionName).getId();

        return getParentById(id);
    }

    @Override
    public Notation getNotationByPositionName(String positionName) {
        Long id = notationRepository.findFirstByPositionName(positionName).getId();

        return getNotationById(id);
    }

    @Override
    public Notation saveNotation(Notation notation, Long parent_id) {
        // 기보 DB에 저장할 함수
        // notation 만들어서 저장
        // 새로 만든 notation의 id와 parent_id로 closure 만들어서 저장
        return null;
    }
}
