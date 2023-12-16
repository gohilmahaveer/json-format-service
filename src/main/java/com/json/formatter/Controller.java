package com.json.formatter;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/score")
public class Controller {

    private final Repository repository;

    public Controller(Repository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Score save(@RequestBody Score score) {
        return repository.save(score);
    }

    @GetMapping("{id}")
    public ScoreDto findById(@PathVariable Long id) {
        ScoreDto scoreDto = new ScoreDto();
        repository.findById(id).ifPresent(data -> {
            scoreDto.setId(data.getId());
            scoreDto.setScore(data.getScore());
            scoreDto.setStatus(data.getStatus());
        });
        return scoreDto;
    }
}
