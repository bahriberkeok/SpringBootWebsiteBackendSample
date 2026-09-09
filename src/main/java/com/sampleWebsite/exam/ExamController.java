package com.sampleWebsite.exam;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/exam")
public class ExamController {

    private final ExamService examService;

    ExamController(ExamService examService) {
        this.examService = examService;
    }

    @GetMapping("/{id}")
    public Optional<ExamModel> getExamById(@PathVariable Long id) {
        try {
            return examService.getExamById(id);
        } catch (RuntimeException e) {
            log.error("e: ", new ExamNotFoundException());
            return Optional.empty();
        }

    }

    @PostMapping("/admin/newexam")
    public ExamModel setExam(@RequestBody ExamModel exam) {
        return examService.saveExam(exam);
    }

    @GetMapping("/allexams")
    public List<ExamModel> getAllExams() {
        return examService.getAllExams();
    }
    @PostMapping("/admin/{id}/delete")
    public void deleteExamById(@PathVariable Long id) {
        examService.deleteExamById(id);
    }


}
