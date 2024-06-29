package ChessOpenings.Project.service.NotationService;

import ChessOpenings.Project.domain.Notation;

import java.util.List;

public interface NotationService {

    // id로 자식 전부 가져오기
    public List<Notation> getChildsById(Long id);

    // id로 부모 가져오기
    public Notation getParentById(Long id);

    // id로 notation 가져오기
    public Notation getNotationById(Long id);


    // name으로 자식 전부 가져오기
    public List<Notation> getChildsByPositionName(String positionName);

    // name으로 부모 가져오기
    public Notation getParentByPositionName(String positionName);

    // name으로 notation 가져오기
    public Notation getNotationByPositionName(String positionName);

    // 새로운 notation 저장
    public Notation saveNotation(Notation notation, Long parent_id);
}