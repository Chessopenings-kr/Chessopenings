package ChessOpenings.Project.web.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import ChessOpenings.Project.domain.Notation;
import ChessOpenings.Project.service.NotationService.NotationService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Validated
@CrossOrigin
@RequestMapping("/")
@Slf4j
@Component
public class NotationController {

    private final NotationService notationService;

    @GetMapping("/notation/{id}")
    public Notation getNotation(@PathVariable Long id) {
        return notationService.getNotationById(id);
    }

    @GetMapping("/notation/child/{id}")
    public List<Notation> getNotationChild(@PathVariable Long id) {
        return notationService.getChildsById(id);
    }

    @GetMapping("/position/{name}")
    public Notation getNotationByPosition(@PathVariable String name) {
        return notationService.getNotationByPositionName(name);
    }

    @GetMapping("/position/child/{name}")
    public List<Notation> getNotationChildByPosition(@PathVariable String name) {
        return notationService.getChildsByPositionName(name);
    }
}
