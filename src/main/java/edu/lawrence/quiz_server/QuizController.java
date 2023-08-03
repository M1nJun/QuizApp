package edu.lawrence.quiz_server;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/quizzes")
@CrossOrigin(origins="*")
public class QuizController {
    private QuizDAO quizDAO;
    
    public QuizController(QuizDAO dao) {
        this.quizDAO = dao;
    }
    
    @GetMapping()
    public List<Quiz> quizzes (){
        return quizDAO.findAllQuizes();
    } 
    
}
