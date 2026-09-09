package com.sampleWebsite.exam;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExamService {
    private final ExamRepository examRepository;

    public ExamService(ExamRepository examRepository) {
        this.examRepository = examRepository;
    }

    public ExamModel saveExam(ExamModel exam) {
        return examRepository.save(exam);
    }

    public List<ExamModel> getAllExams() {
        return examRepository.findAll();
    }

    public Optional<ExamModel> getExamById(Long id) {
        return examRepository.findById(id);
    }

    public void deleteExamById(Long id) {
        examRepository.deleteById(id);
    }

}
